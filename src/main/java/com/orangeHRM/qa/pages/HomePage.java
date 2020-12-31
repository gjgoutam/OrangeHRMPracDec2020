package com.orangeHRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	/* 
	 * Object repositary
	 */
	
	By DashboardLabel = By.xpath("//li[@class='page-title']");
	
	public String homePageTitle() {
		return driver.getTitle();		
	}
	
	public boolean PresenceOfDashboard() {
		return driver.findElement(DashboardLabel).isDisplayed();
	}
	
	
	
	
}
