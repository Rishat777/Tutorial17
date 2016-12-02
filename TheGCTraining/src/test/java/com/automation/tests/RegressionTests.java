package com.automation.tests;

import org.junit.Test;

import com.automation.library.BasePage;
import com.automation.pages.HomePage;

public class RegressionTests extends BasePage{
	
	HomePage hpPage = new HomePage();
	
	//First Change added after pushing the project
	
	
	@Test
	public void loginTest() {
		hpPage.goto_theGreatCoursesWebsite();
		hpPage.click_CategoryMath();
		System.out.println("Classes executed");
	}

}
