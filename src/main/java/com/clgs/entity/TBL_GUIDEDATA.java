package com.clgs.entity;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_GUIDEDATA   implements Serializable{
	
	//@PK
	@Id
	private String DATA_ID =UUID.randomUUID().toString() ; //�������Զ�����
	
	private String GUIDE_ID ; //  ָ��ID, �ǿգ����TBL_GUIDE.GUIDE.ID
	
	
	
	private String POINT_ID ; //  ����ID, �ǿգ����TBL_POINTS.POINT.ID
	
	private String VALUE ; //  ����ֵ
	
	private Date DATA_TIME ; //  ����ʱ��
	
	
	
	//@Temp
	private Long LONG_TIME ; //  ���� �������ǳ��� 60*1000
	
	
	@Override
	public String toString() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.getDATA_TIME());
		String utc = "Date.UTC("+cal.get(Calendar.YEAR)+","+(cal.get(Calendar.MONTH))+","+cal.get(Calendar.DAY_OF_MONTH)+","+cal.get(Calendar.HOUR_OF_DAY)+","+cal.get(Calendar.MINUTE)+","+cal.get(Calendar.SECOND)+")";
		return "["+utc+","+this.getVALUE()+"]" ;
	}
	

	

	public String getDATA_ID() {
		return DATA_ID;
	}

	public void setDATA_ID(String data_id) {
		DATA_ID = data_id;
	}

	public String getGUIDE_ID() {
		return GUIDE_ID;
	}

	public void setGUIDE_ID(String guide_id) {
		GUIDE_ID = guide_id;
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




	public Long getLONG_TIME() {
		return LONG_TIME;
	}

	public void setLONG_TIME(Long long_time) {
		LONG_TIME = long_time;
	}

	
	
	
	
	
	
	
	
	
	
}
