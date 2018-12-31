package com.webOrder.UI_Functional_Utilities;

import junit.framework.Assert;

public class BrowserUtils {

	public static void verifyTextMatches(String actual, String expected) {
		
		if(actual.equals(expected)) {
			System.out.println("Title Test: PASS");
		}else {
			System.out.println("Title Test: FAIL");
		}
		

	}

	public static void verifyTextContains(String actual, String expected) {
		
		if(actual.contains(expected)) {
			System.out.println("Title Test: PASS");
		}else {
			System.out.println("Title Test: FAIL");
		}
		
	}

}
