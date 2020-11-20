package com.restApp.controllers;

import org.junit.Assert;
import org.junit.Test;


public class HomeControllerTest {

	@Test
	public void shouldReturnHello() {
		HomeController homeController = new HomeController();
		String returnText = homeController.rootPath();
		Assert.assertEquals("Hello", returnText);
	}
}
