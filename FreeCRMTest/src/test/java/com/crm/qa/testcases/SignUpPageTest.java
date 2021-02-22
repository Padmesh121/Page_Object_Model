package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.TestUtil;

public class SignUpPageTest extends TestBase{
		 
		 SignUpPage sign = new SignUpPage();
		 TestUtil util;
		 String sheetName = "SignUpdata";
		
		 ///--- To initialize properties file
		 public SignUpPageTest() {
			 super();
		 }
		 
		 
		 
		@BeforeMethod
		public void setup() {
			
		initialization();
		sign = new SignUpPage();
		
		}
		@DataProvider
		public Object[][] getCRMData()
		{
			Object data[][]=TestUtil.getTestData(sheetName);
			return data;
		}
		@Test(dataProvider="getCRMData")
		public void SignInpage(String email, String phone)
		{
		 sign.signUpButton();
		 sign.Email(email);
		 sign.Phone(phone);
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			
		}
		

	}
