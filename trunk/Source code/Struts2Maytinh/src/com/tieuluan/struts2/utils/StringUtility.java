package com.tieuluan.struts2.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtility {
	
	/** STRING_SEARCH_LIKE_ALL. */
	public static final String STRING_SEARCH_LIKE_ALL = "%%";

	private static final String[] oracleTextKeywords = new String[] { "ACCUM",
			"ABOUT", "NOT", "OR", "AND", "BT", "BTG", "BTP", "BTI", "NT",
			"NTG", "NTP", "NTI", "PT", "RT", "RT", "SQE", "SYN", "TR", "TRSYN",
			"TT", "FUZZY", "HASPATH", "INPATH", "MINUS", "NEAR", "WITHIN", "84%", "8%", "MDATA" };
	
	/**
	 * Gets the m d5 hash.
	 * 
	 * @param string
	 *            the string
	 * 
	 * @return the m d5 hash
	 */
	public static String getMD5Hash(String string, String salt) {
		MessageDigest digest;
		try {
			digest = java.security.MessageDigest.getInstance("MD5");
			digest.update((salt+string).getBytes());
			final byte[] hash = digest.digest();
			final StringBuilder result = new StringBuilder(hash.length);
			for (int i = 0; i < hash.length; i++) {
				result.append(Integer.toString((hash[i] & 0xff) + 0x100, 16)
						.substring(1));
			}
			return result.toString();
		} catch (final NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	public static boolean isNullOrEmpty(final String s) {
		return (s == null || s.trim().length() == 0);
	}
	
	public static String removeSpecialChars(String text, String byString) {
		final String[] chars = new String[] { ",", ".", "/", "!", "@", "#",
				"$", "%", "^", "&", "*", "'", "\"", ";", "-", "_", "(", ")",
				":", "|", "[", "]", "~", "+", "{", "}", "?", "\\", "<", ">" };
		if (StringUtility.isNullOrEmpty(text))
			return text;

		for (int i = 0; i < chars.length; i++) {
			if (text.indexOf(chars[i]) >= 0) {
				text = text.replace(chars[i], byString);
			}
		}
		return text;
	}
	
	public static String toOracleSearchText(String searchText,
			boolean isAutocomplete) {
		String[] splitString;
		StringBuilder text = new StringBuilder();
		String OpPat = ",;&"; // search operator pattern
		String SpPat = "<>./!@#$%^*'\"-_():|[]~+{}?\\\n"; // special char
		// pattern
		char[] searchTextArr;
		boolean preCheck = true;

		// [DungNTM commented on Jan 10 - 2011: remove all special characters
		// later]
		// searchText = clearAllHTMLTags(searchText);
		// [end]

		if (!StringUtility.isNullOrEmpty(searchText)) {
			searchTextArr = searchText.toCharArray();

			// remove special char, keep operator char
			for (int i = 0; i < searchTextArr.length; i++) {
				if (SpPat.indexOf(searchTextArr[i]) >= 0) {
					searchTextArr[i] = ' ';
				} else if (OpPat.indexOf(searchTextArr[i]) >= 0) {
					if (preCheck) {
						searchTextArr[i] = ' ';
					}
					preCheck = true;
				} else
					preCheck = false;
			}

			searchText = String.valueOf(searchTextArr).trim();
			if (StringUtility.isNullOrEmpty(searchText)) {
				return STRING_SEARCH_LIKE_ALL;
			}

			if (isAutocomplete)
				//searchText = "%" + text.toString().trim() + "%";
				searchText = searchText.trim() + "%";
			else
				searchText = searchText.trim();
			
			splitString = searchText.split(" ");
			// if (splitString.length > 1) {
			for (int i = 0; i < splitString.length; i++) {
				if (!"".equals(splitString[i])) {

					//if (!isAutocomplete) {
						for (int j = 0; j < oracleTextKeywords.length; j++) {
							if (oracleTextKeywords[j].equals(splitString[i]
									.toUpperCase())) {
								splitString[i] = "{" + splitString[i] + "}";
								break;
							}
						}
					//}

					text.append(splitString[i] + " ");
				}
			}
			
			searchText = text.toString();
			
			// } else if (splitString.length == 1) {
			// text.append("%");
			// text.append(splitString[0].trim());
			// text.append("%");
			// }
			
			// remove last operator if exist
			if (OpPat.indexOf(searchText.charAt(searchText.length() - 1)) >= 0) {
				searchText = searchText.substring(0, searchText.length() - 1);
			}
		} else
			return STRING_SEARCH_LIKE_ALL;

		// System.out.println("searchString:" + searchText);
		return searchText;
	}
	
	public static String toOracleSearchLike(String searchText) {
//		String[] result = new String[2];
//		String[] splitString;
//		StringBuilder text = new StringBuilder();
//		searchText = clearAllHTMLTags(searchText);
		String escapeChar = "/";
		String[] arrSpPat = {"/", "%", "_", "\\\\"};
		
		for (String str: arrSpPat) {
			if (!StringUtility.isNullOrEmpty(searchText)) {
				searchText = searchText.replaceAll(str, escapeChar + str);
			}
		}
		searchText = "%" + searchText + "%";
		return searchText;
	}
}
