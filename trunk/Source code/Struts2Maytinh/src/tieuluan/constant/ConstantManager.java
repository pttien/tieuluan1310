package tieuluan.constant;

/**
 * The Class ActionConstant.
 * 
 * @author NgaNT
 */
public class ConstantManager {

	/* common */
	public static final String EMPTY_STRING = "";
	public final static String VI_LANGUAGE = "vi";
	public static final String FULL_DATE_FORMAT = "dd/MM/yyyy";
	public static final String FULL_DATE_FORMAT_EN = "MM/dd/yyyy";
	public static final String DATE_FORMAT_NOW = "dd/MM/yyyy HH:mm:ss";
	public static final String FULL_DATE_FORMAT_EEEE = "dd-MMM-yyyy";
	public static final String UTF_8_ENCODING = "UTF-8";
	
	/* auto login */
	public static final String TOKEN_ID_SESSION = "TOKEN_ID_SESSION";
	public static final String UID_COOKIE = "UTOKEN";
	public static final String SECRET_KEY_COOKIE = "STOKEN";
	public static final int EXPIRED_DURATION = 60 * 60 * 24 * 7; // 1 tuan
	public static final String REDIRECT_LOGIN ="redirect-login";
	/* dectect phone */
	public static final String MSISDN = "msisdn";
	/*Map*/
	public static final int WAP_MARKER_WIDTH_DEFAULT=225;
    public static final int WAP_MARKER_HEIGHT_DEFAULT=147;
    public static final int WAP_MARKER_ZOOM_DEFAULT=14;
    public static final int WAP_MAP_MOVE_DISTANCE=30;
    public static final String WAP_MAP_MODE = "map";
    public static final String WAP_MAP_MODE_DOWN = "down";
    public static final String WAP_MAP_MODE_UP = "up";
    public static final String WAP_MAP_MODE_LEFT = "left";
    public static final String WAP_MAP_MODE_RIGHT = "right";
    public static final String WAP_MAP_MODE_ZOOM_IN = "zoomin";
    public static final String WAP_MAP_MODE_ZOOM_OUT = "zoomout";
    public static final String WAP_DIRECTION_UNIT_M = "m";
    public static final String WAP_DIRECTION_UNIT_KM = "km";
    public static final int WAP_MAP_ZOOM_MAX = 19;
    public static final int WAP_MAP_ZOOM_MIN = 3;
    public static final int VIETBANDO_RADIUS= 3000;
    public static Double LAT_LNG_EMPTY = 0D;
	public static Integer REPORT_TYPE = 1;
    public static final int  VBD_DIRECTION_LINE_HEIGHT =2;
    public static final String VBD_DIRECTION_CORLOR = "red";
    public static final String VBD_DIRECTION_IMAGE_TYPE = "png";
    public static final String VENUE_NOT_FOUND = "venue-not-found";
	public static final int PRESENT_SECTION_PAGE_SIZE = 4;
	public static final int PRESENT_LIST_PAGE_SIZE = 3;
	public static final int LOCATION_MAP_WIDTH = 226;
	public static final int LOCATION_MAP_HEIGHT = 214;
	public static final int LOCATION_MAP_ZOOM = 15;
	public static final String MAP_MOVE_TO_TOP = "top";
	public static final String MAP_MOVE_TO_BOTTOM = "bottom";
	public static final String MAP_MOVE_TO_LEFT = "left";
	public static final String MAP_MOVE_TO_RIGHT = "right";
	public static final double MAP_MOVE_NUM = 0.001;
	public static final String MAP_ZOOM_IN = "in";
	public static final String MAP_ZOOM_OUT = "out";
	public static final String SESSION_TOKEN = "SESSION_TOKEN";
	public static final String SESSION_DEAL = "session_deal";
	public static final String ERROR_404 = "404";
	public static final String TOKEN_NAME = "token";
	public static final String SESSION_VOUCHER = "session_voucher";
	
	//Location
	public static final String SESION_LOCATION = "SESION_LOCATION";
	
	public static final String TEMPLATE_TRADE_DEAL= "File_So_Luot_Giao_Dich_Deal.xls";
	public static final String TEMPLATE_ACTION_LOCATION= "File_Hoat_Dong_Dia_Diem.xls";
	public static final String TEMPLATE_ACTION_USER= "File_Hoat_Dong_Thanh_Vien.xls";
	public static final String TEMPLATE_SORT_LOCATION= "File_Sap_Xep_Dia_Diem.xls";
	public static final String OUT_TRADE_DEAL= "So_Luot_Giao_Dich_Deal";
	public static final String OUT_ACTION_LOCATION= "Hoat_Dong_Dia_Diem";
	public static final String OUT_ACTION_USER= "Hoat_Dong_Thanh_Vien";
	public static final String OUT_SORT_LOCATION= "Sap_Xep_Dia_Diem";
	public static final String EXPORT_FILE_EXTENSION= ".xls";
	
	//account section
	public static final String TEMPLATE_ACCOUNT_MANAGER_EXPORT = "File_DS_Tai_khoan_quan_tri.xls";
	public static final String TEMPLATE_ACCOUNT_USER_EXPORT = "File_DS_Tai_khoan_nguoi_dung.xls";
	public static final String TEMPLATE_ACCOUNT_CP_EXPORT = "File_DS_Tai_khoan_CP.xls";
	public static final String TEMPLATE_PRESENT_EXPORT = "File_DS_Qua_tang.xls";
	public static final String TEMPLATE_PRESENTREG_EXPORT = "File_DS_Dang_ky_nhan_qua_tang.xls";
	public static final String DATE_FORMAT_EXCEL_FILE = "yyyyMMddHHmmss";
	public static final String GRID_SESSION = "GRID_SESSION";
	public static final String ERR_SYSTEM = null;
	public static final Integer GRID_TYPE = 0;
	public static final Integer ROLE_ALL = -2;
	public static final int TOTAL_TYPE = 2;
	public static final String SESSION_NEWS = "session_news";
	// mess
	public interface MESS{
		public static final String ERROR = "error";
		public static final String SUCCESS = "success";
	}	
}
