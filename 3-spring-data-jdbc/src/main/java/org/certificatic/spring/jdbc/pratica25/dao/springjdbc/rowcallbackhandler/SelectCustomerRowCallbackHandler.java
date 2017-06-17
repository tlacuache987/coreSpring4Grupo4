package org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowcallbackhandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.certificatic.spring.jdbc.pratica25.dao.springjdbc.rowmapper.CustomerRowMapper;
import org.certificatic.spring.jdbc.pratica25.domain.entities.Customer;
import org.springframework.jdbc.core.RowCallbackHandler;

import lombok.Getter;

public class SelectCustomerRowCallbackHandler implements RowCallbackHandler {

	private CustomerRowMapper customerRowMapper = new CustomerRowMapper();
	private @Getter List<Customer> customerList = new ArrayList<>();

	private int i = 0;

	@Override
	public void processRow(ResultSet rs) throws SQLException {
		customerList.add(customerRowMapper.mapRow(rs, i++));
	}

}