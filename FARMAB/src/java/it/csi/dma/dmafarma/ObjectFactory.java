/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.dmafarma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.dmafarma package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDelegantiFarmacia_QNAME = new QName("http://dmafarma.dma.csi.it/", "getDelegantiFarmacia");
    private final static QName _GetDelegantiFarmaciaResponse_QNAME = new QName("http://dmafarma.dma.csi.it/", "getDelegantiFarmaciaResponse");
    private final static QName _ElencoRicetteFarmacia_QNAME = new QName("http://dmafarma.dma.csi.it/", "elencoRicetteFarmacia");
    private final static QName _ElencoRicetteFarmaciaResponse_QNAME = new QName("http://dmafarma.dma.csi.it/", "elencoRicetteFarmaciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.dmafarma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElencoRicetteFarmaciaResponse }
     * 
     */
    public ElencoRicetteFarmaciaResponse createElencoRicetteFarmaciaResponse() {
        return new ElencoRicetteFarmaciaResponse();
    }

    /**
     * Create an instance of {@link ElencoRicetteFarmaciaRequest }
     * 
     */
    public ElencoRicetteFarmaciaRequest createElencoRicetteFarmaciaRequest() {
        return new ElencoRicetteFarmaciaRequest();
    }

    /**
     * Create an instance of {@link GetDelegantiFarmaciaResponse }
     * 
     */
    public GetDelegantiFarmaciaResponse createGetDelegantiFarmaciaResponse() {
        return new GetDelegantiFarmaciaResponse();
    }

    /**
     * Create an instance of {@link GetDelegantiFarmaciaRequest }
     * 
     */
    public GetDelegantiFarmaciaRequest createGetDelegantiFarmaciaRequest() {
        return new GetDelegantiFarmaciaRequest();
    }

    /**
     * Create an instance of {@link ElencoRicette }
     * 
     */
    public ElencoRicette createElencoRicette() {
        return new ElencoRicette();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link DatiFarmaciaRichiedente }
     * 
     */
    public DatiFarmaciaRichiedente createDatiFarmaciaRichiedente() {
        return new DatiFarmaciaRichiedente();
    }

    /**
     * Create an instance of {@link ElencoErrori }
     * 
     */
    public ElencoErrori createElencoErrori() {
        return new ElencoErrori();
    }

    /**
     * Create an instance of {@link Ricetta }
     * 
     */
    public Ricetta createRicetta() {
        return new Ricetta();
    }

    /**
     * Create an instance of {@link Delegante }
     * 
     */
    public Delegante createDelegante() {
        return new Delegante();
    }

    /**
     * Create an instance of {@link ElencoDeleganti }
     * 
     */
    public ElencoDeleganti createElencoDeleganti() {
        return new ElencoDeleganti();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDelegantiFarmaciaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmafarma.dma.csi.it/", name = "getDelegantiFarmacia")
    public JAXBElement<GetDelegantiFarmaciaRequest> createGetDelegantiFarmacia(GetDelegantiFarmaciaRequest value) {
        return new JAXBElement<GetDelegantiFarmaciaRequest>(_GetDelegantiFarmacia_QNAME, GetDelegantiFarmaciaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDelegantiFarmaciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmafarma.dma.csi.it/", name = "getDelegantiFarmaciaResponse")
    public JAXBElement<GetDelegantiFarmaciaResponse> createGetDelegantiFarmaciaResponse(GetDelegantiFarmaciaResponse value) {
        return new JAXBElement<GetDelegantiFarmaciaResponse>(_GetDelegantiFarmaciaResponse_QNAME, GetDelegantiFarmaciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRicetteFarmaciaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmafarma.dma.csi.it/", name = "elencoRicetteFarmacia")
    public JAXBElement<ElencoRicetteFarmaciaRequest> createElencoRicetteFarmacia(ElencoRicetteFarmaciaRequest value) {
        return new JAXBElement<ElencoRicetteFarmaciaRequest>(_ElencoRicetteFarmacia_QNAME, ElencoRicetteFarmaciaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElencoRicetteFarmaciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dmafarma.dma.csi.it/", name = "elencoRicetteFarmaciaResponse")
    public JAXBElement<ElencoRicetteFarmaciaResponse> createElencoRicetteFarmaciaResponse(ElencoRicetteFarmaciaResponse value) {
        return new JAXBElement<ElencoRicetteFarmaciaResponse>(_ElencoRicetteFarmaciaResponse_QNAME, ElencoRicetteFarmaciaResponse.class, null, value);
    }

}
