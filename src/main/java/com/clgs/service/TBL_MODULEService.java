package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_MODULE;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Sep 17, 2012 9:18:13 PM 
 * ��˵��: 
 */
public interface TBL_MODULEService extends JdbcDAO<TBL_MODULE> {

	//�Ƿ����ģ��
	public boolean exist(String sqlWhere);
}
