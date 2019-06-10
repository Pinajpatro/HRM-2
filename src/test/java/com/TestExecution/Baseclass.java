package com.TestExecution;

import org.testng.annotations.BeforeSuite;

import com.WebReusabilityMethods.TestDatareader;

public class Baseclass {
	public static TestDatareader excel;
	
	@BeforeSuite
	public void Firstexecution() {
		 excel = new TestDatareader();
	}

}
