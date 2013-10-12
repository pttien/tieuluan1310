/**
 * 
 */
package com.tieuluan.struts2.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageUtil {
	private static final String RESOURCE_FILE_NAME = AppSetting.getStringValue("message");

	public MessageUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the resource string.
	 * 
	 * @param language
	 *            the language
	 * @param key
	 *            the key
	 * @param params
	 *            the params
	 * @return the resource string
	 */
	public static String getResourceString(String language, String key,
			Object... params) {
		ResourceBundle rs = ResourceBundle.getBundle(RESOURCE_FILE_NAME,
				new Locale(language));
		String text = rs.getString(key);
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				if (params[i] != null) {
					text = text.replace("{" + i + "}", params[i].toString());
				}
			}
		}

		return text;
	}
}
