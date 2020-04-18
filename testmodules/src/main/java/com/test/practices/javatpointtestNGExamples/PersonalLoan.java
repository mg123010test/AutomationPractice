package com.test.practices.javatpointtestNGExamples;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class PersonalLoan {

	final static Logger logger = Logger.getLogger(PersonalLoan.class);

	@Test(groups = { "SmokeTest" })
	public void WebLoginPersonalLoan() {
		logger.info("Web Login Personal Loan");
	}

	@Test
	public void MobileLoginPersonalLoan() {
		logger.info("Mobile Login Personal Loan");
	}

	@Test
	public void APILoginPersonalLoan() {
		logger.info("API Login Personal Loan");
	}
}
