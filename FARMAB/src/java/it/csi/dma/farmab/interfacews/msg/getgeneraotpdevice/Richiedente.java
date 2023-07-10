/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.farmab.interfacews.msg.getgeneraotpdevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per richiedente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="richiedente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicativoVerticale" type="{http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/}tipoCodice" minOccurs="0"/>
 *         &lt;element name="applicazione" type="{http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/}tipoCodice" minOccurs="0"/>
 *         &lt;element name="codiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruolo" type="{http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/}tipoCodice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "richiedente", propOrder = {
    "applicativoVerticale",
    "applicazione",
    "codiceFiscale",
    "ip",
    "numeroTransazione",
    "ruolo"
})
public class Richiedente {

    protected TipoCodice applicativoVerticale;
    protected TipoCodice applicazione;
    protected String codiceFiscale;
    protected String ip;
    protected String numeroTransazione;
    protected TipoCodice ruolo;

    /**
     * Recupera il valore della proprietÃ  applicativoVerticale.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodice }
     *     
     */
    public TipoCodice getApplicativoVerticale() {
        return applicativoVerticale;
    }

    /**
     * Imposta il valore della proprietÃ  applicativoVerticale.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodice }
     *     
     */
    public void setApplicativoVerticale(TipoCodice value) {
        this.applicativoVerticale = value;
    }

    /**
     * Recupera il valore della proprietÃ  applicazione.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodice }
     *     
     */
    public TipoCodice getApplicazione() {
        return applicazione;
    }

    /**
     * Imposta il valore della proprietÃ  applicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodice }
     *     
     */
    public void setApplicazione(TipoCodice value) {
        this.applicazione = value;
    }

    /**
     * Recupera il valore della proprietÃ  codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprietÃ  codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprietÃ  ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Imposta il valore della proprietÃ  ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Recupera il valore della proprietÃ  numeroTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransazione() {
        return numeroTransazione;
    }

    /**
     * Imposta il valore della proprietÃ  numeroTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransazione(String value) {
        this.numeroTransazione = value;
    }

    /**
     * Recupera il valore della proprietÃ  ruolo.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodice }
     *     
     */
    public TipoCodice getRuolo() {
        return ruolo;
    }

    /**
     * Imposta il valore della proprietÃ  ruolo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodice }
     *     
     */
    public void setRuolo(TipoCodice value) {
        this.ruolo = value;
    }

}