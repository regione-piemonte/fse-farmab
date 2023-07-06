/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.domain;

public class DmaccTabelleIdx {

	private long idDocumentoIlec;
	private String codCl;
	private String dataValidazione;
	private String nreRifDoc;
	private String codiceIdMedico;

	public DmaccTabelleIdx(long idDocumentoIlec, String codCl, String dataValidazione, String nreRifDoc) {
		super();
		this.idDocumentoIlec = idDocumentoIlec;
		this.codCl = codCl;
		this.dataValidazione = dataValidazione;
		this.nreRifDoc = nreRifDoc;
	}

	public DmaccTabelleIdx(String nreRifDoc, String dataValidazione, String codiceIdMedico) {
		super();
		this.nreRifDoc = nreRifDoc;
		this.dataValidazione = dataValidazione;
		this.codiceIdMedico = codiceIdMedico;
	}

	public long getIdDocumentoIlec() {
		return idDocumentoIlec;
	}
	public void setIdDocumentoIlec(long idDocumentoIlec) {
		this.idDocumentoIlec = idDocumentoIlec;
	}

	public String getCodCl() {
		return codCl;
	}
	public void setCodCl(String codCl) {
		this.codCl = codCl;
	}

	public String getDataValidazione() {
		return dataValidazione;
	}
	public void setDataValidazione(String dataValidazione) {
		this.dataValidazione = dataValidazione;
	}

	public String getNreRifDoc() {
		return nreRifDoc;
	}

	public void setNreRifDoc(String nreRifDoc) {
		this.nreRifDoc = nreRifDoc;
	}

	public String getCodiceIdMedico() {
		return codiceIdMedico;
	}

	public void setCodiceIdMedico(String codiceIdMedico) {
		this.codiceIdMedico = codiceIdMedico;
	}


}
