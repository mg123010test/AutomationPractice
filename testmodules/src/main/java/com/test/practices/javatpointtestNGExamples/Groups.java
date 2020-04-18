package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Groups {

	final static Logger logger = Logger.getLogger(Groups.class);
	
	
	@Test(groups = "GroupA")
	public void testCase1() {
		logger.info("testCase1 belonging to GroupA");
	}
	
	@Test(groups= {"GroupA", "GroupB"})
	public void testCase2() {
		logger.info("testCase2 belonging to GroupA and GroupB");
	}
	
	
	@Test(groups="GroupB")
	public void testCase3() {
		logger.info("testCase3 belonging to GroupB");
	}
}
