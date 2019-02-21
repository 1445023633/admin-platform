package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_LAST_GUIDEDATA implements Serializable{
	
	//@PK
	@Id
	private String GUIDE_ID ; //  指标ID, 非空，外键TBL_GUIDE.GUIDE.ID
	
	//@PK
	@Id
	private String POINT_ID ; //  监测点ID, 非空，外键TBL_POINTS.POINT.ID
	
	private String GUIDE_CODE;//指标代码
	
	private String GUIDE_CATALOG ; //  指标ID, 非空，外键TBL_GUIDE.GUIDE.ID
	
	private String GUIDE_CATALOG_NAME ; //  指标ID, 非空，外键TBL_GUIDE.GUIDE.ID
	
	
	private String VALUE ; //  数据值
	
	private Date DATA_TIME ; //  发生时间
	
	
	//xgq 
	private String LINE_ID ; //线路ID
	
	//报警类型
	private String ALARM_TYPE ; //报警类型
	
	private String MX_VALUE ; //门限值
	

	
	
	public String getALARM_TYPE() {
		return ALARM_TYPE;
	}

	public void setALARM_TYPE(String alarm_type) {
		ALARM_TYPE = alarm_type;
	}

	public String getMX_VALUE() {
		return MX_VALUE;
	}

	public void setMX_VALUE(String mx_value) {
		MX_VALUE = mx_value;
	}

	public String getLINE_ID() {
		return LINE_ID;
	}

	public void setLINE_ID(String line_id) {
		LINE_ID = line_id;
	}

	public String getGUIDE_ID() {
		return GUIDE_ID;
	}

	public void setGUIDE_ID(String guide_id) {
		GUIDE_ID = guide_id;
	}

	public String getGUIDE_CATALOG() {
		return GUIDE_CATALOG;
	}

	public void setGUIDE_CATALOG(String guide_catalog) {
		GUIDE_CATALOG = guide_catalog;
	}

	public String getPOINT_ID() {
		return POINT_ID;
	}

	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}

	public String getVALUE() {
		return VALUE;
	}

	public void setVALUE(String value) {
		VALUE = value;
	}

	public Date getDATA_TIME() {
		return DATA_TIME;
	}

	public void setDATA_TIME(Date data_time) {
		DATA_TIME = data_time;
	}

	public String getGUIDE_CODE() {
		return GUIDE_CODE;
	}

	public void setGUIDE_CODE(String guide_code) {
		GUIDE_CODE = guide_code;
	}

	public String getGUIDE_CATALOG_NAME() {
		return GUIDE_CATALOG_NAME;
	}

	public void setGUIDE_CATALOG_NAME(String guide_catalog_name) {
		GUIDE_CATALOG_NAME = guide_catalog_name;
	}
	
	
}
