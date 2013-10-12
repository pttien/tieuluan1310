/**
 * 
 */
package com.tieuluan.struts2.utils;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * The Class Configuration.
 * 
 * @author DuongMinhTu
 */
public class Configuration {

    /**
     * Gets the resource bundle.
     * 
     * @param language
     *            the language
     * @return the resource bundle
     */
    public static ResourceBundle getResourceBundle(String language) {
        return ResourceBundle.getBundle(AppSetting
                .getStringValue("resource-bundle"), new Locale(language));
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
        ResourceBundle rs = getResourceBundle(language);
        String text = rs.getString(key);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                text = text.replace("{" + i + "}", params[i].toString());
            }
        }

        return text;
    }
}
