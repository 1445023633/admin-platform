package com.clgs.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdae.access.pool.JdbcDAO;

import com.clgs.entity.TBL_VAR;


/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 21, 2012 11:22:50 PM 
 * ��˵��: 
 */
public interface TBL_VARService extends JdbcDAO<TBL_VAR> {

	//根据用户公司ID获得对应变量表中的变量字段
	public String GetFirstVarValue(String selCloumn,String strWhere,String Company_ID);
	//根据用户公司ID获得对应变量表中的变量字段
	public String GetFirstVarValue(String selCloumn,String strWhere,HttpServletRequest request);
}
