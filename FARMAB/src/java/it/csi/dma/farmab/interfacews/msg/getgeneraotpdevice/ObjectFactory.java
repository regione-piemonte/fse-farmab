/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.dma.farmab.interfacews.msg.getgeneraotpdevice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.dma.farmab.interfacews.msg.getgeneraotpdevice package. 
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

    private final static QName _GetGeneraOtpDevice_QNAME = new QName("http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/", "getGeneraOtpDevice");
    private final static QName _GetGeneraOtpDeviceResponse_QNAME = new QName("http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/", "getGeneraOtpDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.dma.farmab.interfacews.msg.getgeneraotpdevice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGeneraOtpDeviceRequest }
     * 
     */
    public GetGeneraOtpDeviceRequest createGetGeneraOtpDeviceRequest() {
        return new GetGeneraOtpDeviceRequest();
    }

    /**
     * Create an instance of {@link GetGeneraOtpDeviceResponse }
     * 
     */
    public GetGeneraOtpDeviceResponse createGetGeneraOtpDeviceResponse() {
        return new GetGeneraOtpDeviceResponse();
    }

    /**
     * Create an instance of {@link Richiedente }
     * 
     */
    public Richiedente createRichiedente() {
        return new Richiedente();
    }

    /**
     * Create an instance of {@link Codifica }
     * 
     */
    public Codifica createCodifica() {
        return new Codifica();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link TipoCodice }
     * 
     */
    public TipoCodice createTipoCodice() {
        return new TipoCodice();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Errore }
     * 
     */
    public Errore createErrore() {
        return new Errore();
    }

    /**
     * Create an instance of {@link ElencoErroriType }
     * 
     */
    public ElencoErroriType createElencoErroriType() {
        return new ElencoErroriType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneraOtpDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/", name = "getGeneraOtpDevice")
    public JAXBElement<GetGeneraOtpDeviceRequest> createGetGeneraOtpDevice(GetGeneraOtpDeviceRequest value) {
        return new JAXBElement<GetGeneraOtpDeviceRequest>(_GetGeneraOtpDevice_QNAME, GetGeneraOtpDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneraOtpDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://getgeneraotpdevice.msg.interfacews.farmab.dma.csi.it/", name = "getGeneraOtpDeviceResponse")
    public JAXBElement<GetGeneraOtpDeviceResponse> createGetGeneraOtpDeviceResponse(GetGeneraOtpDeviceResponse value) {
        return new JAXBElement<GetGeneraOtpDeviceResponse>(_GetGeneraOtpDeviceResponse_QNAME, GetGeneraOtpDeviceResponse.class, null, value);
    }

}
