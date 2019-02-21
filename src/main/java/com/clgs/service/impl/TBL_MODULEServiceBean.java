package com.clgs.service.impl;

import java.util.Properties;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.jdae.ds.JdaePersistence;
import org.springframework.jdae.init.Jdae;

import com.clgs.entity.TBL_MODULE;
import com.clgs.entity.TBL_MODULE_TYPE;
import com.clgs.entity.TBL_VAR;
import com.clgs.service.CORE;
import com.clgs.service.TBL_MODULEService;
import com.clgs.utils.KongUtil;


public class TBL_MODULEServiceBean extends JdbcDAOSupport<CORE, TBL_MODULE> implements TBL_MODULEService {
	
	
	public static void main(String[] args) {
		Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
		

		Service.get(TBL_MODULEServiceBean.class).initModule();
		JdaePersistence.closeThreadLocalConnection("clgs");
		

	}
	
	
	public void initModule(){
			
			Service.get(TBL_USER_OPERATIONServiceBean.class).init();
			
			/**
			 * 初始化模块
			 */
			
			Service.get(TBL_MODULE_TYPEServiceBean.class).deleteByCondition(null, null, true);
			Service.get(TBL_MODULEServiceBean.class).deleteByCondition(null, null, true);
			
			
			TBL_MODULE_TYPE tbl_module_type = new TBL_MODULE_TYPE();
			
			tbl_module_type.setMODULE_TYPE_ID("jkgl");
			tbl_module_type.setMODULE_TYPE_NAME("监控管理");
			tbl_module_type.setXH(1);
			Service.get(TBL_MODULE_TYPEServiceBean.class).saveOrUpdate(tbl_module_type);
			
			TBL_MODULE tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/line/line-list.jsp");
			tbl_module.setMODULE_NAME("线路与监测点管理");
			tbl_module.setURL("/control/system/line/line-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(1);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/guide/guide-catalog-list.jsp");
			tbl_module.setMODULE_NAME("指标类别与指标管理");
			tbl_module.setURL("/control/system/guide/guide-catalog-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(2);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			
			
			tbl_module_type.setMODULE_TYPE_ID("rzgl");
			tbl_module_type.setMODULE_TYPE_NAME("日志管理");
			tbl_module_type.setXH(2);
			Service.get(TBL_MODULE_TYPEServiceBean.class).saveOrUpdate(tbl_module_type);
			
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/ararm-log-list.jsp");
			tbl_module.setMODULE_NAME("报警日志");
			tbl_module.setURL("/control/system/log/ararm-log-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(1);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/com-jc-mx.jsp");
			tbl_module.setMODULE_NAME("串口检测明细");
			tbl_module.setURL("/control/system/log/com-jc-mx.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(2);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/gprs-jc-mx.jsp");
			tbl_module.setMODULE_NAME("GPRS检测明细");
			tbl_module.setURL("/control/system/log/gprs-jc-mx.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(3);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/gprs-jc-now.jsp");
			tbl_module.setMODULE_NAME("GPRS检测当前");
			tbl_module.setURL("/control/system/log/gprs-jc-now.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(4);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/sms-send.jsp");
			tbl_module.setMODULE_NAME("短信发送");
			tbl_module.setURL("/control/system/log/sms-send.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(5);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/sms-send-mx.jsp");
			tbl_module.setMODULE_NAME("短信发送明细");
			tbl_module.setURL("/control/system/log/sms-send-mx.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(6);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/sms-revice.jsp");
			tbl_module.setMODULE_NAME("短信接收");
			tbl_module.setURL("/control/system/log/sms-revice.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(7);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/log-list.jsp");
			tbl_module.setMODULE_NAME("错误日志");
			tbl_module.setURL("/control/system/log/log-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(8);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/log/user-access-list.jsp");
			tbl_module.setMODULE_NAME("用户操作日志");
			tbl_module.setURL("/control/system/log/user-access-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(8);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			
			tbl_module_type.setMODULE_TYPE_ID("xtgl");
			tbl_module_type.setMODULE_TYPE_NAME("系统管理");
			tbl_module_type.setXH(3);
			Service.get(TBL_MODULE_TYPEServiceBean.class).saveOrUpdate(tbl_module_type);
			
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/group/group-list.jsp");
			tbl_module.setMODULE_NAME("群组管理");
			tbl_module.setURL("/control/system/group/group-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(1);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/user/user-list.jsp");
			tbl_module.setMODULE_NAME("用户管理");
			tbl_module.setURL("/control/system/user/user-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(2);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/var/var-list.jsp");
			tbl_module.setMODULE_NAME("变量管理");
			tbl_module.setURL("/control/system/var/var-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(3);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/module/group-list.jsp");
			tbl_module.setMODULE_NAME("模块管理");
			tbl_module.setURL("/control/system/module/group-list.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(4);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
			
			tbl_module = new TBL_MODULE();
			tbl_module.setMODULE_ID("/control/system/logo/line-set-ui.jsp");
			tbl_module.setMODULE_NAME("LOGO管理");
			tbl_module.setURL("/control/system/logo/line-set-ui.jsp");
			tbl_module.setMODULE_TYPE_ID(tbl_module_type.getMODULE_TYPE_ID());
			tbl_module.setXH(5);
			Service.get(TBL_MODULEServiceBean.class).saveOrUpdate(tbl_module);
			
		
		
		
		
			//Service.get(TBL_VARServiceBean.class).deleteByCondition(null, null);
	
			/**
			 * 初始化变量
			 */
			TBL_VAR  tbl_var = new TBL_VAR();
			tbl_var.setVAR_ID("centerX");
			tbl_var.setVAR_CODE("centerX");
			tbl_var.setVAR_NAME("地图默认X点");
			tbl_var.setVAR_VALUE1("28.5");
			tbl_var.setVAR_TYPE("地图相关");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("centerY");
			tbl_var.setVAR_CODE("centerY");
			tbl_var.setVAR_NAME("地图默认Y点");
			tbl_var.setVAR_VALUE1("112");
			tbl_var.setVAR_TYPE("地图相关");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("zoom");
			tbl_var.setVAR_CODE("zoom");
			tbl_var.setVAR_NAME("地图默认放大级别");
			tbl_var.setVAR_VALUE1("7");
			tbl_var.setVAR_TYPE("地图相关");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("refreshTime");
			tbl_var.setVAR_CODE("refreshTime");
			tbl_var.setVAR_NAME("地图默认刷新时间");
			tbl_var.setVAR_VALUE1("600000");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS("10分钟");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("OFF_LINE_TIME");
			tbl_var.setVAR_CODE("OFF_LINE_TIME");
			tbl_var.setVAR_NAME("监测点离线时间");
			tbl_var.setVAR_VALUE1("1800000");
			tbl_var.setREMARKS("30分钟");
			tbl_var.setVAR_TYPE("地图相关");
			
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("LINE_COLOR");
			tbl_var.setVAR_CODE("LINE_COLOR");
			tbl_var.setVAR_NAME("线路默认颜色");
			tbl_var.setVAR_VALUE1("#0000ff");
			tbl_var.setREMARKS("30分钟");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("HeartBeatContent");
			tbl_var.setVAR_CODE("HeartBeatContent");
			tbl_var.setVAR_NAME("心跳包内容");
			tbl_var.setVAR_VALUE1("$");
			tbl_var.setVAR_TYPE("GPRS");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("GprsQueryInterval");
			tbl_var.setVAR_CODE("GprsQueryInterval");
			tbl_var.setVAR_NAME("查询命令周期");
			tbl_var.setVAR_VALUE1("1");
			tbl_var.setVAR_TYPE("GPRS");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var);
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("ComQueryInterval");
			tbl_var.setVAR_CODE("ComQueryInterval");
			tbl_var.setVAR_NAME("串口查询周期");
			tbl_var.setVAR_VALUE1("2");
			tbl_var.setVAR_TYPE("COM");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			

			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("IsMapOffline");
			tbl_var.setVAR_CODE("IsMapOffline");
			tbl_var.setVAR_NAME("是否显示离线地图");
			tbl_var.setVAR_VALUE1("0");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS("显示离线地图1，不显示0 ");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			

			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("IsShowAlarm");
			tbl_var.setVAR_CODE("IsShowAlarm");
			tbl_var.setVAR_NAME("是否显示报警提示信息 ");
			tbl_var.setVAR_VALUE1("1");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS("1表示显示，0表示不显示  ");
			
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("pointCount");
			tbl_var.setVAR_CODE("pointCount");
			tbl_var.setVAR_NAME("显示集群的监测点门限值 ");
			tbl_var.setVAR_VALUE1("100");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("alarm_info_time");
			tbl_var.setVAR_CODE("alarm_info_time");
			tbl_var.setVAR_NAME("报警请求刷新时间 ");
			tbl_var.setVAR_VALUE1("5000");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("max_result");
			tbl_var.setVAR_CODE("max_result");
			tbl_var.setVAR_NAME("每页最大显示记录数 ");
			tbl_var.setVAR_VALUE1("1000");
			tbl_var.setVAR_TYPE("分页相关");
			tbl_var.setREMARKS(null);
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			tbl_var   = new TBL_VAR();
			tbl_var.setVAR_ID("showMode");
			tbl_var.setVAR_CODE("showMode");
			tbl_var.setVAR_NAME("地图默认显示模式");
			tbl_var.setVAR_VALUE1("1");
			tbl_var.setVAR_TYPE("地图相关");
			tbl_var.setREMARKS("1为线路模式，2为监测点模式");
			Service.get(TBL_VARServiceBean.class).saveOrUpdate(tbl_var,true);
			
			
		
		JdaePersistence.closeThreadLocalConnection("core");
		
	}
	
	
	//是否存在模块
	public boolean exist(String sqlWhere){
		try{
		String strSql="  1=1";
		if(KongUtil.isNotNull(sqlWhere)){strSql+=" and "+sqlWhere;}
		return Service.get(TBL_MODULEServiceBean.class).getCountByCondition(new StringBuffer(strSql), null,true)>0;
		}catch(Exception dd){return true;}
	}
	
}
