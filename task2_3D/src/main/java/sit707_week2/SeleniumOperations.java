package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws Exception {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.officeworks.com.au/app/identity/create-account");
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Maximize chrome driver
		driver.manage().window().maximize();
		
		// Find first input field which is firstname
		WebElement El1 = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + El1);
		// Send first name
		El1.sendKeys("Rahul");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement El2 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + El2);
		// Send last name
		El2.sendKeys("Prem");
		
		WebElement El3 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + El3);
		// Send phone number
		El3.sendKeys("0478512895");
		
		WebElement El4 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + El4);
		// Send email
		El4.sendKeys("rahulprem90@gmail.com");
		
		WebElement El5 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + El5);
		// Send password
		El5.sendKeys("rp097");
		
		WebElement El6 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + El6);
		// Send confirm password
		El6.sendKeys("rp097");
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		WebElement El7 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		System.out.println("Found element: " + El7);
		// Send create account button
		El7.click();
		
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		//Call take screenshot function
		takeSnapShot(driver, "/Users/rahulprem/Uni/SIT707/Screenshots/Task2.1P.png"); 
		
	
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	public static void bunnings_registration_page(String url) throws Exception {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.bunnings.com.au/register");
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Maximize chrome driver
		driver.manage().window().maximize();
		
		// Find first input field which is firstname
		WebElement El1 = driver.findElement(By.id("uid"));
		System.out.println("Found element: " + El1);
		// Send first name
		El1.sendKeys("rahulprem90@gmail.com");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement El2 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + El2);
		// Send last name
		El2.sendKeys("rp097");
		
		WebElement El3 = driver.findElement(By.id("firstName"));
		System.out.println("Found element: " + El3);
		// Send phone number
		El3.sendKeys("Rahul");
		
		WebElement El4 = driver.findElement(By.id("lastName"));
		System.out.println("Found element: " + El4);
		// Send email
		El4.sendKeys("Prem");
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		WebElement El5 = driver.findElement(By.xpath("//*[@id=\"retailRegistration\"]/div/div[7]/button"));
		System.out.println("Found element: " + El5);
		// Send create account button
		El5.click();
		
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		//Call take screenshot function
		takeSnapShot(driver, "/Users/rahulprem/Uni/SIT707/Screenshots/Bunnings_Task2.3D.png"); 
		
	
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot ss =((TakesScreenshot)webdriver);
		File sf = ss.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(sf, DestFile);
	}
	
	
}
