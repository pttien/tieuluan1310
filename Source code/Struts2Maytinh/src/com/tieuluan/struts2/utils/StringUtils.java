package com.tieuluan.struts2.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author thanhtc
 * 
 */
public class StringUtils extends org.springframework.util.StringUtils {

	public static String getMD5Hash(String input) {
		return getMD5Hash(input, null);
	}

	public static String fromNullToEmtpyString(String input) {
		if (input == null) {
			return "";
		} else {
			return input;
		}
	}

	public static boolean isNumber(String input) {
		Pattern p = Pattern.compile("^\\d+$");
		Matcher m = p.matcher(input);

		boolean matchFound = m.matches();
		return matchFound;
	}

	public static String getMD5Hash(String input, String salt) {
		MessageDigest digest;
		try {
			if (salt != null) {
				input = salt.trim() + input;
			}
			digest = java.security.MessageDigest.getInstance("MD5");
			digest.update(input.getBytes());
			final byte[] hash = digest.digest();
			final StringBuilder result = new StringBuilder(hash.length);
			for (int i = 0; i < hash.length; i++) {
				result.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
			}
			return result.toString();
		} catch (final NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "error";
		}
	}

	 	private final static char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

	    private static int[]  toInt   = new int[128];

	    /**
	     * Translates the specified Base64 string into a byte array.
	     *
	     * @param s the Base64 string (not null)
	     * @return the byte array (not null)
	     */

	public static String beautifyNumber(Number number) {
		StringBuffer sb = new StringBuffer();
		if (number != null) {
			String input = String.valueOf(number.longValue());
			while (input.length() > 3) {
				sb.insert(0, input.substring(input.length() - 3));
				sb.insert(0, ".");
				input = input.substring(0, input.length() - 3);
			}
			sb.insert(0, input);
		}
		return sb.toString();
	}

	public static boolean isPhone(String number) {
		number = number.replace(".", "");
		if (number.length() == 10 || number.length() == 11 || number.length() == 12) {
			switch (number.length()) {
			case 10:
				if (number.substring(0, 2).compareTo("09") != 0) {
					return false;
				}
				break;
			case 11:
				if (!(number.substring(0, 2).compareTo("09") == 0 || number.substring(0, 3).compareTo("849") == 0)) {
					return false;
				}
				break;
			case 12:
				if (number.substring(0, 3).compareTo("841") != 0) {
					return false;
				}
				break;
			}
			return true;
		}
		return false;
	}

	public static String getFrameTitle(String title) {
		if ("Windows 7".equalsIgnoreCase(System.getProperty("os.name"))) {
			return title;
		} else {
			return Unicode2English.removeDau(title);
		}
	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
	}
	
	public static String beautyNumber(Number number) {
        StringBuffer sb = new StringBuffer();
        if (number != null) {
            String input = String.valueOf(number.longValue());
            while (input.length() > 3) {
                sb.insert(0, input.substring(input.length() - 3));
                sb.insert(0, ".");
                input = input.substring(0, input.length() - 3);
            }
            sb.insert(0, input);
        }

        String str = sb.toString();
        if (str.length() > 2) {
            String prefix = str.substring(0, 2);
            if (prefix.equalsIgnoreCase("-.")) {
                str = prefix.substring(0, 1) + str.substring(2, str.length());
            }
        }
        return str;
    }
	  public static String getID(Integer branchId,Integer shopId){
		  if(branchId==null){
			  branchId=0;
		  }if(shopId==null){
			  shopId=0;
		  }
	    	UUID uuid = UUID.randomUUID();
	    	String id = shopId + "_" + branchId + "_" + uuid.toString();
	    	return id;
	    }
	  
	  public static Long parseLong(String value){
		  try{
			  return Long.parseLong(value);
		  }
		  catch(Exception ex){
			  return null;
		  }
	  }
}
