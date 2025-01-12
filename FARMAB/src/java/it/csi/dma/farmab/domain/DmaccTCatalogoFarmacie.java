/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.domain;

public class DmaccTCatalogoFarmacie {
	long catalogoFarmId;
	String codAzienda;
	String denominazione; 
	String codFarmacia; 
	String denomFarmacia; 
	String descNatura;
	String partitaIva;
	String descTipoFar;
	String cognomeDir;
	String nomeDir;
	String codiceFiscaleDir;
	String indirizzo="";
	String numeroCivico="";
	String cap="";
	String comune="";
	String denomProvincia;
	String dataInizioValiditaFarm;
	String dataFineValiditaFarm;
	String dataInizioFarab;
	String dataFineFarab;
	
	public DmaccTCatalogoFarmacie(long catalogoFarmId, String codAzienda, String denominazione, String codFarmacia,
			String denomFarmacia, String descNatura, String partitaIva, String descTipoFar, String cognomeDir,
			String nomeDir, String codiceFiscaleDir, String indirizzo, String numeroCivico, String cap, String comune,
			String denomProvincia, String dataInizioValiditaFarm, String dataFineValiditaFarm, String dataInizioFarab,
			String dataFineFarab) {
		super();
		this.catalogoFarmId = catalogoFarmId;
		this.codAzienda = codAzienda;
		this.denominazione = denominazione;
		this.codFarmacia = codFarmacia;
		this.denomFarmacia = denomFarmacia;
		this.descNatura = descNatura;
		this.partitaIva = partitaIva;
		this.descTipoFar = descTipoFar;
		this.cognomeDir = cognomeDir;
		this.nomeDir = nomeDir;
		this.codiceFiscaleDir = codiceFiscaleDir;
		setIndirizzo(indirizzo);
		setNumeroCivico(numeroCivico); 
		this.cap = cap;
		this.comune = comune;
		this.denomProvincia = denomProvincia;
		this.dataInizioValiditaFarm = dataInizioValiditaFarm;
		this.dataFineValiditaFarm = dataFineValiditaFarm;
		this.dataInizioFarab = dataInizioFarab;
		this.dataFineFarab = dataFineFarab;
	}

	public long getCatalogoFarmId() {
		return catalogoFarmId;
	}

	public void setCatalogoFarmId(long catalogoFarmId) {
		this.catalogoFarmId = catalogoFarmId;
	}

	public String getCodAzienda() {
		return codAzienda;
	}

	public void setCodAzienda(String codAzienda) {
		this.codAzienda = codAzienda;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getCodFarmacia() {
		return codFarmacia;
	}

	public void setCodFarmacia(String codFarmacia) {
		this.codFarmacia = codFarmacia;
	}

	public String getDenomFarmacia() {
		return denomFarmacia;
	}

	public void setDenomFarmacia(String denomFarmacia) {
		this.denomFarmacia = denomFarmacia;
	}

	public String getDescNatura() {
		return descNatura;
	}

	public void setDescNatura(String descNatura) {
		this.descNatura = descNatura;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getDescTipoFar() {
		return descTipoFar;
	}

	public void setDescTipoFar(String descTipoFar) {
		this.descTipoFar = descTipoFar;
	}

	public String getCognomeDir() {
		return cognomeDir;
	}

	public void setCognomeDir(String cognomeDir) {
		this.cognomeDir = cognomeDir;
	}

	public String getNomeDir() {
		return nomeDir;
	}

	public void setNomeDir(String nomeDir) {
		this.nomeDir = nomeDir;
	}

	public String getCodiceFiscaleDir() {
		return codiceFiscaleDir;
	}

	public void setCodiceFiscaleDir(String codiceFiscaleDir) {
		this.codiceFiscaleDir = codiceFiscaleDir;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		if (indirizzo!=null)
			this.indirizzo = indirizzo.trim();
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		if (numeroCivico!=null)
			this.numeroCivico = numeroCivico.trim();
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getDenomProvincia() {
		return denomProvincia;
	}

	public void setDenomProvincia(String denomProvincia) {
		this.denomProvincia = denomProvincia;
	}

	public String getDataInizioValiditaFarm() {
		return dataInizioValiditaFarm;
	}

	public void setDataInizioValiditaFarm(String dataInizioValiditaFarm) {
		this.dataInizioValiditaFarm = dataInizioValiditaFarm;
	}

	public String getDataFineValiditaFarm() {
		return dataFineValiditaFarm;
	}

	public void setDataFineValiditaFarm(String dataFineValiditaFarm) {
		this.dataFineValiditaFarm = dataFineValiditaFarm;
	}

	public String getDataInizioFarab() {
		return dataInizioFarab;
	}

	public void setDataInizioFarab(String dataInizioFarab) {
		this.dataInizioFarab = dataInizioFarab;
	}

	public String getDataFineFarab() {
		return dataFineFarab;
	}

	public void setDataFineFarab(String dataFineFarab) {
		this.dataFineFarab = dataFineFarab;
	}

	
}
