package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_CATALOG;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 27, 2012 9:59:57 PM 
 * ��˵��: 
 */
public interface TBL_CATALOGService extends JdbcDAO<TBL_CATALOG> {
    //����ָ�����ID���ָ���������
	public String GetCatologName(String group_id);
}
