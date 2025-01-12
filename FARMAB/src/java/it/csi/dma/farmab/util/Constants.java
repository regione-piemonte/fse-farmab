/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.util;

public class Constants {

	/**
	 * FARAB
	 */
	public static final String APPLICATION_CODE = "farmab";
	public static final String[] APPLICATIONS_RUPAR= {"WEBAPP_CM"};
	public static final String SUCCESS_CODE = "SUCCESSO";
	public static final String FAIL_CODE = "FALLIMENTO";
	public static final String SUCCESS_CODE_0000 = "0000";//Richiesta andata a buon fine
	public static final String FAIL_CODE_9999 = "9999";//Richiesta non accettata
	public static final String DEVICE_CERTIFICATO = "CERT";
	public static final String DEVICE_DISSOCIATO = "DIS";
	public static final String DEVICE_NON_CERT= "NON_CERT";
	public static final String FAROCC_CODSES_TIMETOLIVE ="FAROCC_CODSES_TIMETOLIVE";
	public static final String OTP_DEVICE_TIMETOLIVE = "OTP_DEVICE_TIMETOLIVE";
	public static final String NUM_MAX_TENTATIVI_INI_PROM = "NUM_MAX_TENTATIVI_INI_PROM";
	public static final int OTP_LENGHT = 6;
	public static final int IMEI_LENGHT = 15;
	//public static final int CF_LENGHT = 16; inserito controllo in FarmabUtils.isNotValidCf() per aggiungere controllo su cf con lunghezza 11 numerico
	public static final String OTP_DEVICE_LINK = "OTP_DEVICE_LINK";
	public static final String STATO_DELEGA = "ATTIVA";
	public static final String MAX_DATE_WHERE_IS_NULL = "DADEFINIRE";
	public static final String OPERATION_C_INSERISCI = "C";
	public static final String OPERATION_M_MODIFICA = "M";
	public static final String OPERATION_R_RIMUOVI = "R";

	public static final String CODICE_SERVIZIO_GET_FAMACIE="GET_FAR_ABI";

	//MAX_LENGHT
	public static final int CODICE_FARMACIA_LENGHT=10;
	public static final int NUMERO_TRANSAZIONE_LENGHT=100;
	//sarebbe il caso di farlo anche per ip ma ...... public static final int IP_LENGHT=256;

	//COSTANTI PER DELEGHE
	public static final String GET_DELEGANTI = "GET_DELEGANTI";
	public static final int ID_SERVIZIO_GETDELEGANTI = 1;
	public static final String MODULO_DELEGHE = "Modulo Deleghe";
	public static final String SUCCESS_CODE_MINUSCOLO = "successo";
	public static final String[] AZIONI = {"C","M","R"};
	public static final String CITTADINO="CIT";
	public static final String CODICE_SERVIZIO_IN_DELEGHE="FARAB";
	public static final String GRADO_DELEGA="FORTE";

	//costante per fatal da non mettere sul DB
	public static final String FAR_CC_FATAL="FAR-CC-FATAL";

	//Costanti ad uso LOG
	public static final String LOG_BLOCCANTE="Bloccante";
	public static final String LOG_SUCCESSO="Successo";

	/**
	 * FARAB costanti che devono essere decodificate come descrizione nel DB
	 */
	//COSTANTI PER MESSAGGI ERRORE (DMACC_D_CATOLOGO_LOG)
	public static final String FAR_CC_0000= "FAR-CC-0000";
	public static final String FAR_CC_0001= "FAR-CC-0001";
	public static final String FAR_CC_0002= "FAR-CC-0002";
	public static final String FAR_CC_0003= "FAR-CC-0003";
	public static final String FAR_CC_0004= "FAR-CC-0004";
	public static final String FAR_CC_0005= "FAR-CC-0005";
	public static final String FAR_CC_0050= "FAR-CC-0050";
	public static final String FAR_CC_0051= "FAR-CC-0051";
	public static final String FAR_CC_0052= "FAR-CC-0052";
	public static final String FAR_CC_0053= "FAR-CC-0053";
	public static final String FAR_CC_0054= "FAR-CC-0054";
	public static final String FAR_CC_0055= "FAR-CC-0055";
	public static final String FAR_CC_0056= "FAR-CC-0056";
	public static final String FAR_CC_0057= "FAR-CC-0057";
	public static final String FAR_CC_0058= "FAR-CC-0058";
	public static final String FAR_CC_0059= "FAR-CC-0059";
	public static final String FAR_CC_0060= "FAR-CC-0060";
	public static final String FAR_CC_0061= "FAR-CC-0061";
	public static final String FAR_CC_0062= "FAR-CC-0062";
	public static final String FAR_CC_0063= "FAR-CC-0063";
	public static final String FAR_CC_0064= "FAR-CC-0064";
	public static final String FAR_CC_0065= "FAR-CC-0065";
	public static final String FAR_CC_0066= "FAR-CC-0066";
	public static final String FAR_CC_0067= "FAR-CC-0067";
	public static final String FAR_CC_0068= "FAR-CC-0068";
	public static final String FAR_CC_0069= "FAR-CC-0069";
	public static final String FAR_CC_0070= "FAR-CC-0070";
	public static final String FAR_CC_0071= "FAR-CC-0071";
	public static final String FAR_CC_0072= "FAR-CC-0072";
	public static final String FAR_CC_0073= "FAR-CC-0073";
	public static final String FAR_CC_0074= "FAR-CC-0074";
	public static final String FAR_CC_0075= "FAR-CC-0075";
	public static final String FAR_CC_0076= "FAR-CC-0076";
	public static final String FAR_CC_0077= "FAR-CC-0077";
	public static final String FAR_CC_0078= "FAR-CC-0078";
	//MESSAGGI SOSTITUITI NEI SEGNAPOSTO {NUMERO} PER CODICE 0051
	public static final String CF_CITTADINO_0051= "codice fiscale cittadino";
	public static final String CODICE_OTP_0051= "codice OTP";
	public static final String CODICE_APPLICAZIONE_0051= "codice applicazione";
	public static final String CF_RICHIEDENTE_0051= "codice fiscale richiedente";
	public static final String CF_FARMACISTA_0051= "codice fiscale farmacista";
	public static final String CODICE_RUOLO_0051= "codice ruolo";
	public static final String FONTE_0051= "fonte";
	public static final String UUID_DEVICE_0051="uuidDevice";
	public static final String DATA_FINE_VALIDITA_0051= "data Fine Validita";
	public static final String APPLICATIVO_VERTICALE_0051= "applicativo verticale";
	public static final String DATA_INIZIO_VALIDITA_0051= "data Inizio Validita";
	//MESSAGGI SOSTITUITI NEI SEGNAPOSTO {NUMERO} PER CODICE 0050
	public static final String APPLICAZIONE_0050= "codice applicazione";
	public static final String APPLICATIVO_VERTICALE_0050= "applicativo verticale";
	public static final String CF_CITTADINO_0050= "codice fiscale cittadino";
	public static final String NUMERO_TRANSAZIONE_0050= "numero transazione";
	public static final String CODICE_RUOLO_0050= "codice ruolo";
	public static final String CF_RICHIEDENTE_0050= "codice fiscale richiedente";
	public static final String CF_ASSISTITO_0050= "codice fiscale assistito";
	public static final String CF_FARMACISTA_0050= "codice fiscale farmacista";
	public static final String UUID_DEVICE_0050= "uuid device";
	public static final String FONTE_0050= "fonte";
	public static final String NUMERO_TELEFONO_0050= "numero telefono";
	public static final String CODICE_OTP_0050= "codice OTP";
	public static final String PIN_CODE_0050= "pin code";
	public static final String CODICE_FARMACIA_0050= "codice farmacia";
	public static final String PIVA_FARMACIA_0050= "piva farmacia";
	public static final String GESTIONALE_0050= "gestionale";
	public static final String CODICE_SESSIONE_0050= "codice sessione";
	public static final String ID_FARMACIA_ABITUALE_0050= "id farmacia abituale";
	public static final String DATA_INIZIO_VALIDITA_0050= "data Inizio Validita";
	public static final String DATA_FINE_VALIDITA_0050= "data Fine Validita";
	//ERRORI IRIDE
	public static final String AUTH_ER_501="AUTH-ER-501";
	public static final String AUTH_ER_502="AUTH-ER-502";
	public static final String AUTH_ER_503="AUTH-ER-503";
	public static final String AUTH_ER_504="AUTH-ER-504";
	public static final String AUTH_ER_505="AUTH-ER-505";
	public static final String AUTH_ER_506="AUTH-ER-506";

	//costanti per codice catalogo
	public static final String CATALOG_ELE_RIC_FAR = "ELE_RIC_FAR";
	public static final String CATALOG_ELE_RIC_FAR_DEL = "ELE_RIC_FAR_DEL";
	public static final String CATALOG_GET_DEL_FAR = "GET_DEL_FAR";
	public static final String CATALOG_SET_FARAB = "SET_FARAB";
	public static final String CATALOG_SET_FARAB_DEL = "SET_FARAB_DEL";
	public static final String CATALOG_CERT_DEV_OTP = "CERT_DEV_OTP";
	public static final String CATALOG_AUT_FAR_OCC = "AUT_FAR_OCC";
	public static final String CATALOG_SET_DIS_DEV = "SET_DIS_DEV";
	public static final String CATALOG_CERT_DEV = "CERT_DEV";
	public static final String RUOLO_DEL = "DEL";
	public static final String SANSOL = "SANSOL";

	//CHIAVE PER LEGARE REQUEST E RESPOSNE
	public static final String LOGGING_KEY_L_XML_MESSAGGI = "LOGGING_KEY_L_XML_MESSAGGI";
	public static final String LOGGING_WSO2ID = "WSO2ID";
	public static final String LOGGING_KEY_L_MESSAGGI = "LOGGING_KEY_L_MESSAGGI";
	public static final String REQUEST_ID_NONTROVATO = APPLICATION_CODE + "_REQUESTIDNONTROVATO";

	//COSTANTI PER RICHIAMO INI 27/01/2023
	public static final String COD_REGIONALE_INI = "010";
	public static final String COD_DOCUMENTO_INI = "57833-6";
	public static final String COD_RUOLO_UTENTE_INI = "FAR";
}
