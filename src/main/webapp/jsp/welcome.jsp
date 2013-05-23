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
<script type="text/javascript" src="<%=path %>/js/WdatePicker.js"></script>
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
			<form action="qureyMessageform" method="post">
				<div class="search">
					<input type="submit" value="" class="btn"/>
					<input type="hidden" name="msgStatus" value="1">
					<input type="text" class="text1" value="日期"  name="publishTime" onClick="WdatePicker()"/>
					<input type="text" class="text" id="tags" name="publisherPhone" onkeyup="autoMessages()"  value="电话号码"/>
					<div id="result"></div>
				</div>
			</form>
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
								<p><a>今日9时不慎将一部白色款iPhone4遗落在理工西区主教1002室，望拾到者归还...</a>187****1323&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-22</p>
								<p><a>今天中午将书包遗落在西区第三食堂，没有贵重物品，希望好心人帮我找一下,谢...</a>186****9421&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-22</p>
								<p><a>先本人手中有一考研证继续转让,望有意者尽快联系我,电话：18704493213</a>132****3423&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-21</p>
								<p><a>想要购买一把二手椅子,不知道哪位同学想出售，可以联系我,QQ:1297197234</a>135****0880&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-21</p>
								<p><a>端午节，去哪里？长白山3日游，有组团的童鞋可以联系一下！QQ:237505474</a>187****9841&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-20</p>
								<p><a>今晚6点，东区二教8楼，adobe公司招聘会，有意者可以准时与会~</a>186****3367&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-20</p>
								<p><a>明天是我哥们大亮的生日，在这里祝我哥们生日快乐，前途似锦~小亮</a>132****1453&nbsp;&nbsp;|&nbsp;&nbsp;2013-05-20</p>
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
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;学校启动“我的中国梦”主题教育活动<font color="red"> new~</font></a>&nbsp;&nbsp;---------------------------------&nbsp;&nbsp;2013-05-23</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;生命科学技术学院举办师生联谊系列体育活动<font color="red"> new~</font> </a>&nbsp;&nbsp;-------------------------&nbsp;&nbsp;2013-05-23</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;部（处）长访谈（三）：访产业管理处处长李振辉</a>&nbsp;&nbsp;----------------------------&nbsp;&nbsp;2013-05-22</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;“学士杯”学生男子篮球赛举行</a>&nbsp;&nbsp;-----------------------------------------------&nbsp;&nbsp;2013-05-21</p>
					<span>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="<%=path %>/jsp/browseMessage.jsp" style="color:#fa9a2c">more...</a></span>
				</div>
			</div>
			<!-- aboutus -->
			<!-- systemintrduce -->
			<div class="systemintrduce">
				<h2>广告栏</h2>
				<div class="word">
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;吉软国际IT人才培训学校 JR1318班 顺利开班！<font color="red"> new~</font></a>&nbsp;&nbsp;---&nbsp;2013-05-23</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;西罗町比萨  24小时快热送~<font color="red"> new~</font></a>&nbsp;&nbsp;-----------------------&nbsp;&nbsp;2013-05-23</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;争流考研 5月30号 理工西区一教 506</a>&nbsp;&nbsp;--------------------&nbsp;&nbsp;2013-05-22</p>
					<p><a><img src="<%=path%>/image/qt-p_icon.jpg">&nbsp;长春捷柯技术开发有限公司 招聘信息！</a>&nbsp;&nbsp;------------------&nbsp;&nbsp;2013-05-21</p>
					<span>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="<%=path %>/jsp/browseMessage.jsp" style="color:#fa9a2c">
					more...</a></span>
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
				<li><a href="http://www.cust.edu.cn/">长春理工大学</a></li>
			</ul>
			<p class="p1">Copyright @ 2013 ttlsp | 京ICP备13001629号</p>
		</div>
		<!-- // footer -->
	</div></body>
</body>
</html>