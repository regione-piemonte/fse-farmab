/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.domain;

public class DmaccTFarmaciaOccasionaleRich {
	long farmOccRichId;
	long idPaziente;
	String farmaciaCod;
	String farmaciaPiva;
	String farmaciaGestionale;
	String farmacistaCf;
	String cittadinoDelegatoCf;
	String sessioneCod;
	int    farmOccRichStatoId;
	String dataInserimento;
	String dataAggiornamento;
	String dataCancellazione;

	public DmaccTFarmaciaOccasionaleRich(long farmOccRichId, long idPaziente, String farmaciaCod, String farmaciaPiva,
			String farmaciaGestionale, String farmacistaCf, String cittadinoDelegatoCf, String sessioneCod,
			int farmOccRichStatoId, String dataInserimento, String dataAggiornamento, String dataCancellazione) {
		super();
		this.farmOccRichId = farmOccRichId;
		this.idPaziente = idPaziente;
		this.farmaciaCod = farmaciaCod;
		this.farmaciaPiva = farmaciaPiva;
		this.farmaciaGestionale = farmaciaGestionale;
		this.farmacistaCf = farmacistaCf;
		this.cittadinoDelegatoCf = cittadinoDelegatoCf;
		this.sessioneCod = sessioneCod;
		this.farmOccRichStatoId = farmOccRichStatoId;
		this.dataInserimento = dataInserimento;
		this.dataAggiornamento = dataAggiornamento;
		this.dataCancellazione = dataCancellazione;
	}

	public long getFarmOccRichId() {
		return farmOccRichId;
	}

	public void setFarmOccRichId(long farmOccRichId) {
		this.farmOccRichId = farmOccRichId;
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

	public String getFarmaciaPiva() {
		return farmaciaPiva;
	}

	public void setFarmaciaPiva(String farmaciaPiva) {
		this.farmaciaPiva = farmaciaPiva;
	}

	public String getFarmaciaGestionale() {
		return farmaciaGestionale;
	}

	public void setFarmaciaGestionale(String farmaciaGestionale) {
		this.farmaciaGestionale = farmaciaGestionale;
	}

	public String getFarmacistaCf() {
		return farmacistaCf;
	}

	public void setFarmacistaCf(String farmacistaCf) {
		this.farmacistaCf = farmacistaCf;
	}

	public String getCittadinoDelegatoCf() {
		return cittadinoDelegatoCf;
	}

	public void setCittadinoDelegatoCf(String cittadinoDelegatoCf) {
		this.cittadinoDelegatoCf = cittadinoDelegatoCf;
	}

	public String getSessioneCod() {
		return sessioneCod;
	}

	public void setSessioneCod(String sessioneCod) {
		this.sessioneCod = sessioneCod;
	}

	public int getFarmOccRichStatoId() {
		return farmOccRichStatoId;
	}

	public void setFarmOccRichStatoId(int farmOccRichStatoId) {
		this.farmOccRichStatoId = farmOccRichStatoId;
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


}
