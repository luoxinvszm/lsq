<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/qt-index1.css"/>
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/qt-style1.css" />
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/pagination.css" />
<script type="text/javascript" src="<%=path %>/js/yzp/jquery-1.4.3.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/json2.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-Bus.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var params =null;
	$("#paging").asynPage3("queryBusInfo",params,"#bus",buildHtml,10,"busList","totalSize");
});
function buildHtml(busList){
	$.each(busList,function(i,bus){
		var str = [
			'<li><img src="<%=path%>/image/qt-p_icon.jpg"/>&nbsp;&nbsp;',
			bus.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',
			,bus.infoContent,'</li>'
		].join('');
		$("#bus").append(str);
	});
}
</script>
</head>
<body>
	  <div class="contents1">
      	<div class="main">
      		<h1><font size="4px">广告栏</font></h1>
            <ul class="btnbox">
            	<li><a href="<%=path%>/jsp/welcome.jsp">返回首页</a></li>
            </ul>
       		<ul  id="bus" class="list">
            </ul>
          <!--分页控件 -->
			<div id="paging" class="paging"></div>
         </div>
	  </div>
    <!-- // contents -->
		<!-- footer -->
		<div class="footer">
			<p class="p1">地址:吉林省 长春市 卫星路 7089号   | 邮编：130022</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="http://www.cust.edu.cn/">长春理工大学</a></li>
			</ul>
			<p class="p1">Copyright @ 2013 ttlsp | 吉ICP备13001629号</p>
		</div>
		<!-- // footer -->
</body>
</html>
