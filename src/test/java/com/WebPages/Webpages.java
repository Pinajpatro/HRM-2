package com.WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.TestExecution.Baseclass;

public class Webpages extends Baseclass{
	public WebDriver driver;
	
	
	@FindBy(xpath ="//input[@id='xs_username-inner']")WebElement usernamefield;
	@FindBy(xpath ="//input[@id = 'xs_password-inner']")WebElement passwordfield;
	@FindBy(xpath ="//div[@id = 'logon_button-inner']")WebElement loginbutton;
	
	public void loginsuccess(WebDriver driver) {
		this.driver = driver;
		String username = excel.getstringcelldata("Credentials", 1, 1);
		String password = excel.getstringcelldata("Credentials", 1, 2);
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		loginbutton.click();
	}

}
