package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	/*ReadConfig readconfig=new ReadConfig();
	public String baseUrl=readconfig.getApplicationUrl();
	public String userName=readconfig.getUserName();
	public String pwd=readconfig.getPassword();*/

	public String baseUrl="https://demo.guru99.com/v4/index.php";
	public String userName="mngr418496";
	public String pwd="rarabaj";
	
	public static WebDriver driver;
	public static Logger logger;
	
	//@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		 logger=Logger.getLogger("CMPMaven");
		PropertyConfigurator.configure("log4j.xml");
		
	/*if(br.equals("chrome"))
	{
		//System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(br.equals("firefox"))
	{
		System.out.println("browser mismatch");
	}*/
			
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
}
