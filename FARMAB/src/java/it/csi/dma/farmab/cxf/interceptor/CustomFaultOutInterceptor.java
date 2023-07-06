/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.cxf.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.Soap11FaultOutInterceptor;
import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import it.csi.dma.farmab.util.Constants;

/**
 * CustomFaultOutInterceptor: Intercetta il fault causato da errore nel messaggio inviato, durante la catena degli interceptor  
 * -	costruisce il messaggio di risposta 
 *
 */
@Component
public class CustomFaultOutInterceptor extends AbstractSoapInterceptor {
	
	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);		

    public CustomFaultOutInterceptor() {
        super(Phase.MARSHAL);
        getAfter().add(Soap11FaultOutInterceptor.class.getName());
    }

    public void handleMessage(SoapMessage message) throws Fault {
         //Il fault  stato riabilitato   
        //message.removeContent(Exception.class);        		
    }
	
}
