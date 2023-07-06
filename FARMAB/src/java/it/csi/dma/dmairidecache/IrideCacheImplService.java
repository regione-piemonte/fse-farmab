/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.dmairidecache;

import java.net.MalformedURLException;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-12-16T10:20:22.528+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebServiceClient(name = "IrideCacheImplService", 
                  wsdlLocation = "",
                  targetNamespace = "http://dmairidecache.dma.csi.it") 
public class IrideCacheImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dmairidecache.dma.csi.it", "IrideCacheImplService");
    public final static QName IrideCacheImplPort = new QName("http://dmairidecache.dma.csi.it", "IrideCacheImplPort");
    static {
        URL url = null;
        try {
            url = new URL("");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IrideCacheImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "");
        }
        WSDL_LOCATION = url;
    }

    public IrideCacheImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IrideCacheImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IrideCacheImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IrideCacheImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IrideCacheImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IrideCacheImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IrideCache
     */
    @WebEndpoint(name = "IrideCacheImplPort")
    public IrideCache getIrideCacheImplPort() {
        return super.getPort(IrideCacheImplPort, IrideCache.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IrideCache
     */
    @WebEndpoint(name = "IrideCacheImplPort")
    public IrideCache getIrideCacheImplPort(WebServiceFeature... features) {
        return super.getPort(IrideCacheImplPort, IrideCache.class, features);
    }

}
