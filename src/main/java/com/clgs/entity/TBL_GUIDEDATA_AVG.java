package com.clgs.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_GUIDEDATA_AVG  implements Serializable{
	
	//@PK
	@Id
	private String POINT_ID ;
	//@PK
	@Id
	private String GUIDE_ID ;
	
	//@PK
	@Id
	private Date  DATE_ID ; //��Сʱ���㣬Сʱ��ƽ��ֵ��ÿ�����һ��
	
	private String AVG_VALUE ; //  ����ֵ
	
	
	private String GUIDE_CODE ;

	
	@Override
	public String toString() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.getDATE_ID());
		String utc = "Date.UTC("+cal.get(Calendar.YEAR)+","+(cal.get(Calendar.MONTH))+","+cal.get(Calendar.DAY_OF_MONTH)+","+cal.get(Calendar.HOUR_OF_DAY)+","+cal.get(Calendar.MINUTE)+","+cal.get(Calendar.SECOND)+")";
		return "["+utc+","+this.getAVG_VALUE()+"]" ;
	}
	
	
	public String getGUIDE_CODE() {
		return GUIDE_CODE;
	}

	public void setGUIDE_CODE(String guide_code) {
		GUIDE_CODE = guide_code;
	}

	public String getPOINT_ID() {
		return POINT_ID;
	}

	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}

	public String getGUIDE_ID() {
		return GUIDE_ID;
	}

	public void setGUIDE_ID(String guide_id) {
		GUIDE_ID = guide_id;
	}

	

	public Date getDATE_ID() {
		return DATE_ID;
	}

	public void setDATE_ID(Date date_id) {
		DATE_ID = date_id;
	}

	public String getAVG_VALUE() {
		return AVG_VALUE;
	}

	public void setAVG_VALUE(String avg_value) {
		AVG_VALUE = avg_value;
	}


	

	


	
	

	

	
	
	
	
	
}
