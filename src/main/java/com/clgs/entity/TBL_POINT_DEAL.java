package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_POINT_DEAL  implements Serializable{
	//@PK
	@Id
	private String POINT_ID ;
	
	private String DEAL_TYPE ; //处理类型
	
	private String POINT_TYPE ; //点类型�ϻ���

	public String getPOINT_ID() {
		return POINT_ID;
	}

	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}

	public String getDEAL_TYPE() {
		return DEAL_TYPE;
	}

	public void setDEAL_TYPE(String deal_type) {
		DEAL_TYPE = deal_type;
	}

	public String getPOINT_TYPE() {
		return POINT_TYPE;
	}

	public void setPOINT_TYPE(String point_type) {
		POINT_TYPE = point_type;
	}
	
	
}	
