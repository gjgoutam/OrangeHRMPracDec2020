package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.orangeHRM.qa.baseClass.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}	

	/*
	 * Object Repository
	 */

	By userName = By.id("txtUsername");
	By password = By.xpath("//input[@id='txtPassword']");
	By loginBtn = By.name("Submit");
	By footerLink = By.xpath("//a[text()='OrangeHRM, Inc']");

	/*
	 * Page Actions
	 */

	public String getPgTitle() {
		return driver.getTitle();
	}

	public HomePage doLogin(String usn, String pwd) {
		driver.findElement(userName).sendKeys(usn);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new HomePage(driver);
	}

}
