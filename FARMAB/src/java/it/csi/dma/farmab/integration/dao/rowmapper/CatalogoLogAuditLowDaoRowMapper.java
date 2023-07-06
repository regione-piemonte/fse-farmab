/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.integration.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.csi.dma.farmab.integration.dao.dto.CatalogoLogAuditLowDto;

public class CatalogoLogAuditLowDaoRowMapper implements RowMapper<CatalogoLogAuditLowDto> {

	@Override
	public CatalogoLogAuditLowDto mapRow(ResultSet rs, int paramInt) throws SQLException {
		CatalogoLogAuditLowDto dto = new CatalogoLogAuditLowDto();
		dto.setId(Long.valueOf(rs.getLong("ID")));
		dto.setCodice(rs.getString("CODICE"));
		dto.setDescrizione(rs.getString("DESCRIZIONE"));
		dto.setDataInserimento(rs.getTimestamp("DATA_INSERIMENTO"));
		dto.setDescrizioneCodice(rs.getString("DESCRIZIONE_CODICE"));
		
		return dto;
	}
	

}
