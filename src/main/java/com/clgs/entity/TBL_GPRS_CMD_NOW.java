package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class TBL_GPRS_CMD_NOW  implements Serializable{
	
//	//@PK
	@Id
	private String ID=UUID.randomUUID().toString() ;//序号

	
	  private String POINTS_ID;//����ID
	  
	  private String POINTS_NAME;  ////�������
	  
	  
	  private String PHONE;//�����ֻ����
	  
	
	  private String CMD;//���͵Ŀ�������
	  
	 
	  private String CMD_TYPE;//������������
	  
	
	  private Date FS_DATE;//����ʱ��
	  
	
	  private String RESULT;//���ؽ��
	  
	 
	  private Date JS_DATE;//����ʱ��

	  
	  
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

	public String getPOINTS_ID() {
		return POINTS_ID;
	}

	public void setPOINTS_ID(String points_id) {
		POINTS_ID = points_id;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String phone) {
		PHONE = phone;
	}

	public String getCMD() {
		return CMD;
	}

	public void setCMD(String cmd) {
		CMD = cmd;
	}

	public String getCMD_TYPE() {
		return CMD_TYPE;
	}

	public void setCMD_TYPE(String cmd_type) {
		CMD_TYPE = cmd_type;
	}

	public Date getFS_DATE() {
		return FS_DATE;
	}

	public void setFS_DATE(Date fs_date) {
		FS_DATE = fs_date;
	}

	public String getRESULT() {
		return RESULT;
	}

	public void setRESULT(String result) {
		RESULT = result;
	}

	public Date getJS_DATE() {
		return JS_DATE;
	}

	public void setJS_DATE(Date js_date) {
		JS_DATE = js_date;
	}

	
}
