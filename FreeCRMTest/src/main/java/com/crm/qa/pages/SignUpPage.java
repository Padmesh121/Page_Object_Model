package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(xpath="(//a[@title=\"register on freecrm.com\"])[1]")
	WebElement SigninButton;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone_number")
	WebElement phone;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void signUpButton()
	{
	      SigninButton.click();
	}
	public void Email(String em)
	{
	      email.sendKeys(em);
	}

	public void Phone(String ph)
	{
	      phone.sendKeys(ph);
	}
}
