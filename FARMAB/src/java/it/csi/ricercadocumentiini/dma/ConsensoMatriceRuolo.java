/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.ricercadocumentiini.dma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per consensoMatriceRuolo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="consensoMatriceRuolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultazione" type="{http://dma.csi.it/}siNo" minOccurs="0"/>
 *         &lt;element name="dataDiAggiornamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ruoloDMA" type="{http://dma.csi.it/}ruoloDMA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consensoMatriceRuolo", propOrder = {
    "consultazione",
    "dataDiAggiornamento",
    "ruoloDMA"
})
public class ConsensoMatriceRuolo {

    protected SiNo consultazione;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDiAggiornamento;
    protected RuoloDMA ruoloDMA;

    /**
     * Recupera il valore della proprietÃ  consultazione.
     * 
     * @return
     *     possible object is
     *     {@link SiNo }
     *     
     */
    public SiNo getConsultazione() {
        return consultazione;
    }

    /**
     * Imposta il valore della proprietÃ  consultazione.
     * 
     * @param value
     *     allowed object is
     *     {@link SiNo }
     *     
     */
    public void setConsultazione(SiNo value) {
        this.consultazione = value;
    }

    /**
     * Recupera il valore della proprietÃ  dataDiAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiAggiornamento() {
        return dataDiAggiornamento;
    }

    /**
     * Imposta il valore della proprietÃ  dataDiAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiAggiornamento(XMLGregorianCalendar value) {
        this.dataDiAggiornamento = value;
    }

    /**
     * Recupera il valore della proprietÃ  ruoloDMA.
     * 
     * @return
     *     possible object is
     *     {@link RuoloDMA }
     *     
     */
    public RuoloDMA getRuoloDMA() {
        return ruoloDMA;
    }

    /**
     * Imposta il valore della proprietÃ  ruoloDMA.
     * 
     * @param value
     *     allowed object is
     *     {@link RuoloDMA }
     *     
     */
    public void setRuoloDMA(RuoloDMA value) {
        this.ruoloDMA = value;
    }

}
