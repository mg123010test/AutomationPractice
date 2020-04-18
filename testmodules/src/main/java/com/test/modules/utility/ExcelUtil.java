package com.test.modules.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.test.modules.constant.CommonDef;

public class ExcelUtil {

	/*
	 * private static URL RESOURCE; private static XSSFSheet ExcelWSheet; private
	 * static XSSFWorkbook ExcelWBook; private static XSSFCell Cell; private static
	 * XSSFRow Row;
	 */

	final static private String className = "ExcelUtil";
	final static Logger logger = Logger.getLogger(className);

	private static HSSFWorkbook ExcelWBook;
	private static HSSFSheet ExcelWSheet;
	private static HSSFCell Cell;
	private static HSSFRow Row;
	private static String sheetName;
	private static File file;
	private static FileInputStream fileinputStream;
	private static FileOutputStream fileout;
	private static String filePath = CommonDef.USER_DIR + CommonDef.EXCEL_FILE_PATH;

	// This method is used to load the excel file
	public static void loadExcelFile(String filename) {

		logger.info("className : " + className + " has started its execution.");

		try {
			file = new File(filePath + filename);
			logger.info("File Name : " + file);
			fileinputStream = new FileInputStream(file);
			ExcelWBook = new HSSFWorkbook(fileinputStream);
			logger.info("ExcelWBook : " + file.getName());
			ExcelWSheet = ExcelWBook.getSheetAt(0);
			sheetName = ExcelWSheet.getSheetName();
			logger.info("ExcelWSheet : " + sheetName);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	// This method is to read the data from the Excel cell passing parameters as RowNum and ColNum

	public static String getCellData(int RowNum, int ColNum) {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return e.getMessage();

		}

	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters

	public static void setCellData(String Result, int RowNum, int ColNum) {

		try {

			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			fileout = new FileOutputStream(file);

			ExcelWBook.write(fileout);

			fileout.flush();

			fileout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
