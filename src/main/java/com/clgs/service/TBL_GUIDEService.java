package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_GUIDE;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 27, 2012 11:03:12 PM 
 * ��˵��: 
 */
public interface TBL_GUIDEService extends JdbcDAO<TBL_GUIDE> {

	//�Ƿ����ģ��
	public boolean exist(String sqlWhere);
}
