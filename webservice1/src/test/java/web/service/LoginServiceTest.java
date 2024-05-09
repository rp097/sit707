package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"file:///Users/rahulprem/Uni/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("rahul");
		

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("rahul_pass");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("12-07-1997");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "success");
		
		driver.close();
	}
	
	@Test
	public void testLoginFail() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"file:///Users/rahulprem/Uni/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("rp");
		

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("rahul_pass1");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("13-08-1991");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "fail");
		
		driver.close();
	}
	
	@Test
	public void testLoginFailBlanks() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"file:///Users/rahulprem/Uni/SIT707/8.1P-resources/pages/login.html");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("");
		

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "fail");
		
		driver.close();
	}
}
