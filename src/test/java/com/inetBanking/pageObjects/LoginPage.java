package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	

	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pwd;
	 
	@FindBy(name="btnLogin")
	WebElement LoginBtn;
	
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassWord(String password)
	{
		pwd.sendKeys(password);
	}
	
	
	public void clickSubmit()
	{
		LoginBtn.click();
	}
}