package com.restApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restApp.model.Person;

public class PersonDao {
	private JdbcTemplate jdbcTemplate;
	
	
	public PersonDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Person> doSomeStuff(String sql) {
		Person returnedAccount = this.jdbcTemplate.queryForObject(sql, Person.class);
		List<Person> list = new ArrayList<Person>();
		list.add(returnedAccount);
		return list;
	}
}
