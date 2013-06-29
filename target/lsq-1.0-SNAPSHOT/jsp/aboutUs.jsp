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
				<li><a href="<%=path %>/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=">浏览信息</a></li>
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
				
				<li><p style="color:black"><a href="http://www.ttlsq.com" style="color:#00b8d5;"><font size="3px"><strong>天天乐上墙(ttlsq.com)-校园信息自主发布平台</strong></font></a>是一个服务于高校和企业之间的服务性平台。一方面可以充分满足在校大学生便捷、个性的信息发布需求，
				以更高效、更环保的发布模式减少传统信息发布方式（如：广告粘贴板，纸质宣传单等）所造成的大量资源浪费和环境污染。
				另一方面可有效的解决企业的技术难题，提高高校的科研成果和技术人才的效用，推动产学研融合。可以利用学生实习、社会实践，和社会关系，
				把学校的优势（技术、人力）发布给社会，再利用校园信息自主发布平台，把学生从社会实践中获得的企业需要整理发布到校园信息平台，招募团队完成项目，
				实现以项目为目标的专业合作，推动产学研融合。</p></li>
				<li><p style="color:black">
				<p style="color:black">平台创新点与特色 :</p>
				<p style="color:black">1. 我们的校园信息自主发布平台可以随时随地的发布信息，信息接收者的覆盖面非常广。</p>
				<p style="color:black">2. 主营业务:学生和老师发布的信息免费，这样有利于我们在目标市场立足。</p>
				<p style="color:black">3. 校园信息自主发布平台的输出终端采用多媒体广告机，取代了校园里乱粘乱贴的广告牌和铺张浪费的宣传</p>
				<p style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;单，既干净环保又节约资源。</p>
				<p style="color:black">4. 校园信息自主发布平台的出现大大节约了校园广告的人力资源。</p>
				<p style="color:black">5. 广告机采用分时段和滚动播出的方式，大大提高了信息发布量，可以更好的为客户服务。</p>
				<p style="color:black">6. 目标市场很大，为所有高校。且与各高校传统的信息发布方式相比具有很强的竞争力。</p>
				<p style="color:black">7. 基于校园信息自主发布平台可以充分实现产学研融合。</p>
				<p style="color:#00b8d5;"><strong>联系方式 :</strong></p>
				<p style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ : 237505474</p>
				<p style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话 : 18704499540</p>
				</li>
				</ul>
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
			<p class="p1">地址:吉林省 长春市 卫星里 7089号   | 邮编：130022</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="http://www.cust.edu.cn/">长春理工大学</a></li>
			</ul>
			<p class="p1">Copyright @ 2013 ttlsp | 京ICP备13001629号</p>
		</div>
		<!-- // footer -->
	</div>
</body>
</html>