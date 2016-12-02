package com.automation.library;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BasePage {

	public static WebDriver driver;
	public static UtilityLibrary ul;
	
	@Before
	public void beforeEachTest() throws Exception {
		ul = new UtilityLibrary(driver);
		driver= ul.startLocalBrowser("Firefox");
		System.out.println("*** TEST STARTED ***");
	}
	
	@After
	public void afterEachTest() throws Exception {
		ul.customWait(5);
		System.out.println("*** TEST ENDED ***");
		
	}
	
	@AfterClass
	public static void afterAllTest() {
		if(driver !=null) {
			driver.close();
			driver.quit();
		}
	}
}
