/**
 * 
 */
package com.test.modules.toolsQAExamples.browserCommands;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author manish.gupta
 *
 */
public class BrowserCommands {

	private WebDriver driver;
	String titleOfPage, pageSource, currentUrl;
	int lengthOfTitlePage, lengthOfPageSource;
	private final String demoURL = "https://demoqa.com/";
	private final String toolsQAURL = "https://www.toolsqa.com/";

	@BeforeTest
	public void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void automationPracticeForm(){
		driver.get(demoURL);
		driver.findElement(By.linkText("Automation practice form")).click();
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL,demoURL+"automation-practice-form/");
		System.out.println("passed.");
		
		  //driver.findElement(By.name("firstname")).sendKeys("manish");
		 // driver.findElement(By.id("lastname")).sendKeys("gupta");
		  //driver.findElement(By.id("buttonwithclass")).click();
		topmenuElementsFinder(driver);
	}
	/*@Test 
	public void browsercommandsTest() {
	  
	  // Storing the Application URL in the String variable 
		String url = "http://shop.demoqa.com/";
	  
	  driver.get(url); 
	  driver.manage().timeouts().implicitlyWait(10,
	  TimeUnit.SECONDS); for (int i = 0; i < 100; i++) System.out.print("-");
	  
	  System.out.println();
	  
	  titleOfPage = driver.getTitle(); System.out.println("\n 1. Title of Page : "
	  + titleOfPage);
	  
	  lengthOfTitlePage = titleOfPage.length();
	  System.out.println("\n 2. Length of Title Page is : " + lengthOfTitlePage);
	  
	  pageSource = driver.getPageSource(); lengthOfPageSource =
	  pageSource.length(); System.out.println("\n 3. Length of Page Source : " +
	  lengthOfPageSource); System.out.println("\n 4. Page Source : " +
	  pageSource.substring(0, 100));
	  
	  currentUrl = driver.getCurrentUrl();
	  
	  System.out.println("\n 5. "); 
	  if (url.equalsIgnoreCase(currentUrl))
	  System.out.print("\n 5. " + url + " and " + currentUrl + " are same."); else
	  System.out.print("\n 5. " + url + " and " + currentUrl + " are not same.");
	  
	  System.out.println("\n Actual URL : + " + url);
	  System.out.println("\n Current URL : " + currentUrl);
	  
	  for (int i = 0; i < 100; i++) System.out.print("-"); 
	  }*/

	/*
	@Test
	public void newbrowserWindowCommandTest() {
		System.out.println("\n Window switching method called.");
		String url = "https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.close();
		// will close only the parent window if want to close all then use quit command.

	}*/

	/*
	@Test
	public void browserNavigationCommands() throws InterruptedException {

		try {
			URL url = new URL(demoURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n browser navigation method called.");
		driver.navigate().to(demoURL);

		System.out.println("Demo url has been opened.");
		Thread.sleep(5000);
		System.out.println("back method is going to call.");
		driver.navigate().back();
		System.out.println("back method ended.");
		Thread.sleep(5000);
		System.out.println("forward method is going to call.");
		driver.navigate().forward();
		System.out.println("forward method ended.");
		Thread.sleep(5000);
		System.out.println("refresh method is going to call.");
		driver.navigate().refresh();
		System.out.println("refresh method ended.");
		Thread.sleep(10000);
		driver.close();

	}*/

	/*
	@Test
	public void radioAndCheckboxSelection() {

		System.out.println("\n browser navigation method called.");
		driver.get(toolsQAURL);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[text()='Selenium Training']")).click();
		WebElement menuOption = driver.findElement(By.xpath(".//span[contains(text(),'DEMO SITES')]"));
		System.out.println("ElementValue : " + menuOption.getText());
		menuOption.clear();

		Actions actions = new Actions(driver);
		actions.moveToElement(menuOption).perform();
		System.out.println("Done mouse over on DEMO SITES");

		WebElement subMenuLink = driver.findElement(By.xpath(".//span/span[contains(text(),'Automation Practice Form')]"));
		subMenuLink.click();
		System.out.println("Selected Automation Practice Form link.");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement closePopupElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='close-image']")));
		closePopupElement.click();

		driver.findElement(By.xpath("//img[@alt='close-image']")).click();

		// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		// Storing all the elements under category 'Sex' in the list of WebLements
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));

		// Create a boolean variable which will hold the value (True/False) 
		boolean bValue = false;

		// This statement will return True, in case of first Radio button is selected
		bValue = rdBtn_Sex.get(0).isSelected();

		// This will check that if the bValue is True means if the first radio button is selected
		if (bValue == true) {
			// This will select Second radio button, if the first radio button is selected by default
			rdBtn_Sex.get(1).click();
		} else {
			// If the first radio button is not selected by default, the first will be selected
			rdBtn_Sex.get(0).click();
		}

		// Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();

		// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'(Use Value attribute to match the selection)
		// Find the Check Box or radio button element by Name 
		
		List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));

		// This will tell you the number of Check Boxes are present
		int iSize = chkBx_Profession.size();

		// Start the loop from first Check Box to last Check Box
		for (int i = 0; i < iSize; i++) {
			// Store the Check Box name to the string variable, using'Value' attribute
			String sValue = chkBx_Profession.get(i).getAttribute("value");

			// Select the Check Box it the value of the Check Box is same what you are looking for
			if (sValue.equalsIgnoreCase("Automation Tester")) {
				chkBx_Profession.get(i).click();
				// This will take the execution out of for loop
				break;
			}
		}
		// Step 6: Check the Check Box 'Selenium IDE' for category'Automation Tool'(Use cssSelector)
		WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheck_Box.click();

	}*/
	
	public static void topmenuElementsFinder(WebDriver driver) {
		//Locating child elements : ul#menu-top li:nth-of-type(1)    {ul is parent having id as menu-top and child is li having class attribute only}
		List<WebElement> topmenuElements = driver.findElements(By.cssSelector("li.menu-item"));
		//WebElement topmenuElements = driver.findElement(By.cssSelector("ul#menu-top li:nth-of-type(1)"));
		System.out.println(topmenuElements.size());
	}
}
