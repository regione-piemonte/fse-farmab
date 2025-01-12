/*******************************************************************************
* Copyright Regione Piemonte - 2023
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.dma.farmab.integration.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.dma.farmab.integration.dao.dto.AuditDto;
import it.csi.dma.farmab.integration.dao.dto.CatalogoLogAuditLowDto;
import it.csi.dma.farmab.integration.dao.rowmapper.CatalogoLogAuditLowDaoRowMapper;
import it.csi.dma.farmab.util.Constants;
import it.csi.dma.farmab.util.NamedParameterJdbcTemplateWithQueryDebug;

@Repository
public class LogAuditDao extends JdbcDaoSupport {
	private final static Logger log = Logger.getLogger(Constants.APPLICATION_CODE);
	@Autowired
	private NamedParameterJdbcTemplateWithQueryDebug namedJdbcTemplate;

	@Value("${encryptionkey}")
	private String encryptionkey;

	private static final String INSERT_T_LOG_AUDIT = "INSERT INTO dmacc_t_log_audit "
	 +  " ( ID,INFORMAZIONI_TRACCIATE,ID_CATALOGO_LOG_AUDIT,DATA_INSERIMENTO,ID_TRANSAZIONE,ID_APPLICAZIONE_RICHIEDENTE,"
	 + " ID_RUOLO ,CODICE_SERVIZIO,NOME_SERVIZIO,APPL_VERTICALE,IP_CHIAMANTE,ID_PAZIENTE,CODICE_FISCALE_UTENTE, VISIBILEALCITTADINO, ID_UTENTE, COLLOCAZIONE) VALUES "
	 + " ( nextval('seq_dmacc_t_log_audit'),:INFORMAZIONI_TRACCIATE,:ID_CATALOGO_LOG_AUDIT,now(),:ID_TRANSAZIONE,"
	 + " ( SELECT ID FROM DMACC_D_APPLICAZIONE_RICHIEDENTE  WHERE CODICE_APPLICAZIONE = :CODICE_APPLICAZIONE) ,"
	 + " (select id from dmacc_d_ruolo where codice_ruolo = :CODICE_RUOLO ), :CODICE_SERVIZIO,:NOME_SERVIZIO,:APPL_VERTICALE,:IP_CHIAMANTE,:ID_PAZIENTE, "
	 + " pgp_sym_encrypt(:CODICE_FISCALE_UTENTE ,:encryption_key)::bytea, :VISIBILEALCITTADINO, :ID_UTENTE, :COLLOCAZIONE )";


	private static final String SELECT_D_CATALOGO_LOG_AUDIT = "SELECT ID,CODICE,DESCRIZIONE,DESCRIZIONE_CODICE,DATA_INSERIMENTO,VISUALIZZA_WEBAPP FROM "
			+ " dmacc_d_catalogo_log_audit where CODICE = :CODICE";



	@Autowired
	LogAuditDao(DataSource dataSource){

		setDataSource(dataSource);
	}


	public void insertTlogAudit(AuditDto dto){

		String uuid = UUID.randomUUID().toString();
		StringBuilder sql = new StringBuilder();
		sql.append(INSERT_T_LOG_AUDIT);
		MapSqlParameterSource params = new MapSqlParameterSource();

		params.addValue("INFORMAZIONI_TRACCIATE", dto.getInformazioniTracciate());
		params.addValue("ID_PAZIENTE", dto.getIdPaziente());
		params.addValue("ID_CATALOGO_LOG_AUDIT", dto.getIdCatalogoLogAudit());
		params.addValue("ID_TRANSAZIONE", uuid);
		params.addValue("CODICE_APPLICAZIONE", dto.getCodiceApplicazioneRichiedente());
		params.addValue("ID_UTENTE", dto.getIdUtente());
		params.addValue("CODICE_RUOLO", dto.getCodiceRuolo());
		params.addValue("CODICE_FISCALE_UTENTE", dto.getCodiceFiscaleUtente());
		params.addValue("CODICE_SERVIZIO", dto.getCodiceServizio());
		params.addValue("NOME_SERVIZIO", dto.getNomeServizio());
		params.addValue("APPL_VERTICALE", dto.getApplicativoVerticale());
		params.addValue("IP_CHIAMANTE", dto.getIpChiamante());
		params.addValue("VISIBILEALCITTADINO", dto.getVisibileAlCittadino());
		params.addValue("encryption_key", encryptionkey, Types.VARCHAR);
		params.addValue("COLLOCAZIONE", dto.getCollocazione());

		logger.info("LogAuditDao::insertTlogAudit sql: " + sql.toString());

		try {

			this.namedJdbcTemplate.update(sql.toString(), params);
		} catch (Exception ex) {
			log.error("[LogAuditDao::insertTlogAudit ERROR]", ex);
			throw ex;
		}
	}

	public CatalogoLogAuditLowDto geCatalogoLogAudittByCodice(String codice){
		List<CatalogoLogAuditLowDto> list = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append(SELECT_D_CATALOGO_LOG_AUDIT);



		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("CODICE", codice);

		try {
			list = namedJdbcTemplate.query(sql.toString(), paramSource, new CatalogoLogAuditLowDaoRowMapper());
		} catch (Exception e) {
			log.error("[LogAuditDao::geCatalogoLogAudittByCodice error]" + e.getMessage());
			throw e;
		}

		if(list == null || list.size() == 0){
			return null;
		}

		return list.get(0);
	}
}
