package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class TBL_GPRS_JC_NOW  implements Serializable{
	
//	//@PK
	@Id
	private String ID;
	  
	
	  private String POINTS_ID;// ����iD
	
	  private String POINTS_NAME;  ////��������
	
	  private String PACKAGE_HEAD;  //����ע����İ�ͷ
	
	
	  private String ADDRESS_ID;//����ע����ĵ�ַ9λ
	  
	 
	  private String PHONE; //����ע����еĶ�Ӧ�ֻ�
	  
	 
	  private Integer ISZC;//�ü����Ƿ�Ϊ��ϵͳע�ᣨδע�����������ϵͳ�м��㣩
	  
	
	  private Date CREATE_DATE;//���㷢��ע�����ע��ʱ��

	  
	  
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

	public String getPACKAGE_HEAD() {
		return PACKAGE_HEAD;
	}

	public void setPACKAGE_HEAD(String package_head) {
		PACKAGE_HEAD = package_head;
	}

	public String getADDRESS_ID() {
		return ADDRESS_ID;
	}

	public void setADDRESS_ID(String address_id) {
		ADDRESS_ID = address_id;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String phone) {
		PHONE = phone;
	}

	public Integer getISZC() {
		return ISZC;
	}

	public void setISZC(Integer iszc) {
		ISZC = iszc;
	}

	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(Date create_date) {
		CREATE_DATE = create_date;
	}

	
}
