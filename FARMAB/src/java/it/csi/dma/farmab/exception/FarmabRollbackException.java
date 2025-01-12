/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.exception;

import org.apache.log4j.Logger;

import it.csi.dma.farmab.util.Constants;

public class FarmabRollbackException extends Exception{
	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);

	public FarmabRollbackException() {
		super();
		log.error("FarmabRollbackException:Rollaback");
	}
	
	public FarmabRollbackException(String message, Throwable cause, String cf) {
		super(message,cause);
		log.error(message, cause);
	}
	

}
