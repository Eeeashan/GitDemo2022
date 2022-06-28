package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
	@Test
	public void loginAsBankManager() {
		log.debug("Inside Login Test!");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		log.debug("Login Successfully Executed!");
		
	}

}
