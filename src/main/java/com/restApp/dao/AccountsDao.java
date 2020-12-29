package com.restApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restApp.model.Accounts;

public class AccountsDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public AccountsDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Accounts> doSomeStuff(String sql) {
		Accounts returnedAccount = this.jdbcTemplate.queryForObject(sql, Accounts.class);
		List<Accounts> list = new ArrayList<Accounts>();
		list.add(returnedAccount);
		return list;
	}
}
