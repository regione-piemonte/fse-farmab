/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.domain;

import it.csi.iccws.dmacc.GetFarmacieAderentiResponse;

public class DmaccTFarmaciaAbitualeDescDomain {
	long farmAbitId;
	long idPaziente;
	String farmaciaCod;
	String dataAssociazioneInizio;
	String dataAssociazioneFine;
	String dataInserimento;
	String dataAggiornamento;
	String dataCancellazione;
	String utenteInserimento;
	String utenteAggiornamento;
	String utenteCancellazione;
	GetFarmacieAderentiResponse farmacieAderentiResponse=null;

	public GetFarmacieAderentiResponse getFarmResp() {
		return farmacieAderentiResponse;
	}

	public void setFarmacieAderentiResponse(GetFarmacieAderentiResponse farmacieAderentiResponse) {
		this.farmacieAderentiResponse = farmacieAderentiResponse;
	}

	public DmaccTFarmaciaAbitualeDescDomain(long farmAbitId, long idPaziente, String farmaciaCod,
			String dataAssociazioneInizio, String dataAssociazioneFine, String dataInserimento,
			String dataAggiornamento, String dataCancellazione, String utenteInserimento, String utenteAggiornamento,
			String utenteCancellazione) {
		super();
		this.farmAbitId = farmAbitId;
		this.idPaziente = idPaziente;
		this.farmaciaCod = farmaciaCod;
		this.dataAssociazioneInizio = dataAssociazioneInizio;
		this.dataAssociazioneFine = dataAssociazioneFine;
		this.dataInserimento = dataInserimento;
		this.dataAggiornamento = dataAggiornamento;
		this.dataCancellazione = dataCancellazione;
		this.utenteInserimento = utenteInserimento;
		this.utenteAggiornamento = utenteAggiornamento;
		this.utenteCancellazione = utenteCancellazione;
	}

	public long getFarmAbitId() {
		return farmAbitId;
	}

	public void setFarmAbitId(long farmAbitId) {
		this.farmAbitId = farmAbitId;
	}

	public long getIdPaziente() {
		return idPaziente;
	}

	public void setIdPaziente(long idPaziente) {
		this.idPaziente = idPaziente;
	}

	public String getFarmaciaCod() {
		return farmaciaCod;
	}

	public void setFarmaciaCod(String farmaciaCod) {
		this.farmaciaCod = farmaciaCod;
	}

	public String getDataAssociazioneInizio() {
		return dataAssociazioneInizio;
	}

	public void setDataAssociazioneInizio(String dataAssociazioneInizio) {
		this.dataAssociazioneInizio = dataAssociazioneInizio;
	}

	public String getDataAssociazioneFine() {
		return dataAssociazioneFine;
	}

	public void setDataAssociazioneFine(String dataAssociazioneFine) {
		this.dataAssociazioneFine = dataAssociazioneFine;
	}

	public String getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(String dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public String getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(String dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	public String getDataCancellazione() {
		return dataCancellazione;
	}

	public void setDataCancellazione(String dataCancellazione) {
		this.dataCancellazione = dataCancellazione;
	}

	public String getUtenteInserimento() {
		return utenteInserimento;
	}

	public void setUtenteInserimento(String utenteInserimento) {
		this.utenteInserimento = utenteInserimento;
	}

	public String getUtenteAggiornamento() {
		return utenteAggiornamento;
	}

	public void setUtenteAggiornamento(String utenteAggiornamento) {
		this.utenteAggiornamento = utenteAggiornamento;
	}

	public String getUtenteCancellazione() {
		return utenteCancellazione;
	}

	public void setUtenteCancellazione(String utenteCancellazione) {
		this.utenteCancellazione = utenteCancellazione;
	}

}
