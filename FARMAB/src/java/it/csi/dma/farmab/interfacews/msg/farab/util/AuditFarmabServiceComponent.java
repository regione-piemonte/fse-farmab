/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.interfacews.msg.farab.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.dma.farmab.integration.dao.LogAuditDao;
import it.csi.dma.farmab.integration.dao.dto.AuditDto;
import it.csi.dma.farmab.integration.dao.dto.CatalogoLogAuditLowDto;
import it.csi.dma.farmab.interfacews.msg.farab.Richiedente;
import it.csi.dma.farmab.util.Constants;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AuditFarmabServiceComponent {
	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);
	@Autowired
	LogAuditDao logAudit;

	public void componiAuditESalvaAudit(String codiceCatalogo,  Richiedente req, String remoteClientAddr, Long idPaziente, String cfPaziente, String nomeServizio){
		log.info("[AuditFarmabServiceComponent::componiAuditESalvaAudit] - BEGIN");
		try {
			AuditDto audit = new AuditDto();
			audit.setApplicativoVerticale(Constants.CODICE_SERVIZIO_IN_DELEGHE);

			CatalogoLogAuditLowDto catalogo = logAudit.geCatalogoLogAudittByCodice(codiceCatalogo);
			audit.setInformazioniTracciate(catalogo.getDescrizione());
			audit.setIdPaziente(idPaziente);
			audit.setIdCatalogoLogAudit(catalogo.getId());

			if(req.getApplicazione() != null){
				audit.setCodiceApplicazioneRichiedente(req.getApplicazione().getCodice());
			}

			audit.setVisibileAlCittadino("S");
			audit.setIpChiamante(remoteClientAddr);

			if(req.getRuolo() != null && cfPaziente.equalsIgnoreCase(req.getCodiceFiscale())){
				audit.setCodiceRuolo(req.getRuolo().getCodice());
			}else{
				audit.setCodiceRuolo(Constants.RUOLO_DEL);
			}

			audit.setCodiceServizio(codiceCatalogo); // -> da analisi codice del servizio
			audit.setNomeServizio(nomeServizio);

			//audit.setApplicativoVerticale(req.getApplicativoVerticale()); --> da analisi null
			audit.setCodiceFiscaleUtente(req.getCodiceFiscale());

			logAudit.insertTlogAudit(audit);
		} catch (Exception e) {
			log.error("[AuditFarmabServiceComponent::componiAuditESalvaAudit] ERROR", e);
			throw e;
		}finally{
			log.info("[AuditFarmabServiceComponent::componiAuditESalvaAudit] - END");
		}
	}
}
