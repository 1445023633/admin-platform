package com.clgs.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatUtil {
	/**
	  * ��һ��10λ��������ɵ��ַ���ת����һ��Calendar���ʵ��
	  */
	 public static Calendar transferString10ToCalendar(String date) {
	  Calendar calendar = Calendar.getInstance();
	  calendar.set(Calendar.YEAR, Integer.parseInt(date.substring(0, 4)));
	  calendar.set(Calendar.MONTH, Integer.parseInt(date.substring(4, 6)) - 1);
	  calendar.set(Calendar.DATE, Integer.parseInt(date.substring(6)));

	  return calendar;
	 }

	 /**
	  * ��һ��10λ��������ɵ��ַ���ת����һ��Date���ʵ��
	  * 
	  */
	 public static Date getTimeFromString10(String date) {
	  return transferString10ToCalendar(date).getTime();
	 }

	 /**
	  * ��һ��8λ��������ɵ��ַ���ת����һ��Calendar���ʵ��
	  */
	 public static Calendar transferStringToCalendar(String date) {

	  Calendar calendar = Calendar.getInstance();
	  calendar.set(Calendar.YEAR, Integer.parseInt(date.substring(0, 4)));
	  calendar.set(Calendar.MONTH, Integer.parseInt(date.substring(4, 6)) - 1);
	  calendar.set(Calendar.DATE, Integer.parseInt(date.substring(6)));

	  return calendar;
	 }

	 /**
	  * ��һ��yyyyMMdd hh:mm:ss��ʽ���ַ���ת����һ��Date���ʵ��
	  */
	 public static Date getTimeFromString17(String date) {

	  Calendar calendar = Calendar.getInstance();
	  calendar.set(Calendar.YEAR, Integer.parseInt(date.substring(0, 4)));
	  calendar.set(Calendar.MONTH, Integer.parseInt(date.substring(4, 6)) - 1);
	  calendar.set(Calendar.DATE, Integer.parseInt(date.substring(6, 8)));

	  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(date.substring(9, 11)));
	  calendar.set(Calendar.MINUTE, Integer.parseInt(date.substring(12, 14)));
	  calendar.set(Calendar.SECOND, Integer.parseInt(date.substring(15)));
	  return calendar.getTime();
	 }

	 /**
	  * ��һ��8λ��������ɵ��ַ���ת����һ��Date���ʵ��
	  * 
	  */
	 public static Date getTimeFromString8(String date) {
	  return transferStringToCalendar(date).getTime();
	 }

	 /**
	  * ��һ��8λ��������ɵ�����ת����ָ���ָ����������ʽ �������partenΪCN���᷵��һ���������ո�ʽ������
	  */
	 public static String transferStringToDate(String date, String parten) {

	  String fullDate = null;
	  if (date != null && date.trim().length() == 8) {
	   try {
	    StringBuffer sb = new StringBuffer();
	    String year = date.substring(0, 4);
	    String month = date.substring(4, 6);
	    String day = date.substring(6);
	    if (parten.equals("CN")) {
	     sb.append(year).append("��");
	     sb.append(month).append("��");
	     sb.append(day).append("��");
	    } else {
	     sb.append(year).append(parten);
	     sb.append(month).append(parten);
	     sb.append(day);

	    }
	    fullDate = sb.toString();

	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }

	  return fullDate;
	 }

	 /**
	  * ��һ��Date���ʵ��ת����8λ��������ɵ��ַ���
	  */
	 public static String transferDateToString(Date date) {
	  return datetime2Str(date, "yyyyMMdd");

	 }

	 /**
	  * ��һ��Date���ʵ��ת����10λ��������ɵ��ַ���<br>
	  * yyyy-MM-dd
	  */
	 public static String transferDateToString10(Date date) {
	  return datetime2Str(date, "yyyy-MM-dd");

	 }

	 /**
	  * ��һ��Date���ʵ��ת���� yyyyMMdd hh:mm:ss �ַ���
	  */
	 public static String transferDateTimeToString(Date date) {

	  return datetime2Str(date, "yyyyMMdd HH:mm:ss");
	 }

	 /**
	  * ��һ��Date���ʵ��ת���� yyyyMMdd 000000 �ַ���
	  */
	 public static String transferDateToBegin(Date date) {

	  return datetime2Str(date, "yyyyMMdd") + " 000000";
	 }

	 /**
	  * ��һ��yyyyMMdd��ʽ���ַ���ת���� yyyyMMdd 000000 �ַ���
	  */
	 public static String transferToBegin(String date) {

	  return date + " 000000";
	 }

	 /**
	  * ��һ��Date���ʵ��ת���� yyyyMMdd 235959 �ַ���
	  */
	 public static String transferDateToEnd(Date date) {

	  return datetime2Str(date, "yyyyMMdd") + " 235959";
	 }

	 /**
	  * ��һ��yyyyMMdd��ʽ���ַ���ת���� yyyyMMdd 235959 �ַ���
	  */
	 public static String transferToEnd(String date) {

	  return date + " 235959";
	 }

	 /**
	  * ��һ��Date���ʵ��ת���� yyyyMMdd hhmmss �ַ���
	  */
	 public static String transferDateTimeToString15(Date date) {

	  return datetime2Str(date, "yyyyMMdd HHmmss");
	 }

	 /**
	  * �ѵ�ǰ��ʱ��ת���� yyyy-MM-dd hh-mm-ss SSS ��ʽ���ַ���
	  */
	 public static String now2String() {
	  return datetime2Str(new Date(), "yyyy-MM-dd HH:mm:ss SSS");
	 }

	 /**
	  * ��һ��Date���ʵ��ת����ָ����ʽ���ַ���
	  */
	 public static String datetime2Str(Date date, String pattern) {
	  if (date == null) {
	   return null;
	  }
	  // �޸Ľ���
	  SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getInstance();
	  dateFormat.applyPattern(pattern);
	  return dateFormat.format(date);
	 }

	 /**
	  * ��һ��Calendar���ʵ��ת����8λ��������ɵ��ַ���
	  */
	 public static String transferCalendarToString(Calendar calendar) {
	  StringBuffer sb = new StringBuffer();
	  sb.append(String.valueOf(calendar.get(Calendar.YEAR)));
	  String temp = String.valueOf(calendar.get(Calendar.MONTH) + 1);
	  if (temp.length() == 1) {
	   sb.append("0");
	   sb.append(temp);
	  } else {
	   sb.append(temp);
	  }

	  temp = String.valueOf(calendar.get(Calendar.DATE));
	  if (temp.length() == 1) {
	   sb.append("0");
	   sb.append(temp);
	  } else {
	   sb.append(temp);
	  }

	  return sb.toString();
	 }

	 /*
	  * ���ڼ�飬�����뵱ǰ����
	  * 
	  */
	 public static boolean isValidDate(String date) {
	  boolean isValid = false;
	  if (date != null && date.trim().length() >= 8) {
	   try {
	    int month = Integer.parseInt(date.substring(4, 6));
	    int day = Integer.parseInt(date.substring(6));
	    if (month > 12 || month < 1 || day > 31 || day < 1) {
	     return false;
	    }
	    Date today = new Date();
	    Date sourceDate = null;
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    sourceDate = sdf.parse(date);
	    isValid = !sourceDate.after(today);
	   } catch (Exception e) {
	    System.out.println(e);
	    isValid = false;
	   }
	  }
	  return isValid;
	 }

	 /**
	  * ����·��Ƿ�Ϸ��Ҳ���������
	  */
	 public static boolean isValidMonty(String month) {
	  boolean isValid = false;
	  if (month != null && month.trim().length() == 6) {
	   try {
	    int monthTime = Integer.parseInt(month.substring(4, 6));
	    int yearTime = Integer.parseInt(month.substring(0, 4));
	    if (monthTime > 12 || monthTime < 1) {
	     return false;
	    }

	    Date today = null;
	    Date sourceDate = null;
	    int todayYear = Calendar.getInstance().get(Calendar.YEAR);
	    int todayMonth = Calendar.getInstance().get(Calendar.MONTH);

	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
	    SimpleDateFormat todaysdf = new SimpleDateFormat("yyyyMM");

	    sourceDate = sdf.parse(month);
	    today = todaysdf.parse(String.valueOf(todayYear) + String.valueOf(todayMonth + 1));
	    System.out.println("todayYear" + todayYear);
	    System.out.println("todayMonth" + String.valueOf(todayMonth + 1));
	    System.out.println("sourceDate" + sourceDate);
	    System.out.println("today" + today);
	    if (sourceDate.compareTo(today) <= 0)
	     isValid = true;
	    else
	     isValid = false;

	    System.out.println("����");

	   } catch (Exception e) {
	    System.out.println(e);
	    isValid = false;
	   }
	  }
	  return isValid;
	 }

	 /**
	  * ���ص�ǰ������ʱ��׼ȷ���ڣ���ʽ[yyyymmdd]
	  */
	 public static String getBeforThreeMonthDate() {
	  java.util.Date myDate = new java.util.Date();
	  long myTime = (myDate.getTime() / 1000) - 60 * 60 * 24 * 91;
	  myDate.setTime(myTime * 1000);
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	  String mDate = sdf.format(myDate);

	  return mDate;

	 }

	 /**
	  * ���ص������ڣ���ʽ[yyyymmdd]
	  */
	 public static String getTodayDate() {
	  java.util.Date myDate = new java.util.Date();
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	  String mDate = sdf.format(myDate);

	  return mDate;

	 }
	 public static Date getNowDate() {
		  java.util.Date myDate =Calendar.getInstance().getTime();
		  return myDate;
		 }

	 /*******************************************************************************************************************
	  * ����:date ��ʽ[yyyymmdd] ����:flag =AM [ 00:00:00] PM=[ 23:59:59]
	  */
	 public static String getLongTimeByDate(String date, String pattern) {
	  String theDate = transferStringToDate(date, "-");
	  if (pattern.equals("AM")) {
	   theDate = theDate + " 00:00:00";

	  } else if (pattern.equals("PM")) {
	   theDate = theDate + " 23:59:59";
	  }
	  return theDate;
	 }

	 /**
	  * ת��yyyymmdd��ʽ�������ַ�����yyyy-mm-dd��ʽ
	  */
	 public static String transfer8DateFormatStrTo10DateFormateStr(String date) {
	  String temp = date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
	  return temp;
	 }

	 public static String getYearFromString6(String date) {
	  if (date == null) {
	   System.out.println("ָ�����·���null");
	   return null;
	  }
	  if (date.length() != 6) {
	   System.out.println(("ָ�����·ݲ�����λ"));
	   return null;
	  }
	  System.out.println("�ꡣ��������");
	  return date.substring(0, 4);
	 }

	 public static String getMonthFromString6(String date) {
	  if (date == null) {
	   System.out.println(("ָ�����·���null"));
	   return null;
	  }
	  if (date.length() != 6) {

	   System.out.println(("ָ�����·ݲ�����λ"));
	   return null;
	  }
	  return date.substring(4, 6);
	 }

	 public static String transformString6TOFor8Month(String month) {
	  if (month != null && month.length() == 6) {
	   return month.substring(0, 4) + "-" + month.substring(4, 6);
	  } else
	   return null;
	 }

	 public static void main(String[] agrs) throws Exception {

	  System.out.println(DateFormatUtil.transferDateTimeToString(DateFormatUtil.getTimeFromString17("19990104 20:11:16")));
	  String str = "select dd from xx where dd=xx and cc=mm order xad";
	  int idx = str.indexOf(" where ");
	  int orderIdx = str.indexOf(" order by ");
	  System.out.println(idx+"===="+orderIdx);
	 }
}
