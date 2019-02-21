package com.clgs.utils; 

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * @author: xgqman@126.com 
 * @version time��Jul 2, 2010 6:37:14 PM 
 * class description: 
 */
public class DateUtil {
	
	public static SimpleDateFormat DEFAULT_TIMESSTAMP_COMPLETE_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	public static SimpleDateFormat DEFAULT_TIMESSTAMP_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static SimpleDateFormat DEFAULT_DATE_SDF = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat DEFAULT_FILE_SDF = new SimpleDateFormat("/yyyy/MM/dd/");
	
	/**
	 * ��ȡĳ�����������
	 * @param inputDate����������
	 * @param dayNumber��������� 
	 * @return ������������
	 */
	public static Date getSpaceDateAfter(Date inputDate,long dayNumber){
		
		long day=inputDate.getTime()+(((long)1000)*60*60*24*dayNumber);
		
		return new Date(day);
	}
	
	/**
	 * ��ȡĳ���֮ǰ�����������
	 * @param inputDate����������
	 * @param dayNumber���������
	 * @return ������������
	 */
	public static Date getSpaceDateBefore(Date inputDate,long dayNumber){
		
		long day=inputDate.getTime()-(((long)1000)*60*60*24*dayNumber);
		
		return new Date(day);
	}
	
	
	/**
	 * ��ȡ��������
	 * @param endDate
	 * @param startDate
	 * @return
	 */
	public static  long getSpaceNumber( Date endDate,Date startDate){
		
	
		return (endDate.getTime()-startDate.getTime())/(1000*60*60*24);
		
	}
	
	
	
	/**
	 * ��ȡ��������һ��
	 * @return ���磺2010
	 */
	public static String  getThisYear(){
		
		Calendar calendar=Calendar.getInstance();
		
		return calendar.get(Calendar.YEAR )+"";
		
	}
	/**
	 * ��ȡ����������
	 * @return
	 */
	public static String  getThisMonth(){
		
		Calendar calendar=Calendar.getInstance();
		
		return (calendar.get(Calendar.MONTH)+1)+"";
		
	}
	/**
	
	/**
	 * ��ȡ���µĵ�һ��
	 * @return
	 */
	public static Date  getDateFirstDayOfMonth(){
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR ), calendar.get(Calendar.MONTH ), 1);
		
		Date date=calendar.getTime();
		return date;
		
	}
	
	
	
	
	/**
	 * ��ȡĳ�������ڼ�
	 * @return
	 */
	public  static String getWeekDay(Date date){
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		String day=null;
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		  switch (dayOfWeek) {
		  case 1:
			  day="������";
		   break;
		  case 2:
			  day="����һ";
		   break;
		  case 3:
			  day="���ڶ�";
		   break;
		  case 4:
			  day="������";
		   break;
		  case 5:
			  day="������";
		   break;
		  case 6:
			  day="������";
		   break;
		  case 7:
			  day="������";
		   break;

		  }
		  return day;
	}
	
}
 