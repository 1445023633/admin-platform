package com.clgs.entity;





import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TBL_GUIDEDATA_LOG  implements Serializable{
	
	//@PK
	@Id
	private java.sql.Date  DATE_ID ;
	
	public TBL_GUIDEDATA_LOG(Date date_id) {
		
		DATE_ID = date_id;
	}

	public TBL_GUIDEDATA_LOG() {
		
	}

	
	public java.sql.Date getDATE_ID() {
		return DATE_ID;
	}

	public void setDATE_ID(java.sql.Date date_id) {
		DATE_ID = date_id;
	}

	
	
	
	
	
	
	
}
