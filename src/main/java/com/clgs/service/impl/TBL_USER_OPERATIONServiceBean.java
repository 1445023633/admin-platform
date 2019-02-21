package com.clgs.service.impl;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import com.clgs.entity.TBL_USER_OPERATION;
import com.clgs.service.CORE;

/** 
 * @author 作者 E-mail: xgqman@126.com
 * @version 创建时间：Dec 3, 2012 6:11:15 PM 
 * 类说明: 
 */
public class TBL_USER_OPERATIONServiceBean extends JdbcDAOSupport<CORE, TBL_USER_OPERATION> {
	
	public void init(){
		
		TBL_USER_OPERATION tbl_user_operation = new TBL_USER_OPERATION();
		
		tbl_user_operation.setACTION_ID("/wtes/jsp/login/login.jsp");
		tbl_user_operation.setMODULE_NAME("系统登录");
		tbl_user_operation.setACTION_NAME("登录");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/group/group-add.jsp");
		tbl_user_operation.setMODULE_NAME("群组");
		tbl_user_operation.setACTION_NAME("添加");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/group/group-delete.jsp");
		tbl_user_operation.setMODULE_NAME("群组");
		tbl_user_operation.setACTION_NAME("删除");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		tbl_user_operation.setACTION_ID("/control/system/group/group-list.jsp");
		tbl_user_operation.setMODULE_NAME("群组");
		tbl_user_operation.setACTION_NAME("查看");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/group/group-modify.jsp");
		tbl_user_operation.setMODULE_NAME("群组");
		tbl_user_operation.setACTION_NAME("修改");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		/////////////////////////////////////////
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-add.jsp");
		tbl_user_operation.setMODULE_NAME("指标");
		tbl_user_operation.setACTION_NAME("添加");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-catalog-add.jsp");
		tbl_user_operation.setMODULE_NAME("指标类别");
		tbl_user_operation.setACTION_NAME("添加");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-catalog-delete.jsp");
		tbl_user_operation.setMODULE_NAME("指标类别");
		tbl_user_operation.setACTION_NAME("删除");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-catalog-list.jsp");
		tbl_user_operation.setMODULE_NAME("指标类别");
		tbl_user_operation.setACTION_NAME("查看");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-catalog-modify.jsp");
		tbl_user_operation.setMODULE_NAME("指标类别");
		tbl_user_operation.setACTION_NAME("修改");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-delete.jsp");
		tbl_user_operation.setMODULE_NAME("指标");
		tbl_user_operation.setACTION_NAME("删除");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-list.jsp");
		tbl_user_operation.setMODULE_NAME("指标");
		tbl_user_operation.setACTION_NAME("查看");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		tbl_user_operation.setACTION_ID("/control/system/guide/guide-modify.jsp");
		tbl_user_operation.setMODULE_NAME("指标");
		tbl_user_operation.setACTION_NAME("修改");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
		tbl_user_operation.setACTION_ID("/control/system/line/line-list.jsp");
		tbl_user_operation.setMODULE_NAME("线路");
		tbl_user_operation.setACTION_NAME("查看");
		Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
		
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/servlet/control/line/line-modify-servlet");
			tbl_user_operation.setMODULE_NAME("线路");
			tbl_user_operation.setACTION_NAME("修改");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
		
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/servlet/control/line/line-add-servlet");
			tbl_user_operation.setMODULE_NAME("线路");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/line/line-delete.jsp");
			tbl_user_operation.setMODULE_NAME("线路");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			
			
			tbl_user_operation.setACTION_ID("/control/system/line/point-add.jsp");
			tbl_user_operation.setMODULE_NAME("监测点");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation.setACTION_ID("/control/system/line/point-delete.jsp");
			tbl_user_operation.setMODULE_NAME("监测点");
			tbl_user_operation.setACTION_NAME("删除");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation.setACTION_ID("/control/system/line/point-list.jsp");
			tbl_user_operation.setMODULE_NAME("监测点");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation.setACTION_ID("/control/system/line/point-modify.jsp");
			tbl_user_operation.setMODULE_NAME("监测点");
			tbl_user_operation.setACTION_NAME("修改");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/line/point-list.jsp");
			tbl_user_operation.setMODULE_NAME("监测点");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/ararm-log-list.jsp");
			tbl_user_operation.setMODULE_NAME("报警日志");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/com-jc-mx.jsp");
			tbl_user_operation.setMODULE_NAME("串口监测明细");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/gprs-cmd-mx.jsp");
			tbl_user_operation.setMODULE_NAME("GPRS命令明细");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/gprs-cmd-now.jsp");
			tbl_user_operation.setMODULE_NAME("GPRS命令当前");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/gprs-jc-mx.jsp");
			tbl_user_operation.setMODULE_NAME("GPRS监测明细");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/gprs-jc-now.jsp");
			tbl_user_operation.setMODULE_NAME("GPRS监测当前");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/log-list.jsp");
			tbl_user_operation.setMODULE_NAME("日志");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/sms-revice.jsp");
			tbl_user_operation.setMODULE_NAME("短信接收");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/sms-send.jsp");
			tbl_user_operation.setMODULE_NAME("短信发送");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/sms-send-mx.jsp");
			tbl_user_operation.setMODULE_NAME("短信发送明细");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/log/user-access-list.jsp");
			tbl_user_operation.setMODULE_NAME("用户操作");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/module/module-add.jsp");
			tbl_user_operation.setMODULE_NAME("模块");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/module/module-delete.jsp");
			tbl_user_operation.setMODULE_NAME("模块");
			tbl_user_operation.setACTION_NAME("删除");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/module/module-list.jsp");
			tbl_user_operation.setMODULE_NAME("模块");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/module/module-modify.jsp");
			tbl_user_operation.setMODULE_NAME("模块");
			tbl_user_operation.setACTION_NAME("修改");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/user/user-add.jsp");
			tbl_user_operation.setMODULE_NAME("用户");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/user/user-delete.jsp");
			tbl_user_operation.setMODULE_NAME("用户");
			tbl_user_operation.setACTION_NAME("删除");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/user/user-list.jsp");
			tbl_user_operation.setMODULE_NAME("用户");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/user/user-modify.jsp");
			tbl_user_operation.setMODULE_NAME("用户");
			tbl_user_operation.setACTION_NAME("修改");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/var/var-add.jsp");
			tbl_user_operation.setMODULE_NAME("变量");
			tbl_user_operation.setACTION_NAME("增加");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
		
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/var/var-delete.jsp");
			tbl_user_operation.setMODULE_NAME("变量");
			tbl_user_operation.setACTION_NAME("删除");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/var/var-list.jsp");
			tbl_user_operation.setMODULE_NAME("变量");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/system/var/var-modify.jsp");
			tbl_user_operation.setMODULE_NAME("变量");
			tbl_user_operation.setACTION_NAME("修改");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/stastics/show-result-01.jsp");
			tbl_user_operation.setMODULE_NAME("监测点表格");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/control/stastics/show-result-02.jsp");
			tbl_user_operation.setMODULE_NAME("监测点图标");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			tbl_user_operation = new TBL_USER_OPERATION();
			tbl_user_operation.setACTION_ID("/wtes/jsp/center/show-line.jsp");
			tbl_user_operation.setMODULE_NAME("监测点线路");
			tbl_user_operation.setACTION_NAME("查看");
			Service.get(TBL_USER_OPERATIONServiceBean.class).saveOrUpdate(tbl_user_operation, true);
			
			
			
			
			
			
	}
}
