package com.tieuluan.struts2.utils;

/**
 * The Class ListConst.
 */
public class ListConst {

	public static final String USER_SESSION_KEY = "USER_SESSSION_HANDLE";
	public static final String PHONE_DETECTED = "PHONE_DETECTED";
	public static final String PHONE_FREE_DATA = "PHONE_FREE_DATA";
	
	public static final String LOGIN_TYPE_KUNKUN_DOMAIN = "kunkun.vn";
	public static final String LOGIN_TYPE_YAHOO_DOMAIN = "yahoo.com";
	public static final String LOGIN_TYPE_GOOGLE_DOMAIN = "google.com";
	
	public static final String FORMAT_DATE_DD_MM_YYYY = "dd/MM/yyyy";
	
	public static final float LIKE = 1;
	public static final float DISLIKE = -1;
	
    public static final String ROLE_LIST_CONTEXT = "ROLE_LIST";
    
    public static final String USER_ROLE_NAME = "User";
    
    public static final String ADMINISTRATOR_ROLE_NAME = "Administrator";
    
    public static final String MASTER_ROLE_NAME = "Master";
    public static final String MANAGER_ROLE_NAME = "Manager";
    
    public static final String MESSAGE_LOGIN_EMPTY_USERNAME = "message.login.emptyUserName";
    public static final String MESSAGE_LOGIN_EMPTY_PASSWORD = "message.login.emptyPassword";
    public static final String MESSAGE_LOGIN_INVALID_ACCOUNT = "message.login.invalidAccount";
    public static final String MESSAGE_LOGIN_ACCOUNT_IN_ACTIVE = "message.login.accountInActive";
    public static final String MESSAGE_LOGIN_ACCOUNT_DISABLE = "message.login.account.disable";
    public static final String MESSAGE_LOGIN_INVALID_PASSWORD = "message.login.invalidPassword";
    public static final String MESSAGE_CONV_SELECT_CONTACT = "user.conversation.select.list.contact";
    // Profile field
    public static final int NUMBER_OF_BASIC_INFO_FIELDS = 6;
    public static final int NUMBER_OF_EDU_WORK_INFO_FIELDS = 4;
    public static final int NUMBER_OF_CONTACT_FIELDS = 3;
    public static final int NUMBER_OF_HOBBY_FIELDS = 2;
    
    // Client Name
    /** The Constant CLIENT_NAME_WEB. */
    public static final String CLIENT_NAME_WEB = "kunkun.vn";

    /** The Constant CLIENT_NAME_WAP. */
    public static final String CLIENT_NAME_WAP = "m.kunkun.vn";

    /** The Constant CLIENT_NAME_SMS. */
    public static final String CLIENT_NAME_SMS = "sms.kunkun.vn";

    /** The Constant CLIENT_NAME_SMS. */
    public static final String CLIENT_NAME_MOBILE = "MOBILE";

    /** The Constant ADMIN_USER_NAME. */
    public static final String ADMIN_USER_NAME = "admin";

    /** The Constant SRID_DEFAULT. */
    public static final int GEOM_DISTANCE_SEARCH = 1000;

    /** The Constant GEOM_SRID_DEFAULT. */
    public static final int GEOM_SRID_DEFAULT = 8307;

    /** The Constant GEOM_TOLERANCE. */
    public static final double GEOM_TOLERANCE = 0.05;

    /** The Constant GEOM_POINT_2_SQL. */
    public static final String GEOM_POINT_SQL =
            "SDO_GEOMETRY(2001, " + GEOM_SRID_DEFAULT
                    + ", SDO_POINT_TYPE(?, ?, NULL), NULL, NULL)";

    /** The Constant GEOM_POLYGON_SQL. */
    public static final String GEOM_POLYGON_SQL =
            "SDO_GEOMETRY(2003, " + GEOM_SRID_DEFAULT + ", NULL,"
                    + " SDO_ELEM_INFO_ARRAY(1,1003,1),"
                    + " SDO_ORDINATE_ARRAY(?, ?, ?, ?, ?, ?, ?, ?, ?, ?))";

    /** The Constant VIETTEL_LOCATION_PREFIX. */
    public static final String VIETTEL_LOCATION_PREFIX = "viettel_";
    // public static final String SERVER_10_58_41_194_NAME = "vt_ttpm_huytq12";
    /** The Constant SERVER_10_58_41_194_NAME. */
    public static final String SERVER_10_58_41_194_NAME = "rac1";

    /** The Constant SERVER_10_58_41_195_NAME. */
    public static final String SERVER_10_58_41_195_NAME = "rac2";

    /** The Constant SERVER_10_58_41_196_NAME. */
    public static final String SERVER_10_58_41_196_NAME = "rac3";

    /** The Constant SEACRCH_POI_NUM_RECORDS_PER_PAGE. */
    public static final int SEACRCH_POI_NUM_RECORDS_PER_PAGE = 10;
    
    /** The Constant PATH_TO_CATEGORY_FOLDER: path to static category photo folder*/
    public static final String PATH_TO_CATEGORY_FOLDER = "/resources/images/category/";
    
    /** The Constant PATH_TO_CATEGORY_PHOTO_UPLOADED: path to uploaded category photo folder */
    public static final String PATH_TO_CATEGORY_PHOTO_UPLOADED = "/uploads/category/";
    
    /** The Constant PATH_TO_TEMP_FOLDER */
    public static final String PATH_TO_TEMP_FOLDER = "/uploads/tmp/";

    /** The Constant PATH_TO_ENTRY_IMAGE. */
    //public static final String PATH_TO_ENTRY_IMAGE = "/uploads/entryimage/";

    /** The Constant PATH_TO_USER_FILE. */
    //public static final String PATH_TO_USER_FILE = "/uploads/userfiles/";

    /** The Constant PATH_TO_USER_AVATAR. */
    public static final String PATH_TO_USER_AVATAR = "/uploads/user_avatar/";

    /** The Constant PATH_TO_EVENT_IMAGE. */
    //public static final String PATH_TO_EVENT_IMAGE = "/uploads/eventimage/";
    
    /** The Constant PATH_TO_USER_GALLERY. */
    public static final String PATH_TO_USER_GALLERY = "/uploads/gallery/user/";

    public static final String PATH_TO_LOCATIONCHAIN_AVATAR =
        "/uploads/location_chain_avatar/";
    
    /** The Constant PATH_TO_LOCATION_AVATAR. */
    public static final String PATH_TO_LOCATION_AVATAR =
            "/uploads/location_avatar/";
    
    /** The Constant PATH_TO_LOCATION_GALLERY. */
    public static final String PATH_TO_LOCATION_GALLERY = "/uploads/gallery/location/";

    /** The Constant PATH_TO_DEFAULT_EVENT_AVATAR. */
    public static final String PATH_TO_DEFAULT_EVENT_AVATAR =
            "/resources/images/default/event-default-avatar.gif";

    /** The Constant PATH_TO_DEFAULT_USER_AVATAR. */
    public static final String PATH_TO_DEFAULT_USER_AVATAR =
            "/resources/images/default/user-default-avatar.gif";
    
    /** The Constant PATH_TO_DEFAULT_LOCATION_AVATAR. */
    public static final String PATH_TO_DEFAULT_LOCATION_AVATAR =
            "/resources/images/default/default-location-small.jpg";
    
    /** The Constant PATH_TO_DEFAULT_USER_AVATAR_MOBILE_60. */
    public static final String PATH_TO_DEFAULT_USER_AVATAR_MOBILE_60 =
            "/resources/images/default/user-default-avatar_60_60.gif";
    
    /** The Constant PATH_TO_DEFAULT_LOCATION_AVATAR_50. */
    public static final String PATH_TO_DEFAULT_LOCATION_AVATAR_50 =
            "/resources/images/default/default-location-tiny.jpg";
    
    public static final String PATH_TO_DEFAULT_BLOG_AVATAR =
        "/resources/images/user/blog/blog.jpg";
    /** The Constant LOCATION_SESSION_KEY. */
    public static final String LOCATION_SESSION_KEY =
            "LOCATION_SESSSION_HANDLE";

    /** The Constant IMAGE_SESSION_KEY. */
    public static final String IMAGE_SESSION_KEY = "IMAGE_SESSSION_HANDLE";

    /** The Constant NUMPAGES_LOCATION_SESSION_KEY. */
    public static final String NUMPAGES_LOCATION_SESSION_KEY =
            "NUMPAGES_LOCATION_SESSSION_HANDLE";

    /** The Constant NUMCOMMENTS_LOCATION_SESSION_KEY. */
    public static final String NUMCOMMENTS_LOCATION_SESSION_KEY =
            "NUMIMAGES_LOCATION_SESSSION_HANDLE";

    /** The Constant NUMPAGES_TO_PAGING. */
    public static final String NUMPAGES_TO_PAGING = "NUMPAGES_TO_PAGING";

    /** The Constant LINK_BACK_TO_VIEW_LOCATION_INFO. */
    public static final String LINK_BACK_TO_VIEW_LOCATION_INFO =
            "LINK_BACK_TO_VIEW_LOCATION_INFO";

    /** The Constant LINK_BACK_TO_VIEW_SEARCHIMAGE_RESULT. */
    public static final String LINK_BACK_TO_VIEW_SEARCHIMAGE_RESULT =
            "LINK_BACK_TO_VIEW_SEARCHIMAGE_RESULT";

    /** The Constant LINK_BACK_TO_PREVIOUS_PAGE. */
    public static final String LINK_BACK_TO_PREVIOUS_PAGE =
            "LINK_BACK_TO_PREVIOUS_PAGE";

    /** The Constant LINK_BACK_TO_VIEW_IMAGE_INFO. */
    public static final String LINK_BACK_TO_VIEW_IMAGE_INFO =
            "LINK_BACK_TO_VIEW_IMAGE_INFO";

    /** The Constant NUM_COMMENTS_OF_IMAGE. */
    public static final String NUM_COMMENTS_OF_IMAGE = "NUM_COMMENTS_OF_IMAGE";

    /** The Constant LOCATIONTYPE_HOME. */
    public static final int LOCATIONTYPE_HOME = 16;

    /** The Constant LOCATIONTYPE_POSITION. */
    public static final int LOCATIONTYPE_POSITION = 20;

    // public static final String STATUS_SESSION_KEY = "STATUS_SESSION_KEY";
    // public static final String POSITION_SESSION_KEY = "POSITION_SESSION_KEY";

    /** The Constant MIN_LAT. */
    public static final double MIN_LAT = -360.0;

    /** The Constant RELATION_ISME. */
    public static final String RELATION_ISME = "Chính là bạn!";

    /** The Constant RELATION_ISFRIEND. */
    public static final String RELATION_ISFRIEND = "Bạn của bạn!";

    /** The Constant RELATION_CANADD. */
    public static final String RELATION_CANADD = "Chưa quen bạn!";

    /** The Constant RELATION_ISME_VALUE. */
    public static final String RELATION_ISME_VALUE = "isme";

    /** The Constant RELATION_ISFRIEND_VALUE. */
    public static final String RELATION_ISFRIEND_VALUE = "isfriend";

    /** The Constant RELATION_CANADD_VALUE. */
    public static final String RELATION_CANADD_VALUE = "canadd";

    /** The Constant RELATION_UNDEFINED_VALUE. */
    public static final String RELATION_UNDEFINED_VALUE = "undefined";

    /** The Constant RELATION_ISME_INT. */
    public static final int RELATION_ISME_INT = 1;

    /** The Constant RELATION_ISFRIEND_INT. */
    public static final int RELATION_ISFRIEND_INT = 2;

    /** The Constant RELATION_CANADD_INT. */
    public static final int RELATION_CANADD_INT = 3;

    /** The Constant RELATION_UNDEFINED_INT. */
    public static final int RELATION_UNDEFINED_INT = 0;

    /** The Constant RELATION_REQUEST_INT. */
    public static final int RELATION_REQUEST_INT = 4;

    /** The Constant RELATION_REQUESTED_INT. */
    public static final int RELATION_REQUESTED_INT = 5;

    /** The Constant MOBILE_SERVER_PATH. */
    public static final String MOBILE_SERVER_PATH = "/KunKunMobile";

    // service
    /** The Constant SERVICE_DEFAULT_PAGE_SIZE. */
    public static final int SERVICE_DEFAULT_PAGE_SIZE = 10;
    // map
    /** The Constant MAP_LOCATION_AVATAR_SIZE. */
    public static final int MAP_LOCATION_AVATAR_SIZE = 32;
    //map blog detail
    public static final int MAP_BLOG_AVATAR_SIZE_WIDTH=122;
    public static final int MAP_BLOG_AVATAR_SIZE_HEIGHT=92;
    /** The Constant MAP_LOCATION_ALL_TYPE. */
    public static final int MAP_LOCATION_ALL_TYPE = 1;

    /** The Constant MAP_ALL_LOCATION_PAGE_SIZE. */
    public static final int MAP_ALL_LOCATION_PAGE_SIZE = 100;
    
    /**
     * Events type: all kinds of event (mine + was requested to join + already
     * joined + of friends + public).
     */
    public static final int INT_EVENT_TYPE_ALL_KINDS = -1;

    /** Events type: events I was requested to join. */
    public static final int INT_EVENT_TYPE_REQUESTED = 0;

    /** Events type: events I have already joined. */
    public static final int INT_EVENT_TYPE_JOINED = 1;
    
    /** Events type: events I have already denied. */
    public static final int INT_EVENT_TYPE_DENIED = 2;
    
    /** Events type: events I have already blocked. */
    public static final int INT_EVENT_TYPE_BLOCKED = 3;
    
    /** Events type: events of community. */
    public static final int INT_EVENT_TYPE_COMMUNITY = 4;
    
    /** Events type: events of friends. */
    public static final int INT_EVENT_TYPE_FRIENDS = 5;
    
    /** Events type: events I created. */
    public static final int INT_EVENT_TYPE_MINE = 6;
    
    /** Events type: events relate to user. */
    public static final int INT_EVENT_TYPE_ALL_USER_RALATED = 7;

    /** Events type: open, public events. */
    public static final int INT_EVENT_TYPE_OPEN = 8;
    
   
    public static final int INT_BLOG_TYPE_ALL = 0;
    
    public static final int INT_BLOG_TYPE_MINE = 1;
    
    public static final int INT_BLOG_TYPE_FRIEND = 2;
    
    
    /** The Constant PATH_TO_LOCATION_AVATAR. */
    public static final String PATH_TO_STATUS_AVATAR =
            "/uploads/statusavatar/";
    
    /** The name of wall photo album. */
    public static final String WALL_PHOTO_ALBUM_NAME = "Ảnh đem khoe";
    
    /** The description of wall photo album. */
    public static final String WALL_PHOTO_ALBUM_DESC = "";
    
    public static final int MAIL_TYPE_IN_BOX = 0;
	public static final int MAIL_TYPE_READ = 1;
	public static final int MAIL_TYPE_UN_READ = 2;
	public static final int MAIL_TYPE_SENT = 3;
	public static final int MAIL_TYPE_IN_BOX_EXCEPT_DATING = 4;
	public static final int MAIL_TYPE_UNREAD_EXCEPT_DATING = 5;
	public static final int MAIL_TYPE_IN_BOX_LOCATION_INVITATION = 6;
	public static final int MAIL_TYPE_IN_BOX_EXCEPT_LOCATION_INVITATION = 7;
	public static final int MAIL_TYPE_UNREAD_LOCATION_INVITATION = 8;
	public static final int MAIL_TYPE_UNREAD_EXCEPT_LOCATION_INVITATION = 9;

    /** The Constant DEFAULT_ALBUM. */
    //public static final String DEFAULT_ALBUM = "Default album";
	public static final String DEFAULT_ALBUM = Configuration.getResourceString("vi",
			"kunkun.default.album", (Object[]) null);
	
    /** The Constant DEFAULT_ALBUM. */
    //public static final String DEFAULT_ALBUM_LOCATION = "Default album location";
	public static final String DEFAULT_ALBUM_LOCATION = Configuration.getResourceString("vi",
			"kunkun.default.album.location", (Object[]) null);
	
    /** The Constant DEFAULT_ALBUM_DESCRIPTION. */
    //public static final String DEFAULT_ALBUM_DESCRIPTION = "Default album of ";
	public static final String DEFAULT_ALBUM_DESCRIPTION = Configuration.getResourceString("vi",
			"kunkun.default.album.description", (Object[]) null);
	
    /** The Constant DEFAULT_COMMUNITY_ALBUM. */
    //public static final String DEFAULT_COMMUNITY_ALBUM = "Default community album";
    public static final String DEFAULT_COMMUNITY_ALBUM = Configuration.getResourceString("vi",
			"kunkun.default.community.album", (Object[]) null);
    
    /** The Constant DEFAULT_COMMUNITY_ALBUM_DESCRIPTION. */
    //public static final String DEFAULT_COMMUNITY_ALBUM_DESCRIPTION = "Default community album of ";
    public static final String DEFAULT_COMMUNITY_ALBUM_DESCRIPTION = Configuration.getResourceString("vi",
			"kunkun.default.community.album.description", (Object[]) null);
    
    /** The Constant DEFAULT_AVATAR_ALBUM. */
    //public static final String DEFAULT_AVATAR_ALBUM = "Default avatar album";
    public static final String DEFAULT_AVATAR_ALBUM = Configuration.getResourceString("vi",
			"kunkun.default.avatar.album", (Object[]) null);
    
    /** The Constant DEFAULT_AVATAR_ALBUM_DESCRIPTION. */
    //public static final String DEFAULT_AVATAR_ALBUM_DESCRIPTION = "Default avatar album of ";
    public static final String DEFAULT_AVATAR_ALBUM_DESCRIPTION = Configuration.getResourceString("vi",
			"kunkun.default.avatar.album.description", (Object[]) null);
    
    /** Use in SearchMgr: search entry, type blog. */
    public static final int INT_SEARCH_ENTRY_TYPE_BLOG = 0;
    
    /** Use in SearchMgr: search entry, type news. */
    public static final int INT_SEARCH_ENTRY_TYPE_NEWS = 1;
    
    public static final int INT_LOCATION_TYPE_ALL = 0;
    
    public static final int INT_LOCATION_TYPE_FRIENDS = 1;
    
    public static final int INT_LOCATION_TYPE_FAVOURITE = 2;
    
    public static final int INT_LOCATION_TYPE_MINE = 3;
    
    public static final int INT_LOCATION_TYPE_MINE_AND_FAVOURITE = 4;
    
    // update messages
    public static final String CHANGE_AVATAR_MSG = "AvatarChange";
    
    /** The Constant LIST_AVATAR_SIZE. */
    public static final int[] LIST_AVATAR_SIZE = { 30, 60 };
    
    /** The Constant LIST_WEB_THUMBNAIL_SIZES. */
    public static final int[] LIST_WEB_THUMBNAIL_SIZES = {32, 36, 50, 160, 200};
    
    /** The Constant THUMB. */
    public static final String THUMB = "thumb";

    ///////////////////////////////
    
    public static final String SPLIT_MAIL_CHAR = "@";
    
    // defined suggestion constant
    public static final int LOCATION_SUGGESTION_RADIUS = 5000;
    public static final int LOCATION_MIN_VIEW_TIMES = 200;
    public static final int LOCATION_MIN_RANK = 4;
    public static final int LOCATION_MIN_RATE = 20;
    
    public static final String ORDER_MOST = "orderMost";
    public static final String ORDER_NEWEST = "orderNewest";
    
    public static final int ALLOW_CHECK_IN_DISTANCE = 1500; //m
    public static final int ALLOW_CHECK_IN_NUMBER = 30; //times
    public static final int ALLOW_CHECK_IN_MINUTES = 20; //Minutes
    
    public static final int CHECK_IN_SCORE_NORMAL = 1;
    public static final int CHECK_IN_SCORE_FIRST_TIME = 5;
    
    public static final String MAYOR_RESULT_TYPE_BECOME = "becomeMayor";
    public static final String MAYOR_RESULT_TYPE_STILL = "stillMayor";
    
    public static final int LIST_FRIEND_SIZE = 10;
    public static final int LIST_CHECKIN_SIZE = 10;
    public static final int LIST_TIP_SIZE = 10;
    public static final int LIST_MAYOR_SIZE = 10;
    public static final int LIST_LOCATION_SIZE = 10;
    public static final int LIST_COMMENT_SIZE = 10;
    public static final int LIST_SEARCH_SIZE = 20;
    public static final int LIST_SEARCH_MOBILE_SIZE = 10;
    
    public static final String RATING_FRIEND_TYPE = "friend";
    public static final String RATING_COMMUNITY_TYPE = "community";
    public static final int VIET_NAME_COUNTRY = 1;
    public final static String VI_LANGUAGE = "vi";
    
    public static final int PATTERN_EQUALS = 0;
    public static final int PATTERN_LIKE = 1;
    
    public static final int MAX_DAY_SMS = 3;
    public static final int MAX_NUM_SMS_INVITATION_A_DAY = 3;
    public static final int MAX_NUM_SMS_CHAT = 3;
    
    public static final String KEY_MIN_NUM_CALL_TO_ADD_CONTACT_BCCS = "numCallToAddContactBCCS";
    public static final String KEY_MIN_NUM_CALL_TO_SUGGESTION_BCCS = "numCallToSuggestionBCCS";
    
    public static final String ADD = "ADD";
    public static final String DELETE = "DELETE";
    public static final int NUM_MEM_IN_GROUP = 10;
    public static final int NUM_SHORT_CONTENT = 50;
    
    public static final String autoLoginKey = "kunkun0510";
    public static final String autoLoginSalt = "viettelh";
    public static final int iterationCount = 20;
    public static final String LIKE_SESSION = "LIKE_SESSION";
    public static final String SHARE_SESSION = "SHARE_SESSION";
    public static final String COMMENT_SESSION = "COMMENT_SESSION";
    public static final String CHECK_IN_SESSION = "CHECK_IN_SESSION";
    public static final String GET_VOUCHER_SESSION = "GET_VOUCHER_SESSION";
    public static final String GET_VOUCHER_DEALID = "GET_VOUCHER_DEALID";
    public static final String GET_VOUCHER_NUMSALE = "GET_VOUCHER_NUMSALE";
    public static final String SESSION_REPORT = "SESSION_REPORT";
    public static final String PAGE_LIKE_SESSION = "PAGE_LIKE_SESSION";
    public static final String PAGE_USER_SESSION = "PAGE_USER_SESSION";
    public static final String BACK_LINK_SESSION = "BACK_LINK_SESSION";
    public static final String WAITING_SESSION = "WAITING_SESSION";
	public static final String OBJECT_ID = "objectId";
}
