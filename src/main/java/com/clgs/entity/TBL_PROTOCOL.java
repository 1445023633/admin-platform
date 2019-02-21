package com.clgs.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_PROTOCOL  implements Serializable{

	//@PK
	@Id
	private String ID ;
	
	private String POINTS_ID; //����ID
	
	private String GUIDES_ID;//ָ��ID

	private String DATA_RANGE;//ָ���Ӧ�Ľ������ݷ�Χ

	private BigDecimal DATA_JYZ;//ָ��У��ֵ

	private String DATA_JYTYPE;//ָ��У�����ͣ��ӡ������ˡ�����

	private BigDecimal MIN_ALARM;//ָ�걨��ֵ����

	private BigDecimal MAX_ALARM;//ָ�걨��ֵ����

	private Date CREATE_DATE;//Э�鴴��ʱ��

	

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	public String getPOINTS_ID() {
		return POINTS_ID;
	}

	public void setPOINTS_ID(String points_id) {
		POINTS_ID = points_id;
	}

	public String getGUIDES_ID() {
		return GUIDES_ID;
	}

	public void setGUIDES_ID(String guides_id) {
		GUIDES_ID = guides_id;
	}

	public String getDATA_RANGE() {
		return DATA_RANGE;
	}

	public void setDATA_RANGE(String data_range) {
		DATA_RANGE = data_range;
	}

	public BigDecimal getDATA_JYZ() {
		return DATA_JYZ;
	}

	public void setDATA_JYZ(BigDecimal data_jyz) {
		DATA_JYZ = data_jyz;
	}

	public String getDATA_JYTYPE() {
		return DATA_JYTYPE;
	}

	public void setDATA_JYTYPE(String data_jytype) {
		DATA_JYTYPE = data_jytype;
	}

	public BigDecimal getMIN_ALARM() {
		return MIN_ALARM;
	}

	public void setMIN_ALARM(BigDecimal min_alarm) {
		MIN_ALARM = min_alarm;
	}

	public BigDecimal getMAX_ALARM() {
		return MAX_ALARM;
	}

	public void setMAX_ALARM(BigDecimal max_alarm) {
		MAX_ALARM = max_alarm;
	}

	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(Date create_date) {
		CREATE_DATE = create_date;
	}
}
