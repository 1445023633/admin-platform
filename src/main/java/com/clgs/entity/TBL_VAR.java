package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_VAR  implements Serializable{
	
	//@PK
	@Id
	private String VAR_ID ;
	
	private String VAR_CODE  ;   //�ǿգ��߱�ʵ�����壬�ڴ�����ʹ��
	
	private String VAR_NAME ; //��������
	
	private String VAR_VALUE1 ; //����ֵ1
	
	private String VAR_VALUE2 ; //����ֵ2
	
	private String VAR_TYPE ; //����/����
	
	private String REMARKS ; //��ע
	
	public String getVAR_ID() {
		return VAR_ID;
	}

	public void setVAR_ID(String var_id) {
		VAR_ID = var_id;
	}

	public String getVAR_CODE() {
		return VAR_CODE;
	}

	public void setVAR_CODE(String var_code) {
		VAR_CODE = var_code;
	}

	public String getVAR_NAME() {
		return VAR_NAME;
	}

	public void setVAR_NAME(String var_name) {
		VAR_NAME = var_name;
	}

	public String getVAR_VALUE1() {
		return VAR_VALUE1;
	}

	public void setVAR_VALUE1(String var_value1) {
		VAR_VALUE1 = var_value1;
	}

	public String getVAR_VALUE2() {
		return VAR_VALUE2;
	}

	public void setVAR_VALUE2(String var_value2) {
		VAR_VALUE2 = var_value2;
	}

	public String getVAR_TYPE() {
		return VAR_TYPE;
	}

	public void setVAR_TYPE(String var_type) {
		VAR_TYPE = var_type;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String remarks) {
		REMARKS = remarks;
	}
	
	
	
	
}
