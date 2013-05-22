<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<% String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css" rel="stylesheet" href="<%=path %>/css/qt-index.css" />
<link type="text/css" rel="stylesheet" href="<%=path %>/css/qt-lrtk.css"/>
<link type="text/css" rel="stylesheet" href="<%=path %>/css/jquery-ui-1.9.2.custom.css" />

<script type="text/javascript" src="<%=path %>/js/qt-jquery.js"></script>
<script type="text/javascript" src="<%=path %>/js/qt-lrtk.js"></script>
<!--<script type="text/javascript" src="<%=path %>/js/sxl/jquery-ui-1.9.2.custom.js"></script>-->
<script type="text/javascript" src="<%=path %>/js/sxl/autoMessage.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/curDate.js"></script>
</head>
<body onLoad="getEClock(clock)">

	<div class="wrap">
		<!-- header -->
		<div class="header">
			<div class="tlt"><img src="<%=path %>/image/qt-titlt.png" alt="校园信息自主发布平台" /></div>
			<ul class="link">
				<li><a href="#" onclick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.ttlsq.com/');"> 设为首页</a></li>
				<li><a href='#' onclick='window.external.AddFavorite("http://www.ttlsq.com/welcome.jsp","天天乐上墙")'> 加入收藏</a></li>
			</ul>
			<p id="clock"></p>
			<ul class="meun">
				<li><a href="<%=path %>/jsp/welcome.jsp">首页</a></li>
				<li><a href="<%=path %>/jsp/publishMessage.jsp" >发布信息</a></li>
				<li><a href="<%=path %>/jsp/browseMessage.jsp">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" value="" class="btn"/>
				<input type="text" class="text1" value="2013-05-22"/>
				<input type="text" class="text" id="tags" onkeyup="autoMessages()"  value="信息"/>
				<div id="result"></div>
				
			</div>
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- mian -->
			<div class="mian" id="zSlider">
				<div id="picshow">
			
					<div id="picshow_img">
						<ul><%for(int i=0;i<3;i++){ %>
							<li>
								<div class="message" id="datas<%=i+1%>">
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>
								<div class="more">
										<span><a href="<%=path %>/jsp/browseMessage.jsp">more...</a></span>
									</div>
								</div>
							</li>
							<%}%>
						</ul>
					</div>
				</div>
					<div id="select_btn">
						<ul>
				  			<li><p class="tlt">屏幕一</p><a href="#" target="_blank"><span class="select_text">地点：西区主教一楼</span></a></li>
				 			<li><p class="tlt">屏幕二</p><a href="#" target="_blank"><span class="select_text">地点：西区图书馆一楼</span></a></li>
				 			<li><p class="tlt">屏幕三</p><a href="#" target="_blank"><span class="select_text">地点：东区二教一楼</span></a></li>
					</ul>
				</div>	
				
			</div>
			<!-- // mian -->
			<!-- //aboutus -->
			<div class="aboutus">
				<h2>校园资讯</h2>
				<div class="word">
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我</p>
					<p>介绍关于我们的的介绍 关于我们绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介
					绍 关于我们的介绍...</p>
					<span><a href="#" style="color:#fa9a2c">more...</a></span>
				</div>
			</div>
			<!-- aboutus -->
			<!-- systemintrduce -->
			<div class="systemintrduce">
				<h2>广告栏</h2>
				<div class="word">
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我</p>
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的 关于我们的介绍...</p>
					<span><a href="#" style="color:#fa9a2c">more...</a></span>
				</div>
			</div>
			<!-- // systemintrduce -->
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
	</div></body>
</body>
</html>