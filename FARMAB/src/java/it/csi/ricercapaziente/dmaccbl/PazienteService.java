/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.ricercapaziente.dmaccbl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2021-09-15T08:53:36.855+02:00
 * Generated source version: 2.7.14
 * 
 */
@WebService(targetNamespace = "http://dmaccbl.csi.it/", name = "PazienteService")
@XmlSeeAlso({ObjectFactory.class, it.csi.ricercapaziente.dma.ObjectFactory.class, it.csi.ricercapaziente.dmacc.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PazienteService {

    @WebMethod
    @WebResult(name = "getPazienteByIdIrecResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getPazienteByIdIrecResponse")
    public GetPazienteByIdIRECResponse getPazienteByIdIrec(
        @WebParam(partName = "getPazienteByIdIrec", name = "getPazienteByIdIrec", targetNamespace = "http://dmaccbl.csi.it/")
        GetPazienteByIdIREC getPazienteByIdIrec
    );

    @WebMethod
    @WebResult(name = "setDatiNotificaMMGResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "setDatiNotificaMMGResponse")
    public SetDatiNotificaMMGResponse setDatiNotificaMMG(
        @WebParam(partName = "setDatiNotificaMMG", name = "setDatiNotificaMMG", targetNamespace = "http://dmaccbl.csi.it/")
        SetDatiNotificaMMG setDatiNotificaMMG
    );

    @WebMethod
    @WebResult(name = "notificaDocumentoScaricabileResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "notificaDocumentoScaricabileResponse")
    public NotificaRefertoScaricabileResponse notificaDocumentoScaricabile(
        @WebParam(partName = "notificaDocumentoScaricabile", name = "notificaDocumentoScaricabile", targetNamespace = "http://dmaccbl.csi.it/")
        NotificaDocumentoScaricabile notificaDocumentoScaricabile
    );

    @WebMethod
    @WebResult(name = "verificaRefertiInScadenzaResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "verificaRefertiInScadenzaResponse")
    public InvioNotifichePazientiResponse verificaRefertiInScadenza(
        @WebParam(partName = "verificaRefertiInScadenza", name = "verificaRefertiInScadenza", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti verificaRefertiInScadenza
    );

    @WebMethod
    @WebResult(name = "invioNotifichePazientiNRResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "invioNotifichePazientiNRResponse")
    public InvioNotifichePazientiResponse invioNotifichePazientiNR(
        @WebParam(partName = "invioNotifichePazientiNR", name = "invioNotifichePazientiNR", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti invioNotifichePazientiNR
    );

    @WebMethod
    @WebResult(name = "getInfoPazienteResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getInfoPazienteResponse")
    public GetInfoPazienteResponse getInfoPaziente(
        @WebParam(partName = "getInfoPaziente", name = "getInfoPaziente", targetNamespace = "http://dmaccbl.csi.it/")
        GetInfoPaziente getInfoPaziente
    );

    @WebMethod
    @WebResult(name = "notificaPresenzaDatiILECResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "notificaPresenzaDatiILECResponse")
    public NotificaPresenzaDatiILECResponse notificaPresenzaDatiILEC(
        @WebParam(partName = "notificaPresenzaDatiILEC", name = "notificaPresenzaDatiILEC", targetNamespace = "http://dmaccbl.csi.it/")
        NotificaPresenzaDatiILEC notificaPresenzaDatiILEC
    );

    @WebMethod
    @WebResult(name = "AlimentazioneElencoCodiciFiscaliResponse", targetNamespace = "http://dmacc.csi.it/", partName = "AlimentazioneElencoCodiciFiscaliResponse")
    public AlimentazioneElencoCodiciFiscaliResponse alimentazioneElencoCodiciFiscali(
        @WebParam(partName = "AlimentazioneElencoCodiciFiscaliRequest", name = "AlimentazioneElencoCodiciFiscaliRequest", targetNamespace = "http://dmacc.csi.it/")
        AlimentazioneElencoCodiciFiscali alimentazioneElencoCodiciFiscaliRequest
    );

    @WebMethod
    @WebResult(name = "GetAccessiResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "GetAccessiResponse")
    public GetAccessiResponse getAccessi(
        @WebParam(partName = "getAccessi", name = "getAccessi", targetNamespace = "http://dmaccbl.csi.it/")
        GetAccessi getAccessi
    );

    @WebMethod
    @WebResult(name = "getDoNotificaMMGResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getDoNotificaMMGResponse")
    public GetDoNotificaMMGResponse getDoNotificaMMG(
        @WebParam(partName = "getDoNotificaMMG", name = "getDoNotificaMMG", targetNamespace = "http://dmaccbl.csi.it/")
        GetDoNotificaMMG getDoNotificaMMG
    );

    @WebMethod
    @WebResult(name = "NotificaOscuramentoNREResponse", targetNamespace = "http://dmacc.csi.it/", partName = "NotificaOscuramentoNREResponse")
    public it.csi.ricercapaziente.dmacc.NotificaOscuramentoNREResponse notificaOscuramentoNRE(
        @WebParam(partName = "NotificaOscuramentoNRERequest", name = "NotificaOscuramentoNRERequest", targetNamespace = "http://dmacc.csi.it/")
        it.csi.ricercapaziente.dmacc.NotificaOscuramentoNRERequest notificaOscuramentoNRERequest
    );

    @WebMethod
    @WebResult(name = "preparaNotifichePazientiNRResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "preparaNotifichePazientiNRResponse")
    public InvioNotifichePazientiResponse preparaNotifichePazientiNR(
        @WebParam(partName = "preparaNotifichePazientiNR", name = "preparaNotifichePazientiNR", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti preparaNotifichePazientiNR
    );

    @WebMethod
    @WebResult(name = "ricercaPazienteResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "ricercaPazienteResponse")
    public RicercaPazienteResponse ricercaPaziente(
        @WebParam(partName = "ricercaPaziente", name = "ricercaPaziente", targetNamespace = "http://dmaccbl.csi.it/")
        RicercaPaziente ricercaPaziente
    );

    @WebMethod
    @WebResult(name = "getRiepilogoResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getRiepilogoResponse")
    public GetRiepilogoResponse getRiepilogo(
        @WebParam(partName = "getRiepilogo", name = "getRiepilogo", targetNamespace = "http://dmaccbl.csi.it/")
        GetRiepilogo getRiepilogo
    );

    @WebMethod
    @WebResult(name = "getCLDaInvocareResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getCLDaInvocareResponse")
    public GetCLDaInvocareResponse getCLDaInvocare(
        @WebParam(partName = "getCLDaInvocare", name = "getCLDaInvocare", targetNamespace = "http://dmaccbl.csi.it/")
        GetCLDaInvocare getCLDaInvocare
    );

    @WebMethod
    @WebResult(name = "invioNotifichePazientiNFResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "invioNotifichePazientiNFResponse")
    public InvioNotifichePazientiResponse invioNotifichePazientiNF(
        @WebParam(partName = "invioNotifichePazientiNF", name = "invioNotifichePazientiNF", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti invioNotifichePazientiNF
    );

    @WebMethod
    @WebResult(name = "GetAccessi2Response", targetNamespace = "http://dmaccbl.csi.it/", partName = "GetAccessi2Response")
    public GetAccessi2Response getAccessi2(
        @WebParam(partName = "GetAccessi2Request", name = "GetAccessi2Request", targetNamespace = "http://dmaccbl.csi.it/")
        GetAccessi2Request getAccessi2Request
    );

    @WebMethod
    @WebResult(name = "invioNotifichePazientiNAResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "invioNotifichePazientiNAResponse")
    public InvioNotifichePazientiResponse invioNotifichePazientiNA(
        @WebParam(partName = "invioNotifichePazientiNA", name = "invioNotifichePazientiNA", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti invioNotifichePazientiNA
    );

    @WebMethod
    @WebResult(name = "NotificaDocumentoNonScaricabileResponse", targetNamespace = "http://dmacc.csi.it/", partName = "NotificaDocumentoNonScaricabileResponse")
    public it.csi.ricercapaziente.dmacc.NotificaDocumentoNonScaricabileResponse notificaDocumentoNonScaricabile(
        @WebParam(partName = "NotificaDocumentoNonScaricabileRequest", name = "NotificaDocumentoNonScaricabileRequest", targetNamespace = "http://dmacc.csi.it/")
        it.csi.ricercapaziente.dmacc.NotificaDocumentoNonScaricabileRequest notificaDocumentoNonScaricabileRequest
    );

    @WebMethod
    @WebResult(name = "setInfoPazienteResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "setInfoPazienteResponse")
    public SetInfoPazienteResponse setInfoPaziente(
        @WebParam(partName = "setInfoPaziente", name = "setInfoPaziente", targetNamespace = "http://dmaccbl.csi.it/")
        SetInfoPaziente setInfoPaziente
    );

    @WebMethod
    @WebResult(name = "getDatiNotificaMMGResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getDatiNotificaMMGResponse")
    public GetDatiNotificaMMGResponse getDatiNotificaMMG(
        @WebParam(partName = "getDatiNotificaMMG", name = "getDatiNotificaMMG", targetNamespace = "http://dmaccbl.csi.it/")
        GetDatiNotificaMMG getDatiNotificaMMG
    );

    @WebMethod
    @WebResult(name = "getMMGPazienteResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "getMMGPazienteResponse")
    public GetMMGPazienteResponse getMMGPaziente(
        @WebParam(partName = "getMMGPaziente", name = "getMMGPaziente", targetNamespace = "http://dmaccbl.csi.it/")
        GetMMGPaziente getMMGPaziente
    );

    @WebMethod
    @WebResult(name = "invioNotifichePazientiResponse", targetNamespace = "http://dmaccbl.csi.it/", partName = "invioNotifichePazientiResponse")
    public InvioNotifichePazientiResponse invioNotifichePazienti(
        @WebParam(partName = "invioNotifichePazienti", name = "invioNotifichePazienti", targetNamespace = "http://dmaccbl.csi.it/")
        InvioNotifichePazienti invioNotifichePazienti
    );
}
