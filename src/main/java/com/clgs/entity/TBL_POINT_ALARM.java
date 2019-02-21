package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_POINT_ALARM  implements Serializable{
	
	@Id
	private String POINT_ID ;
	
	private String ALARM_TYPE ; //�ϻ���
	
	private Date ALARM_DATE ; 
	
	private String LINE_ID ;
	

	public String getLINE_ID() {
		return LINE_ID;
	}

	public void setLINE_ID(String line_id) {
		LINE_ID = line_id;
	}

	public String getPOINT_ID() {
		return POINT_ID;
	}

	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}

	public String getALARM_TYPE() {
		return ALARM_TYPE;
	}

	public void setALARM_TYPE(String alarm_type) {
		ALARM_TYPE = alarm_type;
	}

	public Date getALARM_DATE() {
		return ALARM_DATE;
	}

	public void setALARM_DATE(Date alarm_date) {
		ALARM_DATE = alarm_date;
	}
	
	
	
	
}	
