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
	SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * ��ȡĳ�����������
	 * @param inputDate����������
	 * @param dayNumber��������� 
	 * @return ������������
	 */
	public static Date getSpaceDateAfter(Date inputDate,int dayNumber){
		
		long day=inputDate.getTime()+(1000*60*60*24*dayNumber);
		
		return new Date(day);
	}
	
	/**
	 * ��ȡĳ���֮ǰ�����������
	 * @param inputDate����������
	 * @param dayNumber���������
	 * @return ������������
	 */
	public static Date getSpaceDateBefore(Date inputDate,int dayNumber){
		
		long day=inputDate.getTime()-(1000*60*60*24*dayNumber);
		
		return new Date(day);
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
 