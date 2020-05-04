package com.webapp.steps;

import com.webapp.utility.FunctionLibrary;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks extends FunctionLibrary {

	/*
	 * @BeforeStep public void beforeStep() {
	 * 
	 * System.out.println("=============Before Step============");
	 * 
	 * }
	 * 
	 * @AfterStep public void afterStep() {
	 * System.out.println("===============After Step====================="); }
	 */

	@Before("@Fb")
	public void beforeScenario() {

		System.out.println("Start time " + System.currentTimeMillis());

	}

	/*
	 * @Before(order = 2) public void setUp() {
	 * 
	 * System.out.println("============Scenario Started==============");
	 * 
	 * }
	 * 
	 * @After(order = 2) public void endScenario() {
	 * 
	 * System.out.println(driver.getTitle());
	 * 
	 * System.out.println(driver.getCurrentUrl());
	 * 
	 * }
	 */
	@After("@Fb")
	public void afterScenario() {

		System.out.println("End time " + System.currentTimeMillis());

	}

}
