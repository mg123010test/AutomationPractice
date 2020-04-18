package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	private static final Logger logger = Logger.getLogger(DependsOnMethodsTest.class);
	
	@Test()
	public void mobileAPITesting() {
		logger.info("mobileapiTesting methiod called");
		Reporter.log("Reporter log : mobileapiTesting methiod called");
	}
	
	@Test
	public void webAPITestingMethod() {
		logger.info("webapitesting method called.");
	}
	
	@Test(dependsOnMethods = {"webAPITestingMethod", "mobileAPITesting"})
	public void apiTestingMethod() {
		logger.info("API Testing method called.");
	}
	
	@Test
	public void checkMethod() {
		logger.info("check method");
	}
}
