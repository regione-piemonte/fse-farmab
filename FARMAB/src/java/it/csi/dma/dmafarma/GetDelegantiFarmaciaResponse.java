/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.dmafarma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetDelegantiFarmaciaResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDelegantiFarmaciaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="elencoErrori" type="{http://dmafarma.dma.csi.it/}ElencoErrori" minOccurs="0" form="qualified"/>
 *         &lt;element name="elencoDeleganti" type="{http://dmafarma.dma.csi.it/}ElencoDeleganti" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDelegantiFarmaciaResponse", propOrder = {
    "codEsito",
    "elencoErrori",
    "elencoDeleganti"
})
public class GetDelegantiFarmaciaResponse {

    protected String codEsito;
    protected ElencoErrori elencoErrori;
    protected ElencoDeleganti elencoDeleganti;

    /**
     * Recupera il valore della proprietÃ  codEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEsito() {
        return codEsito;
    }

    /**
     * Imposta il valore della proprietÃ  codEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEsito(String value) {
        this.codEsito = value;
    }

    /**
     * Recupera il valore della proprietÃ  elencoErrori.
     * 
     * @return
     *     possible object is
     *     {@link ElencoErrori }
     *     
     */
    public ElencoErrori getElencoErrori() {
        return elencoErrori;
    }

    /**
     * Imposta il valore della proprietÃ  elencoErrori.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoErrori }
     *     
     */
    public void setElencoErrori(ElencoErrori value) {
        this.elencoErrori = value;
    }

    /**
     * Recupera il valore della proprietÃ  elencoDeleganti.
     * 
     * @return
     *     possible object is
     *     {@link ElencoDeleganti }
     *     
     */
    public ElencoDeleganti getElencoDeleganti() {
        return elencoDeleganti;
    }

    /**
     * Imposta il valore della proprietÃ  elencoDeleganti.
     * 
     * @param value
     *     allowed object is
     *     {@link ElencoDeleganti }
     *     
     */
    public void setElencoDeleganti(ElencoDeleganti value) {
        this.elencoDeleganti = value;
    }

}
