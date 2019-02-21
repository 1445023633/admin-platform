package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class TBL_SMS_SEND  implements Serializable{
	
	//@PK
	@Id
	private String ID;
	  

	 
	  private String SMS_HEAD;//���Ͷ���ͷ
	  

	
	  private String SMS_PHONE;//���ŷ��ͺ��루�ú���Ϊ���ն����˵ĺ��룩
	  
	
	  private Integer SMS_LENGTH;//�������ݶ��ų���
	  
	
	  private String SMS_CONTENT;//���Ͷ�������
	  
	
	  private Date FS_DATE;//��������

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getSMS_HEAD() {
		return SMS_HEAD;
	}

	public void setSMS_HEAD(String sms_head) {
		SMS_HEAD = sms_head;
	}

	public String getSMS_PHONE() {
		return SMS_PHONE;
	}

	public void setSMS_PHONE(String sms_phone) {
		SMS_PHONE = sms_phone;
	}

	public Integer getSMS_LENGTH() {
		return SMS_LENGTH;
	}

	public void setSMS_LENGTH(Integer sms_length) {
		SMS_LENGTH = sms_length;
	}

	public String getSMS_CONTENT() {
		return SMS_CONTENT;
	}

	public void setSMS_CONTENT(String sms_content) {
		SMS_CONTENT = sms_content;
	}

	public Date getFS_DATE() {
		return FS_DATE;
	}

	public void setFS_DATE(Date fs_date) {
		FS_DATE = fs_date;
	}
}
