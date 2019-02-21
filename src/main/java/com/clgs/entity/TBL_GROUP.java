package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_GROUP  implements Serializable{
	
//	//@PK
	@Id
	private String  GROUP_ID ; //群组序号
	
	private String  GROUP_NAME ; //GROUP_NAME唯一索引
	
	private String  PARENT_GROUP_ID ;// 父群组

	
	/**
	 * 额外字段
	 */
	
	private String GROUP_LXFS ; //联系方式
	
	private String  PARENT_GROUP_NAME ;// 父群组名
	
	private Integer  ISCOMPANY;//是否为公司
	
//	//@Temp
	private Integer GRADE ;
	
	public String getGROUP_ID() {
		return GROUP_ID;
	}

	public void setGROUP_ID(String group_id) {
		GROUP_ID = group_id;
	}

	public String getGROUP_NAME() {
		return GROUP_NAME;
	}

	public void setGROUP_NAME(String group_name) {
		GROUP_NAME = group_name;
	}

	public String getPARENT_GROUP_ID() {
		return PARENT_GROUP_ID;
	}

	public void setPARENT_GROUP_ID(String parent_group_id) {
		PARENT_GROUP_ID = parent_group_id;
	}

	public String getGROUP_LXFS() {
		return GROUP_LXFS;
	}

	public void setGROUP_LXFS(String group_lxfs) {
		GROUP_LXFS = group_lxfs;
	}

	public String getPARENT_GROUP_NAME() {
		return PARENT_GROUP_NAME;
	}

	public void setPARENT_GROUP_NAME(String parent_group_name) {
		PARENT_GROUP_NAME = parent_group_name;
	}

	public Integer getGRADE() {
		return GRADE;
	}

	public void setGRADE(Integer grade) {
		GRADE = grade;
	}

	public Integer getISCOMPANY() {
		return ISCOMPANY;
	}

	public void setISCOMPANY(Integer iscompany) {
		ISCOMPANY = iscompany;
	}

	
	
	
}
