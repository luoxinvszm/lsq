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
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/qh/queryResultMessage.js"></script>
<link href="css/qt-IE6.css" rel="stylesheet" type="text/css" media="all" />



</head>
<body onload="getInfo()">
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
				<input type="button" class="btn" id="btnGet" />
				<input type="text" class="text" id="publisherPhone" >
			</div>
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>查询结果</h2>
				<ul class="list" id="info">
					<!-- <li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li> -->
				</ul>
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
				<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内容协议内容协议内容</p><br>
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
</body>
</html>