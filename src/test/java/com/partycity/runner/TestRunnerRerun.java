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
@CucumberOptions(features = "@Report/FailedScenario.txt",
glue = "com.adactin.stepDefinition",
dryRun = true,
monochrome = true,
stepNotifications = true

)
public class TestRunnerRerun {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
	String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
	driver = BaseClass.getBrowser(browser);

	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
