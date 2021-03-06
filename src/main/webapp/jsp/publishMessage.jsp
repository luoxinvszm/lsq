<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib prefix="s" uri="/struts-tags"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css" rel="stylesheet" href="<%=path %>/css/qt-index.css"   />
<link type="text/css" rel="stylesheet" href="<%=path %>/css/qt-style.css" />
<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/qh/publishMessage.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/curDate.js"></script>
<script type="text/javascript" src="<%=path %>/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/common.js"></script>
<script type="text/javascript" src="<%=path %>/js/keyWords.js"></script>
<script type="text/javascript">
function changeImage() {
	var date = new Date();
	document.getElementById("auth").src = 'authImg?id=' + date.getTime();
}
</script>
    <script type="text/javascript">
		$(function(){
			$("#messageContext").blur(function(){
				var position = 0;
				var length = 0;
				var text = $("#messageContext").val();
				for(var i = 0; i < keyWords.length ; i++){
					var next1 = next(keyWords[i]);
					position = pattern(text,keyWords[i],next1);
					length = keyWords[i].length;
					if(position != undefined){
						replaceWords(text,position,length);
						break;
					}
				
				}	
			});
		});
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
				<li><a href="<%=path %>/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>发布信息</h2>
				<p class="p"><strong>请认真填写下面信息</strong></p>
				<font color="red" face="songti"><s:fielderror /></font>
				<dl class="dl">
					<dt>署名</dt>
					<dd><input type="text"  class="text" id="publisherName"/></dd>
					<dt>电话号码</dt>
					<dd><input type="text" class="text" id="publisherPhone"/></dd>
					<dt>验证码</dt>
					<dd><input type="text" class="text1" id="authimg"/><img src="authImg"  id="auth" style="width:100px;height:30px;"/><a
								href="javascript:void(0)" onclick="changeImage()">看不清</a></dd>
				</dl>
				<p class="p">请输入您要发布的信息</p>
				<textarea class="textarea" id="messageContext" ></textarea>
				<input type="checkbox" checked class="check" /><label>我已接受**协议</label>
				<input type="button" value="提&nbsp;交" class="btn" id="btnGet"/>
			</div>
			<!-- // left -->
			<!-- right -->
			<div class="right">
				<h2>发布协议</h2>
				<p><font size="2px" color="grey">天天乐上墙(ttlsq.com)-校园信息自主发布平台郑重提请用户，发布信息为公开信息请慎重填写，
				并且发布信息必须填入个人验证信息才可提交，等待审核通过即可查询已公布信息，个人验证信息本平台将做到隐私保护，请用户放心。</font>
				</p>
				<p><font size="2px" color="grey">用户所发信息内容必须遵守国家有关法律规定，任何信息都不得含有以下内容： 
					(1)违反宪法确定的基本原则的；
					(2)危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；
					(3)损害国家荣誉和利益，攻击党和政府的信息;</font>
					</p>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#00b8d5"><strong><a href="Xiangxixieyi.jsp">更多相关. . . .</a></strong></font>
					
			</div>
			<!-- // right -->
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
	</div>
</body>
</html>