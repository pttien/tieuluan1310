package com.tieuluan.struts2.utils;

import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogUtility {
	private static Logger responseLog = Logger
			.getLogger("com.viettel.mycity.log.response");
	private static Logger serverErrorLog = Logger
			.getLogger("com.viettel.mycity.log.error.server");
	private static Logger clientErrorLog = Logger
			.getLogger("com.viettel.mycity.log.error.client");

	public static void logResponse(String className,String methodName,String duration ) {
		responseLog.trace(className + ";" + methodName + ";" +duration);
	}

	public static void logError(Throwable e, String message) {
		if (serverErrorLog.isEnabledFor(Level.ERROR)) {
			StringBuilder sb = new StringBuilder();
			sb.append("\"").append(toCSVCell(message)).append("\",");

			sb.append("\"");
			if (e != null) {
				sb.append(e.getMessage()).append("\n");
				StackTraceElement[] st = e.getStackTrace();
				for (int i = 0; i < st.length; i++) {
					sb.append(st[i]).append("\n");
				}
			}
			sb.append("\"");

			serverErrorLog.error(sb.toString());
		}
	}

	public static void logMobileClientError(String platform, String model,
			String version, String errName, String description) {
		if (clientErrorLog.isEnabledFor(Level.ERROR)) {
			StringBuilder sb = new StringBuilder();
			sb.append("\"").append(platform).append("\",");
			sb.append("\"").append(model).append("\",");
			sb.append("\"").append(toCSVCell(errName)).append("\",");
			sb.append("\"").append(toCSVCell(description)).append("\",");
			sb.append("\"").append(new Date()).append("\",");
			sb.append("\"").append(version).append("\"");

			clientErrorLog.error(sb.toString());
		}
	}

	private static String toCSVCell(String input) {
		if(input != null){
			return input.replaceAll("\"", "\"\"");
		}
		return "";
	}
}
