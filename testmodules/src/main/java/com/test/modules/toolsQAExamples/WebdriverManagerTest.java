package com.test.modules.toolsQAExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {

	private WebDriver driver;
	@Test
    public void WebDriverManagerTest()
    {
		
		
		  //setup the chromedriver using WebDriverManager
		  WebDriverManager.chromedriver().setup();
		  
		  //Create driver object for Chrome WebDriver will give exception as it require chrome 79 version
		  
		  
		  driver = new ChromeDriver();
		 
		
		
		/*
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * driver = new FirefoxDriver();
		 * 
		 * 
		 * //Navigate to a URL 
		 */
		/*
		 * driver.get("http://toolsqa.com");
		 * System.out.println(driver.findElement(By.linkText("DEMO SITES")).getCssValue(
		 * "class"));
		 */
		  
		  driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		  driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  Actions action = new Actions(driver);
		  WebElement element = driver.findElement(By.xpath("//span[text()='Admin']"));
		  action.moveToElement(element).perform();
		  
		  WebElement element2 = driver.findElement(By.xpath("//span[text()='Qualification']"));
		  action.moveToElement(element2).perform();
		  WebElement skillsElement = driver.findElement(By.xpath("//span[text()='Skills']"));
		  skillsElement.click();
    }
}
