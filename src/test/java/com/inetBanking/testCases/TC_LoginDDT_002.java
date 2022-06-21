package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void LoginDDT(String user,String pwd)
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassWord(pwd);
		lp.clickSubmit();
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+ "src/test/java/com/inetBanking/testData/UserName.xlsx";
		
		int rownum=XLUtils.getRowCount(path,"sheet1");
		int colcount=XLUtils.getCellCount(path,"sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for(int j = 0; j<colcount; j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
	}
}
