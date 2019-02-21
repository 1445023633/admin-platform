package com.clgs.utils;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlHelper {
    //�����ļ���ȡxml�ļ��еĽڵ�ֵ
	public static String GetXmlNodeText(String NodeName,String XmlFileName)
	{
		 SAXReader reader = new SAXReader();
		 try{
         Document  document = reader.read(XmlHelper.class.getResourceAsStream(XmlFileName));
         
         Element root = document.getRootElement();
	     List<Element> lists = root.elements(NodeName);
	     if(lists==null||lists.size()==0)return null;
	     return lists.get(0).getText();
         }catch(Exception dd){return "333";}
	}
	
}
