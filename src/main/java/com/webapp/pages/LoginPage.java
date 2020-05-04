package com.webapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webapp.utility.FunctionLibrary;

public class LoginPage extends FunctionLibrary {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	WebElement user_input;

	@FindBy(id = "txtPassword")
	WebElement pwd_input;

	@FindBy(name = "Submit")
	WebElement login_input;

	@FindBy(xpath = "//*[@id='forgotPasswordLink']/a")
	WebElement forgot_pwd;

	@FindBy(id = "logInPanelHeading")
	WebElement login_header;



	public void validateLoginHeader(String label) {

		Assert.assertEquals(login_header.getText(), label);

	}

	public void validateForgotPwd(String label) {

		Assert.assertEquals(forgot_pwd.getText(), label);

	}

	public HomePage loginApp() {

		user_input.sendKeys(prop.getProperty("username"));

		pwd_input.sendKeys(prop.getProperty("password"));

		login_input.click();

		return new HomePage();

	}


	
}
