package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Driver//chromedriver.exe");
		
		try {
			FileInputStream fis=new FileInputStream(src);
		    pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public String getApplicationUrl()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String username=pro.getProperty("userName");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("pwd");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}

}
