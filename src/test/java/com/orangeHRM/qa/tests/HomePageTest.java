package com.orangeHRM.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHRM.qa.baseClass.BaseTest;
import com.orangeHRM.qa.pages.HomePage;
import com.orangeHRM.qa.pages.LoginPage;

public class HomePageTest {

	WebDriver driver;
	BaseTest bt;
	LoginPage lp;
	HomePage hp;
	
	
	@BeforeTest
	public void setUp() {
		BaseTest bt = new BaseTest();
		driver = bt.initDriver("Chrome");
		bt.getURL();
		lp = new LoginPage(driver);
		hp = lp.doLogin("admin", "Shashu1@");
	}
	
	@Test
	public void dasboardPage() {
		Assert.assertEquals(true, hp.PresenceOfDashboard());
	}

}
