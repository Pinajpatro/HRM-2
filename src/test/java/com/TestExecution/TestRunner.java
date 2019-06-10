package com.TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.WebCommonMethods.InitialClass;
import com.WebPages.Webpages;
import com.WebReusabilityMethods.Screenshotsonwebpages;


public class TestRunner extends Baseclass {
	public WebDriver driver;
	InitialClass ic = new InitialClass();
	Webpages wb;
	
	@Test
	public void StartExecution() {
		driver = ic.getbrowser(driver,"Chrome");
		Screenshotsonwebpages screen = new Screenshotsonwebpages();
		screen.getscreenshots(driver, "Browser launched");
		 wb = PageFactory.initElements(driver, Webpages.class);
		 wb.loginsuccess(driver);
	}

	

}
