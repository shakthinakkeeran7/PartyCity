package com.partycity.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver = null;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(id = "password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(id = "login")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}

}
