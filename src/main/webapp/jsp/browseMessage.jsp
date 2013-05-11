<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css" href="../css/qt-index.css"   rel="stylesheet" />
<link type="text/css" href="../css/qt-lrtk.css" rel="stylesheet" />
<link type="text/css" href="../css/qt-style.css" rel="stylesheet" />
<link href="css/qt-IE6.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/qh.js"></script>
</head>
<body onload="submit()">
	<div class="wrap">
		<!-- header -->
		<div class="header">
			<div class="tlt"><img src="../image/qt-titlt.png" alt="校园信息自主发布平台" /></div>
			<ul class="link">
				<li><a href="#">设为首页</a></li>
				<li><a href="#">加入收藏</a></li>
			</ul>
			<p>2013年4月19日 星期五</p>
			<ul class="meun">
				<li><a href="welcome.jsp">首页</a></li>
				<li><a href="publishMessage.jsp">发布信息</a></li>
				<li><a href="queryResultMessage.jsp">浏览信息</a></li>
				<li><a href="#">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" value=" " class="btn" onclick="submit()" />
				<input type="text" class="text" id="queryExp" />
			</div>
		
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>浏览信息</h2>
				
				
				<!-- <div  class="message">
					<p>信息内容 信息内容 信息内容信息内容信息内容信息内容信息内容信息内容信息内容信息内容信息内容信息内容信息内容</p>
					<p class="p"><span>署名：###</span><span>电话：187****0000</span></p>
				</div> -->
				 <div id="result" class="message">
				</div>
			
				<p class="page">
					<span><a href="#">首页</a></span>
					<span><a href="#">上一页</a></span>
					<span><a href="#">下一页</a></span>
					<span><a href="#">尾页</a></span>
				</p>
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
			<p class="p1">版权所有：长春理工大学</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="">长春理工大学</a></li>
				<li><a href="">吉林大学</a></li>
				<li><a href="">东北师范大学</a></li>
				<li class="bg"><a href="">长春大学</a></li>
			</ul>
			<p class="p1">地址:吉林省 长春市 卫星里 7089号  邮编：130022</p>
		</div>
		<!-- // footer -->
	</div>
</body>
</html>