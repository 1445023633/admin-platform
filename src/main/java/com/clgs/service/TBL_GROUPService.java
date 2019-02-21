package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_GROUP;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 18, 2012 9:27:57 PM 
 * ��˵��: 
 */
public interface TBL_GROUPService extends JdbcDAO<TBL_GROUP> {

	//��Ⱥ�����ṹ
	public String BindGroupTree();
	//����Ⱥ��ID���Ⱥ������
	public String GetGroupName(String group_id);
	
}
