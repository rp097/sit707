package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	
	public static String bunnings_login_page(String email, String pw) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get("https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
		
		// Find first input field which is firstname
		WebElement El1 = driver.findElement(By.id("okta-signin-username"));
		System.out.println("Found element: " + El1);
		// Send email
		El1.sendKeys(email);
		
		WebElement El2 = driver.findElement(By.id("okta-signin-password"));
		System.out.println("Found element: " + El2);
		// Send password
		El2.sendKeys(pw);
		
		WebElement El3 = driver.findElement(By.id("okta-signin-submit"));
		System.out.println("Found element: " + El3);
		// Click Login
		El3.click();
		
		sleep(10);
		
		//Get the URL of the browser
		String u = driver.getCurrentUrl();
		System.out.println("Found URL: "+u);
		
		sleep(10);
		
		// close chrome driver
		driver.close();	
		
		return u;
	}
	
	
}
