package com.cn;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestTestNG {

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();
		Assert.assertEquals(email, "feedback@yiibai.com");
	}
}
