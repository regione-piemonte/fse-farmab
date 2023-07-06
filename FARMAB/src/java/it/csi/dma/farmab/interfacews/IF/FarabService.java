/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.interfacews.IF;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import it.csi.dma.farmab.interfacews.msg.farab.AutorizzaFarmaciaOccasionale;
import it.csi.dma.farmab.interfacews.msg.farab.AutorizzaFarmaciaOccasionaleResponse;
import it.csi.dma.farmab.interfacews.msg.farab.CertificaDevice;
import it.csi.dma.farmab.interfacews.msg.farab.CertificaDeviceConOtp;
import it.csi.dma.farmab.interfacews.msg.farab.CertificaDeviceConOtpResponse;
import it.csi.dma.farmab.interfacews.msg.farab.CertificaDeviceResponse;
import it.csi.dma.farmab.interfacews.msg.farab.GetFarmaciaOccasionale;
import it.csi.dma.farmab.interfacews.msg.farab.GetFarmaciaOccasionaleResponse;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-11-18T09:45:32.858+01:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://farab.msg.interfacews.farmab.dma.csi.it/", name = "FarabService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface FarabService {

	@WebMethod
	public @WebResult CertificaDeviceResponse certificaDevice(@WebParam CertificaDevice certificaDeviceRequest);
	
	@WebMethod
	public @WebResult CertificaDeviceConOtpResponse certificaDeviceConOtp(@WebParam CertificaDeviceConOtp certificaDeviceConOtpRequest);

	@WebMethod
	public @WebResult GetFarmaciaOccasionaleResponse getFarmaciaOccasionale(@WebParam GetFarmaciaOccasionale getFarmaciaOccasionaleRequest);
	
	@WebMethod
	public @WebResult AutorizzaFarmaciaOccasionaleResponse autorizzaFarmaciaOccasionale(@WebParam AutorizzaFarmaciaOccasionale autorizzaFarmaciaOccasionaleRequest);
}
