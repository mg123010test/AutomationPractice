package com.test.modules.guru99Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	WebDriver driver;

	@Test
	public void explicitWaitTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		WebDriverWait explicitWait = new WebDriverWait(driver, 20);

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		// Maximizes the browser window
		driver.manage().window().maximize();
		// get the actual value of the title
		aTitle = driver.getTitle();
		// compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		WebElement guru99seleniumlink;
		guru99seleniumlink = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		guru99seleniumlink.click();

	}
}
