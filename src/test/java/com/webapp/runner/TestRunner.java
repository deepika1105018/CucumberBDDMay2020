package com.webapp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(

		features = "./src/main/java/com/webapp/features",

		glue = { "com/webapp/steps" },

		dryRun = false,

		plugin = { "pretty", "html:target/Html-output", "junit:target/Junit-output/index.xml",
				"json:target/cucumber/cucumber.json" },

		monochrome = true,

		strict = true,

		tags = "@Regression"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
