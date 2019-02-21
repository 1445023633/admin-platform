package com.clgs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class TBL_USER  implements Serializable{
	
	//@PK
	@Id
	private String USER_ID ;
	
	private String USER_NAME ; //�ǿգ�ǿ�ƴ�д USER_NAMEΨһ����
	
	private String USER_NAME2 ; //�û�����
	
	private String PASSWORD ; //2��MD5����
	
	private String USER_GROUP ; //����Ⱥ��  �ǿգ����TBL_GROUP. GROUP_ID

	private String USER_GROUP_NAME ; //����Ⱥ��  �ǿգ����TBL_GROUP. GROUP_ID
	
	
	
	
	//@Temp
	@Transient
	private Set<String> line_ids ;
	
	//@Temp
	@Transient
	private List<String> system_module_ids ;
	
	//@Temp
	@Transient
	private List<String> user_module_ids ;

	//@Temp
	@Transient
	private List<String> user_operation_ids ;
	
	//@Temp
	@Transient
	private String COMPANY_ID;
	
	//@Temp
	@Transient
	private String COMPANY_NAME;
	
	
	
	
	public List<String> getUser_operation_ids() {
		return user_operation_ids;
	}

	public void setUser_operation_ids(List<String> user_operation_ids) {
		this.user_operation_ids = user_operation_ids;
	}

	public String getUSER_NAME2() {
		return USER_NAME2;
	}

	public void setUSER_NAME2(String user_name2) {
		USER_NAME2 = user_name2;
	}

	
	public Set<String> getLine_ids() {
		return line_ids;
	}

	public void setLine_ids(Set<String> line_ids) {
		this.line_ids = line_ids;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String user_name) {
		USER_NAME = user_name;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String password) {
		PASSWORD = password;
	}

	public String getUSER_GROUP() {
		return USER_GROUP;
	}

	public void setUSER_GROUP(String user_group) {
		USER_GROUP = user_group;
	}

	public String getUSER_GROUP_NAME() {
		return USER_GROUP_NAME;
	}

	public void setUSER_GROUP_NAME(String user_group_name) {
		USER_GROUP_NAME = user_group_name;
	}

	public List<String> getSystem_module_ids() {
		return system_module_ids;
	}

	public void setSystem_module_ids(List<String> system_module_ids) {
		this.system_module_ids = system_module_ids;
	}

	public List<String> getUser_module_ids() {
		return user_module_ids;
	}

	public void setUser_module_ids(List<String> user_module_ids) {
		this.user_module_ids = user_module_ids;
	}

	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}

	public void setCOMPANY_ID(String company_id) {
		COMPANY_ID = company_id;
	}

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public void setCOMPANY_NAME(String company_name) {
		COMPANY_NAME = company_name;
	}
	
	
	

	
	
	
	
	
}
