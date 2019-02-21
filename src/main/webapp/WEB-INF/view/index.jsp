<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="org.springframework.jdae.Service"%>
<%@page import="org.springframework.jdae.access.pool.JdbcPageForm"%>
<%@page import="org.wtes.utils.*"%>
<%@page import="org.wtes.utils.Constant"%>
<%@page import="org.wtes.clgs.bean.TBL_POINTS_IMGS"%>
<%@page import="org.wtes.clgs.bean.service.impl.TBL_POINTS_IMGSServiceBean"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="org.wtes.utils.UTF8Encoder"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="org.wtes.utils.WebUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.wtes.clgs.bean.service.impl.TBL_VARServiceBean"%>
<%@ include file="/wtes/jsp/share/taglibsimple.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<!----------------------------- 页面 逻辑代码 ------------------------------------>
<%
StringBuffer whereql = new StringBuffer();
List<Object> queryParams = new ArrayList<Object>();
LinkedHashMap<String,String> orderby = new LinkedHashMap<String,String>();

String  points_id = request.getParameter("points_id");
request.setAttribute("points_id",points_id);
String ltime= request.getParameter("ltime");
if(ltime == null){
		ltime = "24";
	}
long hourBt = (long)60*60*1000*1 ;
String st =  request.getParameter("st");
String et =  request.getParameter("et");
Date endTime = null ;
Date startTime = null ;
	if(KongUtil.isNotNull(et)){
		endTime = Constant.DEFAULT_TIMESSTAMP_SDF.parse(et);
	}
	else{
		endTime = new Timestamp(System.currentTimeMillis());
		et = Constant.DEFAULT_TIMESSTAMP_SDF.format(endTime);
	}
	
	if(KongUtil.isNotNull(st)){
		
		startTime = Constant.DEFAULT_TIMESSTAMP_SDF.parse(st);
	}
	else{
		
		long betweenMs = hourBt*Integer.parseInt(ltime) ;
			
		long startMs = endTime.getTime()- betweenMs ;
		startTime = new Timestamp(startMs);
		st = Constant.DEFAULT_TIMESSTAMP_SDF.format(startTime);
	}

	request.setAttribute("st",st);
	request.setAttribute("et",et);
		whereql.delete(0,whereql.length());
		queryParams.clear();
		orderby.clear();

String TBL_NAME = "TBL_POINT_IMGS" ;
	whereql.append(" o.POINT_ID = ?");
	queryParams.add(points_id);


	whereql.append(" and o.JC_DATE >= ?");
	queryParams.add(startTime);


	whereql.append(" and o.JC_DATE <= ?");
	queryParams.add(endTime);

//排序
orderby.put("JC_DATE","DESC");

List<TBL_POINTS_IMGS> tbl_points_imgs = Service.get(TBL_POINTS_IMGSServiceBean.class).getListByCondition(-1,-1,whereql,queryParams,orderby);	
if(!tbl_points_imgs.isEmpty()){
		request.setAttribute("tbl_points_imgs",tbl_points_imgs);
}
Integer rowCount =KongUtil.isNull(tbl_points_imgs)?0:tbl_points_imgs.size();
request.setAttribute("rowCount",rowCount);
	//根据当前URL获得页面模块名称
	String ModelUrl="/control/stastics/index.jsp";
	String mname="图片展示";
	String mtname="数据展示";

%>
<!------------------------------ 页面 头 ---------------------------------------------->
<head>
<title>图片浏览器</title>
<link rel="stylesheet" href="${ctx}/images/main.css" />
<link rel="stylesheet" type="text/css" href="${ctx}/wtes/js/ymPrompt4/skin/simple/ymPrompt.css" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/elastislide.css" />
		<noscript>
			<style>
				.es-carousel ul{
					display:block;
				}
			</style>
		</noscript>
		<script id="img-wrapper-tmpl" type="text/x-jquery-tmpl">	
			<div class="rg-image-wrapper">
				{{if itemsCount > 1}}
					<div class="rg-image-nav">
						<a href="#" class="rg-image-nav-prev">Previous Image</a>
						<a href="#" class="rg-image-nav-next">Next Image</a>
					</div>
				{{/if}}
				<div class="rg-image"></div>
				<div class="rg-loading"></div>
				<div class="rg-caption-wrapper">
					<div class="rg-caption" style="display:none;">
						<p></p>
					</div>
				</div>
			</div>
		</script>
</head>

<body>
<form id="fenyeForm" action="${ctx}/control/stastics/index.jsp" method="get">
 <div class="rightDiv">
	<div class="position">
	<!-- 条件查询 -->
	<div class="topOpt">
	   <div class="page">
	     <table width="100%" border="0" cellspacing="0" cellpadding="0">
	              <tr>
	              	<td width="32" >
			                </td>
	                <td class="left" >
	                	共计${rowCount}张图片 	                	
	                	起始时间：<input name="st" id="st" value="${st}"  onfocus="rcalendar(this,'full');" readonly value="${st}"  />  
						结束时间：<input name="et" id="et" value="${et}"  onfocus="rcalendar(this,'full');" readonly  value="${et}"  /> 
	                	<input type="hidden"  name="points_id" value="${points_id}" />
			            <input type="submit" id="eButton"  class="button"  value="查询" title="查询" />
	               	</td>
	              </tr>
	     </table>
	</div>
	 <div class="c"></div>
	</div>
	<div class="righttable">
	<div class="container">
			<div class="content">
				<div id="rg-gallery" class="rg-gallery">
					<div class="rg-thumbs">
						<!-- Elastislide Carousel Thumbnail Viewer -->
						<div class="es-carousel-wrapper">
							<div class="es-nav">
								<span class="es-nav-prev">Previous</span>
								<span class="es-nav-next">Next</span>
							</div>
							<div class="es-carousel">
								<ul>
								<c:forEach items="${tbl_points_imgs}" var="entry" varStatus="loop">
									<li><a href="#"><img src="${ctx}/upload/jcimg/${entry.JC_IMG}" data-large="${ctx}/upload/jcimg/${entry.JC_IMG}" alt="image01" data-description="图片采集时间：<fmt:formatDate type="date" pattern="yyyy-MM-dd HH:mm:ss"  value="${entry.JC_DATE}" var ="JC_DATE" scope="page"/>
								${JC_DATE}" /></a></li>
								</c:forEach> 
								</ul>
							</div>
						</div>
						<!-- End Elastislide Carousel Thumbnail Viewer -->
					</div><!-- rg-thumbs -->
				</div><!-- rg-gallery -->
			</div><!-- content -->
		</div><!-- container -->

 </div>
</div>

<!--  
<div class="search"  >

	
	<input type="submit" class="buttonType"  value="查　　询" title="查询" />
	<input type="button" id="eButton"  class="buttonType"  value="导　　出" title="导出" />
	
</div>	
<input name="disable" class="buttonType"
										<c:if test="${fn:length(fenyeForm.queryResult.recordList)<1}">disabled="disabled"</c:if>
										onclick="javascript:SelectDel('mainForm','ids','${ctx}/control/system/var/var-delete.jsp')"
										value="删除变量 " />
		<input type="button" class="buttonType"  id="addButton"  value="添加变量" title="添加变量" />
-->
</form>

<!-------------------------------- 显示错误页面 --------------------------------------->
<input type="hidden" id="erroMsg" name="erroMsg" value="<%=KongUtil.isNull(request.getAttribute("strErroMsg"))?"":request.getAttribute("strErroMsg") %>"/>
<input type="hidden" id="jsMsg" name="jsMsg" value="<%=KongUtil.isNull(request.getAttribute("jsMsg"))?"":request.getAttribute("jsMsg")  %>"/>

<!------------------------------ 页面 javascript ---------------------------------->
<script type="text/javascript" src="${ctx}/wtes/js/xgqtools.js"></script>
<script type="text/javascript" src="${ctx}/wtes/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/wtes/js/select-check.js"></script>
<script type="text/javascript" src="${ctx}/wtes/js/ymPrompt4/ymPrompt.js"></script><script type="text/javascript" src="${ctx}/wtes/js/jquery.messager.js"></script>
<script type="text/javascript" src="${ctx}/wtes/js/common.js"></script>
<script type="text/javascript" src="${ctx}/wtes/js/main.js"></script>
<script type="text/javascript"  src="${ctx}/wtes/js/calendar.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.tmpl.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="js/jquery.elastislide.js"></script>
		<script type="text/javascript" src="js/gallery.js"></script>

</body>
</html>

