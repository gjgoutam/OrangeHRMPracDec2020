package com.orangeHRM.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.qa.Utils.Constants;
import com.orangeHRM.qa.baseClass.BaseTest;
import com.orangeHRM.qa.pages.LoginPage;

public class LoginPageTest {

	BaseTest bt;
	LoginPage lp;
	WebDriver driver;
	

	@BeforeTest
	public void setUp() {
		bt = new BaseTest();
		driver = bt.initDriver("Chrome");
		bt.getURL();
		lp = new LoginPage(driver);
	}

	@Test
	public void titleTest() {
		String title = lp.getPgTitle();
		Assert.assertEquals(title, Constants.CONSTANTS_LOGINPG_TITLE);
	}

	@Test
	public void loginTest() {
		lp.doLogin("Admin","Shashu1@");
	}
	

	@AfterTest
	public void tearDown() {
		bt.closeBwsr();
	}

}
