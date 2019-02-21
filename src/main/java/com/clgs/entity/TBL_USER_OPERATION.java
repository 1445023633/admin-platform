package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_USER_OPERATION  implements Serializable{
	//@PK
	@Id
	private String ACTION_ID ;
	
	private String MODULE_NAME ; //ģ����
	
	private String ACTION_NAME ;  //���ӣ�ɾ�����޸ģ���¼

	public String getACTION_ID() {
		return ACTION_ID;
	}

	public void setACTION_ID(String action_id) {
		ACTION_ID = action_id;
	}

	public String getMODULE_NAME() {
		return MODULE_NAME;
	}

	public void setMODULE_NAME(String module_name) {
		MODULE_NAME = module_name;
	}

	public String getACTION_NAME() {
		return ACTION_NAME;
	}

	public void setACTION_NAME(String action_name) {
		ACTION_NAME = action_name;
	}
	
	
	
	
}
