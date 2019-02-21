package com.clgs.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.jdae.ds.JdaePersistence;
import org.springframework.jdae.init.Jdae;
import com.clgs.service.CORE;
import com.clgs.entity.TBL_CATALOG;
import com.clgs.entity.TBL_GROUP;
import com.clgs.entity.TBL_CATALOGService;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 27, 2012 10:00:18 PM 
 * ��˵��: 
 */
public class TBL_CATALOGServiceBean extends JdbcDAOSupport<CORE, TBL_CATALOG> implements TBL_CATALOGService {
	
	
	public static void main(String[] args) {
		Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
		StringBuffer generatedText = new StringBuffer();

		Service.get(TBL_CATALOGServiceBean.class).showCatalog(generatedText, null);
		JdaePersistence.closeThreadLocalConnection("clgs");
		System.out.println(generatedText);

	}

	/**
	 * ��ʾ��·
	 * @param generatedText
	 * @param parentId
	 */

	public void showCatalog(StringBuffer generatedText, String parentId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("CATALOG_ID", "ASC");
		List<TBL_CATALOG> tbl_catalogs = null;
		if (parentId == null) {

			whereql.append(" o.PARENT_CATALOG is null");
			tbl_catalogs = Service.get(TBL_CATALOGServiceBean.class).getListByCondition(-1, -1, whereql, null, orderby);

		} else {
			whereql.append(" o.PARENT_CATALOG =?");
			queryParams.add(parentId);
			tbl_catalogs = Service.get(TBL_CATALOGServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}

		if (KongUtil.isNotNull(tbl_catalogs)) {
			if (parentId != null)
				generatedText.append("<ul>");
			for (TBL_CATALOG tbl_catalog : tbl_catalogs) {

				generatedText.append("<li ><input type='radio' name='parent_catalog' value='" + tbl_catalog.getCATALOG_ID() + "' value2='" + tbl_catalog.getCATALOG_NAME() + "' >" + tbl_catalog.getCATALOG_NAME());

				showCatalog(generatedText, tbl_catalog.getCATALOG_ID());

				generatedText.append("</li>");

			}
			if (parentId != null)
				generatedText.append("</ul>");
		}

	}
	

	//����ָ���������
	public String GetCatologName(String group_id){
		try{
			System.out.println("group_ID");
		    TBL_CATALOG _model=Service.get(TBL_CATALOGServiceBean.class).get("CATALOG_ID", group_id);
			if(_model==null)return "";
			return _model.getCATALOG_NAME();
		}catch(Exception dd){return "";}
	}
	
	
}
