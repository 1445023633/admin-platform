package com.clgs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import com.clgs.service.CORE;
import com.clgs.service.TBL_USER_FEATUREService;
import com.clgs.entity.TBL_USER;
import com.clgs.entity.TBL_USER_FEATURE;
import com.clgs.utils.KongUtil;
import com.clgs.utils.MD5;

public class TBL_USER_FEATUREServiceBean extends JdbcDAOSupport<CORE, TBL_USER_FEATURE> implements TBL_USER_FEATUREService {
	
	
	public boolean exists(String user_id, String feature_id){
		try{
			int count=Service.get(TBL_USER_FEATUREServiceBean.class).getCountByCondition(new StringBuffer(" USER_ID='"+user_id+"' and FEATURE_ID='"+feature_id+"'"), null,null);
			return count>0;
		}catch(Exception d){return true;}
	}
	
	public TBL_USER_FEATURE GetUserFeature(String user_id, String feature_id){
		try{
			List lists=Service.get(TBL_USER_FEATUREServiceBean.class).getListByCondition(-1, -1,new StringBuffer(" USER_ID='"+user_id+"' and FEATURE_ID='"+feature_id+"'"), null,null);
			if(KongUtil.isNotNull(lists))return (TBL_USER_FEATURE)lists.get(0);
			return null;
		}catch(Exception d){return null;}
	}
}
