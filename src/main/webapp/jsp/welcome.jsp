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
<script type="text/javascript" src="<%=path %>/js/qt-jquery.js"></script>
<script type="text/javascript" src="<%=path %>/js/qt-lrtk.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/curDate.js"></script>
<script type="text/javascript" src="<%=path %>/js/WdatePicker.js"></script>
<script type="text/javascript">
	function submitForm(form){
		var phone = $()
		var datevalue = $("#publishTime").val();
		if(datevalue=="日期"){
			$("#publishTime").val("");
		}
	}
</script>
<!-- 电话号自动补全 -->
<link type="text/css" rel="stylesheet" href="<%=path %>/css/jquery-ui-1.9.2.custom.css" />
<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/qh/publishMessage.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/autoPhone.js"></script>

<!-- 信息遍历 -->
<script type="text/javascript" src="<%=path %>/js/yzp/jquery-1.4.3.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/json2.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-Stu.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-School.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-Bus.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var params =null;
	$("#paging1").asynPage1("queryStuInfo",params,"#datas",buildHtml1,7,"stuList","totalSize");
	$("#paging2").asynPage2("querySchoolInfo",params,"#datas",buildHtml2,4,"schoolList","totalSize");
	$("#paging3").asynPage3("queryBusInfo",params,"#datas",buildHtml3,4,"busList","totalSize");
});
function buildHtml1(stuList){
	$.each(stuList,function(i,stu){
		var str = [
		    '<p><a href="#">',
		    stu.msgConctent,'</a>',
		    stu.publishTime,'</p>'
		].join('');
		$("#stu").append(str);
	});
}
function buildHtml2(schoolList){
	$.each(schoolList,function(i,school){
		var str = [
		    '<p><img src="<%=path%>/image/qt-p_icon.jpg"/>&nbsp;&nbsp;',
		    school.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',
		    ,'<a href="#">',school.infoTitle,'</a>',
		    '</p>'
		].join('');
		$("#school").append(str);
	});
}
function buildHtml3(busList){
	$.each(busList,function(i,bus){
		var str = [
			'<p><img src="<%=path%>/image/qt-p_icon.jpg"/>&nbsp;&nbsp;',
			bus.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',
			,'<a href="#">',bus.infoTitle,'</a>',
			'</p>'
		].join('');
		$("#bus").append(str);
	});
}
</script>

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
				<li><a href="<%=path %>/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			<form action="browseMessage.jsp" method="get" onsubmit="return submitForm(this);">
				<div class="search">
					<input type="submit" value="" class="btn"/>
					<input type="hidden" name="msgStatus" value="1">
					<input type="text" class="text1" value="日期" id="publishTime" name="publishTime" onClick="WdatePicker()"/>
					<input type="text" class="text" id="publisherPhone" name="publisherPhone" onkeydown="autoPhone()"  value="电话号码"/>
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
								<div class="message" id="stu">
								<!--此处为主页面学生信息  -->
								<div class="more">
										<span><a href="<%=path %>/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=">more...</a></span>
								</div>
								</div>
					</div>
				</div>
					<!-- 左侧屏幕 <div id="select_btn">
						<ul>
				  			<li><p class="tlt">屏幕一</p><a href="#" target="_blank"><span class="select_text">地点：西区主教一楼</span></a></li>
				 			<li><p class="tlt">屏幕二</p><a href="#" target="_blank"><span class="select_text">地点：西区图书馆一楼</span></a></li>
				 			<li><p class="tlt">屏幕三</p><a href="#" target="_blank"><span class="select_text">地点：东区二教一楼</span></a></li>
					</ul>
				</div>	 -->
				
			</div>
			<!-- // mian -->
			<!-- //aboutus -->
			<div class="aboutus">
				<h2>校园资讯</h2>
				<div class="word">
					<div id="school"></div>
					<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="<%=path %>/jsp/schoolInfo.jsp" style="color:#fa9a2c">more...</a>
					</div>
				</div>
			</div>
			<!-- aboutus -->
			<!-- systemintrduce -->
			<div class="systemintrduce">
				<h2>广告栏</h2>
				<div class="word" >
					<div id="bus"></div>
					<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="<%=path %>/jsp/businessInfo.jsp" style="color:#fa9a2c">
					more...</a></div>
				</div>
					
			</div>
			<!-- // systemintrduce -->
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
	</div></body>
</body>
<script language="JavaScript" type="text/javascript">
			function addListener(element,e,fn){    
    	 		if(element.addEventListener){    
          			element.addEventListener(e,fn,false);    
     			 } else {    
         	 		element.attachEvent("on" + e,fn);    
     	 		 }    
			}
			var publisherPhone = document.getElementById("publisherPhone");
			addListener(publisherPhone,"click",function(){
				publisherPhone.value = "";
			})
		

</script>
</html>