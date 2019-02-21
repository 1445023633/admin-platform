package com.clgs.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_ALARM_LOG  implements Serializable{

//	//@PK
	@Id
	private String ID;//�Զ�����ID

	private String POINTS_ID;//����ID
	
	private String POINTS_NAME;//����NAME

	private String POINTS_TYPE;//��������(GPRS��COM����)

	private String GUIDES_ID;//ָ��ID
	
	private String GUIDES_NAME;//ָ��ID

	private String DATA_HEXVALUE;//16���ƽ�������ֵ

	private String DATA_INTVALUE;//��������ֵ�����Σ�

	private String DATA_JYZ;//����У��ֵ

	private String DATA_JYTYPE;//У�����ͣ��ӡ������ˡ����� �������ݱȽϹ�ʽ��datavalue +jytype+jyz �Ƚ� alarmvalue

	
	private String ALARM_VALUE;//���ݱ���ֵ

	
	private String ALARM_TYPE;//�������ͣ����ޣ����ޣ�

	
	
	private String ALARM_INFO;//������Ϣ

	private String PLAN_INFO;//Ԥ����Ϣ
	

	private Timestamp ALARM_DATE;//����ʱ��

	private Integer IS_READ; // 0  ֻ��0�����

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

	public String getPOINTS_TYPE() {
		return POINTS_TYPE;
	}

	public void setPOINTS_TYPE(String points_type) {
		POINTS_TYPE = points_type;
	}

	public String getDATA_HEXVALUE() {
		return DATA_HEXVALUE;
	}

	public void setDATA_HEXVALUE(String data_hexvalue) {
		DATA_HEXVALUE = data_hexvalue;
	}

	public String getDATA_INTVALUE() {
		return DATA_INTVALUE;
	}

	public void setDATA_INTVALUE(String data_intvalue) {
		DATA_INTVALUE = data_intvalue;
	}

	public String getDATA_JYZ() {
		return DATA_JYZ;
	}

	public void setDATA_JYZ(String data_jyz) {
		DATA_JYZ = data_jyz;
	}

	public String getDATA_JYTYPE() {
		return DATA_JYTYPE;
	}

	public void setDATA_JYTYPE(String data_jytype) {
		DATA_JYTYPE = data_jytype;
	}

	public String getALARM_VALUE() {
		return ALARM_VALUE;
	}

	public void setALARM_VALUE(String alarm_value) {
		ALARM_VALUE = alarm_value;
	}

	public String getALARM_TYPE() {
		return ALARM_TYPE;
	}

	public void setALARM_TYPE(String alarm_type) {
		ALARM_TYPE = alarm_type;
	}

	public String getPLAN_INFO() {
		return PLAN_INFO;
	}

	public void setPLAN_INFO(String plan_info) {
		PLAN_INFO = plan_info;
	}

	

	public Timestamp getALARM_DATE() {
		return ALARM_DATE;
	}

	public void setALARM_DATE(Timestamp alarm_date) {
		ALARM_DATE = alarm_date;
	}

	public String getGUIDES_ID() {
		return GUIDES_ID;
	}

	public void setGUIDES_ID(String guides_id) {
		GUIDES_ID = guides_id;
	}

	public String getALARM_INFO() {
		return ALARM_INFO;
	}

	public void setALARM_INFO(String alarm_info) {
		ALARM_INFO = alarm_info;
	}

	public Integer getIS_READ() {
		return IS_READ;
	}

	public void setIS_READ(Integer is_read) {
		IS_READ = is_read;
	}

	public String getPOINTS_NAME() {
		return POINTS_NAME;
	}

	public void setPOINTS_NAME(String points_name) {
		POINTS_NAME = points_name;
	}

	public String getGUIDES_NAME() {
		return GUIDES_NAME;
	}

	public void setGUIDES_NAME(String guides_name) {
		GUIDES_NAME = guides_name;
	}
	
	

}
