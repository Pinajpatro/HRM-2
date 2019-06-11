package com.TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.WebCommonMethods.InitialClass;
import com.WebPages.Webpages;


public class TestRunner extends Baseclass {
	InitialClass ic = new InitialClass();
	Webpages wb;
	
	@Test
	public void StartExecution() {
		logger = report.createTest("OpsVeda Login");
		driver = ic.getbrowser(driver,"Chrome");
		screen.getscreenshots(driver);
		 wb = PageFactory.initElements(driver, Webpages.class);
		 wb.loginsuccess(driver);
		 //screen.getscreenshots(driver);
	}

	

}
