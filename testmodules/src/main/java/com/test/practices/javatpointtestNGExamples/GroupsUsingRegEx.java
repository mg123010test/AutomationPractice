package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class GroupsUsingRegEx {

	final static Logger logger = Logger.getLogger(GroupsUsingRegEx.class);
	
	@Test(groups= {"Include test case1"})  
	public void test_case1()   
	{  
		logger.info("This is test case 1");  
	}  
	@Test(groups= {"Include test case2"})  
	public void test_case2()   
	{  
		logger.info("This is test case 2");  
	}  
	@Test(groups= {"Exclude test case3"})  
	public void test_case3()   
	{  
		logger.info("This is test case 3");  
	}  
}
