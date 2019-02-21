package com.clgs.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_POINTS  implements Serializable{
	
	
	//@PK
	@Id
	private String POINT_ID ; //���
	
	private String POINT_NAME ; //������
	
	private String POINT_ADDRESS ; //���ڵ�ַ
	
	private BigDecimal POINT_X ; //����X
	
	private BigDecimal POINT_Y ; //����Y
	
	private String POINT_CODE ; //Ӳ�����룬��ʱ����Ҫ��
	
	private String PROTOCOL ; //ͨ��Э��:GPRS,COM���ݲ���
	
	private String BIND_TEL ; //�󶨵��ֻ�����
	
	private String SERVER_IP ; // �ɼ�������IP
	
	private String SERVER_PORT ; //�ɼ��������˿�
	
	
	private String PARENT_LINE ; // ����·ID
	
	private String PARENT_LINE_NAME ; // ����·
	
	private Integer PARENT_NUM ; // �ڸ���·�е����
	
	
	private String  NEXT_POINT_ID ; //��һ������
	
	private BigDecimal NEXT_POINT_X ; //��һ����X
	
	private BigDecimal NEXT_POINT_Y ; //��һ����Y
	
	private String COLOR ;  //������·��ɫ
	
	private String POINT_ONLINE ; 
	
	private String POINT_NOTE; //��ע
	
	/**
	 * �����ֶ�
	 */
	
	
	private String PACKAGE_HEAD;//��������ͷ
	  
	
	private String QUERY_CMD;//�����ѯ����
	  
	
	private String CONTROL_CMD;//�����������
	  
	
	private String POINT_TYPE;//��������(GPRS��COM����)
	
	private String POINT_SHOW_TYPE;//ǰ̨չʾ����
	
     //20121002
	private Integer DATA_LENGTH ; //�������ݳ���
	
	  //20121002
	private String SMS_PHONE ; //�����쳣ʱ���Ͷ����ֻ�����
	

	private Integer QUERY_INTERVAL ; //��ѯ���� ��λΪ����
	
	private String HEARTBEAT_CONTENT ; //����������; 
	
	private String ISSENDMSG = "1" ; ////�Ƿ��Ͷ���
	private String YOUXIAO="1";
	
	//@Temp
	private String CONTENT ;

	
	
	
	//@Temp //���չʾ��
	private Date DATA_TIME ;
	
	
	
	
	

	public String getISSENDMSG() {
		return ISSENDMSG;
	}


	public String getYOUXIAO() {
		return YOUXIAO;
	}


	public void setYOUXIAO(String youxiao) {
		YOUXIAO = youxiao;
	}


	public void setISSENDMSG(String issendmsg) {
		ISSENDMSG = issendmsg;
	}


	public Integer getQUERY_INTERVAL() {
		return QUERY_INTERVAL;
	}


	public void setQUERY_INTERVAL(Integer query_interval) {
		QUERY_INTERVAL = query_interval;
	}


	public String getHEARTBEAT_CONTENT() {
		return HEARTBEAT_CONTENT;
	}


	public void setHEARTBEAT_CONTENT(String heartbeat_content) {
		HEARTBEAT_CONTENT = heartbeat_content;
	}


	public Date getDATA_TIME() {
		return DATA_TIME;
	}


	public void setDATA_TIME(Date data_time) {
		DATA_TIME = data_time;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((POINT_ID == null) ? 0 : POINT_ID.hashCode());
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
		final TBL_POINTS other = (TBL_POINTS) obj;
		if (POINT_ID == null) {
			if (other.POINT_ID != null)
				return false;
		} else if (!POINT_ID.equals(other.POINT_ID))
			return false;
		return true;
	}


	public String getPOINT_ID() {
		return POINT_ID;
	}


	public void setPOINT_ID(String point_id) {
		POINT_ID = point_id;
	}


	public String getPOINT_NAME() {
		return POINT_NAME;
	}


	public void setPOINT_NAME(String point_name) {
		POINT_NAME = point_name;
	}


	public String getPOINT_ADDRESS() {
		return POINT_ADDRESS;
	}


	public void setPOINT_ADDRESS(String point_address) {
		POINT_ADDRESS = point_address;
	}


	public BigDecimal getPOINT_X() {
		return POINT_X;
	}


	public void setPOINT_X(BigDecimal point_x) {
		POINT_X = point_x;
	}


	public BigDecimal getPOINT_Y() {
		return POINT_Y;
	}


	public void setPOINT_Y(BigDecimal point_y) {
		POINT_Y = point_y;
	}


	public String getPOINT_CODE() {
		return POINT_CODE;
	}


	public void setPOINT_CODE(String point_code) {
		POINT_CODE = point_code;
	}


	public String getPROTOCOL() {
		return PROTOCOL;
	}


	public void setPROTOCOL(String protocol) {
		PROTOCOL = protocol;
	}


	public String getBIND_TEL() {
		return BIND_TEL;
	}


	public void setBIND_TEL(String bind_tel) {
		BIND_TEL = bind_tel;
	}


	public String getSERVER_IP() {
		return SERVER_IP;
	}


	public void setSERVER_IP(String server_ip) {
		SERVER_IP = server_ip;
	}


	public String getSERVER_PORT() {
		return SERVER_PORT;
	}


	public void setSERVER_PORT(String server_port) {
		SERVER_PORT = server_port;
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


	public Integer getPARENT_NUM() {
		return PARENT_NUM;
	}


	public void setPARENT_NUM(Integer parent_num) {
		PARENT_NUM = parent_num;
	}


	public String getNEXT_POINT_ID() {
		return NEXT_POINT_ID;
	}


	public void setNEXT_POINT_ID(String next_point_id) {
		NEXT_POINT_ID = next_point_id;
	}


	public BigDecimal getNEXT_POINT_X() {
		return NEXT_POINT_X;
	}


	public void setNEXT_POINT_X(BigDecimal next_point_x) {
		NEXT_POINT_X = next_point_x;
	}


	public BigDecimal getNEXT_POINT_Y() {
		return NEXT_POINT_Y;
	}


	public void setNEXT_POINT_Y(BigDecimal next_point_y) {
		NEXT_POINT_Y = next_point_y;
	}


	public String getCOLOR() {
		return COLOR;
	}


	public void setCOLOR(String color) {
		COLOR = color;
	}


	public String getPACKAGE_HEAD() {
		return PACKAGE_HEAD;
	}


	public void setPACKAGE_HEAD(String package_head) {
		PACKAGE_HEAD = package_head;
	}


	public String getQUERY_CMD() {
		return QUERY_CMD;
	}


	public void setQUERY_CMD(String query_cmd) {
		QUERY_CMD = query_cmd;
	}


	public String getCONTROL_CMD() {
		return CONTROL_CMD;
	}


	public void setCONTROL_CMD(String control_cmd) {
		CONTROL_CMD = control_cmd;
	}


	public String getPOINT_TYPE() {
		return POINT_TYPE;
	}


	public void setPOINT_TYPE(String point_type) {
		POINT_TYPE = point_type;
	}

	public String getPOINT_SHOW_TYPE() {
		return POINT_SHOW_TYPE;
	}


	public void setPOINT_SHOW_TYPE(String point_show_type) {
		POINT_SHOW_TYPE = point_show_type;
	}


	public Integer getDATA_LENGTH() {
		return DATA_LENGTH;
	}


	public void setDATA_LENGTH(Integer data_length) {
		DATA_LENGTH = data_length;
	}


	public String getSMS_PHONE() {
		return SMS_PHONE;
	}


	public void setSMS_PHONE(String sms_phone) {
		SMS_PHONE = sms_phone;
	}


	public String getCONTENT() {
		return CONTENT;
	}


	public void setCONTENT(String content) {
		CONTENT = content;
	}
	
	public String getPOINT_ONLINE() {
		return POINT_ONLINE;
	}

	public void setPOINT_ONLINE(String point_online) {
		POINT_ONLINE = point_online;
	}
	
	public String getPOINT_NOTE() {
		return POINT_NOTE;
	}

	public void setPOINT_NOTE(String point_note) {
		POINT_NOTE = point_note;
	}
	
	
}
