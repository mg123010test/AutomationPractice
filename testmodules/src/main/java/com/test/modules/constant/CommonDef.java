package com.test.modules.constant;

import com.test.modules.utility.Config;

public class CommonDef {

		public static final String USERNAME = Config.getProperty("username");
		public static final String PASSWORD = Config.getProperty("password");
		public static final String URL=Config.getProperty("quest_ipms_portal");
		public static final String DATA_FILE=Config.getProperty("userdata_file");
		public static final String TESTDATA_FILE=Config.getProperty("testdata_file");
		public static final String EXCEL_FILE_PATH=Config.getProperty("excel_file_path");
		public static final String USER_HOME=System.getProperty("user.home");
		public static final String USER_DIR=System.getProperty("user.dir");
		public static final String EXCEL_SUFFIX=".xls";
		
		
}
