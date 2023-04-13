package com.partycity.stepDefinition;

import org.testng.Assert;

import com.partycity.baseclass.BaseClass;
import com.partycity.manager.FileReaderManager;
import com.partycity.pageobjects.AccountPage;
import com.partycity.pageobjects.LoginPage;
import com.partycity.util.TestContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPageTestSteps extends BaseClass {

	TestContext testContext;
	AccountPage accountPage;

	public AccountPageTestSteps(TestContext context) throws Throwable {

		testContext = context;
		accountPage = testContext.getPageObjectManager().getAccountPage();

	}

	@Given("I am logged in to the account page")
	public void i_am_logged_in_to_the_account_page() throws Throwable {

		String LoginUrl = FileReaderManager.getInstance().getCrInstance().getApplicationUrl() + "/account";
		launchUrl(LoginUrl);
	}

	@When("I click on the Sign Out button")
	public void i_click_on_the_sign_out_button() {
		clickonWebelement(accountPage.getSignOutButton());
	}

	@Then("I should be logged out and redirected to the {string} Home page")
	public void i_should_be_logged_out_and_redirected_to_the_home_page(String url) {

		Assert.assertEquals(currentUrl(), url);

	}
}
