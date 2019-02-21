package com.clgs.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_LOGS  implements Serializable{
	
	//@PK
	@Id
	private String LOG_ID ;
	
	private String LOG_PROVIDER ; //�ṩ��
	
	private String LOG_MEMO ; //��־����
	
	private Timestamp LOG_TIME ; //��־ʱ��
	
	private String LOG_TYPE ; //����

	
	
	
	
	public String getLOG_ID() {
		return LOG_ID;
	}

	public void setLOG_ID(String log_id) {
		LOG_ID = log_id;
	}

	public String getLOG_PROVIDER() {
		return LOG_PROVIDER;
	}

	public void setLOG_PROVIDER(String log_provider) {
		LOG_PROVIDER = log_provider;
	}

	public String getLOG_MEMO() {
		return LOG_MEMO;
	}

	public void setLOG_MEMO(String log_memo) {
		LOG_MEMO = log_memo;
	}

	public Timestamp getLOG_TIME() {
		return LOG_TIME;
	}

	public void setLOG_TIME(Timestamp log_time) {
		LOG_TIME = log_time;
	}

	public String getLOG_TYPE() {
		return LOG_TYPE;
	}

	public void setLOG_TYPE(String log_type) {
		LOG_TYPE = log_type;
	}
	
	
	
	
}
