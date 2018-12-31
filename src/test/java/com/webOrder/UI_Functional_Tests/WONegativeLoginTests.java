package com.webOrder.UI_Functional_Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webOrder.UI_Functional_Utilities.BrowserUtils;

public class WONegativeLoginTests extends TestBase {

	@Test(priority = 1)
	public void negativeWrongUsername() {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		String expected = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login.aspx";
		String actual = driver.getCurrentUrl();

		BrowserUtils.verifyTextMatches(actual, expected);

		// if(actual.equals(expected)) {
		// System.out.println("Title Test: PASS");
		// }else {
		// System.out.println("Title Test: FAIL");
		// }

	}

	@Test(priority = 2)
	public void negativeWrongPassword() {
		driver.findElement(By.className("txt")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("Test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		String expected = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login.aspx";
		String actual = driver.getCurrentUrl();

		BrowserUtils.verifyTextMatches(actual, expected);

		// if(actual.equals(expected)) {
		// System.out.println("Title Test: PASS");
		// }else {
		// System.out.println("Title Test: FAIL");
		// }

	}

	@Test(priority = 3)
	public void negativeBlankUsername() {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		String expected = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login.aspx";
		String actual = driver.getCurrentUrl();

		BrowserUtils.verifyTextMatches(actual, expected);

		// if(actual.equals(expected)) {
		// System.out.println("Title Test: PASS");
		// }else {
		// System.out.println("Title Test: FAIL");
		// }

	}

	@Test(priority = 4)
	public void negativeBlankPassword() {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		String expected = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login.aspx";
		String actual = driver.getCurrentUrl();

		BrowserUtils.verifyTextMatches(actual, expected);

		// if(actual.equals(expected)) {
		// System.out.println("Title Test: PASS");
		// }else {
		// System.out.println("Title Test: FAIL");
		// }

	}

}
