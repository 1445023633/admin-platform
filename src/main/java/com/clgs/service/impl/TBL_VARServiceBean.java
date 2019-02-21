package com.clgs.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;

import com.clgs.entity.TBL_VAR;
import com.clgs.service.CORE;
import com.clgs.service.TBL_VARService;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 21, 2012 11:23:13 PM 
 * ��˵��: 
 */
public class TBL_VARServiceBean extends JdbcDAOSupport<CORE, TBL_VAR> implements TBL_VARService {
	//根据用户公司ID获得对应变量表中的变量字段
	public String GetFirstVarValue(String selCloumn,String strWhere,String Company_ID){
		try{
			List<String> lists = Service.get(TBL_VARServiceBean.class).getSelectedListByCondition(String.class,selCloumn,0,1,new StringBuffer(strWhere),null,null);
			if(KongUtil.isNull(lists)||lists.size()==0)return null;
			return lists.get(0);
		}catch(Exception d){return null;}
	}
	//根据用户公司ID获得对应变量表中的变量字段
	public String GetFirstVarValue(String selCloumn,String strWhere,HttpServletRequest request){
		String strCompanyID="-1";//获得用户的公司名称
		return GetFirstVarValue(selCloumn,strWhere,strCompanyID);
	}
}
