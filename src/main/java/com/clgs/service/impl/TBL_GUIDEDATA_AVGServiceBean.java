package com.clgs.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;

import com.clgs.entity.TBL_GUIDEDATA_AVG;
import com.clgs.service.CORE;
import com.clgs.service.Constant;
import com.clgs.service.TBL_GUIDEDATA_AVGService;
import com.clgs.utils.DateUtil;
import com.clgs.utils.KongUtil;
import com.clgs.utils.PropUtil;


public class TBL_GUIDEDATA_AVGServiceBean extends JdbcDAOSupport<CORE, TBL_GUIDEDATA_AVG> implements TBL_GUIDEDATA_AVGService {
	
	
	/**
	 * ��ȡ��Ҫ���µ�����
	 * @return
	 */
	public List<java.sql.Date> getNeedStasticDays(){
		
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String,String> orderby = new LinkedHashMap<String,String>();
	
		
	
		
	
		Calendar calendar=Calendar.getInstance();
		//�������ָ��
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		
		//�����ϴ������
		Date currentDate = calendar.getTime(); //
		
		//���û�м������ʾʱ��
		whereql.delete(0,whereql.length());
		queryParams.clear();
		Date configStartDate = null ;
		
		try {
			configStartDate = Constant.DEFAULT_DATE_SDF.parse(PropUtil.getString("START_DATE"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    long spaceDay = DateUtil.getSpaceNumber(currentDate,configStartDate);
	    System.out.println("授权日期:" + configStartDate+"今天的日期："+currentDate+"相隔的天数："+spaceDay);
	    List<java.sql.Date> needStasticsDays = null ;
	    if(spaceDay>0){
	    	needStasticsDays = new ArrayList<java.sql.Date>();
	    	for(int i = 0;i<spaceDay;i++){
	    		System.out.println("需要上传的日期:" + Constant.DEFAULT_DATE_SDF.format(needStasticsDays));
	    		needStasticsDays.add(new java.sql.Date(DateUtil.getSpaceDateAfter(configStartDate, i).getTime()));
	    	}
	    	
	    	
	    }
		if(KongUtil.isNotNull(needStasticsDays)){
			whereql.delete(0,whereql.length());
			queryParams.clear();
			orderby.clear();
			orderby.put("DATE_ID", "ASC");
			List<java.sql.Date> logDates =  Service.get(TBL_GUIDEDATA_LOGServiceBean.class).getSelectedListByCondition(java.sql.Date.class, "DATE_ID", -1, -1, null, null, orderby);
			if(KongUtil.isNotNull(logDates)){
				needStasticsDays.removeAll(logDates); //����Ѿ��ϴ���;
			
			}
		}
		
		return needStasticsDays;
	}
}
