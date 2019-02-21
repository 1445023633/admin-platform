package com.clgs.utils;

public class NumberUtil {
	
	//�ж��Ƿ�������
	public static boolean isNumeric(String s)
	{
	   if((s != null)&&(s!=""))
	    return s.matches("^[0-9]*$");
	   else
	    return false;
	}
	//�жϴ��������Ƿ�������
	public static int checkNum(String s)
	{
	   if((s == null)||(s.length() == 0)||!s.matches("^[0-9]*$"))
	   {
	    return 0;
	   }
	   else
	   {
	    if(s.length() < 10)
	    {
	     return Integer.parseInt(s);
	      }
	      else
	      {
	        return 0;
	      } 
	   }
	}
	//�жϴ��������Ƿ����ַ���
	   public static String checkString(String s)
	{
	   if((s == null)||(s.length() == 0)||s.matches("^[0-9]*$"))
	   {
	    return "";
	   }
	   else
	   {
	    return s;    
	   }
	}  



}
