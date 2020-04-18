package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class IncludeExcludeGroups {

	final static Logger logger = Logger.getLogger(IncludeExcludeGroups.class);

	@Test(groups = { "Include Group" })
	public void test_case1() {
		logger.info("This is test case 1");
	}

	@Test(groups = { "Include Group" })
	public void test_case2() {
		logger.info("This is test case 2");
	}

	@Test(groups = { "Exclude Group" })

	public void test_case3() {
		logger.info("This is test case 3");
	}
}
