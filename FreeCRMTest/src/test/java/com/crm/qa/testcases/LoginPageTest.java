package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

 public class LoginPageTest extends TestBase{
	 
	 LoginPage loginpage = new LoginPage();
	
	 ///--- To initialize properties file
	 public LoginPageTest() {
		 super();
	 }
	 
	 
	 
	@BeforeMethod
	public void setup() {
		
	initialization();
	loginpage = new LoginPage();
	
	}
	
	@Test
	public void loginPageTitleTest()
	{
	  String title = loginpage.validateloginpageTitle();
	  Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	/*@Test
	public void crmlogoimageTest()
	{
		boolean flag=loginpage.validatecrmimage();
		Assert.assertTrue(flag);
	}*/
	@Test
	public void LoginButton()
	{
		loginpage.LoginButton();
	}
	
	/* @Test
	public void loginTest()
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	} */
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	

}
