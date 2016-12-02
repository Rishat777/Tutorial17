package com.automation.pages;

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;

import com.automation.library.BasePage;

public class HomePage extends BasePage{
	
	private String homeURl = "http://www.thegreatcourses.com/";
	
	Properties prop;
	public HomePage goto_theGreatCoursesWebsite() {
		driver.get(homeURl);
		System.out.println("Page Title: '" + driver.getTitle() + "'");
		assertEquals("The Great Courses", driver.getTitle());
		return this;
	}
	public HomePage click_CategoryMath() {
		ul.clickElement(By.linkText("Mathematics"));
		ul.clickElement(null);
		return this;
		
	}


}
