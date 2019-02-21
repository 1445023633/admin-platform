package com.clgs.service.impl;

import java.util.List;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import com.clgs.service.CORE;
import com.clgs.service.TBL_PROTOCOLService;
import com.clgs.entity.TBL_PROTOCOL;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Oct 6, 2012 2:01:38 PM 
 * ��˵��: 
 */
public class TBL_PROTOCOLServiceBean extends JdbcDAOSupport<CORE, TBL_PROTOCOL> implements TBL_PROTOCOLService {
	//根据监测点ID判断监测点是否存在协议
	public  boolean isexistsprotocol(String pointsID){
		try{
		String sql ="select distinct count(*) FROM TBL_PROTOCOL  where  POINTS_ID='"+pointsID+"'" ;
		List<Long> lists = Service.get(TBL_PROTOCOLServiceBean.class).getBasicListBySql(Long.class,-1,-1,sql,null);
		
		return KongUtil.isNull(lists)||lists.size()==0?false:lists.get(0).intValue()==0?false:true;
		}catch(Exception d){return true;}
	}
}
