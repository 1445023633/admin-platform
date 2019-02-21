package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;





@Entity
public class TBL_COM_JC_MX  implements Serializable{
	
//	//@PK
	@Id
	private String ID;
	
	 
	  private String POINTS_ID;  ////����ID
	  
	  private String POINTS_NAME;  ////��������

	 
	  private String POINTS_ADDRESS;  //�����ַ
	
	
	  private String FS_CONTENT; //���Ͳ�ѯ��������
	
	
	  private Date FS_DATE;//��������
	  
	 
	  private String JS_CONTENT;//���յ��ķ�������
	  
	
	  private Date JS_DATE; //��������

	  
	  
	  
	public String getPOINTS_NAME() {
		return POINTS_NAME;
	}

	public void setPOINTS_NAME(String points_name) {
		POINTS_NAME = points_name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getFS_CONTENT() {
		return FS_CONTENT;
	}

	public void setFS_CONTENT(String fs_content) {
		FS_CONTENT = fs_content;
	}

	public Date getFS_DATE() {
		return FS_DATE;
	}

	public void setFS_DATE(Date fs_date) {
		FS_DATE = fs_date;
	}

	public String getJS_CONTENT() {
		return JS_CONTENT;
	}

	public void setJS_CONTENT(String js_content) {
		JS_CONTENT = js_content;
	}

	public Date getJS_DATE() {
		return JS_DATE;
	}

	public void setJS_DATE(Date js_date) {
		JS_DATE = js_date;
	}

	public String getPOINTS_ID() {
		return POINTS_ID;
	}

	public void setPOINTS_ID(String points_id) {
		POINTS_ID = points_id;
	}

	

	public String getPOINTS_ADDRESS() {
		return POINTS_ADDRESS;
	}

	public void setPOINTS_ADDRESS(String points_address) {
		POINTS_ADDRESS = points_address;
	}

	
}
