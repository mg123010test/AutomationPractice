package com.test.modules.toolsQAExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTests {

	@Test
	 public void Test1()
	 {
	 Assert.assertEquals(false, true);
	 }
	 
	 @Test
	 public void Test2()
	 {
	 Assert.assertEquals(false, true);
	 }
}
