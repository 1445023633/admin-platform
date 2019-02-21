package com.clgs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class TBL_CATALOG  implements Serializable{
	
//	//@PK
	@Id
	private String CATALOG_ID ;
	
	private String CATALOG_CODE ; //�������
	
	private String CATALOG_NAME ; //�������
	
	private String PARENT_CATALOG ; //������ID
	
	private String PARENT_CATALOG_NAME ; //���������
	
//	//@Temp
	private ArrayList<String> guide_codes = new ArrayList<String>();
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CATALOG_ID == null) ? 0 : CATALOG_ID.hashCode());
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
		final TBL_CATALOG other = (TBL_CATALOG) obj;
		if (CATALOG_ID == null) {
			if (other.CATALOG_ID != null)
				return false;
		} else if (!CATALOG_ID.equals(other.CATALOG_ID))
			return false;
		return true;
	}

	public String getCATALOG_ID() {
		return CATALOG_ID;
	}

	public void setCATALOG_ID(String catalog_id) {
		CATALOG_ID = catalog_id;
	}

	public String getCATALOG_CODE() {
		return CATALOG_CODE;
	}

	public void setCATALOG_CODE(String catalog_code) {
		CATALOG_CODE = catalog_code;
	}

	public String getCATALOG_NAME() {
		return CATALOG_NAME;
	}

	public void setCATALOG_NAME(String catalog_name) {
		CATALOG_NAME = catalog_name;
	}

	public String getPARENT_CATALOG() {
		return PARENT_CATALOG;
	}

	public void setPARENT_CATALOG(String parent_catalog) {
		PARENT_CATALOG = parent_catalog;
	}

	public String getPARENT_CATALOG_NAME() {
		return PARENT_CATALOG_NAME;
	}

	public void setPARENT_CATALOG_NAME(String parent_catalog_name) {
		PARENT_CATALOG_NAME = parent_catalog_name;
	}

	public ArrayList<String> getGuide_codes() {
		return guide_codes;
	}

	public void setGuide_codes(ArrayList<String> guide_codes) {
		this.guide_codes = guide_codes;
	}

	
	

	
	
}
