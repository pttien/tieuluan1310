/**
 * 
 */
package tieuluan.helper;



import java.util.Locale;
import java.util.ResourceBundle;

import com.tieuluan.struts2.utils.AppSetting;
import com.tieuluan.struts2.utils.StringUtil;



/**
 * The Class Configuration.
 * 
 * @author DuongMinhTu
 */
public class Configuration {
	public static final int FILE_VERSION_NUMBER = AppSetting
			.getIntegerValue("svn-revision-number");

	public Configuration() {

	}
	
	public static String getJSServerPath(String cssFile) {
		return AppSetting.getStringValue("js-server-path") + cssFile + "?v="
				+ FILE_VERSION_NUMBER;
	}
	
	public static String getImageUploadFileSupport() {
		return AppSetting.getStringValue("image-upload-file-support");
	}
	

	public static String getCSSServerPath(String cssFile) {
		return AppSetting.getStringValue("css-server-path") + cssFile + "?v="
				+ FILE_VERSION_NUMBER;
	}
	
	public static String getImgServerPath() {
		return AppSetting.getStringValue("img-server-path");
	}

	public static String getImgServerPath(String imgFile) {
		if(!StringUtil.isNullOrEmpty(imgFile)){
			return AppSetting.getStringValue("img-server-path") + imgFile + "?v="
			+ FILE_VERSION_NUMBER;
		}else{
			return AppSetting.getStringValue("img-server-path");
		}
	}

	public static String getMapStaticServer() {
		return AppSetting.getStringValue("map-static-server");
	}	
	
	public static String getAppServerPath() {
    	return AppSetting.getStringValue("app-server-path");
    }
	
	public static String getStaticServerPath() {
		return AppSetting.getStringValue("static-server-path");
	}
	
	public static String getStaticServerPath(String cssFile) {
		return AppSetting.getStringValue("static-server-path") + cssFile + "?v="
				+ FILE_VERSION_NUMBER;
	}

	public static String getDealPath() {
		return AppSetting.getStringValue("deal-folder-path");
	}
	public static String getUploadServerPath() {
		return AppSetting.getStringValue("upload-server-path");
	}
	
	public static int getChangePassDuration() {
		return AppSetting.getIntegerValue("change-pass-duration");
	}
	

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
    
    /**
     * Gets the max description length.
     * 
     * @return the max description length
     */
    public static int getMaxDescriptionLength() {
        return AppSetting.getIntegerValue("max-description-length");
    }

    /**
     * Gets the max status length.
     * 
     * @return the max status length
     */
    public static int getMaxStatusLength() {
        return AppSetting.getIntegerValue("max-status-length");
    }

    /**
     * Gets the max image upload size.
     * 
     * @return in MB size
     */
    public static int getMaxImageUploadSize() {
        return AppSetting.getIntegerValue("max-image-upload-size");
    }

    /**
     * Gets the max avatar upload size.
     * 
     * @return in bytes
     */
    public static int getMaxAvatarUploadSize() {
        return AppSetting.getIntegerValue("max-avatar-upload-size");
    }

    /**
     * get max-comment-length.
     * 
     * @return in integer
     */

    public static String getMaxCommentLength() {
        return AppSetting.getStringValue("max-comment-length");
    }

    /**
     * Gets max message send when request add friend length.
     * 
     * @return the max message send when request add friend length
     */
    public static int getMaxMessageAddFriend() {
        return AppSetting.getIntegerValue("max-message-add-friend");
    }

    /**
     * Gets the upload entry image path.
     * 
     * @return the upload entry image path
     */
    public static String getUploadEntryImagePath() {
        return AppSetting.getStringValue("upload-entry-image-path");
    }

    /**
     * Gets the upload user avatar path.
     * 
     * @return the upload user avatar path
     */
    public static String getUploadUserAvatarPath() {
        return AppSetting.getStringValue("upload-useravatar-path");
    }

    /**
     * Gets the upload location avatar path.
     * 
     * @return the upload location avatar path
     */
    public static String getUploadLocationAvatarPath() {
        return AppSetting.getStringValue("upload-locationavatar-path");
    }

    /**
     * Gets the threshold to ban user.
     * 
     * @return the threshold to ban user
     */
    public static Integer getThresholdToBanUser() {
        return AppSetting.getIntegerValue("threshold-ban-user");
    }

    /**
     * Gets the default image upload path.
     * 
     * @return the default image upload path
     */
    public static String getDefaultImageUploadPath() {
        return AppSetting.getStringValue("default-image-upload-path");
    }

    /**
     * Gets the list content management user.
     * 
     * @return the list content management user
     */
    public static String getListContentManagementUser() {
        return AppSetting.getStringValue("content-management-users");
    }

    /**
     * Gets the pager event size.
     * 
     * @return the pager event size
     */
    public static int getPagerEventSize() {
        return AppSetting.getIntegerValue("pager-event-size");
    }

    /**
     * Gets the pager member join in event size.
     * 
     * @return the pager member join in event size
     */
    public static int getPagerMemberJoinInEventSize() {
        return AppSetting.getIntegerValue("pager-member-join-in-event-size");
    }

    /**
     * Gets the pager comment in dialog size.
     * 
     * @return the pager comment in dialog size
     */
    public static int getPagerCommentInDialogSize() {
        return AppSetting.getIntegerValue("pager-comment-in-dialog-size");
    }

    /**
     * Gets the autocomplete user size.
     * 
     * @return the autocomplete user size
     */
    public static int getAutocompleteUserSize() {
        return AppSetting.getIntegerValue("autocomplete-user-size");
    }

    /**
     * Gets the list approved user.
     * 
     * @return the list approved user
     */
    public static String getListApprovedUser() {
        return AppSetting.getStringValue("approved-users");
    }

    /**
     * Gets the pager event map size.
     * 
     * @return the pager event map size
     */
    public static int getPagerEventMapSize() {
        return AppSetting.getIntegerValue("pager-event-size-map");
    }
    
    
    public static Integer getDefaultWeightSuggestion() {
    	return AppSetting.getIntegerValue("default-weight-suggestion");
    }
    
    public static long getAutoLoginExpirationTime() {
    	return AppSetting.getLongValue("auto-login-expiration-time");
    }


	public static String getImageServerPath() {
		return AppSetting.getStringValue("img-server-path");
	}
	

	public static String getLocationAvatarDefault() {
		return AppSetting.getStringValue("location-avatar-default");
	}

	public static String getUserAvatarDefault() {
		return AppSetting.getStringValue("user-avatar-default");
	}

	public static String getPresentAvatarDefault() {
		return AppSetting.getStringValue("present-avatar-default");
	}

	public static String getDealAvatarDefault() {
		return AppSetting.getStringValue("deal-avatar-default");
	}
	
	public static String getNewsAvatarDefault() {
		return AppSetting.getStringValue("news-avatar-default");
	}
	
	public static String getVasAvatarDefault() {
		return AppSetting.getStringValue("vas-avatar-default");
	}
	
	public static boolean getTurnOnLBS() {
		return AppSetting.getBooleanValue("LBS-ON");
	}
	
	public static String getLBSServiceURL() {
		return AppSetting.getStringValue("LBS-service-url");
	}
	
	public static String getLBSServiceUsername() {
		return AppSetting.getStringValue("LBS-service-username");
	}
	
	public static String getLBSServicePassword() {
		return AppSetting.getStringValue("LBS-service-password");
	}
	
	public static String getLBSServiceProvider() {
		return AppSetting.getStringValue("LBS-service-provider");
	}
	
	public static String getLBSServiceId() {
		return AppSetting.getStringValue("LBS-serviceId");
	}
	
	public static boolean getTurnOnVAA() {
		return AppSetting.getBooleanValue("VAA-ON");
	}
	
	public static String getVAAServiceURL() {
		return AppSetting.getStringValue("VAA-service-url");
	}
	
	public static String getVAAServiceUsername() {
		return AppSetting.getStringValue("VAA-service-username");
	}
	
	public static String getVAAServicePassword() {
		return AppSetting.getStringValue("VAA-service-password");
	}
	
	public static String getTemplateServerPath() {
		return AppSetting.getStringValue("template-server-path");
	}

	public static String getExcelTemplatePath() {
		return AppSetting.getStringValue("excel-template-path");
	}
	
	public static String getExcelExportPath() {
		return AppSetting.getStringValue("excel-export-path");
	}
	public static String getAppName() {
		return AppSetting.getStringValue("app-name");
	}
	public static long getMaxImageUploadSizeByte() {
		return AppSetting.getLongValue("avatar-file-size");
	}
	public static Integer getProvinceLocationDefault() {
		return AppSetting.getIntegerValue("province-location-default");
	}
	public static Integer getCPDefault() {
		return AppSetting.getIntegerValue("cp-id-default");
	}
	public static Integer getMaxUploadFile() {
		return AppSetting.getIntegerValue("upload-max-file");
	}
	public static String getGoogleMapAPI() {
		return AppSetting.getStringValue("google-map-api");
	}
	public static Integer getAutocompleteLocationMaxItem() {
		return AppSetting.getIntegerValue("autocomplete-location-max-item");
	}
}
