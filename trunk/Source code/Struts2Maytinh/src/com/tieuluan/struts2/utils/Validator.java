package com.tieuluan.struts2.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class Validator.
 */
public class Validator {

	public static final String USER_TAG_REGEX = "@\\[(\\d*):([a-zA-Z \\*\\d\\sÃ€Ã�Ã‚ÃƒÃˆÃ‰ÃŠáº¾ÃŒÃ�Ã’Ã“Ã�?Ã•Ã™ÃšÄ‚Ä�Ä¨Å¨Æ Ã Ã¡Ã¢Ã£Ã¨Ã©ÃªÃ¬Ã­Ã²Ã³Ã´ÃµÃ¹ÃºÄƒÄ‘Ä©Å©Æ¡Æ¯Ä‚áº áº¢áº¤áº¦áº¨áºªáº¬áº®áº°áº²áº´áº¶áº¸áººáº¼á»€á»€á»‚Æ°Äƒáº¡áº£áº¥áº§áº©áº«áº­áº¯áº±áº³áºµáº·áº¹áº»áº½á»�áº¿á»ƒá»„á»†á»ˆá»Šá»Œá»Žá»�á»’á»�?á»–á»˜á»šá»œá»žá» á»¢á»¤á»¦á»¨á»ªá»…á»‡á»‰á»‹á»�á»�á»‘á»“á»•á»—á»™á»›á»�á»Ÿá»¡á»£á»¥á»§á»©á»«á»¬á»®á»°á»²á»´Ã�á»¶á»¸á»­á»¯á»±á»³Ã½á»µá»·á»¹]*)]";
	
	public static final String USER_TAG_NOTI_REGEX = "@\\[(\\d*):([a-zA-Z \\*\\d\\sÃ€Ã�Ã‚ÃƒÃˆÃ‰ÃŠáº¾ÃŒÃ�Ã’Ã“Ã�?Ã•Ã™ÃšÄ‚Ä�Ä¨Å¨Æ Ã Ã¡Ã¢Ã£Ã¨Ã©ÃªÃ¬Ã­Ã²Ã³Ã´ÃµÃ¹ÃºÄƒÄ‘Ä©Å©Æ¡Æ¯Ä‚áº áº¢áº¤áº¦áº¨áºªáº¬áº®áº°áº²áº´áº¶áº¸áººáº¼á»€á»€á»‚Æ°Äƒáº¡áº£áº¥áº§áº©áº«áº­áº¯áº±áº³áºµáº·áº¹áº»áº½á»�áº¿á»ƒá»„á»†á»ˆá»Šá»Œá»Žá»�á»’á»�?á»–á»˜á»šá»œá»žá» á»¢á»¤á»¦á»¨á»ªá»…á»‡á»‰á»‹á»�á»�á»‘á»“á»•á»—á»™á»›á»�á»Ÿá»¡á»£á»¥á»§á»©á»«á»¬á»®á»°á»²á»´Ã�á»¶á»¸á»­á»¯á»±á»³Ã½á»µá»·á»¹]*):(true|false)]";
	
	public static final String SQL_REGEXP_LIKE_PHONE_PATTERN = "^(84|0)(98|97|163|164|165|166|167|168|169|90|93|122|124|126|121|128|120|91|94|123|125|127|129|96)[0-9]{7}$";
	
    /**
     * validate if contentType is image.
     * 
     * @param contentType
     *            the content type
     * @return true if is valid
     */
    public static boolean validateImageContentType(String contentType) {
        return contentType.startsWith("image");
    }

    /**
     * Checks if is valid location path.
     * 
     * @param path
     *            the path
     * @return true, if is valid location path
     */
    public static boolean isValidLocationPath(String path) {
        Pattern p = Pattern.compile("^[A-Za-z0-9_\\-@]+$");
        Matcher m = p.matcher(path);

        boolean matchFound = m.matches();
        return matchFound;
    }

    /**
     * Checks if is exist ban characters.
     * 
     * @param path
     *            the path
     * @return true, if is exist ban characters
     */
    public static boolean isExistBanCharacters(String path) {
        if (StringUtil.isNullOrEmpty(path)) {
            return false;
        }
        Pattern p = Pattern.compile("[^<>]+");
        Matcher m = p.matcher(path);

        boolean matchFound = !m.matches();
        return matchFound;
    }

    /**
     * Checks if is valid price.
     * 
     * @param price
     *            the price
     * @return true, if is valid price
     */
    public static boolean isValidPrice(String price) {
        // can only accept 0-9,. (temp)
        if (StringUtil.isNullOrEmpty(price)) {
            return true;
        }
        Pattern p = Pattern.compile("^[0-9.]+$");
        Matcher m = p.matcher(price);

        boolean matchFound = m.matches();
        return matchFound;
    }

    /**
     * Checks if is exist special characters.
     * 
     * @param path
     *            the path
     * @return true, if is exist special characters
     */
    public static boolean isExistSpecialCharacters(String path) {
        if (StringUtil.isNullOrEmpty(path)) {
            return false;
        }
        Pattern p = Pattern.compile("[^<>!/@#$%&*(){}?]+");
        Matcher m = p.matcher(path);

        boolean matchFound = !m.matches();
        return matchFound;
    }

    /**
	 * Checks if is exist open close tag.
	 * 
	 * @param path
	 *            the path
	 * @return true, if is exist open close tag
	 */
    public static boolean isExistOpenCloseTag(String path) {
        if (StringUtil.isNullOrEmpty(path)) {
            return false;
        }
        Pattern p = Pattern.compile("[^<>]+");
        Matcher m = p.matcher(path);

        boolean matchFound = !m.matches();
        return matchFound;
    }
    
    /**
     * Validate mobile phone number. A mobile phone number is considered valid
     * if: <br/>
     * - has 10 digits and begin with 09 <br/>
     * - has 11 digits and begin with 01 <br/>
     * - has 11 digits and begin with 849 <br/>
     * - has 12 digits and begin with 841 <br/>
     * - has 12 digits and begin with +849 <br/>
     * - has 13 digits and begin with +841
     * 
     * @param mobileNumber
     *            the mobile phone number
     * @return true if argument is a valid mobile phone number, false otherwise
     */
    public static boolean validateMobileNumber(String mobileNumber) {
        mobileNumber = mobileNumber.trim();
        final String prefix849 = "849";
        final String prefix849plus = "+849";
        final String prefix841 = "841";
        final String prefix841plus = "+841";
        final String prefix09 = "09";
        final String prefix01 = "01";
        boolean result = false;

        if (!StringUtil.isNullOrEmpty(mobileNumber)
                && canBePhoneNumber(mobileNumber)) {
            int length = mobileNumber.length();
            switch (length) {
            case 10:
                if (mobileNumber.startsWith(prefix09)) {
                    result = true;
                }
                break;
            case 11:
                if (mobileNumber.startsWith(prefix01)
                        || mobileNumber.startsWith(prefix849)) {
                    result = true;
                }
                break;
            case 12:
                if (mobileNumber.startsWith(prefix841)
                        || mobileNumber.startsWith(prefix849plus)) {
                    result = true;
                }
                break;
            case 13:
                if (mobileNumber.startsWith(prefix841plus)) {
                    result = true;
                }
                break;
            }
        }

        return result;
    }

    /**
     * Checks if phone number may be valid.
     * 
     * @param phonenumber
     *            the phonenumber
     * @return true, if is valid phone number
     */
    public static boolean canBePhoneNumber(String phonenumber) {

        Pattern p = Pattern.compile("^(09|01|849|841|\\+849|\\+841)[0-9]+$");
        Matcher m = p.matcher(phonenumber);

        boolean matchFound = m.matches();
        return matchFound;
    }
   
   /**
    * Must validate phone number before calling this method!
    * Parse mobile phone number.
    *
    * @param mobileNumber the mobile phone number
    * @return the string
    */
   public static String parseMobileNumber(String mobileNumber) {
	   final String countryCode = "84";
	   final String countryCodePlus = "+84";
	   final String _9x = "9";
	   final String _09x = "09";
	   final String _1x = "1";
	   final String _01x = "01";
	   
	   if (mobileNumber == null) {
		   return null;
	   }
	   mobileNumber = mobileNumber.trim();
	   
	   if(mobileNumber.startsWith(countryCodePlus)) {
		   mobileNumber = mobileNumber.substring(1);
	   }
	   
	   String validatePhone = null;
	   
	   // phone start with "84" or "+84"
	   if (mobileNumber.startsWith(countryCode)) {
		   boolean isMobileNumber =
			   (mobileNumber.length() == 11 && mobileNumber.substring(2)
					   .startsWith(_9x))
					   || (mobileNumber.length() == 12 && mobileNumber.substring(2)
							   .startsWith(_1x));
		   if (isMobileNumber) {
			   validatePhone = mobileNumber;
		   } 
	   } 
	   // phone = "09xxxxxxxx" (like: 0987868686)
	   else if (mobileNumber.length() == 10
			   && mobileNumber.startsWith(_09x)) {
		   validatePhone = countryCode + mobileNumber.substring(1);
	   } 
	   // phone = "1xxxxxxxx" (like: 01696999999)
	   else if (mobileNumber.length() == 11
			   && mobileNumber.startsWith(_01x)) {
		   validatePhone = countryCode + mobileNumber.substring(1);
	   }
	   
	   return validatePhone;        
   }
    
    /**
     * Validate email.
     * 
     * @param value
     *            the value
     * @return true, if successful
     */
    public static boolean validateEmail(String value) {
        Pattern p =
                Pattern
                        .compile("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$");
        Matcher m = p.matcher(value);

        boolean matchFound = m.matches();
        return matchFound;
    }

    /**
     * Validate url.
     * 
     * @param value
     *            the value
     * @return true, if successful
     */
    public static boolean validateUrl(String value) {
        Pattern p =
                Pattern
                        .compile("(http|https|ftp):\\/\\/(([A-Z0-9][A-Z0-9_-]*)(\\.[A-Z0-9][A-Z0-9_-]*)+)(:(\\d+))?\\/?");
        Matcher m = p.matcher(value);

        boolean matchFound = m.matches();
        return matchFound;
    }

    /**
     * Validate number.
     * 
     * @param value
     *            the value
     * @return true, if successful
     */
    public static boolean validateNumber(String value) {
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(value);

        boolean matchFound = m.matches();
        return matchFound;
    }

    /**
     * Validate username.
     * 
     * @param name
     *            the name
     * @return true, if successful
     */
    public static boolean validateUsername(String name) {
        Pattern p = Pattern.compile("^[A-Za-z0-9]+([_][A-Za-z0-9]+)*$");
        Matcher m = p.matcher(name);

        boolean matchFound = m.matches();
        return matchFound;
    }
    
    /**
	 * Checks if is viettel phone number.
	 * 
	 * @param phoneNumber
	 *            the phone number
	 * @return true, if is viettel phone number
	 */
    public static boolean isViettelPhoneNumber(String phoneNumber) {
        boolean match = false;
        if(canBePhoneNumber(phoneNumber)) {
            String formatedPhone = parseMobileNumber(phoneNumber);
            if(formatedPhone != null) {
                Pattern p = Pattern.compile("^84(96|97|98|162|163|164|165|166|167|168|169)[0-9]*$");
                Matcher m = p.matcher(formatedPhone);
                match = m.matches();
            }
        }
        return match;
    }
    
    public static boolean isMobiPhoneNumber(String phoneNumber) {
        boolean match = false;
        if(canBePhoneNumber(phoneNumber)) {
            String formatedPhone = parseMobileNumber(phoneNumber);
            if(formatedPhone != null) {
                Pattern p = Pattern.compile("^84(90|93|120|121|122|126|128)[0-9]*$");
                Matcher m = p.matcher(formatedPhone);
                match = m.matches();
            }
        }
        return match;
    }
    public static boolean isVinaPhoneNumber(String phoneNumber) {
        boolean match = false;
        if(canBePhoneNumber(phoneNumber)) {
            String formatedPhone = parseMobileNumber(phoneNumber);
            if(formatedPhone != null) {
                Pattern p = Pattern.compile("^84(91|94|123|124|125|127|129)[0-9]*$");
                Matcher m = p.matcher(formatedPhone);
                match = m.matches();
            }
        }
        return match;
    }
    /**
     * Checks if is viettel mobi vina phone number.
     *
     * @param phoneNumber the phone number
     * @return true, if is viettel mobi vina phone number
     */
    public static boolean isViettelMobiVinaPhoneNumber(String phoneNumber) {
        boolean match = false;
        if(canBePhoneNumber(phoneNumber)) {
            String formatedPhone = parseMobileNumber(phoneNumber);
            if(formatedPhone != null) {
                Pattern p = Pattern.compile("^84(98|97|163|164|165|166|167|168|169|90|93|122|124|126|121|128|120|91|94|123|125|127|129|96)[0-9]*$");
                Matcher m = p.matcher(formatedPhone);
                match = m.matches();
            }
        }
        return match;
    }
    
    /**
	 * Checks if is valid display name.
	 * 
	 * @param displayName
	 *            the display name
	 * @return true, if is valid display name
	 */
    public static boolean isValidDisplayName(String displayName) {
		if (displayName == null || displayName.trim().equals(""))
			return true;
//		final String DISPLAY_NAME_REGEX = "^[a-zA-Z\\sÃ€Ã�Ã‚ÃƒÃˆÃ‰ÃŠÃŒÃ�Ã’Ã“Ã�?Ã•Ã™ÃšÄ‚Ä�Ä¨Å¨Æ Ã Ã¡Ã¢Ã£Ã¨Ã©ÃªÃ¬Ã­Ã²Ã³Ã´ÃµÃ¹ÃºÄƒÄ‘Ä©Å©Æ¡Æ¯Ä‚áº áº¢áº¤áº¦áº¨áºªáº¬áº®áº°áº²áº´áº¶áº¸áººáº¼á»€á»€á»‚Æ°Äƒáº¡áº£áº¥áº§áº©áº«áº­áº¯áº±áº³áºµáº·áº¹áº»áº½á»�á»�á»ƒá»„á»†á»ˆá»Šá»Œá»Žá»�á»’á»�?á»–á»˜á»šá»œá»žá» á»¢á»¤á»¦á»¨á»ªá»…á»‡áº¿á»‰á»‹á»�á»�á»‘á»“á»•á»—á»™á»›á»�á»Ÿá»¡á»£á»¥á»§á»©á»«á»¬á»®á»°á»²á»´Ã�á»¶á»¸á»­á»¯á»±á»³Ã½á»µá»·á»¹]+$";
		final String DISPLAY_NAME_REGEX  = "^[a-zA-Z \\sÃ€Ã�Ã‚ÃƒÃˆÃ‰ÃŠáº¾ÃŒÃ�Ã’Ã“Ã�?Ã•Ã™ÃšÄ‚Ä�Ä¨Å¨Æ Ã Ã¡Ã¢Ã£Ã¨Ã©ÃªÃ¬Ã­Ã²Ã³Ã´ÃµÃ¹ÃºÄƒÄ‘Ä©Å©Æ¡Æ¯Ä‚áº áº¢áº¤áº¦áº¨áºªáº¬áº®áº°áº²áº´áº¶áº¸áººáº¼á»€á»€á»‚Æ°Äƒáº¡áº£áº¥áº§áº©áº«áº­áº¯áº±áº³áºµáº·áº¹áº»áº½á»�áº¿á»ƒá»„á»†á»ˆá»Šá»Œá»Žá»�á»’á»�?á»–á»˜á»šá»œá»žá» á»¢á»¤á»¦á»¨á»ªá»…á»‡á»‰á»‹á»�á»�á»‘á»“á»•á»—á»™á»›á»�á»Ÿá»¡á»£á»¥á»§á»©á»«á»¬á»®á»°á»²á»´Ã�á»¶á»¸á»­á»¯á»±á»³Ã½á»µá»·á»¹]+$";
		Pattern pattern = Pattern.compile(DISPLAY_NAME_REGEX);
		Matcher matcher = pattern.matcher(displayName.trim());
		return matcher.matches();
	}
    
    public static Set<Integer> splitUserTag(String content) {
    	final Set<Integer> userIdLst = new HashSet<Integer>(); 
	    if(StringUtil.isNullOrEmpty(content)){
	        return userIdLst;
	    }
		final Pattern p = Pattern.compile(USER_TAG_REGEX,Pattern.CASE_INSENSITIVE);
		final Matcher m = p.matcher(content);
		// Check all occurance
		 while(m.find()){
		     userIdLst.add(Integer.parseInt(m.group(1)));
         }
		return userIdLst;
	}
    public static String adjustPhone(String phone) {
		if(StringUtil.isNullOrEmpty(phone)){
			return "";
		}
		String[] lstChar = {"-","."," "};
		int first = 0;
		int last = 0;
		for (String ch : lstChar) {
			first = phone.indexOf(ch);
			last = phone.lastIndexOf(ch);
			if(first > 0 && last < phone.length() - 1){
				phone = phone.replaceAll(ch, "");
			}
			
		}
		return phone;
	}
    public static String replaceUserTagText(String content) {
    	if(StringUtil.isNullOrEmpty(content)){
			return "";
		}
        return content.replaceAll(USER_TAG_REGEX,"@$2");
    }
    
    public static String replaceUserTagNotiText(String content) {
    	if(StringUtil.isNullOrEmpty(content)){
			return "";
		}
        return content.replaceAll(USER_TAG_NOTI_REGEX,"$2");
   }
    public static void main(String[] args) {
		System.out.println(Validator.validateNumber("0835533097"));
	}
}
