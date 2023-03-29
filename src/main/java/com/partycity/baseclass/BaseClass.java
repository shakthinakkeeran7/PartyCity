package com.partycity.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--ignore-certificate-errors");
		option.addArguments("chrome.switches", "--disable-extensions");
		option.addArguments("--disable-notifications");
		option.addArguments("enable-automation");
		option.addArguments("start-maximized");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, option);
		option.merge(cap);

		try {

			if (browserName.equalsIgnoreCase("chrome"))

			{
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
			} else {
				throw new Exception("Browser Name is invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public static void waitforElementVisiblity(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void selectDropDownOption(WebElement element, String option, String value) {
		try {
			waitforElementVisiblity(element);
			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static boolean elementIsEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {

			e.printStackTrace();
		}

		return displayed;
	}

	public static void inputValuestoWebelement(WebElement element, String value) {
		try {
			waitforElementVisiblity(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				element.sendKeys(value);
			}
		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void clickonWebelement(WebElement element) {
		try {
			waitforElementVisiblity(element);
			if (elementIsDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void clearonWebelement(WebElement element) {
		try {
			waitforElementVisiblity(element);
			if (elementIsDisplayed(element)) {
				element.clear();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static String getText(WebElement element) {

		return element.getText();
	}

	public static String getAttribute(WebElement element, String AttributeName) {
		

			String attributeValue = element.getAttribute(AttributeName);
			return attributeValue;	
			
	
	}
}