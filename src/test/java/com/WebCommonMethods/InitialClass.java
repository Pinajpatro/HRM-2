package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.TestExecution.Baseclass;

public class InitialClass extends Baseclass{
	public static WebDriver driver;
	
	public static  WebDriver getbrowser(WebDriver driver,String Browser) {
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pinaj\\Eclipse Project\\OpsVedaAutomation\\BrowserDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			WebDriver chromedriver=new ChromeDriver(capabilities);*/
			String URL = excel.getstringcelldata("Credentials", 1, 0);
			driver.get(URL);
			System.out.println("Chrome broswer opened successfully");
		}
		else if(Browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pinaj\\Eclipse Project\\OpsVedaAutomation\\BrowserDriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://ovc.opsvedadev.opsveda.com:4302/OpsVeda_new/?");
			System.out.println("Firefox broswer opened successfully");
			
		}
		else if(Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Pinaj\\Eclipse Project\\OpsVedaAutomation\\BrowserDriver\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://ovc.opsvedadev.opsveda.com:4302/OpsVeda_new/?");
			System.out.println("IE broswer opened successfully");
		}
		
		else {
			System.out.println("Browser not loaded");
		}
		return driver;
	}

}
