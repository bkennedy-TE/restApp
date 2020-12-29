package com.restApp.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import com.restApp.model.Accounts;

public class AccountsDaoTest {
	@Test
	public void shouldDoSomething() {
		String sqlToExecute="select * from class1";
		
		Accounts fakeAccountsObject = new Accounts();
		fakeAccountsObject.setAccountId(1L);
		fakeAccountsObject.setBalance(new BigDecimal(1250.00));
		
		
		JdbcTemplate jdbcTemplate = Mockito.mock(JdbcTemplate.class);
		Mockito.when(jdbcTemplate.queryForObject(sqlToExecute, Accounts.class)).thenReturn(fakeAccountsObject);
		
		
		
		//create our class
		AccountsDao accountsDao = new AccountsDao(jdbcTemplate);
		
		//run the test
		List<Accounts> list = accountsDao.doSomeStuff(sqlToExecute);
		
		Assert.assertEquals(1,list.size());
		Assert.assertEquals(fakeAccountsObject.getAccountId(), list.get(0).getAccountId());
		
	}
}
