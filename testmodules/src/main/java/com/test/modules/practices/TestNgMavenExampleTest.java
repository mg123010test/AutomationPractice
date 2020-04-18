package com.test.modules.practices;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.modules.practices.tutorialspointtestNGExamples.EmployeeBusinessLogics;
import com.test.modules.practices.tutorialspointtestNGExamples.EmployeeDetails;


public class TestNgMavenExampleTest {

	final static Logger logger = Logger.getLogger(TestNgMavenExampleTest.class);
	
	EmployeeDetails empDetrails = new EmployeeDetails("Deepak", 34, 95000);
	EmployeeBusinessLogics empBusinessLogic = new EmployeeBusinessLogics();
	
	/*
	 * @Test public void exampleOfTestNgMaven() { logger.info(className +
	 * " This is TestNG-Maven Example "); }
	 */
	
	@Test
	public void testCalulateAppraisal() {
		
		logger.info("testCalulateAppraisal method called ");
		double calculateAppraisal = empBusinessLogic.calculateAppraisal(empDetrails);
		Assert.assertEquals(calculateAppraisal, 1000);
		logger.info("testCalulateAppraisal method end ");

	}
	
	@Test
	public void testCalculateYearlySalary() {
		logger.info("testCalculateYearlySalary method called ");
		Assert.assertEquals(empBusinessLogic.calculateYearlySalary(empDetrails), 95000*12);
		logger.info("testCalculateYearlySalary method end ");
	}
	
	@Test
	public void testMessage() {
		logger.info("testMessage method called ");
		String homeDirectory;
		homeDirectory = System.getProperty("user.home");
		Assert.assertEquals(homeDirectory, "/Users/manish.gupta");
		logger.info("testMessage method ends ");
	}
}
