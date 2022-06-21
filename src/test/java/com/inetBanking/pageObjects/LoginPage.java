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

	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="emailid")
	WebElement userName;
	
	@FindBy(name="emailid")
	WebElement pwd;
	 
	@FindBy(name="btnLogin")
	WebElement LoginBtn;
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setUserName(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setPassWord(String mail)
	{
		email.sendKeys(mail);
	}
	
	
	public void clickSubmit()
	{
		LoginBtn.click();
	}
}