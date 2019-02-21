package com.clgs.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.jdae.ds.JdaePersistence;
import org.springframework.jdae.init.Jdae;
import com.clgs.service.CORE;
import com.clgs.service.TBL_GROUPService;
import com.clgs.entity.TBL_DATAPOWER;
import com.clgs.entity.TBL_GROUP;
import com.clgs.entity.TBL_LINES;
import com.clgs.entity.TBL_POINTS;
import com.clgs.entity.TBL_USER;
import com.clgs.pojo.VIEW_DATAPOWER;
import com.clgs.utils.CommUtil;
import com.clgs.utils.KongUtil;

/** 
 * @author ���� E-mail: xgqman@126.com
 * @version ����ʱ�䣺Aug 18, 2012 9:28:17 PM 
 * ��˵��: 
 */
@org.springframework.stereotype.Service
public class TBL_GROUPServiceBean2 extends JdbcDAOSupport<CORE, TBL_GROUP> implements TBL_GROUPService {
	
	
	public static void main(String[] args) {
		Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
		StringBuffer generatedText = new StringBuffer();

		//Service.get(TBL_GROUPServiceBean.class).showGroupLine(generatedText, null);
		JdaePersistence.closeThreadLocalConnection("clgs");
		System.out.println(generatedText);

	}
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * ����Ȩ�޷����ʱ��ҳ��ݹ����
	 * @param generatedText
	 * @param groupId
	 */

	public void showGroupLineMenu(StringBuffer generatedText, String groupId) {
		
		
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
		List<TBL_GROUP> tbl_groups = null;
		
		if (groupId == null) {

			whereql.append(" o.PARENT_GROUP_ID IS NULL ");
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, null, null, orderby);

		} else {
			whereql.append(" o.PARENT_GROUP_ID =?");
			queryParams.add(groupId);
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}
		
		//if (groupId != null)
		//	generatedText.append("<ul>");
		
		if (KongUtil.isNotNull(tbl_groups)) {
			
			generatedText.append("<div class='subTree active'>");
			for (TBL_GROUP tbl_group : tbl_groups) {
				
				
				generatedText.append("<a class='treeNode' href='#'><i class='down'></i>"+tbl_group.getGROUP_NAME()+"</a>");
				
				//�ݹ����
				showGroupLineMenu(generatedText, tbl_group.getGROUP_ID());
				
				
				
			}
			generatedText.append("</div>");
			
		}
		
		 showGroupLineMenu2(generatedText, groupId);
		//if (groupId != null)
		//	generatedText.append("</ul>");

		
		
	}
	
	
	private  void showGroupLineMenu2(StringBuffer generatedText, String parentId){
		
		
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("LINE_ID", "ASC");
		whereql.append(" o.GROUP_ID =?");
		queryParams.add(parentId);
		String sql ="select  D.GROUP_ID,D.LINE_ID,L.LINE_NAME FROM TBL_LINES L,TBL_DATAPOWER D WHERE L.LINE_ID=D.LINE_ID AND D.GROUP_ID=? ORDER BY L.LINE_ID ASC " ;
		
		List<VIEW_DATAPOWER> tbl_datapowers = Service.get(TBL_DATAPOWERServiceBean.class).getListBySql(VIEW_DATAPOWER.class, -1, -1, sql, new Object[]{parentId});
		
		
		if(KongUtil.isNotNull(tbl_datapowers)) {
			
			generatedText.append("<div class='subTree active'>");
			for (VIEW_DATAPOWER tbl_datapower : tbl_datapowers) {
				
				generatedText.append("<a href='#'><i></i><input type='checkbox' class='lineBox' checked='checked' name='line_ids'  value='"+tbl_datapower.getLINE_ID()+"' /><input class='hide' type='radio' />"+tbl_datapower.getLINE_NAME()+"</a>");

			}
			generatedText.append("</div>");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////
	
	

	/**
	 * ����Ȩ�޷����ʱ��ҳ��ݹ����
	 * @param generatedText
	 * @param groupId
	 */

	public void showGroupLine(Set<String> line_ids, StringBuffer generatedText, String groupId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
		List<TBL_GROUP> tbl_groups = null;
		
		
		if (groupId == null) {

			whereql.append(" o.PARENT_GROUP_ID IS NULL ");
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, null, null, orderby);

		} else {
			whereql.append(" o.PARENT_GROUP_ID =?");
			queryParams.add(groupId);
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}
		
		if (groupId != null)
			generatedText.append("<ul>");
		if (KongUtil.isNotNull(tbl_groups)) {
			
			
			for (TBL_GROUP tbl_group : tbl_groups) {
				
				generatedText.append("<li ><input  type='radio' selected='selected' name='parent_group_id' value='" + tbl_group.getGROUP_ID() + "' >" + tbl_group.getGROUP_NAME());
				
				//�ݹ����
				showGroupLine(line_ids,generatedText, tbl_group.getGROUP_ID());

				generatedText.append("</li>");

			}
			
			
		}
		showGroupLine2(line_ids,generatedText, groupId);
		if (groupId != null)
			generatedText.append("</ul>");

	}
	
	private  void showGroupLine2(Set<String> line_ids,StringBuffer generatedText, String parentId){
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("LINE_ID", "ASC");
		whereql.append(" o.GROUP_ID =?");
		queryParams.add(parentId);
		String sql ="select  D.GROUP_ID,D.LINE_ID,L.LINE_NAME FROM TBL_LINES L,TBL_DATAPOWER D WHERE L.LINE_ID=D.LINE_ID AND D.GROUP_ID=? ORDER BY L.LINE_ID ASC " ;
		
		List<VIEW_DATAPOWER> tbl_datapowers = Service.get(TBL_DATAPOWERServiceBean.class).getListBySql(VIEW_DATAPOWER.class, -1, -1, sql, new Object[]{parentId});
		
		
		if(KongUtil.isNotNull(tbl_datapowers)) {
				generatedText.append("<ul>");
				for (VIEW_DATAPOWER tbl_datapower : tbl_datapowers) {
					line_ids.add(tbl_datapower.getLINE_ID());
					generatedText.append("<li ><input type='checkbox' readonly checked='checked'  value='" + tbl_datapower.getLINE_ID() + "' >" + tbl_datapower.getLINE_NAME());
	
					generatedText.append("</li>");
	
				}
				generatedText.append("</ul>");
		}
	}
	
	/////////////////////////////////////////////////////
	/**
	 * �޸�Ⱥ��ʱ��
	 */
	public void showGroup( StringBuffer generatedText, String groupId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
		List<TBL_GROUP> tbl_groups = null;
		
		
		if (groupId == null) {

			whereql.append(" o.PARENT_GROUP_ID IS NULL ");
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, null, null, orderby);

		} else {
			whereql.append(" o.PARENT_GROUP_ID =?");
			queryParams.add(groupId);
			tbl_groups = Service.get(TBL_GROUPServiceBean2.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}
		
		if (groupId != null)
			generatedText.append("<ul>");
		if (KongUtil.isNotNull(tbl_groups)) {
			
			
			for (TBL_GROUP tbl_group : tbl_groups) {
				
				generatedText.append("<li ><input  type='radio'  name='parent_group_id' value='" + tbl_group.getGROUP_ID() +"@"+ tbl_group.getGROUP_NAME()+"' >" + tbl_group.getGROUP_NAME());
				
				//�ݹ����
				showGroup(generatedText, tbl_group.getGROUP_ID());

				generatedText.append("</li>");

			}
			
			
		}
		
		if (groupId != null)
			generatedText.append("</ul>");

	}
	
	/******************************************************************
	 * 
	 *�������
	 * 
	 * *****/
	//��Ⱥ�����ṹ
	public String BindGroupTree(){
      return BindSubGroup("", 0);
	}
    public  String BindSubGroup(String parentid,int count){
    	StringBuffer sqlStr=new StringBuffer("1=1");
        if(KongUtil.isNotNull(parentid)){sqlStr.append(" and PARENT_GROUP_ID='"+parentid+"'");}
        List<TBL_GROUP>  lists=Service.get(TBL_GROUPService.class).getListByCondition(-1, -1, sqlStr, null, null);
        if(lists==null||lists.size()==0)return "";
        String strResult="";
        for (TBL_GROUP tbl_group : lists) {
			strResult+=GetOptionStr(tbl_group.getGROUP_ID(),CommUtil.MakeSeparator(count, "��")+tbl_group.getGROUP_NAME());
			strResult+=BindSubGroup(tbl_group.getGROUP_ID(), count+1);
		}
        return strResult;
    }
	public String GetOptionStr(String ID,String Name){
		return "<option value="+ID+" >"+Name+"</option>";
	}
	
	
	public String GetGroupName(String group_id){
		try{
		    TBL_GROUP _model=Service.get(TBL_GROUPServiceBean.class).getFieldValue(TBL_GROUP.class, "GROUP_NAME", "GROUP_ID", group_id);
			if(_model==null)return "";
			return _model.getGROUP_NAME();
		}catch(Exception dd){dd.printStackTrace();return "";}
	}
}
