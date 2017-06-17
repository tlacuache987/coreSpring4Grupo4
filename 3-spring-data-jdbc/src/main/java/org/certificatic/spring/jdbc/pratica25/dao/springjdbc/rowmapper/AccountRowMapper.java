package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.certificatic.spring.jdbc.pratica25.domain.entities.Account;
import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.certificatic.spring.jdbc.pratica25.domain.vo.CustomDate;
import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		
		Customer customer = new Customer();

		// Implementar Account row mapper
		account.setId(rs.getLong("ACCOUNT_ID"));
		account.setAccountNumber(rs.getString("ACCOUNT_NUMBER"));
		account.setCreatedDate(new CustomDate(rs.getDate("CREATED_DATE").getTime()));
		account.setBalance(rs.getBigDecimal("BALANCE"));
		
		customer.setId(rs.getLong("FK_CUSTOMER_ID"));
		
		account.setCustomer(customer);

		return account;
	}

}
