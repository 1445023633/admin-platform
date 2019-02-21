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
 * @author 作者 E-mail: xgqman@126.com
 * @version 创建时间：Aug 18, 2012 9:28:17 PM 
 * 类说明: 
 */
public class TBL_GROUPServiceBean extends JdbcDAOSupport<CORE, TBL_GROUP> implements TBL_GROUPService {
	
	
	public static void main(String[] args) {
		Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
		StringBuffer generatedText = new StringBuffer();

		
		//new TBL_GROUPServiceBean().showGroupLineMenu(generatedText,"000000000000001",null);
		JdaePersistence.closeThreadLocalConnection("clgs");
		System.out.println(generatedText);

	}
	
	
	/**
	 * 设置自己的
	 * @param group_id
	 * @return
	 */
	public List<String> getSubGroupIds(String group_id){
		List<String> subGroupIds = new ArrayList<String>();
		subGroupIds.add(group_id);
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		whereql.append("o.PARENT_GROUP_ID=?");
		queryParams.add(group_id);
		List<String> childGroupIds = Service.get(TBL_GROUPServiceBean.class).getSelectedListByCondition(String.class,"GROUP_ID",-1, -1, whereql, queryParams, null);
		
		
		if(KongUtil.isNotNull(childGroupIds)){
			
			subGroupIds.addAll(childGroupIds);
			for(String childGroupId:childGroupIds){
				
				subGroupIds.addAll(Service.get(TBL_GROUPServiceBean.class).getSubGroupIds(childGroupId));
			}
			
		}
		
		return subGroupIds ;
	}
	
	
	public List<String> getSubGroupUserIds(String group_id){
		List<String> subGroupIds = new ArrayList<String>();
		List<String> subGroupUserIds = new ArrayList<String>();
		
		subGroupIds.add(group_id);
		
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		
		whereql.append("o.PARENT_GROUP_ID=?");
		queryParams.add(group_id);
		List<String> childGroupIds = Service.get(TBL_GROUPServiceBean.class).getSelectedListByCondition(String.class,"GROUP_ID",-1, -1, whereql, queryParams, null);
		
		whereql.delete(0, whereql.length());
		queryParams.clear();
		whereql.append("o.USER_GROUP=?");
		queryParams.add(group_id);
		
		List<String> userIds =  Service.get(TBL_USERServiceBean.class).getSelectedListByCondition(String.class,"USER_ID",-1, -1, whereql, queryParams, null);
		subGroupUserIds.addAll(userIds);
		
		if(KongUtil.isNotNull(childGroupIds)){
			subGroupIds.addAll(childGroupIds);
			for(String childGroupId:childGroupIds){
				
				subGroupIds.addAll(Service.get(TBL_GROUPServiceBean.class).getSubGroupIds(childGroupId));
			}
			
		}
		
		return userIds ;
	}
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 数据权限分配的时候，页面递归调用
	 * @param generatedText
	 * @param groupId
	 */

	public void showGroupLineMenu(StringBuffer generatedText, String groupId,String line_name,Set<String> line_ids) {
		
		if(groupId==null)return;
		//添加自身的群组  如果是 "-1"表明是根群组，不需要添加
		if(!groupId.trim().equals("-1")){
			String sqlStr=" o.GROUP_ID='"+groupId+"' order by o.GROUP_ID asc";
			List<TBL_GROUP> tbl_groups = null;
			tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, new StringBuffer(sqlStr), null, null);
			//查找对应的线路的子线路
			if (KongUtil.isNotNull(tbl_groups)) {
				for (TBL_GROUP tbl_group : tbl_groups) {
					//添加当前级
					generatedText.append("<a class='treeNode' href='#'><i></i><span></span>"+tbl_group.getGROUP_NAME()+"</a>");
				    //添加子集合 开头
				    generatedText.append("<div class='subTree'>");	
				    //添加子群组
				    showSubGroupLineMenu(generatedText,groupId,line_name,line_ids);
				    //添加封尾线
				    generatedText.append("<div class=\"line\"></div>");	
				    //添加子集合 结尾
				    generatedText.append("</div>");	
				   
				}
			}
			//查找不属于子线路中的其他线路
			showGroupLineMenu2(generatedText, groupId,line_name,line_ids);
		}else{
			//添加子群组
		    showSubGroupLineMenu(generatedText,groupId,line_name,line_ids);
		}
		
		
	}
	
	/**
	 *查找子群组
	 * @param generatedText
	 * @param groupId
	 */
	public void showSubGroupLineMenu(StringBuffer generatedText, String groupId,String line_name,Set<String> line_ids) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
		List<TBL_GROUP> tbl_groups = null;
		
		if(groupId==null)return;

		whereql.append(" o.PARENT_GROUP_ID =?");
		queryParams.add(groupId);
		tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		//查找对应的群组的子群组
		if (KongUtil.isNotNull(tbl_groups)) {
			for (TBL_GROUP tbl_group : tbl_groups) {
				//添加当前级
				generatedText.append("<a class='treeNode'  ><i></i><span></span>"+tbl_group.getGROUP_NAME()+"</a>");
			    //添加子集合 开头
			    generatedText.append("<div class='subTree'>");	
				//递归调用 子集合
				showSubGroupLineMenu(generatedText, tbl_group.getGROUP_ID(),line_name,line_ids);
			    
			    //结束最前组集合
			    if(tbl_group.getPARENT_GROUP_ID().equals("-1")){
			    	generatedText.append("<div class=\"line\"></div>");	
			    }
			   //添加子集合 结尾
			    generatedText.append("</div>");	
			}
		}
		//查找不属于子线路中的其他线路
		showGroupLineMenu2(generatedText, groupId,line_name,line_ids);
		
	}
	
	
	/**
	 * 找子线路
	 * @param generatedText
	 * @param parentId
	 * @param line_name
	 */
	private  void showGroupLineMenu2(StringBuffer generatedText, String parentId,String line_name,Set<String> line_ids){

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("LINE_ID", "ASC");
		whereql.append(" o.GROUP_ID =?");
		queryParams.add(parentId);
		String sql ="select  D.GROUP_ID,D.LINE_ID,L.LINE_NAME,L.LINE_SHOW FROM TBL_LINES L,TBL_DATAPOWER D WHERE L.LINE_ID=D.LINE_ID AND D.GROUP_ID=? ORDER BY L.LINE_ID ASC " ;
		
		List<VIEW_DATAPOWER> tbl_datapowers = Service.get(TBL_DATAPOWERServiceBean.class).getListBySql(VIEW_DATAPOWER.class, -1, -1, sql, new Object[]{parentId});
	
		if(KongUtil.isNotNull(tbl_datapowers)) {
			for (VIEW_DATAPOWER tbl_datapower : tbl_datapowers) {
				
				if(line_ids.contains(tbl_datapower.getLINE_ID()))continue ;
				String select_check="";
				if(tbl_datapower.getLINE_SHOW() != null && tbl_datapower.getLINE_SHOW()==1){
					select_check="checked='checked'";
				}
				line_ids.add(tbl_datapower.getLINE_ID());
				if(line_name==null){
					generatedText.append("<a ><i></i><input type='checkbox' class='lineBox' "+select_check+" name='line_ids' id='"+tbl_datapower.getLINE_ID()+"'   value='"+tbl_datapower.getLINE_ID()+"' /><input class='hide' type='radio' name='menu-radio' id='r"+tbl_datapower.getLINE_ID()+"' style='cursor:pointer' onclick=\"seeLine('"+tbl_datapower.getLINE_ID()+"')\" /><span style='cursor:pointer' class=\"wc\" onclick=\"seeMap('"+tbl_datapower.getLINE_ID()+"')\" >"+tbl_datapower.getLINE_NAME()+"</span><span style='cursor:pointer;display:none;' class=\"wr\" onclick=\"seeLine('"+tbl_datapower.getLINE_ID()+"')\" >"+tbl_datapower.getLINE_NAME()+"</span></a>");
				}
				else if(line_name!=null&&tbl_datapower.getLINE_NAME().contains(line_name)){
					generatedText.append("<a ><i></i><input type='checkbox' class='lineBox' "+select_check+" name='line_ids' id='"+tbl_datapower.getLINE_ID()+"'   value='"+tbl_datapower.getLINE_ID()+"' /><input class='hide' type='radio' name='menu-radio' id='r"+tbl_datapower.getLINE_ID()+"' style='cursor:pointer' onclick=\"seeLine('"+tbl_datapower.getLINE_ID()+"')\" /><span style='cursor:pointer' class=\"wc\" onclick=\"seeMap('"+tbl_datapower.getLINE_ID()+"')\" >"+tbl_datapower.getLINE_NAME()+"</span><span  style='cursor:pointer;display:none;' class=\"wr\" onclick=\"seeLine('"+tbl_datapower.getLINE_ID()+"')\" >"+tbl_datapower.getLINE_NAME()+"</span></a>");
				}
			}
		}
	}
	

	//////////////////////////////////////
	
	/**
	 * 数据权限分配的时候，页面递归调用
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

			whereql.append(" o.PARENT_GROUP_ID='-1' ");
			tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, null, null, orderby);

		} else {
			whereql.append(" o.PARENT_GROUP_ID =?");
			queryParams.add(groupId);
			tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}
		
		if (groupId != null)
			generatedText.append("<ul>");
		showGroupLine2(line_ids,generatedText, groupId);
		if (KongUtil.isNotNull(tbl_groups)) {
			
			
			for (TBL_GROUP tbl_group : tbl_groups) {
				
				generatedText.append("<li >" + tbl_group.getGROUP_NAME());
				
				//递归调用
				showGroupLine(line_ids,generatedText, tbl_group.getGROUP_ID());

				generatedText.append("</li>");

			}
			
			
		}
		
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
				
				for (VIEW_DATAPOWER tbl_datapower : tbl_datapowers) {
					line_ids.add(tbl_datapower.getLINE_ID());
					generatedText.append("<li ><input name='line_ids' type='checkbox' class='checkbox'  checked='checked'  value='" + tbl_datapower.getLINE_ID() + "' >" + tbl_datapower.getLINE_NAME());
	
					generatedText.append("</li>");
	
				}
				
		}
	}
	/////////////////////////////////////////////////////
	/**
	 * 修改群组时用
	 */
	public void showGroup( StringBuffer generatedText, String groupId) {

		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
		List<TBL_GROUP> tbl_groups = null;
		
		
		if (groupId == null) {
			whereql.append(" o.PARENT_GROUP_ID='-1' ");
			tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, null, null, orderby);

		} else {
			whereql.append(" o.PARENT_GROUP_ID =?");
			queryParams.add(groupId);
			tbl_groups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);

		}
		
		if (groupId != null)
			generatedText.append("<ul>");
		if (KongUtil.isNotNull(tbl_groups)) {
			
			
			for (TBL_GROUP tbl_group : tbl_groups) {
				
				generatedText.append("<li ><input  type='radio'  name='parent_group_id' value='" + tbl_group.getGROUP_ID() +"@"+ tbl_group.getGROUP_NAME()+"' >" + tbl_group.getGROUP_NAME());
				
				//递归调用
				showGroup(generatedText, tbl_group.getGROUP_ID());

				generatedText.append("</li>");

			}
			
			
		}
		
		if (groupId != null)
			generatedText.append("</ul>");

	}
	
	
	/**
	 * 20121124 群组树选择实现
	 */
	
	public StringBuffer getGroupTree(TBL_GROUP tbl_group,String selectedGroup_id){
		List<TBL_GROUP> subGroups = new ArrayList<TBL_GROUP>();
		StringBuffer groupTree = new StringBuffer();
		
		if(tbl_group == null){
			
			groupTree.append("<option value=\""+"-1"+"\" >"+""+"</option>");
			
		}
		else{
			
			if(tbl_group.getGRADE()==null)
				tbl_group.setGRADE(1);
			String space ="" ;
			for(int i = 0;i<tbl_group.getGRADE();i++){
				space+="&nbsp;";
			}
			if(selectedGroup_id!=null&&selectedGroup_id.equals(tbl_group.getGROUP_ID())){
				
					
					groupTree.append("<option  selected=\"selected\" value=\""+tbl_group.getGROUP_ID()+"\" >"+space+"├"+tbl_group.getGROUP_NAME()+"</option>");
					subGroups.add(tbl_group);
			
			}
			else{
				
				groupTree.append("<option value=\""+tbl_group.getGROUP_ID()+"\" >"+space+"├"+tbl_group.getGROUP_NAME()+"</option>");
				subGroups.add(tbl_group);
				
			}
		}
		
		
		StringBuffer whereql = new StringBuffer();
		List<Object> queryParams = new ArrayList<Object>();
		LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		
		if(KongUtil.isNotNull(tbl_group)){
			whereql.append("o.PARENT_GROUP_ID=?");
			queryParams.add(tbl_group.getGROUP_ID());
		}
		else{
			whereql.append("o.PARENT_GROUP_ID =? ");
			queryParams.add("-1");
		}
		
		orderby.put("GROUP_ID", "ASC");
		
		List<TBL_GROUP> childGroups = Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, whereql, queryParams, orderby);
		
		if(KongUtil.isNotNull(childGroups)){
			
			subGroups.addAll(childGroups);
			for(TBL_GROUP childGroup:childGroups){
				//设置层级
				if(tbl_group == null)
					childGroup.setGRADE(1);
				else
					childGroup.setGRADE(tbl_group.getGRADE()+1);
				
				groupTree.append(Service.get(TBL_GROUPServiceBean.class).getGroupTree(childGroup,selectedGroup_id));
			}
			
		}
		
		return groupTree ;
	}
	
	
	
	
	
	/******************************************************************
	 * 
	 *陈磊添加
	 * 
	 * *****/
	//绑定群组树结构
	public String BindGroupTree(){
      return BindSubGroup("", 0);
	}
	public String BindGroupTree(String SelValue){
	      return BindSubGroup("", 0,SelValue);
		}
    public  String BindSubGroup(String parentid,int count){
    	StringBuffer sqlStr=new StringBuffer("1=1");
    	LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
        if(KongUtil.isNotNull(parentid)){sqlStr.append(" and PARENT_GROUP_ID='"+parentid+"'");}
        else{sqlStr.append(" and PARENT_GROUP_ID='-1'  ");}
        List<TBL_GROUP>  lists=Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, sqlStr, null, orderby);
        if(lists==null||lists.size()==0)return "";
        String strResult="";
        for (TBL_GROUP tbl_group : lists) {
			strResult+=GetOptionStr(tbl_group.getGROUP_ID(),CommUtil.MakeSeparator(count, "├")+tbl_group.getGROUP_NAME());
			strResult+=BindSubGroup(tbl_group.getGROUP_ID(), count+1);
		}
        return strResult;
    }
    public  String BindSubGroup(String parentid,int count,String SelValue){
    	StringBuffer sqlStr=new StringBuffer("1=1");
    	LinkedHashMap<String, String> orderby = new LinkedHashMap<String, String>();
		orderby.put("GROUP_ID", "ASC");
        if(KongUtil.isNotNull(parentid)){sqlStr.append(" and PARENT_GROUP_ID='"+parentid+"'");}
        else{sqlStr.append(" and  PARENT_GROUP_ID='-1'");}
        List<TBL_GROUP>  lists=Service.get(TBL_GROUPServiceBean.class).getListByCondition(-1, -1, sqlStr, null, orderby);
        if(lists==null||lists.size()==0)return "";
        String strResult="";
        for (TBL_GROUP tbl_group : lists) {
			strResult+=GetOptionStr(tbl_group.getGROUP_ID(),CommUtil.MakeSeparator(count, "├")+tbl_group.getGROUP_NAME(),SelValue);
			strResult+=BindSubGroup(tbl_group.getGROUP_ID(), count+1);
		}
        return strResult;
    }
	public String GetOptionStr(String ID,String Name){
		return "<option value=\""+ID+"\" >"+Name+"</option>";
	}
	public String GetOptionStr(String ID,String Name,String SelValue){
		if(ID.trim().equals(SelValue)){return "<option value=\""+ID+"\" selected=\"selected\" >"+Name+"</option>";}
		else return "<option value=\""+ID+"\" >"+Name+"</option>";
	}
	
	
	//根据群组ID获得群组名称
	public String GetGroupName(String group_id){
		try{
			System.out.println("group_ID");
		    TBL_GROUP _model=Service.get(TBL_GROUPServiceBean.class).get("GROUP_ID", group_id);
			if(_model==null)return "";
			return _model.getGROUP_NAME();
		}catch(Exception dd){return "";}
	}
}
