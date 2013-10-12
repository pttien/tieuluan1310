/*
 * $Id: DateUtil.java 231 2009-08-22 14:53:00Z dinhthaiha $
 
 *  
 *  $Author: dinhthaiha $
 *  $Rev: 231 $
 */
package com.tieuluan.struts2.utils;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

// TODO: Auto-generated Javadoc
/**
 * The Class DateUtil.
 */
public class DateUtil {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5372601928873111839L;

	/**
	 * Instantiates a new date util.
	 */
	private DateUtil() {
		super();
	}
	
	public static final String TIME_FORMAT_FULL = "HH:mm:ss";
	
	public static final String DATE_FORMAT_NOW = "dd/MM/yyyy HH:mm:ss";
	
	public static final String DATE_HH_MM = "HH:mm dd/MM/yyyy";
	
	public static final String DATE_FORMAT_SIMPLE = "dd/MM/yyyy";

	/** The Constant SECOND. */
	public static final long SECOND = 1000;

	/** The Constant MINUTE. */
	public static final long MINUTE = SECOND * 60;

	/** The Constant HOUR. */
	public static final long HOUR = MINUTE * 60;

	/** The Constant DAY. */
	public static final long DAY = HOUR * 24;

	/**
	 * Now.
	 * 
	 * @return the date
	 */
	public static Date now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		try {
			return sdf.parse(sdf.format(cal.getTime()));
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * Now.
	 * 
	 * @param formatDate
	 *            the format date
	 * @return the date
	 */
	public static Date now(String formatDate) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
		try {
			return sdf.parse(sdf.format(cal.getTime()));
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * Format.
	 * 
	 * @param d
	 *            the d
	 * @param format
	 *            the format
	 * @return the string
	 */
	public static String format(Date d, String format) {
		if (d == null) {
			return " ";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(d);
	}

	/**
	 * Format.
	 * 
	 * @param d
	 *            the d
	 * @return the string
	 */
	public static String format(Date d) {
		return format(d, DATE_FORMAT_NOW);
	}

	/**
	 * Parses the.
	 * 
	 * @param str
	 *            the str
	 * @param format
	 *            the format
	 * @return the date
	 */
	public static Date parse(String str, String format) {
		DateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			return new Date();
		}
	}

	/**
	 * Parses the.
	 * 
	 * @param str
	 *            the str
	 * @return the date
	 */
	public static Date parse(String str) {
		return parse(str, DATE_FORMAT_NOW);
	}

	/**
	 * Gets the hour.
	 * 
	 * @param date
	 *            the date
	 * @return the hour
	 */
	public static int getHour(Date date) {
		String hour = null;
		DateFormat f = new SimpleDateFormat("HH");
		try {
			hour = f.format(date);
			return Integer.parseInt(hour);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Gets the minute.
	 * 
	 * @param date
	 *            the date
	 * @return the minute
	 */
	public static int getMinute(Date date) {
		String minute = null;
		DateFormat f = new SimpleDateFormat("mm");
		try {
			minute = f.format(date);
			return Integer.parseInt(minute);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Gets the aMPM.
	 * 
	 * @param date
	 *            the date
	 * @return the aMPM
	 */
	public static String getAMPM(Date date) {
		DateFormat f = new SimpleDateFormat("a");
		try {
			return f.format(date).toUpperCase();
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * Gets the month.
	 * 
	 * @param date
	 *            the date
	 * @return the month
	 */
	public static int getMonth(Date date) {
		String month = null;
		DateFormat f = new SimpleDateFormat("MM");
		try {
			month = f.format(date);
			return Integer.parseInt(month);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Gets the year.
	 * 
	 * @param date
	 *            the date
	 * @return the year
	 */
	public static int getYear(Date date) {
		String year = null;
		DateFormat f = new SimpleDateFormat("yyyy");
		try {
			year = f.format(date);
			return Integer.parseInt(year);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Gets the day.
	 * 
	 * @param date
	 *            the date
	 * @return the day
	 */
	public static int getDay(Date date) {
		String day = null;
		DateFormat f = new SimpleDateFormat("dd");
		try {
			day = f.format(date);
			return Integer.parseInt(day);
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * Compare to.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @return the int
	 */
	public static int compareTo(Date date1, Date date2) {
		return compareTwoDate(date1, date2);
	}

	/**
	 * Compare to.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @param ignoreMilliseconds
	 *            the ignore milliseconds
	 * @return the int
	 */
	public static int compareToSecond(Date date1, Date date2) {

		if ((date1 != null) && (date2 == null)) {
			return -1;
		} else if ((date1 == null) && (date2 != null)) {
			return 1;
		} else if ((date1 == null) && (date2 == null)) {
			return 0;
		}

		long time1 = date1.getTime();
		long time2 = date2.getTime();
		time1 = time1 / SECOND;
		time2 = time2 / SECOND;

		if (time1 == time2) {
			return 0;
		} else if (time1 < time2) {
			return -1;
		} else {
			return 1;
		}
	}

	/**
	 * Compare to.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @return the int
	 */
	public static int compareToHour(Date date1, Date date2) {

		if ((date1 != null) && (date2 == null)) {
			return -1;
		} else if ((date1 == null) && (date2 != null)) {
			return 1;
		} else if ((date1 == null) && (date2 == null)) {
			return 0;
		}

		long time1 = date1.getTime() / HOUR;
		long time2 = date2.getTime() / HOUR;

		if (time1 == time2) {
			return 0;
		} else if (time1 < time2) {
			return -1;
		} else  {
			return 1;
		}
	}

	public static int compareToMinute(Date date1, Date date2) {

		if ((date1 != null) && (date2 == null)) {
			return -1;
		} else if ((date1 == null) && (date2 != null)) {
			return 1;
		} else if ((date1 == null) && (date2 == null)) {
			return 0;
		}

		long time1 = date1.getTime() / MINUTE;
		long time2 = date2.getTime() / MINUTE;

		if (time1 == time2) {
			return 0;
		} else if (time1 < time2) {
			return -1;
		} else  {
			return 1;
		}
	}
	/**
	 * Compare two date.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @return the int
	 */
	public static int compareTwoDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.HOUR_OF_DAY, 0);
		cal2.set(Calendar.SECOND, 0);
		cal2.set(Calendar.MILLISECOND, 0);
		if (cal1.equals(cal2)) {
			return 0;
		} else if (cal1.after(cal2)) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * Equals.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @return true, if successful
	 */
	public static boolean equals(Date date1, Date date2) {
		if (compareTo(date1, date2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Equals.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @param ignoreMilliseconds
	 *            the ignore milliseconds
	 * @return true, if successful
	 */
	public static boolean equals(Date date1, Date date2,
			boolean ignoreMilliseconds) {

		if (!ignoreMilliseconds) {
			return equals(date1, date2);
		}

		long time1 = 0;

		if (date1 != null) {
			time1 = date1.getTime() / SECOND;
		}

		long time2 = 0;

		if (date2 != null) {
			time2 = date2.getTime() / SECOND;
		}

		if (time1 == time2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Gets the minutes between.
	 * 
	 * @param startDate
	 *            the start date
	 * @param endDate
	 *            the end date
	 * @return the minutes between
	 */
	public static long getMinutesBetween(Date startDate, Date endDate) {

		TimeZone timeZone = TimeZone.getTimeZone("GMT");
		int offset = timeZone.getRawOffset();

		Calendar startCal = new GregorianCalendar(timeZone);
		startCal.setTime(startDate);
		startCal.add(Calendar.MILLISECOND, offset);

		Calendar endCal = new GregorianCalendar(timeZone);
		endCal.setTime(endDate);
		endCal.add(Calendar.MILLISECOND, offset);

		long milis1 = startCal.getTimeInMillis();
		long milis2 = endCal.getTimeInMillis();

		long diff = milis2 - milis1;
		long minutesBetween = diff / (60 * 1000);
		return minutesBetween;
	}

	/**
	 * Gets the days between.
	 * 
	 * @param startDate
	 *            the start date
	 * @param endDate
	 *            the end date
	 * @return the days between
	 */
	public static int getDaysBetween(Date startDate, Date endDate) {

		TimeZone timeZone = TimeZone.getTimeZone("GMT");

		int offset = timeZone.getRawOffset();

		Calendar startCal = new GregorianCalendar(timeZone);

		startCal.setTime(startDate);
		startCal.add(Calendar.MILLISECOND, offset);

		Calendar endCal = new GregorianCalendar(timeZone);

		endCal.setTime(endDate);
		endCal.add(Calendar.MILLISECOND, offset);

		int daysBetween = 0;

		while (beforeByDay(startCal.getTime(), endCal.getTime())) {
			startCal.add(Calendar.DAY_OF_MONTH, 1);

			daysBetween++;
		}

		return daysBetween;
	}

	/**
	 * Before by day.
	 * 
	 * @param date1
	 *            the date1
	 * @param date2
	 *            the date2
	 * @return true, if successful
	 */
	public static boolean beforeByDay(Date date1, Date date2) {
		long millis1 = _getTimeInMillis(date1);
		long millis2 = _getTimeInMillis(date2);

		if (millis1 < millis2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * _get time in millis.
	 * 
	 * @param date
	 *            the date
	 * @return the long
	 */
	private static long _getTimeInMillis(Date date) {
		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = 0;
		int minute = 0;
		int second = 0;

		cal.set(year, month, day, hour, minute, second);

		long millis = cal.getTimeInMillis() / DAY;

		return millis;
	}


	/**
	 * @author LuanDV
	 * @since 04/04/2011 - Created.
	 * @param currentDate
	 * @param lastCheckInTime
	 * @return
	 */
	public static boolean isNewWeek(Date currentDate, Date lastCheckInTime) {
		Date firstDayOfWeek = getFirstDayOfWeek(currentDate);
		if (compareTwoDate(lastCheckInTime, firstDayOfWeek) == -1) {
			return true;
		}
		return false;
	}

	public static Date getFirstDayOfWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(dow);
		cal.add(Calendar.DAY_OF_YEAR, (dow * -1) + 2);
		return cal.getTime();
	}

	public static Date getFirstDayNextWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(dow);
		cal.add(Calendar.DAY_OF_YEAR, (dow * -1) + 9);
		return cal.getTime();
	}

	public static Date getNextDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_WEEK, 1);
		Date nextDay = cal.getTime();
		return nextDay;
	}

	public static Date getPreviousDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_WEEK, -1);
		Date nextDay = cal.getTime();
		return nextDay;
	}

	public static Date getNextWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nextWeek = cal.getTime();
		return nextWeek;
	}

	public static Date getNextMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		Date nextMonth = cal.getTime();
		return nextMonth;
	}

	public static Date getFirstNextMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 1);
		Date nextMonth = cal.getTime();
		return nextMonth;
	}

	public static Date getNextYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.YEAR, 1);
		Date nextYear = cal.getTime();
		return nextYear;
	}

	public static Date addDay(Date date, Integer numDay) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, numDay);
		Date nextTime = cal.getTime();
		return nextTime;
	}
	
	public static Date addMonth(Date date, Integer numMonth) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, numMonth);
		Date nextTime = cal.getTime();
		return nextTime;
	}
	

	public static List<Date> getListFirstDayOfWeek(Date startDate, Date endDate) {
		Date dayOfWeek = getFirstDayOfWeek(startDate);
		List<Date> ListFirstDayOfWeekWeek = new ArrayList<Date>();
		Date nextWeek = dayOfWeek;
		do {
			ListFirstDayOfWeekWeek.add(nextWeek);
			nextWeek = getNextWeek(nextWeek);
		} while (compareTwoDate(nextWeek, endDate) < 0);

		return ListFirstDayOfWeekWeek;
	}
	
	public static String toDateString(Date date, String format) {
		String dateString = "";
		if (date == null)
			return dateString;
		Object[] params = new Object[] { date };

		try {
			dateString = MessageFormat
					.format("{0,date," + format + "}", params);
		} catch (Exception e) {

		}
		return dateString;
	}
	
	public static long compareDay(Date startDate,Date endDate){
		long compareMilisecond=(endDate.getTime()/1000/60/60/24-startDate.getTime()/1000/60/60/24);
		return compareMilisecond;
	}

	public static void main(String[] args) {
		String url ="http://localhost:8080/vasservice/initvas?menu=category&submenu=vas";
		System.out.println(url.split("\\?")[1]);
	}

}
