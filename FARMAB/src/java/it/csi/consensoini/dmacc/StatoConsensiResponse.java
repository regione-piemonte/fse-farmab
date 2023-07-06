/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.consensoini.dmacc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.csi.consensoini.dma.StatoConsensiOUT;


/**
 * <p>Classe Java per statoConsensiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="statoConsensiResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dmacc.csi.it/}serviceResponse">
 *       &lt;sequence>
 *         &lt;element name="statoConsensiOUT" type="{http://dma.csi.it/}statoConsensiOUT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statoConsensiResponse", propOrder = {
    "statoConsensiOUT"
})
public class StatoConsensiResponse
    extends ServiceResponse
{

    protected StatoConsensiOUT statoConsensiOUT;

    /**
     * Recupera il valore della proprietÃ  statoConsensiOUT.
     * 
     * @return
     *     possible object is
     *     {@link StatoConsensiOUT }
     *     
     */
    public StatoConsensiOUT getStatoConsensiOUT() {
        return statoConsensiOUT;
    }

    /**
     * Imposta il valore della proprietÃ  statoConsensiOUT.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoConsensiOUT }
     *     
     */
    public void setStatoConsensiOUT(StatoConsensiOUT value) {
        this.statoConsensiOUT = value;
    }

}
