package com.restApp.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import com.restApp.model.Person;

public class PersonDaoTest {
	@Test
	public void shouldDoSomething() {
		String sqlToExecute="select * from class1";
		
		Person fakeAccountsObject = new Person();
		fakeAccountsObject.setPersonId(1L);
		fakeAccountsObject.setAmount(new BigDecimal(1250.00));
		
		
		JdbcTemplate jdbcTemplate = Mockito.mock(JdbcTemplate.class);
		Mockito.when(jdbcTemplate.queryForObject(sqlToExecute, Person.class)).thenReturn(fakeAccountsObject);
		
		
		
		//create our class
		PersonDao accountsDao = new PersonDao(jdbcTemplate);
		
		//run the test
		List<Person> list = accountsDao.doSomeStuff(sqlToExecute);
		
		Assert.assertEquals(1,list.size());
		Assert.assertEquals(fakeAccountsObject.getPersonId(), list.get(0).getPersonId());
		Assert.assertEquals(fakeAccountsObject.getAmount(), list.get(0).getAmount());
		
	}
}
