package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class TBL_GPRS_CMD_MX  implements Serializable{
	
//	//@PK
	@Id
	private String ID=UUID.randomUUID().toString() ;//序号
	
	
	  private String POINTS_ID;//��ID
	  
	  private String POINTS_NAME;  ////�������
	  
	
	  private String PHONE;//���ֻ����
	  
	
	  private String CMD;//��������
	  
	
	  private String CMD_TYPE;//������������
	  
	 
	  private Date CREATE_DATE;//����ʱ��

	public String getPOINTS_ID() {
		return POINTS_ID;
	}

	public void setPOINTS_ID(String points_id) {
		POINTS_ID = points_id;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
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

	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(Date create_date) {
		CREATE_DATE = create_date;
	}

	public String getPOINTS_NAME() {
		return POINTS_NAME;
	}

	public void setPOINTS_NAME(String points_name) {
		POINTS_NAME = points_name;
	}
	
	
	
}
