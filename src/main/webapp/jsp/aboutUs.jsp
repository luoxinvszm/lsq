<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css" rel="stylesheet"  href="<%=path %>/css/qt-index.css"    />
<link type="text/css" rel="stylesheet"  href="<%=path %>/css/qt-style.css" />
<script type="text/javascript" src="<%=path %>/js/yzp/curDate.js"></script>
</head>
<body  onLoad="getEClock(clock)">
	<div class="wrap">
		<!-- header -->
		<div class="header">
			<div class="tlt"><img src="<%=path %>/image/qt-titlt.png" alt="校园信息自主发布平台" /></div>
			<ul class="link">
				<li><a href="#" onclick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.ttlsq.com/');"> 设为首页</a></li>
				<li><a href='#' onclick='window.external.AddFavorite("http://www.ttlsq.com/welcome.jsp","天天乐上墙")'> 加入收藏</a></li>
			</ul>
			<p id="clock"></p><!--时钟 -->
			<ul class="meun">
				<li><a href="<%=path %>/jsp/welcome.jsp">首页</a></li>
				<li><a href="<%=path %>/jsp/publishMessage.jsp">发布信息</a></li>
				<li><a href="<%=path %>/jsp/browseMessage.jsp">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			
		
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>关于我们</h2>
				<ul  id="datas" class="list">
					<li><a>关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们</a></li>
					<li><a>关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们</a></li>
					<li><a>关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们</a></li>
					
				</ul>
			</div>
			<!-- // left -->
			<!-- right -->
			<div class="right">
				<h2>发布协议</h2>
				<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容</p>
				<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内内容协议内容协议内内容协议内容协议内内容
				协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内容协议内容协议内容</p><br>
			</div>
			<!-- // right -->
		</div>
		<!-- // contents -->
		<!-- footer -->
		<div class="footer">
			<p class="p1">地址:吉林省 长春市 卫星里 7089号   | 邮编：130022</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="">长春理工大学</a></li>
				<li><a href="">长春理工大学</a></li>
				<li><a href="">长春理工大学</a></li>
			</ul>
			<p class="p1">Copyright @ 2013 ttlsp | 京ICP备13001629号</p>
		</div>
		<!-- // footer -->
	</div>
</body>
</html>