package com.automation.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UtilityLibrary {

	
	private WebDriver driver;
	
	//Constructor
	public UtilityLibrary(WebDriver _driver) {
		this.driver = _driver;
	}
	
	/***
	 * This method starts Firefox browser
	 * @return
	 */
	private WebDriver startFirefoxBrowser() {
		try {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
		return driver;
	}
	
	/***
	 * This method starts IE browser
	 * @return
	 */
	private WebDriver startIEBrowser() {
		
		try {
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setBrowserName("internet explorer");
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
		return driver;
	}
	
	/***
	 * This method starts Chrome Browser
	 * @return
	 */
	private WebDriver startChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
		return driver;
	}
	/***
	 * This method starts user's desired browser
	 * @param browserName
	 * @return
	 */
	
	public WebDriver startLocalBrowser(String browserName) {
		try{
		if (browserName.contains("IE")) {
			driver = startIEBrowser();
		} else if (browserName.contains("Chrome")) {
			driver = startChromeBrowser();
		} else if (browserName.contains("Firefox")) {
			driver = startFirefoxBrowser();
		} else {
			throw new Exception ("You chose '" + browserName + "', Currently "
					+ "Supporting browsers are: 'IE, Firefox & Chrome' !");
		}
		}catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
		return driver;
	}
	
	/***
	 * This method waits for driver action
	 * @param inSeconds
	 */
	public void customWait (int inSeconds) {
		try{
		Thread.sleep(inSeconds * 1000);
	} catch (Exception ex) {
		System.out.println("Error: " + ex.getMessage());
		ex.printStackTrace();
	}
	}
	
	public void clickElement(By by) {
		try {
			WebElement textField = driver.findElement(by);
			textField.click();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
