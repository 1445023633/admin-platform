package com.clgs.service.impl;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import com.clgs.service.CORE;
import com.clgs.service.TBL_GUIDEService;
import com.clgs.entity.TBL_GUIDE;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 27, 2012 11:03:33 PM 
 * ��˵��: 
 */
public class TBL_GUIDEServiceBean extends JdbcDAOSupport<CORE, TBL_GUIDE> implements TBL_GUIDEService {

	
	//�Ƿ����ģ��
	public boolean exist(String sqlWhere){
		try{
		String strSql="  1=1";
		if(KongUtil.isNotNull(sqlWhere)){strSql+=" and "+sqlWhere;}
		return Service.get(TBL_GUIDEServiceBean.class).getCountByCondition(new StringBuffer(strSql), null,true)>0;
		}catch(Exception dd){return true;}
	}
}
