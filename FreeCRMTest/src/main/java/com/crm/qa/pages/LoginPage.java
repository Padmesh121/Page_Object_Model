package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase  {

	@FindBy(linkText="Log In")
	WebElement login;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//a[@title=\"register on freecrm.com\"])[1]")
	WebElement signin;
	
	@FindBy(xpath="//img[@alt=\"Android\"]")
	WebElement androidImage;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")
	WebElement loginButton;
	
	// -- initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void LoginButton()
	{
		loginButton.click();
	}
	
	public String validateloginpageTitle()
	{
		return driver.getTitle();
	}
	public boolean validatecrmimage()
	{
		return androidImage.isDisplayed();
	}
	public void login(String un, String pw)
	{
          username.sendKeys(un);
          password.sendKeys(pw);
	}

}
