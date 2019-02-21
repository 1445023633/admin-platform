package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_USER_ACCESS  implements Serializable{
	
	//@PK
	@Id
	private String ACCESS_ID =UUID.randomUUID().toString();
	
	private Date ACCESS_TIME ;
	
	private String USER_NAME ;
	
	private String USER_NAME2 ;
	
	private String USER_GROUP ;
	
	private String ACTION_ID ;
	
	private String MODULE_NAME ; //模块名
	
	private String ACTION_NAME ;  //增加，删除，修改，登录
	
	private String USER_IP;//用户登录IP
	
	private String USER_NOTE;//详细的日志描述

	
	
	
	public String getUSER_GROUP() {
		return USER_GROUP;
	}

	public void setUSER_GROUP(String user_group) {
		USER_GROUP = user_group;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String user_name) {
		USER_NAME = user_name;
	}

	public String getUSER_NAME2() {
		return USER_NAME2;
	}

	public void setUSER_NAME2(String user_name2) {
		USER_NAME2 = user_name2;
	}

	public String getACCESS_ID() {
		return ACCESS_ID;
	}

	public void setACCESS_ID(String access_id) {
		ACCESS_ID = access_id;
	}

	public Date getACCESS_TIME() {
		return ACCESS_TIME;
	}

	public void setACCESS_TIME(Date access_time) {
		ACCESS_TIME = access_time;
	}

	public String getACTION_ID() {
		return ACTION_ID;
	}

	public void setACTION_ID(String action_id) {
		ACTION_ID = action_id;
	}

	public String getMODULE_NAME() {
		return MODULE_NAME;
	}

	public void setMODULE_NAME(String module_name) {
		MODULE_NAME = module_name;
	}

	public String getACTION_NAME() {
		return ACTION_NAME;
	}

	public void setACTION_NAME(String action_name) {
		ACTION_NAME = action_name;
	}

	public String getUSER_IP() {
		return USER_IP;
	}

	public void setUSER_IP(String user_ip) {
		USER_IP = user_ip;
	}
	
	public String getUSER_NOTE() {
		return USER_NOTE;
	}
	public void setUSER_NOTE(String user_note) {
		USER_NOTE = user_note;
	}
	
	
}
