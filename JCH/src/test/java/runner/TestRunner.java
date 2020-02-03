package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	        features="D:\\workspace\\JCH\\src\\test\\java\\feature\\login.feature",
	        glue= {"stepdefinition/LoginPage"},
	        tags = {"@smoke"},
	        dryRun = false,
	        strict = true,
	        //format= {"pretty","html:test-output","json:json-output/report.json"},
	        monochrome = true)
	 
	public class TestRunner {
	}

