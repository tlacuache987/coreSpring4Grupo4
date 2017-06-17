package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.impl;

import java.util.List;

import org.certificatic.spring.jdbc.pratica25.dao.api.IAccountDAO;
import org.certificatic.spring.jdbc.pratica25.dao.springjdbc.GenericSpringJdbcDAO;
import org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper.AccountRowMapper;
import org.certificatic.spring.jdbc.pratica25.domain.entities.Account;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
@Profile({ "h2-in-memory", "h2-local", "mysql" })
public class AccountSpringJdbcDAO extends GenericSpringJdbcDAO<Account, Long> implements IAccountDAO {

	private static final String SELECT_ALL_ACCOUNT_WHERE_CUSTOMER_ID = "SELECT * FROM ACCOUNT_TBL WHERE FK_CUSTOMER_ID = ?";
	private static final String SELECT_ALL_ACCOUNT = "SELECT * FROM ACCOUNT_TBL";
	private static final String SELECT_ACCOUNT = "SELECT * FROM ACCOUNT_TBL WHERE ACCOUNT_ID = ?";

	private static final String INSERT_ACCOUNT = "INSERT INTO ACCOUNT_TBL VALUES (null, :fkCustomerId, :accountNumber, :createdDate, :balance)";

	private static final String UPDATE_ACCOUNT_WHERE_ACCOUNT_ID = "UPDATE ACCOUNT_TBL SET ACCOUNT_NUMBER = ?, CREATED_DATE = ?, BALANCE = ? WHERE ACCOUNT_ID = ?";

	private static final String DELETE_ACCOUNT = "DELETE FROM ACCOUNT_TBL WHERE ACCOUNT_ID = ?";

	@Override
	public List<Account> findByCustomerId(Long id) {

		// FIND ACCOUNT BY CUSTOMER ID

		// Implementar mediante JdbcTemplate y AccountRowMapper
		// Se espera una lista de objetos
		return this.jdbcTemplate.query(SELECT_ALL_ACCOUNT_WHERE_CUSTOMER_ID, new AccountRowMapper(), id);
	}

	@Override
	public void insert(Account account) {
		// INSERT Account

		// Implementar mediante NamedParameterJdbcTemplate, SqlParameterSource y
		// KeyHolder

		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("fkCustomerId", account.getCustomer().getId());
		paramSource.addValue("accountNumber", account.getAccountNumber());
		paramSource.addValue("createdDate", account.getCreatedDate());
		paramSource.addValue("balance", account.getBalance());

		this.namedJdbcTemplate.update(INSERT_ACCOUNT, paramSource, keyHolder);
		
		account.setId(keyHolder.getKey().longValue());
	}

	@Override
	public void update(Account account) {
		// UPDATE ACCOUNT

		// Implementar mediante JdbcTemplate
		
		this.jdbcTemplate.update(UPDATE_ACCOUNT_WHERE_ACCOUNT_ID, account.getAccountNumber(), account.getCreatedDate(),
				account.getBalance(), account.getId());
	}

	@Override
	public Account findById(Long id) {
		Account account = null;

		// FIND ACCOUNT BY ID
		try {

			// Implementar mediante JdbcTemplate y AccountRowMapper
			// Se espera un unico objeto
			
			account = this.jdbcTemplate.queryForObject(SELECT_ACCOUNT, new AccountRowMapper(), id);

		} catch (EmptyResultDataAccessException ex) {
			// Cuando se usa queryForObject se espera al menos 1 resultado.
			return null;
		}

		return account;
	}

	@Override
	public Account delete(Long id) {
		Account account = this.findById(id);
		return this.delete(account);
	}

	@Override
	public Account delete(Account account) {
		if (account == null)
			return account;

		// DELETE ACCOUNT

		// Implementar mediante JdbcTemplate
		this.jdbcTemplate.update(DELETE_ACCOUNT, account.getId());

		return account;
	}

	@Override
	public List<Account> findAll() {
		List<Account> accountList = null;

		// FIND ALL Account
		// Implementar mediante JdbcTemplate y AccountRowMapper
		
		accountList = this.jdbcTemplate.query(SELECT_ALL_ACCOUNT, new AccountRowMapper());

		return accountList;
	}

}
