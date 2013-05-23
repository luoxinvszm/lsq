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
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/qt-index.css"/>
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/qt-style.css" />
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/pagination.css"  />

<script type="text/javascript" src="<%=path %>/js/yzp/jquery-1.4.3.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/json2.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-Msg.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/curDate.js"></script>
<!-- 电话号自动补全 -->
<link type="text/css" rel="stylesheet" href="<%=path %>/css/jquery-ui-1.9.2.custom.css" />
<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/qh/publishMessage.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/autoPhone.js"></script>
<script type="text/javascript">
			$(document).ready(function(){
				var params = "";
		    	$("#paging").asynPage("qureyMessage.action",params,"#datas",buildHtml,15,"messageList","totalSize");
    		});
			function buildHtml(messageList){
				$.each(messageList,function(i,message){
					var str = [
					    '<li><a href="#">',
                	 	message.msgConctent,'</a>',
                  		message.publishTime,'</li>'
            		].join('');
            		$("#datas").append(str);
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
			<p id="clock"></p><!--时钟-->
			<ul class="meun">
				<li><a href="<%=path %>/jsp/welcome.jsp">首页</a></li>
				<li><a href="<%=path %>/jsp/publishMessage.jsp">发布信息</a></li>
				<li><a href="<%=path %>/jsp/browseMessage.jsp">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" value=" " class="btn" onclick="submit()" />
				<input type="text" class="text1" value="2013-05-22"/>
				<input type="text" class="text" id="publisherPhone" name="publisherPhone" onkeyup="autoPhone()"  value="电话号码"/>	
			</div>
		
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>浏览信息</h2>
				<ul  id="datas" class="list">
					<li style="margin-right: 290px;margin-top: 60px"><font>正在努力加载数据...</font></li>
				</ul>
					<!--分页控件 -->
					<div id="paging" class="paging"></div>
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