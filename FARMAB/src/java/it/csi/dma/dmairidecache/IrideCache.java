/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.dmairidecache;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-12-16T10:20:22.483+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmairidecache.dma.csi.it", name = "IrideCache")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IrideCache {

    @WebMethod
    @WebResult(name = "identificaUserPasswordPinResponse", targetNamespace = "http://dmairidecache.dma.csi.it", partName = "identificaUserPasswordPinResponse")
    public IdentificaUserPasswordPinResponse identificaUserPasswordPin(
        @WebParam(partName = "identificaUserPasswordPin", name = "identificaUserPasswordPin", targetNamespace = "http://dmairidecache.dma.csi.it")
        IdentificaUserPasswordPin identificaUserPasswordPin
    );

    @WebMethod
    @WebResult(name = "identificaUserPasswordResponse", targetNamespace = "http://dmairidecache.dma.csi.it", partName = "identificaUserPasswordResponse")
    public IdentificaUserPasswordResponse identificaUserPassword(
        @WebParam(partName = "identificaUserPassword", name = "identificaUserPassword", targetNamespace = "http://dmairidecache.dma.csi.it")
        IdentificaUserPassword identificaUserPassword
    );
}
