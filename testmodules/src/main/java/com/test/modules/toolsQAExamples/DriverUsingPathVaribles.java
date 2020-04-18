package com.test.modules.toolsQAExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverUsingPathVaribles {

	WebDriver driver;
	
	@Test
	public void methodUsingPathVariables() {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/manish.gupta/Desktop/GDPR/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com");
		
		///Users/manish.gupta/Desktop/GDPR/drivers
		//PATH=/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/Users/manish.gupta/Desktop/GDPR/apache-maven-3.6.2/bin:/Users/manish.gupta/Desktop/GDPR/drivers:
	
		//export DRIVER_HOME=/Users/manish.gupta/Desktop/GDPR/drivers
				//export PATH=$PATH:DRIVER_HOME
	}
}
