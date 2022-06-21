package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseUrl);
		logger.info("Opened the application");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Enter UserName");
		lp.setPassWord(pwd);
		logger.info("Enter the password ");
		lp.clickSubmit();
		logger.info("Click on Submit");
		if(driver.getTitle().equals("Insurance Broker System - Login"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
 
}
