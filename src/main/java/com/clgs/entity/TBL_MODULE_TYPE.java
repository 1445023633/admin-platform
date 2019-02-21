package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_MODULE_TYPE  implements Serializable{
	
	//@PK
	@Id
	private String MODULE_TYPE_ID;
	
	private String MODULE_TYPE_NAME ;
	
	private Integer XH ; //���
	
	

	public Integer getXH() {
		return XH;
	}

	public void setXH(Integer xh) {
		XH = xh;
	}

	public String getMODULE_TYPE_ID() {
		return MODULE_TYPE_ID;
	}

	public void setMODULE_TYPE_ID(String module_type_id) {
		MODULE_TYPE_ID = module_type_id;
	}

	public String getMODULE_TYPE_NAME() {
		return MODULE_TYPE_NAME;
	}

	public void setMODULE_TYPE_NAME(String module_type_name) {
		MODULE_TYPE_NAME = module_type_name;
	}
	
	
	
}
