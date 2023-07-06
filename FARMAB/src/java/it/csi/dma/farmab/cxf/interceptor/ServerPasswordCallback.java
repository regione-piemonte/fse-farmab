/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.cxf.interceptor;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.log4j.Logger;
import org.apache.ws.security.WSPasswordCallback;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.dma.farmab.domain.DmaccDCredenzialiServizi;
import it.csi.dma.farmab.integration.dao.FarmabDCredenzialiServiziDao;
import it.csi.dma.farmab.util.Constants;

public class ServerPasswordCallback implements CallbackHandler {

	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);

	@Autowired
	FarmabDCredenzialiServiziDao credenzialiDao;

	private static final String CODICE_SERVIZIO = "FARAB";

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		// TODO Auto-generated method stub
		List<DmaccDCredenzialiServizi> lista = credenzialiDao.getcredenzialiFromCodiceServizio(CODICE_SERVIZIO);
		for (int i = 0; i < callbacks.length; i++)
		{
			WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
			String user = pc.getIdentifier();

			Optional<DmaccDCredenzialiServizi> identifier = lista.stream().filter(c -> user.equalsIgnoreCase(c.getUsername()) ).findFirst();
			if(!identifier.isPresent()){
				log.error("Credenziali non valide verificare sulla tabella dmacc_d_credenziali_servizi per il CODICE_SERVIZIO="+CODICE_SERVIZIO);
				throw new IOException("Credenziali non valide");
			}
			pc.setPassword(identifier.get().getPassword());

		}


	}


}
