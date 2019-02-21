package com.clgs.utils;
 
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PropUtil {
	public static Properties pc=new Properties();
	private static Pattern p = Pattern.compile("\\s+");
	
	public static void  readConstantPropertis(String webPath){
		if(FileUtil.IsExistFileOrDirectory(webPath+"wtes/config/config.properties")){
		 InputStream ips = null;
		 DESUtil des = null;
	    try
	    {
	      
	      FileInputStream fin = new FileInputStream(webPath+"wtes/config/config.properties");
	      byte[] b = new byte[fin.available()];
	      
	      int num = fin.read(b);
	      String str = new String(b, 0, num);
	      //str = str.replace("\r\n", "");
	      str = str.trim();
	      
	      try
	      {
	        des = new DESUtil();
	        str = des.decrypt(str);
	      }
	      catch (Exception d)
	      {
	        d.printStackTrace();
	      }
	      ips = new ByteArrayInputStream(str.getBytes("UTF-8"));
	      
	      pc.load(ips);
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	      
	    }
	    finally
	    {
	      try
	      {
	        ips.close();
	      }
	      catch (IOException e)
	      {
	        e.printStackTrace();
	      }
	    }
	}else{
		System.out.println("没有找到配置文件！");
		}
		
	}
	
	public static void  storeConstantPropertis(String webPath){
		
		OutputStream ops=null;
		DESUtil des = null;
		try {
			ops = new FileOutputStream(webPath+"wtes/config/config.properties");
	
			pc.store(ops,null);
			ops.close();
		//存储写入文件中后，进行读取加密
			File file = new File(webPath+"wtes/config/config.properties");

			StringBuilder sb = new StringBuilder();
			String s ="";
			BufferedReader br = new BufferedReader(new FileReader(file));

			while( (s = br.readLine()) != null) {
			sb.append("\r\n"+s);
			}

			br.close();
			String enStr = sb.toString();
			 try{
		        des = new DESUtil();
		        enStr = des.encrypt(enStr);
		      }catch (Exception d) {d.printStackTrace();    }
		//加密后写入文件中
			 try {
				 if(FileUtil.IsExistFileOrDirectory(webPath+"wtes/config/config.properties")){FileUtil.delFile(webPath+"wtes/config/config.properties");}
				 FileUtil.createFile(webPath+"wtes/config/config.properties", enStr, "UTF-8");
		        	} catch (Exception e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        	}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		finally{
			
			try {
				ops.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


	
	public static  void set(String key,String value){
		if(pc.containsKey(key)){
			pc.setProperty(key, value);
		//	pc.put(key, value);
			
		}
		
		
		
	}
	
	
	
	public static String getString(String key) {
		
		
		//System.out.printf(key+"====="+pc.getProperty(key));
		Matcher m = p.matcher(key); //���ģʽ����key��ƥ��
		String value=pc.getProperty(m.replaceAll(""));//��ƥ��ط������滻
		m = p.matcher(value);
		
		return m.replaceAll("");
		
	
	}
	public static int getInt(String key) {
		
		
		Matcher m = p.matcher(key);
		String value=pc.getProperty(m.replaceAll(""));
		m = p.matcher(value);
		
		return Integer.parseInt(m.replaceAll(""));
		
	
	}
	public static long getLong(String key) {
		
		
		Matcher m = p.matcher(key);
		String value=pc.getProperty(m.replaceAll(""));
		m = p.matcher(value);
		
		return Long.parseLong(m.replaceAll(""));
	
	}
	public static boolean getBool(String key){
		
		
		Matcher m = p.matcher(key);
		String value=pc.getProperty(m.replaceAll(""));
		m = p.matcher(value);
		
		
		return new Boolean(m.replaceAll("")).booleanValue();
		
	
	}

}
