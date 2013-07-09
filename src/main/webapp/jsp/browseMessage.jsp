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
<script type="text/javascript" src="<%=path %>/js/WdatePicker.js"></script>

<!-- 电话号自动补全 -->
<link type="text/css" rel="stylesheet" href="<%=path %>/css/jquery-ui-1.9.2.custom.css" />
<%-- <script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script> --%>
<script type="text/javascript" src="<%=path %>/js/qh/publishMessage.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="<%=path %>/js/sxl/autoPhone.js"></script>
<script type="text/javascript">
			function GetRequest() {
				   var url = location.search; //获取url中"?"符后的字串
				   var theRequest = new Object();
				   if (url.indexOf("?") != -1) {
				      var str = url.substr(1);
				      strs = str.split("&");
				      for(var i = 0; i < strs.length; i ++) {
				         theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
				      }
				   }
				   return theRequest;
				}
				//88888888888
			var Request = new Object();
			Request = GetRequest();
			var publisherPhone,publishTime,msgStatus;
			publisherPhone = Request['publisherPhone'];
			publishTime = Request['publishTime'];
			msgStatus = Request['msgStatus'];
			/*  alert(publisherPhone);
			alert(publishTime);
			alert(msgStatus);  */

			$(document).ready(function(){
				var params = "msgStatus="+msgStatus+"&publishTime="+publishTime+"&publisherPhone="+publisherPhone;
		    	$("#paging").asynPage("qureyMessage.action",params,"#datas",buildHtml,10,"messageList","totalSize");
    		});
			
			function result(){
				var time = $("#publicTime1").val();
				var phone = $("#queryExp").val();
				var params = "msgStatus=1&publishTime="+time+"&publisherPhone="+phone;
				$("#paging").asynPage("qureyMessage.action",params,"#datas",buildHtml,10,"messageList","totalSize");
			}
			
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
				<li><a href="<%=path %>/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=">浏览信息</a></li>
				<li><a href="<%=path %>/jsp/aboutUs.jsp">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" value=" " class="btn" onclick="result()" />
				<input type="text" class="text1" id="publicTime1" name="publishTime" onClick="WdatePicker()"/>
				<input type="text" class="text" id="queryExp" value="电话号码" name="publisherPhone" />
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
				<p><font size="2px" color="grey">天天乐上墙(ttlsq.com)-校园信息自主发布平台郑重提请用户，发布信息为公开信息请慎重填写，
				并且发布信息必须填入个人验证信息才可提交，等待审核通过即可查询已公布信息，个人验证信息本平台将做到隐私保护，请用户放心。</font>
				</p>
				<p><font size="2px" color="grey">用户所发信息内容必须遵守国家有关法律规定，任何信息都不得含有以下内容： 
					(1)违反宪法确定的基本原则的；
					(2)危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；
					(3)损害国家荣誉和利益，攻击党和政府的信息;</font>
					</p>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#00b8d5"><strong><a>更多相关. . . .</a></strong></font>
					
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