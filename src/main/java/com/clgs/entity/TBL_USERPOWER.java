package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_USERPOWER implements Serializable{
	
	//@PK
	@Id
	private  String MODULE_ID ; //����ģ�����
	
	//@PK
	@Id
	private  String USER_ID ;
	

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(String module_id) {
		MODULE_ID = module_id;
	}

	

	
	
	

	
	
	
}
