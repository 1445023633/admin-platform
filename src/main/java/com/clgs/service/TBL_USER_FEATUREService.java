package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;

import com.clgs.entity.TBL_USER_FEATURE;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 18, 2012 4:23:42 PM 
 * ��˵��: 
 */
public interface TBL_USER_FEATUREService extends JdbcDAO<TBL_USER_FEATURE> {

	//�ж��û�������ֵ�Ƿ����
	public boolean exists(String user_id, String feature_id);
	//����û�����
	public TBL_USER_FEATURE GetUserFeature(String user_id, String feature_id);
}
