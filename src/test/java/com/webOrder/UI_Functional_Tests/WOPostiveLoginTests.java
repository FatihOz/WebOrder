package com.webOrder.UI_Functional_Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webOrder.UI_Functional_Utilities.BrowserUtils;

import junit.framework.Assert;

public class WOPostiveLoginTests extends TestBase {
	
	@Test(priority = 0)
	public void positiveTest() {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
		driver.get(url);
		driver.findElement(By.className("txt")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		String expected= "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/";
		String actual=driver.getCurrentUrl();
		
//		Assert.assertEquals(expected, actual);
		BrowserUtils.verifyTextMatches(actual, expected);
		
		
		
	}

}
