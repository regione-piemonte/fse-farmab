/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.integration.dao.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class LErroreDto implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4245567965463312810L;
	private Long id;
	private String wso2Id;
	private String codErrore;
	private String descrErrore;
	private String tipoErrore;
	private Timestamp dataIns;
	private String informazioniAggiuntive;

	//costruttore utile per le insert
	public LErroreDto(String wso2Id, String codErrore, String descrErrore, String tipoErrore,
			String informazioniAggiuntive) {
		super();
		this.wso2Id = wso2Id;
		this.codErrore = codErrore;
		this.descrErrore = descrErrore;
		this.tipoErrore = tipoErrore;
		this.informazioniAggiuntive = informazioniAggiuntive;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWso2Id() {
		return wso2Id;
	}
	public void setWso2Id(String wso2Id) {
		this.wso2Id = wso2Id;
	}
	public String getCodErrore() {
		return codErrore;
	}
	public void setCodErrore(String codErrore) {
		this.codErrore = codErrore;
	}
	public String getDescrErrore() {
		return descrErrore;
	}
	public void setDescrErrore(String descrErrore) {
		this.descrErrore = descrErrore;
	}
	public String getTipoErrore() {
		return tipoErrore;
	}
	public void setTipoErrore(String tipoErrore) {
		this.tipoErrore = tipoErrore;
	}
	public Timestamp getDataIns() {
		return dataIns;
	}
	public void setDataIns(Timestamp dataIns) {
		this.dataIns = dataIns;
	}
	public String getInformazioniAggiuntive() {
		return informazioniAggiuntive;
	}
	public void setInformazioniAggiuntive(String informazioniAggiuntive) {
		this.informazioniAggiuntive = informazioniAggiuntive;
	}



}
