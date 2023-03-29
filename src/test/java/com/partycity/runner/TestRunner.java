package com.partycity.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.partycity.baseclass.BaseClass;
import com.partycity.manager.FileReaderManager;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
glue = "com.adactin.stepDefinition",
plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:Report/FailedScenario.txt"},
dryRun = false,
monochrome = true,
stepNotifications = true
//tags = "@TC-106"

)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver = BaseClass.getBrowser(browser);
		

	}

	@AfterClass
	public static void tearDown() {
		// driver.quit();
	}

}
