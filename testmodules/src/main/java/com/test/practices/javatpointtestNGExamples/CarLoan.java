package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class CarLoan {

	final static Logger logger = Logger.getLogger(CarLoan.class);

	@Test
	public void WebLoginCarLoan() {
		logger.info("Web Login Car Loan");
	}

	@Test
	public void MobileLoginCarLoan() {
		logger.info("Mobile Login Car Loan");
	}

	@Test(groups = { "SmokeTest" })
	public void APILoginCarLoan() {
		logger.info("API Login Car Loan");
	}
}
