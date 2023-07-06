/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/


package it.csi.ricercadocumentiini.dmacc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.14
 * 2023-01-23T14:06:48.850+01:00
 * Generated source version: 2.7.14
 * 
 */
public final class RicercaDocumentiINIService_RicercaDocumentiINIServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://dmacc.csi.it/", "RicercaDocumentiINIService");

    private RicercaDocumentiINIService_RicercaDocumentiINIServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RicercaDocumentiINIService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        RicercaDocumentiINIService_Service ss = new RicercaDocumentiINIService_Service(wsdlURL, SERVICE_NAME);
        RicercaDocumentiINIService port = ss.getRicercaDocumentiINIServicePort();  
        
        {
        System.out.println("Invoking ricercaDocumenti...");
        it.csi.ricercadocumentiini.dmacc.RicercaDocumentiRequeste _ricercaDocumenti_ricercaDocumenti = null;
        it.csi.ricercadocumentiini.dmacc.RicercaDocumentiResponse _ricercaDocumenti__return = port.ricercaDocumenti(_ricercaDocumenti_ricercaDocumenti);
        System.out.println("ricercaDocumenti.result=" + _ricercaDocumenti__return);


        }

        System.exit(0);
    }

}
