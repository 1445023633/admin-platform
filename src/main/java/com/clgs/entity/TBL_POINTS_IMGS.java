package com.clgs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;




//报警信息表
@Entity
public class TBL_POINTS_IMGS  implements Serializable{

	//@PK
	@Id
	private String ID;
	  
	 private String POINT_ID;//监测点ID
	 

	 private String JC_IMG;//监测点名称
	  	  

	  private Date JC_DATE;//报警时间

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getPOINT_ID() {
		return POINT_ID;
	}

	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}

	public String getJC_IMG() {
		return JC_IMG;
	}

	public void setJC_IMG(String jc_img) {
		JC_IMG = jc_img;
	}

	public Date getJC_DATE() {
		return JC_DATE;
	}

	public void setJC_DATE(Date jc_date) {
		JC_DATE = jc_date;
	}
	
}