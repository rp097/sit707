package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MathQuestionServiceFunctionalTests {

	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAdditionBlank() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q1");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/q2");
		
		driver.close();
	}
	
	@Test
	public void testAdditionInvalid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q1");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("a");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("b");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("c");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/q2");
		
		driver.close();
	}
	
	@Test
	public void testAdditionValid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q1");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("2");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("3");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("5");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "http://127.0.0.1:8082/q2");
		
		driver.close();
	}
	
	@Test
	public void testSubtractionBlank() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q2");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/q3");
		
		driver.close();
	}
	
	@Test
	public void testSubtractionInvalid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q2");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("a");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("b");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("c");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/q3");
		
		driver.close();
	}
	
	@Test
	public void testSubtractionValid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q2");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("6");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("3");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("3");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "http://127.0.0.1:8082/q3");
		
		driver.close();
	}
	
	@Test
	public void testMultiplicationBlank() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q3");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/login");
		
		driver.close();
	}
	
	@Test
	public void testMultiplicationInvalid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q3");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("a");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("b");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("c");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertNotEquals(url, "http://127.0.0.1:8082/login");
		
		driver.close();
	}
	
	@Test
	public void testMultiplicationValid() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/Users/rahulprem/Uni/SIT707/chromedriver124-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);

		driver.navigate().to(
				"http://127.0.0.1:8082/q3");
		sleep(5);
		
		WebElement ele = driver.findElement(By.id("number1"));
		ele.clear();
		ele.sendKeys("2");
		

		ele = driver.findElement(By.id("number2"));
		ele.clear();
		ele.sendKeys("3");
		
		ele = driver.findElement(By.id("result"));
		ele.clear();
		ele.sendKeys("6");


		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "http://127.0.0.1:8082/login");
		
		driver.close();
	}
}
