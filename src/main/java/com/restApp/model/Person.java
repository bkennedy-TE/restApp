package com.restApp.model;

import java.math.BigDecimal;

public class Person {
	private Long personId;
	private BigDecimal amount;
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
