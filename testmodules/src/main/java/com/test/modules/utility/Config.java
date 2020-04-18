package com.test.modules.utility;

import java.util.ResourceBundle;

public class Config {

	private static ResourceBundle properties = ResourceBundle.getBundle("questmodules");

	public static String getProperty(String key) {
		return properties.getString(key);
	}

}
