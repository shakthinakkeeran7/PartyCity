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

	@Given("Launch hotel reservation application using URL as in the test data")
	public void launch_hotel_reservation_application_using_url_as_in_the_test_data() throws Throwable {
		
		String url = FileReaderManager.getInstance().getCrInstance().getApplicationUrl() + "/HotelAppBuild2/index.php";

		driver.get(url);

	}

	@When("Login to the application using {string} and {string} as in the test data")
	public void login_to_the_application_using_and_as_in_the_test_data(String UserName, String Password) {
		loginPage.getUserName().sendKeys(UserName);
		loginPage.getPassword().sendKeys(Password);
		loginPage.getLogin().click();

	}

}
