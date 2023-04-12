package com.partycity.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.partycity.baseclass.BaseClass;
import com.partycity.enums.Context;
import com.partycity.manager.FileReaderManager;
import com.partycity.manager.PageObjectManager;
import com.partycity.pageobjects.LoginPage;
import com.partycity.runner.TestRunner;
import com.partycity.util.TestContext;

import io.cucumber.java.en.*;

public class LoginPageTestSteps extends BaseClass {

	TestContext testContext;
	LoginPage loginPage;

	public LoginPageTestSteps(TestContext context) {
		
		
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginpage();
	}

	
	
	
	

}
