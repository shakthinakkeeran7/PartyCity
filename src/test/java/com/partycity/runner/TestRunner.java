package com.partycity.runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.partycity.baseclass.BaseClass;
import com.partycity.manager.FileReaderManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import io.github.bonigarcia.wdm.WebDriverManager;



@CucumberOptions(
        features = "src/test/resources/feature/account-login.feature",
        glue = {"com.partycity.stepDefinition"},
        dryRun = true,
        plugin = {"json:target/cucumber-reports/Cucumber.json", "html:target/cucumber-reports"},
        monochrome = true		)

public class TestRunner	extends AbstractTestNGCucumberTests {
	    //Parallel Execution Scenario
	   
    private TestNGCucumberRunner testNGCucumberRunner;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extent;
    private static ExtentTest test;
	
	    public static WebDriver driver;

	    
	    @BeforeSuite(alwaysRun = true)
	    public void setUp() throws Throwable {
	    	
	    	
	        // Set up ExtentReports
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport.html");
	        htmlReporter.config().setDocumentTitle("Test Automation Report");
	        htmlReporter.config().setReportName("Functional Test Report");
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Host Name", "localhost");
	        extent.setSystemInfo("Environment", "Test Environment");
	        extent.setSystemInfo("User Name", "Test User");
	       
			String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
			driver = BaseClass.getBrowser(browser);
			
	    
	    }
	    
	   
	
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
		
		
		
			
}