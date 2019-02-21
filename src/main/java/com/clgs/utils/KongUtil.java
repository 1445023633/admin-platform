package com.clgs.utils;

import java.util.Collection;
import java.util.Map;

public class KongUtil {
	
	public static boolean isNull(Object obj){
		if(obj==null){
			
			return true;
		}
		if(obj instanceof String){
			
			if(((String)obj).trim().equals("")){
				
				return true;
			}
			
		}
		if(obj instanceof Collection){
			
			if(((Collection)obj).size()>0)
				return false;
			else {
				return true;
			}
			
		}
		if(obj instanceof Object[]){
			
			if(((Object[])obj).length>0)
				return false;
			else {
				return true;
			}
			
		}
		if(obj instanceof Map){
			
			if(((Map)obj).size()>0)
				return false;
			else {
				return true;
			}
			
		}
		
		return false;
	}
	
	public static boolean isNotNull(Object obj){
		
		return !isNull(obj);
	}
	
}
