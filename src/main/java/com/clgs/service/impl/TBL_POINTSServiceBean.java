package com.clgs.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.jdae.ds.JdaePersistence;
import org.springframework.jdae.init.Jdae;
import com.clgs.service.CORE;
import com.clgs.entity.TBL_LINES;
import com.clgs.entity.TBL_POINTS;
import com.clgs.service.TBL_POINTSService;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 19, 2012 11:11:21 PM 
 * ��˵��: 
 */
public class TBL_POINTSServiceBean extends JdbcDAOSupport<CORE, TBL_POINTS> implements TBL_POINTSService {
	
		
	
	public static void main(String[] args) {
		Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
		StringBuffer generatedText = new StringBuffer();

		Service.get(TBL_POINTSServiceBean.class).showPointsByLine(generatedText, null);
		JdaePersistence.closeThreadLocalConnection("clgs");
		System.out.println(generatedText);

	}

	/**
	 * ��ʾ��·
	 * @param generatedText
	 * @param parentId
	 */
	 
	/**
	 * ��ʾ��·�µ����������
	 */
	public void showPointsByLine(StringBuffer generatedText, String parentId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("LINE_ID", "ASC");
		List<TBL_LINES> tbl_lineses = null;
		if (parentId == null) {

			whereql.append(" o.PARENT_LINE is null");
			tbl_lineses = Service.get(TBL_LINESServiceBean.class).getListByCondition(-1, -1, whereql, null, orderby);

		} else {
			whereql.append(" o.PARENT_LINE =?");
			queryParams.add(parentId);
			tbl_lineses = Service.get(TBL_LINESServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}

		if (KongUtil.isNotNull(tbl_lineses)) {
			if (parentId != null)
				generatedText.append("<ul>");
			for (TBL_LINES tbl_line : tbl_lineses) {

				generatedText.append("<li >" + tbl_line.getLINE_NAME());

				showPointsByLine(generatedText, tbl_line.getLINE_ID());
				
				generatedText.append("<ul>");
				showPoints(generatedText, tbl_line.getLINE_ID());
				generatedText.append("</ul>");
				
				generatedText.append("</li>");

			}
			if (parentId != null)
				generatedText.append("</ul>");
		}

	}
	
	/**
	 * ��ʾ��·�µĵ�
	 * @param generatedText
	 * @param parentId
	 */
	public void showPoints(StringBuffer generatedText, String parentId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("POINT_ID", "ASC");
		List<TBL_POINTS> tbl_points = null;
		
		whereql.append(" o.PARENT_LINE =?");
	     queryParams.add(parentId);
		 tbl_points = Service.get(TBL_POINTSServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		

		if (KongUtil.isNotNull(tbl_points)) {
			
			for (TBL_POINTS tbl_point : tbl_points) {

				generatedText.append("<li ><input type='checkbox' name='point_id' value='" + tbl_point.getPOINT_ID() + "' value2='" + tbl_point.getPOINT_NAME() + "' >" + tbl_point.getPOINT_NAME());

				generatedText.append("</li>");

			}
			
		}

	}
	
}
