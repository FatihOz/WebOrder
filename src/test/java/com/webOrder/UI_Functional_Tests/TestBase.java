package com.webOrder.UI_Functional_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;

	//@Parameters("browser")
	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
		driver.get(url);

	}

	@AfterMethod
	public void closeDriver() {
		
		driver.quit();
		
	}
	

}
