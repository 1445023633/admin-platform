package com.clgs.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_GUIDE  implements Serializable{

//	//@PK
	@Id
	private String GUIDE_ID; //�����Զ�����

	private String GUIDE_CODE; //ָ�����

	private String GUIDE_NAME; //ָ�����
	
	private String GUIDE_UNIT; //ָ�����

	private String PARENT_CATALOG; //������ID  �ǿգ����TBL_CATALOG.CATALOG_ID

	private String PARENT_CATALOG_NAME; //������ID  �ǿգ����TBL_CATALOG.CATALOG_ID

	
	//20121002
	private String GUIDE_TYPE; //ָ������  ��GPRS or COM��

	private String FEATURE_VALUE; //����ֵ

	//20121002
	private String MIN_PLAN;//���������ޱ���ʱ�����ֵ�Ԥ����Ϣ

	//20121002
	private String MAX_PLAN;//���������ޱ���ʱ�����ֵ�Ԥ����Ϣ

	//20121002
	private String BZ;//��ע
	
	
	
	/**
	 * ��Щ��ʱ�ֶ���������ʾЭ���
	 */
	
	//@Temp
	private String TEMP1 ;
	
	//@Temp
	private String TEMP2 ;
	
	
	
	//@Temp
	private String ID;//ָ���Ӧ�Ľ�����ݷ�Χ
	
	
	//@Temp
	private String DATA_RANGE;//ָ���Ӧ�Ľ�����ݷ�Χ
	//@Temp
	private BigDecimal DATA_JYZ;//ָ��У��ֵ
	//@Temp
	private String DATA_JYTYPE;//ָ��У�����ͣ��ӡ������ˡ���
	//@Temp
	private BigDecimal MIN_ALARM;//ָ�걨��ֵ����
	//@Temp
	private BigDecimal MAX_ALARM;//ָ�걨��ֵ����
	//@Temp
	private Date CREATE_DATE;//Э�鴴��ʱ��
	
	
	
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GUIDE_ID == null) ? 0 : GUIDE_ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TBL_GUIDE other = (TBL_GUIDE) obj;
		if (GUIDE_ID == null) {
			if (other.GUIDE_ID != null)
				return false;
		} else if (!GUIDE_ID.equals(other.GUIDE_ID))
			return false;
		return true;
	}

	public String getTEMP1() {
		return TEMP1;
	}

	public void setTEMP1(String temp1) {
		TEMP1 = temp1;
	}

	public String getTEMP2() {
		return TEMP2;
	}

	public void setTEMP2(String temp2) {
		TEMP2 = temp2;
	}

	public String getGUIDE_ID() {
		return GUIDE_ID;
	}

	public void setGUIDE_ID(String guide_id) {
		GUIDE_ID = guide_id;
	}

	public String getGUIDE_CODE() {
		return GUIDE_CODE;
	}

	public void setGUIDE_CODE(String guide_code) {
		GUIDE_CODE = guide_code;
	}

	public String getGUIDE_NAME() {
		return GUIDE_NAME;
	}

	public void setGUIDE_NAME(String guide_name) {
		GUIDE_NAME = guide_name;
	}
	
	public String getGUIDE_UNIT() {
		return GUIDE_UNIT;
	}

	public void setGUIDE_UNIT(String guide_unit) {
		GUIDE_UNIT = guide_unit;
	}

	public String getPARENT_CATALOG() {
		return PARENT_CATALOG;
	}

	public void setPARENT_CATALOG(String parent_catalog) {
		PARENT_CATALOG = parent_catalog;
	}

	public String getPARENT_CATALOG_NAME() {
		return PARENT_CATALOG_NAME;
	}

	public void setPARENT_CATALOG_NAME(String parent_catalog_name) {
		PARENT_CATALOG_NAME = parent_catalog_name;
	}

	public String getGUIDE_TYPE() {
		return GUIDE_TYPE;
	}

	public void setGUIDE_TYPE(String guide_type) {
		GUIDE_TYPE = guide_type;
	}

	public String getFEATURE_VALUE() {
		return FEATURE_VALUE;
	}

	public void setFEATURE_VALUE(String feature_value) {
		FEATURE_VALUE = feature_value;
	}

	public String getMIN_PLAN() {
		return MIN_PLAN;
	}

	public void setMIN_PLAN(String min_plan) {
		MIN_PLAN = min_plan;
	}

	public String getMAX_PLAN() {
		return MAX_PLAN;
	}

	public void setMAX_PLAN(String max_plan) {
		MAX_PLAN = max_plan;
	}

	public String getBZ() {
		return BZ;
	}

	public void setBZ(String bz) {
		BZ = bz;
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

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}

	
	

}
