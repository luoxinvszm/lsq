<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="<%=path%>/css/index.css" rel="stylesheet" />
<link type="text/css" href="<%=path%>/css/style.css" rel="stylesheet" />
<title>详细协议</title>
</head>
<body>
	   <div class="contents1">
      	<div class="main">
      		<h1><font size="+1">协议详细内容</font></h1>
            <ul class="btnbox">
            	<li><a href="<%=path%>/jsp/publishMessage.jsp">返回上一层</a></li>
            </ul>
            <br/><br/><br/><br/>
       		<div align="center"><font face="heiti" size="6" >用户协议</font></div>
       		
            </div>
	  </div>
    <!-- // contents -->
		<!-- footer -->
		<div class="footer">
			<p class="p1">版权所有：长春理工大学</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="http://www.cust.edu.cn/"  target="_blank">长春理工大学</a></li>
				<li><a href="">吉林大学</a></li>
				<li><a href="">东北师范大学</a></li>
				<li class="bg"><a href="">长春大学</a></li>
			</ul>
			<p class="p1">地址:吉林省 长春市 卫星路 7089号  邮编：130022</p>
		</div>
	    
</body>
</html>