package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_DATAPOWER implements Serializable{
	
	
	
//	//@PK
	@Id
	private String GROUP_ID ; //Ⱥ��ID
//	//@PK
	@Id
	private String LINE_ID ; //����ID
	
//	//@Temp
	private String LINE_NAME ;
	
	
	

	public String getGROUP_ID() {
		return GROUP_ID;
	}

	public void setGROUP_ID(String group_id) {
		GROUP_ID = group_id;
	}

	public String getLINE_ID() {
		return LINE_ID;
	}

	public void setLINE_ID(String line_id) {
		LINE_ID = line_id;
	}


	public String getLINE_NAME() {
		return LINE_NAME;
	}

	public void setLINE_NAME(String line_name) {
		LINE_NAME = line_name;
	}

	

	
	
	
}
