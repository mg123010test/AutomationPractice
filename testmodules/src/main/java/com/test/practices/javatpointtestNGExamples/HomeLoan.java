package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class HomeLoan {

	final static Logger logger = Logger.getLogger(HomeLoan.class);

	@Test
	public void WebLoginHomeLoan() {
		logger.info("Web Login Home Loan");
	}

	@Test(groups = { "SmokeTest" })
	public void MobileLoginHomeLoan() {
		logger.info("Mobile Login Home Loan");
	}

	@Test
	public void APILoginHomeLoan() {
		logger.info("API Login Home Loan");
	}
}
