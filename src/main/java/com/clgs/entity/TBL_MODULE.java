package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_MODULE  implements Serializable{
	
	//@PK
	@Id
	private  String MODULE_ID ; //����ģ�����,
	
	private  String MODULE_NAME ;
	
	private String MODULE_TYPE_ID ;
	
	private String URL ;  //MODULE_ID��URLȥ��.JSP��Ľ��
	
	private Integer XH ; //���
	
	
	

	public String getMODULE_TYPE_ID() {
		return MODULE_TYPE_ID;
	}

	public void setMODULE_TYPE_ID(String module_type_id) {
		MODULE_TYPE_ID = module_type_id;
	}

	public String getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(String module_id) {
		MODULE_ID = module_id;
	}

	public String getMODULE_NAME() {
		return MODULE_NAME;
	}

	public void setMODULE_NAME(String module_name) {
		MODULE_NAME = module_name;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String url) {
		URL = url;
	}

	public Integer getXH() {
		return XH;
	}

	public void setXH(Integer xh) {
		XH = xh;
	}
	
	
	
	
}
