package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_PROTOCOL;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Oct 6, 2012 2:01:09 PM 
 * ��˵��: 
 */
public interface TBL_PROTOCOLService extends JdbcDAO<TBL_PROTOCOL> {

	//根据监测点ID判断监测点是否存在协议
	public  boolean isexistsprotocol(String pointsID);
}
