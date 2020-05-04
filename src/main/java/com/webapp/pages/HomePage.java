package com.webapp.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webapp.utility.FunctionLibrary;

public class HomePage extends FunctionLibrary {

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "welcome")
	WebElement welcome;

	@FindBy(xpath = "//*[text()  = 'Admin']")
	WebElement admin;

	@FindBy(xpath = "//*[@class='menu']//li[@class='current']/ul[1]/li/a")
	List<WebElement> adminOptions;

	public void validateWelcome(String label) {

		Assert.assertEquals(welcome.getText(), label);
	}

	public void clickAdmin() {

		admin.click();

	}

	public List<String> getAllAdmin() {

		List<String> labels = new ArrayList<String>();

		for (int i = 0; i < adminOptions.size(); i++) {

			labels.add(adminOptions.get(i).getText());

		}

		return labels;

	}

}
