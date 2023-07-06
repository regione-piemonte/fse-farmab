/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.domain;

public class DmaccTDispositivoCertificazioneOtpRichDomain {
	long deviceOtpRichId;
	String deviceNumeroTelefono;
	String otp;
	long idPaziente;
	String cittadinoCf; 
	int fonteCertId;
	int deviceOtpRichStatoId;
	String dataInserimento;
	String dataAggiornamento;
	String utenteInserimento;
	String utenteAggiornamento;
	String dataFineValidita;
	
	public DmaccTDispositivoCertificazioneOtpRichDomain(long deviceOtpRichId, String deviceNumeroTelefono, String otp,
			long idPaziente, String cittadinoCf, int fonteCertId, int deviceOtpRichStatoId, 
			String dataInserimento, String dataAggiornamento, String utenteInserimento,
			String utenteAggiornamento, String dataFineValidita) {
		super();
		this.deviceOtpRichId = deviceOtpRichId;
		this.deviceNumeroTelefono = deviceNumeroTelefono;
		this.otp = otp;
		this.idPaziente = idPaziente;
		this.cittadinoCf = cittadinoCf;
		this.fonteCertId = fonteCertId;
		this.deviceOtpRichStatoId = deviceOtpRichStatoId;
		this.dataInserimento = dataInserimento;
		this.dataAggiornamento = dataAggiornamento;
		this.utenteInserimento = utenteInserimento;
		this.utenteAggiornamento = utenteAggiornamento;
		this.dataFineValidita = dataFineValidita;
	}

	public long getDeviceOtpRichId() {
		return deviceOtpRichId;
	}

	public void setDeviceOtpRichId(long deviceOtpRichId) {
		this.deviceOtpRichId = deviceOtpRichId;
	}

	public String getDeviceNumeroTelefono() {
		return deviceNumeroTelefono;
	}

	public void setDeviceNumeroTelefono(String deviceNumeroTelefono) {
		this.deviceNumeroTelefono = deviceNumeroTelefono;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public long getIdPaziente() {
		return idPaziente;
	}

	public void setIdPaziente(long idPaziente) {
		this.idPaziente = idPaziente;
	}

	public String getCittadinoCf() {
		return cittadinoCf;
	}

	public void setCittadinoCf(String cittadinoCf) {
		this.cittadinoCf = cittadinoCf;
	}

	public int getFonteCertId() {
		return fonteCertId;
	}

	public void setFonteCertId(int fonteCertId) {
		this.fonteCertId = fonteCertId;
	}

	public int getDeviceOtpRichStatoId() {
		return deviceOtpRichStatoId;
	}

	public void setDeviceOtpRichStatoId(int deviceOtpRichStatoId) {
		this.deviceOtpRichStatoId = deviceOtpRichStatoId;
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

	public String getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(String dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}
	
}
