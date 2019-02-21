package com.clgs.utils;

import javax.servlet.http.HttpServletRequest;

public class CommUtil {

	public static String  MakeSeparator(int count, String BZ)
    {
        String separator = "";
        if (count == 0){ separator = "";}
        else{separator = padLeft(BZ,count,' ');}
        return separator;
    }
	
	public static String padLeft(String str,int length,char ch){ 
		  for(int i=str.length();i<length;i++){
		   str = ch + str;
		  }
		  return str;
		 }

		 public static String padRight(String str,int length,char ch){
		  for(int i=str.length();i<length;i++){
		   str = str + ch;
		  }
		  return str;
		 }
		 
		 //根据request 获得用户IP
		 public static String getIpAddr(HttpServletRequest request) { 
			 String ip = request.getHeader("x-forwarded-for"); 
			 if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) 
			 { ip = request.getHeader("Proxy-Client-IP"); } 
			 if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) 
			 { ip = request.getHeader("WL-Proxy-Client-IP"); } 
			 if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) 
			 { ip = request.getRemoteAddr(); } 
			 return ip; 
          }
}
