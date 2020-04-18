package com.test.modules.practices.tutorialspointtestNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class AnnotationExecutionHeirarchy {

	final static Logger logger = Logger.getLogger(AnnotationExecutionHeirarchy.class);
	// test case 1
	   @Test
	   public void testCase1() {
	     logger.info("in test case 1");
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      logger.info("in test case 2");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      logger.info("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      logger.info("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      logger.info("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      logger.info("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      logger.info("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      logger.info("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      logger.info("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      logger.info("in afterSuite");
	   }
	   
	   @BeforeGroups
	   public void beforeGroups() {
	      logger.info("in beforeGroups");
	   }

	   @AfterGroups
	   public void afterGroups() {
	      logger.info("in afterGroups");
	   }
}
