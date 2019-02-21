package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class TBL_SMS_RECIVE  implements Serializable{
	//@PK
	@Id
	private String ID;
	  

	 
	  private String SMS_HEAD;//���յ��Ķ���ͷ
	  

	
	  private String SMS_PHONE;//���յ��ֻ����루�ú���Ϊ���͸ö��ŵ��ֻ����룩
	  
	
	  private Integer SMS_LENGTH;//���Ͷ��ų���
	  
	
	  private String SMS_CONTENT;//���Ͷ�������
	  
	
	  private Date JS_DATE;//��������

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

	public Date getJS_DATE() {
		return JS_DATE;
	}

	public void setJS_DATE(Date js_date) {
		JS_DATE = js_date;
	}

	
}
