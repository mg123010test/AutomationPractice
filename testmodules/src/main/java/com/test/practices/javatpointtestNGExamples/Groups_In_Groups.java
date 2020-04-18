package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Groups_In_Groups {

	
	final static Logger logger = Logger.getLogger(Groups_In_Groups.class);
	
	
	@Test(groups= {"Smoke"})  
	 public void test1()  
	 {  
		logger.info("test1");  
	 }  
	 @Test(groups= {"Regression"})  
	 public void test2()  
	 {  
		 logger.info("test2");  
	 }  
	 @Test  
	 public void test3()  
	 {  
		 logger.info("test3");  
	 }
}
