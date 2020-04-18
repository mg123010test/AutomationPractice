package com.test.modules.utility;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.test.modules.constant.CommonDef;

public class Log4jTestClass {
	
	  final static private String className="Log4jTestClass"; 
	  final static Logger logger = Logger.getLogger(className);
	 

	public static void main(String[] args) throws Exception {

		String str = "Java Examples Java Code Java Program";
		 
		int count = StringUtils.countMatches(str, "Java");
		 
		System.out.println("Total occurrences: " + count);
		
		String str1 = "The Java Examples Java Code Java Program Java";
		 
		int count1 = ( str1.split("Java",-1).length ) - 1;
		 
		System.out.println("Total occurrences: " + count1);
		
		/*
		 * logger.info("className : " + className + " has started its execution.");
		 * 
		 * ExcelUtil.loadExcelFile(CommonDef.TESTDATA_FILE);
		 * 
		 * String username = ExcelUtil.getCellData(1, 0);
		 * 
		 * String address = ExcelUtil.getCellData(1, 1);
		 * 
		 * logger.info("Name : " + username); logger.info("Address : " + address);
		 * 
		 * // This is to send the PASS value to the Excel sheet in the result column.
		 * 
		 * ExcelUtil.setCellData("PASS", 1, 2); ExcelUtil.setCellData("PASS", 2, 2);
		 * ExcelUtil.setCellData("PASS", 3, 2); ExcelUtil.setCellData("FAIL", 4, 2);
		 * ExcelUtil.setCellData("FAIL", 5, 2);
		 * 
		 * 
		 * logger.info("Result updated check : " + ExcelUtil.getCellData(1, 2));
		 * logger.info("Result updated check : " + ExcelUtil.getCellData(2, 2));
		 * logger.info("Result updated check : " + ExcelUtil.getCellData(3, 2));
		 * logger.info("Result updated check : " + ExcelUtil.getCellData(4, 2));
		 * logger.info("Result updated check : " + ExcelUtil.getCellData(5, 2));
		 */
	}

}
