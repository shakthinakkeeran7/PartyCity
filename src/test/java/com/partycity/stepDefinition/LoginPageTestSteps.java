package com.partycity.stepDefinition;

import java.util.HashMap;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.partycity.baseclass.BaseClass;
import com.partycity.dataprovider.ConfigExcelFileReader;
import com.partycity.enums.Context;
import com.partycity.manager.FileReaderManager;
import com.partycity.manager.PageObjectManager;
import com.partycity.pageobjects.LoginPage;
import com.partycity.runner.TestRunner;
import com.partycity.util.TestContext;


import io.cucumber.java.en.*;

public class LoginPageTestSteps extends BaseClass {
	public static ConfigExcelFileReader reader = null;
	
	TestContext testContext;
	LoginPage loginPage;
	

	public LoginPageTestSteps(TestContext context) throws Throwable {

		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginpage();
		
		
	}
	

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		}

	@When("I enter my valid username and password")
	public void i_enter_my_valid_username_and_password() throws Throwable   {
		String sheetName = FileReaderManager.getInstance().getCrInstance().getSheetName("LoginPageTestData");
		String testName = "SuccessfulLoginWithValidUsernameAndPassword";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		System.out.println("----------"+testData.get("EmailID")+testData.get("Password")+"--------------");
		
		String LoginUrl = FileReaderManager.getInstance().getCrInstance().getApplicationUrl()+"/account-login";
	
	driver.get(LoginUrl);		
	}

	@When("I click the login button")
	public void i_click_the_login_button() {

	}

	@Then("I should be redirected to the home page")
	public void i_should_be_redirected_to_the_home_page() {

	}

	@When("I enter an invalid username and password")
	public void i_enter_an_invalid_username_and_password() {

	}

	@Then("I should see an error message indicating the login failed")
	public void i_should_see_an_error_message_indicating_the_login_failed() {

	}

	@When("I leave the username or email field empty")
	public void i_leave_the_username_or_email_field_empty() {

	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {

	}

	@When("I enter a valid username or email")
	public void i_enter_a_valid_username_or_email() {

	}

	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() {

	}

	@When("I enter an invalid email and password")
	public void i_enter_an_invalid_email_and_password() {

	}



	@When("I enter whitespace characters in the username or email field")
	public void i_enter_whitespace_characters_in_the_username_or_email_field() {

	}

	@When("I enter whitespace characters in the password field")
	public void i_enter_whitespace_characters_in_the_password_field() {

	}

	@Then("I should")
	public void i_should() {

	}

	@When("I enter my valid email and password")
	public void i_enter_my_valid_email_and_password() {

	}

}
