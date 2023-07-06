/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.cxf.interceptor;

import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.dma.farmab.domain.DmaccLXmlMessaggi;
import it.csi.dma.farmab.integration.dao.FarmabTLogDao;
import it.csi.dma.farmab.integration.dao.dto.LMessaggiDto;
import it.csi.dma.farmab.util.Constants;


//public class SoapActionInInterceptor extends SoapHeaderInterceptor{
public abstract class SoapActionInInterceptorBase extends AbstractPhaseInterceptor<Message> {

	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);

	@Autowired
	FarmabTLogDao  logDao;

	public SoapActionInInterceptorBase() {
		super(Phase.RECEIVE);
		addBefore(IrideCacheUserPaswordInterceptor.class.getName());

	}

	public void handleMessage(Message message) throws Fault {

		boolean scrividb = true;
		AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);
		if (policy == null && this instanceof SoapActionInInterceptorUuidCodSessione) {
			scrividb = false;
		}
		InputStream is = message.getContent(InputStream.class);
		if (is != null && scrividb) {
			CachedOutputStream bos = new CachedOutputStream();
			try {
				HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
				String ipChiamante = request.getRemoteAddr();
				
				IOUtils.copy(is, bos);

				bos.flush();
				is.close();
				message.setContent(InputStream.class, bos.getInputStream());
				bos.close();
				String soapMessage = new String(bos.getBytes());// here you get the soap message

				//String xRequestId = StringUtils.substringBetween(soapMessage, "<numeroTransazione>", "</numeroTransazione>");
				//ATTENZIONE Egidio e Tom non sono d'accordo X-request-id --> che va a asalvarsi su wso2_id è una chiave generate e non si prende dalla request 
				String xRequestId = getUuid(soapMessage);
				
				String uuid = UUID.randomUUID().toString();
				
				DmaccLXmlMessaggi messaggio = new DmaccLXmlMessaggi();
				messaggio.setXmlIn(new String(bos.getBytes()));

				/*
				 * ATTENZIONE Egidio e Tom non sono d'accordo X-request-id
				if(StringUtils.isEmpty(xRequestId)){
					xRequestId = Constants.REQUEST_ID_NONTROVATO;
				}
				messaggio.setxRequestId(xRequestId);
				*/
				
				messaggio.setxRequestId(uuid);
				
				long id = logDao.insertLXmlMessaggi(messaggio);
				log.info("SoapActionInInterceptor::handleMessage id ricavato da insert:"+id);
				
				
				
				//message.getInterceptorChain().forEach( c -> log.info("Classe interceptor: " + c.getClass().getName()) );
				//message.getInterceptorChain().
				message.getExchange().put(Constants.LOGGING_KEY_L_XML_MESSAGGI, new Long(id));
				message.getExchange().put(Constants.LOGGING_WSO2ID, uuid);
				
				//Inizializzo il dto per la lmessaggi
				LMessaggiDto lMessaggio = riempilLMessaggio(soapMessage, xRequestId, uuid, ipChiamante);
				if(lMessaggio != null){
					long idLMessaggi = logDao.insertLMessaggi(lMessaggio); 
					message.getExchange().put(Constants.LOGGING_KEY_L_MESSAGGI, new Long(idLMessaggi));
				}
				


			}catch(Exception ex) {
				log.error(ex.getMessage());;
			}

		}
	}
	
	protected abstract LMessaggiDto riempilLMessaggio(String soapMessage, String xRequestId, String uuid, String ipChiamante);
	
	protected  abstract String getUuid(String soapMessage);


}
