package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_USER_FEATURE  implements Serializable{

	//@PK
	@Id
	private String ID;
	
	private String USER_ID;
	
	private String FEATURE_ID;
	
	private String FEATURE_NAME;
	
	private String VALUE;

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getFEATURE_ID() {
		return FEATURE_ID;
	}

	public void setFEATURE_ID(String feature_id) {
		FEATURE_ID = feature_id;
	}

	public String getFEATURE_NAME() {
		return FEATURE_NAME;
	}

	public void setFEATURE_NAME(String feature_name) {
		FEATURE_NAME = feature_name;
	}

	public String getVALUE() {
		return VALUE;
	}

	public void setVALUE(String value) {
		VALUE = value;
	}
	
}
