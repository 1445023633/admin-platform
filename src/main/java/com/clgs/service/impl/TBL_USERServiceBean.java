package com.clgs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdae.access.pool.JdbcDAOSupport;

import com.clgs.entity.TBL_USER;
import com.clgs.service.CORE;
import com.clgs.service.TBL_USERService;
import com.clgs.utils.MD5;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 18, 2012 4:24:15 PM 
 * ��˵��: 
 */
public class TBL_USERServiceBean extends JdbcDAOSupport<CORE, TBL_USER> implements TBL_USERService {
	
	
	
	public void save(TBL_USER t, Boolean... isClose) {
		
		t.setPASSWORD(MD5.MD5Encode(MD5.MD5Encode(t.getPASSWORD())));
		super.save(t, isClose);
	}
	
	
	public void update(TBL_USER t, Boolean... isClose) {
		
		super.update(t, isClose);
	}
	
	
	/**
	 * /**
	 * �ж��û����������Ƿ���ȷ
	 */
	
	public boolean validate(String manager_id, String password){
		password=MD5.MD5Encode(MD5.MD5Encode(password));
		System.out.println("password:"+password);
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		
		whereql.append(" o.USER_NAME=? and o.PASSWORD=? ");
		queryParams.add(manager_id);
		queryParams.add(password);
		
		return  this.getCountByCondition(whereql, queryParams)>0;
	}
	
	
	
}
