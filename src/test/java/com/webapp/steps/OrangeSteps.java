package com.webapp.steps;

import org.testng.Assert;

import com.webapp.pages.HomePage;
import com.webapp.pages.LoginPage;
import com.webapp.utility.FunctionLibrary;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeSteps extends FunctionLibrary {

	LoginPage login;

	static HomePage home;

	@Given("the user launches the url")
	public void the_user_launches_the_url() {

		FunctionLibrary.browserFactory();

	}

	@When("the user login to the App")
	public void the_user_login_to_the_App(DataTable table) {

		login = new LoginPage();

		login.validateLoginHeader(table.asList().get(0));

		login.validateForgotPwd(table.asList().get(1));

		home = login.loginApp();

	}

	@Then("the user should see the home page {string}")
	public void the_user_should_see_the_home_page(String title) {

		Assert.assertEquals(driver.getTitle(), title);

	}



	@Given("the user validates url of the {string} current page")
	public void the_user_validates_url_of_the_current_page(String url) {

		Assert.assertEquals(driver.getCurrentUrl(), url);

	}

	@When("the user verifies the {string} label on it.")
	public void the_user_verifies_the_label_on_it(String label) {

		home.validateWelcome(label);

	}

	@Given("the user clicks admin icon")
	public void the_user_clicks_admin_icon() {

		home.clickAdmin();

	}

	@When("the user verifies labels on it")
	public void the_user_verifies_labels_on_it(DataTable table) {

		Assert.assertEquals(home.getAllAdmin(), table.asList());

	}
	
	@Given("step {string}")
	public void step(String string) {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(string);
	}

}
