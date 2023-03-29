package com.partycity.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.partycity.pageobjects.LoginPage;

public class PageObjectManager {
	WebDriver driver;
	LoginPage loginpage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage getLoginpage() {

		if (loginpage == null) {
			loginpage = new LoginPage(driver);
		}
		return loginpage;
	}

}
