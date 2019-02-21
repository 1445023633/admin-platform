package com.clgs.pojo;

import org.springframework.jdae.dao.ano.Pk;
import org.springframework.jdae.dao.ano.Temp;

public class VIEW_DATAPOWER {
	
	
	
	
	private String GROUP_ID ; //Ⱥ��ID
	
	private String LINE_ID ; //����ID
	
	
	
	
	private String LINE_NAME ;
	
	private Integer LINE_SHOW ;
	
	
	
	
	

	public String getGROUP_ID() {
		return GROUP_ID;
	}

	public void setGROUP_ID(String group_id) {
		GROUP_ID = group_id;
	}

	public String getLINE_ID() {
		return LINE_ID;
	}

	public void setLINE_ID(String line_id) {
		LINE_ID = line_id;
	}


	public String getLINE_NAME() {
		return LINE_NAME;
	}

	public void setLINE_NAME(String line_name) {
		LINE_NAME = line_name;
	}

	public Integer getLINE_SHOW() {
		return LINE_SHOW;
	}

	public void setLINE_SHOW(Integer line_show) {
		LINE_SHOW = line_show;
	}

	
	
	
}
