package com.clgs.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_LINES  implements Serializable{
	
	//@PK
	@Id
	private String LINE_ID ;
	
	private String LINE_NAME ; //线路名
	
	private String LINE_ADDRESS ;
	
	
	private String PARENT_LINE ;
	
	private String PARENT_LINE_NAME ;
	
	private Integer POSTION_NUM ; //在父线路中的序号 从1开始，相当于top
	
	private String COLOR ;
	
	//xgq 2012.11,19 图片字段
	private String LINE_PIC ;
	
	private String LINE_TYPE ;
	
	private String CMA_ID;
	
	private Integer LINE_SHOW ;
	
	//xgq 20121204
	private BigDecimal CENTER_POINT_X ;
	
	//xgq 20121204
	private BigDecimal CENTER_POINT_Y ;
	
	//xgq 20121204
	private Integer POINT_COUNT ;
	
	//@Temp
	private String SUB_ITEM ;  // 1为线路，2为监测点
	
	//@Temp //xgq 20121204
	private Integer SUB_COUNT ;
	
	
	
	//20121204 xgq 线路报警状态
	//@Temp
	private String  ALARM_TYPE ; //up,down,gray,green
	
	
	//xgq 20121204
	private Integer ZOOM ;
	
	private BigDecimal MAX_Y ;
	
	private BigDecimal MAX_X ;
	
	private BigDecimal MIN_Y ;
	
	private BigDecimal MIN_X ;
	
	
	
	
	
	public BigDecimal getMAX_Y() {
		return MAX_Y;
	}

	public void setMAX_Y(BigDecimal max_y) {
		MAX_Y = max_y;
	}

	public BigDecimal getMAX_X() {
		return MAX_X;
	}

	public void setMAX_X(BigDecimal max_x) {
		MAX_X = max_x;
	}

	public BigDecimal getMIN_Y() {
		return MIN_Y;
	}

	public void setMIN_Y(BigDecimal min_y) {
		MIN_Y = min_y;
	}

	public BigDecimal getMIN_X() {
		return MIN_X;
	}

	public void setMIN_X(BigDecimal min_x) {
		MIN_X = min_x;
	}

	public Integer getZOOM() {
		return ZOOM;
	}

	public void setZOOM(Integer zoom) {
		ZOOM = zoom;
	}

	public String getALARM_TYPE() {
		return ALARM_TYPE;
	}

	public void setALARM_TYPE(String alarm_type) {
		ALARM_TYPE = alarm_type;
	}

	public Integer getPOINT_COUNT() {
		return POINT_COUNT;
	}

	public void setPOINT_COUNT(Integer point_count) {
		POINT_COUNT = point_count;
	}

	public String getPARENT_LINE() {
		return PARENT_LINE;
	}

	public void setPARENT_LINE(String parent_line) {
		PARENT_LINE = parent_line;
	}

	public String getPARENT_LINE_NAME() {
		return PARENT_LINE_NAME;
	}

	public void setPARENT_LINE_NAME(String parent_line_name) {
		PARENT_LINE_NAME = parent_line_name;
	}
	
	
	
	public BigDecimal getCENTER_POINT_X() {
		return CENTER_POINT_X;
	}

	public void setCENTER_POINT_X(BigDecimal center_point_x) {
		CENTER_POINT_X = center_point_x;
	}

	public BigDecimal getCENTER_POINT_Y() {
		return CENTER_POINT_Y;
	}

	public void setCENTER_POINT_Y(BigDecimal center_point_y) {
		CENTER_POINT_Y = center_point_y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LINE_ID == null) ? 0 : LINE_ID.hashCode());
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
		final TBL_LINES other = (TBL_LINES) obj;
		if (LINE_ID == null) {
			if (other.LINE_ID != null)
				return false;
		} else if (!LINE_ID.equals(other.LINE_ID))
			return false;
		return true;
	}

	public String getSUB_ITEM() {
		return SUB_ITEM;
	}

	public void setSUB_ITEM(String sub_item) {
		SUB_ITEM = sub_item;
	}

	public Integer getSUB_COUNT() {
		return SUB_COUNT;
	}

	public void setSUB_COUNT(Integer sub_count) {
		SUB_COUNT = sub_count;
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

	public String getLINE_ADDRESS() {
		return LINE_ADDRESS;
	}

	public void setLINE_ADDRESS(String line_address) {
		LINE_ADDRESS = line_address;
	}

	

	

	public Integer getPOSTION_NUM() {
		return POSTION_NUM;
	}

	public void setPOSTION_NUM(Integer postion_num) {
		POSTION_NUM = postion_num;
	}

	

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String color) {
		COLOR = color;
	}

	public String getLINE_PIC() {
		return LINE_PIC;
	}

	public void setLINE_PIC(String line_pic) {
		LINE_PIC = line_pic;
	}

	public String getLINE_TYPE() {
		return LINE_TYPE;
	}

	public void setLINE_TYPE(String line_type) {
		LINE_TYPE = line_type;
	}
	
	public String getCMA_ID() {
		return CMA_ID;
	}

	public void setCMA_ID(String cma_id) {
		CMA_ID = cma_id;
	}
	
	public Integer getLINE_SHOW() {
		return LINE_SHOW;
	}

	public void setLINE_SHOW(Integer line_show) {
		LINE_SHOW = line_show;
	}
	
	
	
	
	
}
