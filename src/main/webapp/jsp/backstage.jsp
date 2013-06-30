<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>校园信息自主发布平台管理系统</title>
<link type="text/css" rel="stylesheet" href="<%=path %>/css/houtai.css" />
<link type="text/css"  rel="stylesheet" href="<%=path %>/css/pagination.css"  />

<script type="text/javascript" src="<%=path %>/js/yzp/jquery-1.4.3.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/json2.js"></script>
<script type="text/javascript" src="<%=path %>/js/yzp/asynPage-Msg.js"></script>
<script type="text/javascript" src="<%=path %>/js/houtai.js" ></script>
<script type="text/javascript" src="<%=path %>/js/backstage.js" ></script>
<script type="text/javascript" src="<%=path %>/js/yhy/yhy.js" ></script>
<script type="text/javascript" src="<%=path %>/js/qh/backstageMessage.js" ></script>

</head>
<body onload="">
<%
	String userRealName=session.getAttribute("userRealName").toString();
	String time = new SimpleDateFormat("yyyy年MM月dd日 EE").format(new Date());
	String password = session.getAttribute("password").toString();
%>
	<!-- header -->
	<div class="header">
		<h1>信息管理系统</h1>
		<p><%=time%></p>
		<p>欢迎您 &nbsp;&nbsp;&nbsp;<%=userRealName%></p>
		<div class="btnbox">
			<input type="button" value="修改密码" class="btn1" onclick="Tab(10)"/><input
				type="button" value="安全退出" class="btn1" onclick="exit()"/>
		</div>
	</div>
	<!-- // header -->
	<!-- left -->
	<div class="contents">
		<div id="left">
			<ul id="listUL">
				<li><a href="#" onClick="Tab(1)">待审信息</a></li>
				<li><a href="#" onClick="Tab(2)">已发布信息</a></li>
				<li><a href="#" onClick="Tab(3)">未通过的信息</a></li>
				<li><a href="#" onClick="Tab(4)">发布过期信息</a></li>
				<li><a href="#" onClick="Tab(5)">创建管理员</a></li>
				<li><a href="#" onClick="Tab(6)">使用中管理员</a></li>
				<li><a href="#" onClick="Tab(7)">已冻结管理员</a></li>
				<li><a href="#" onClick="Tab(8)">系统设置</a></li>
			</ul>
		</div>
		<!-- //left -->
		<!-- right1 -->
		<div id="right1">
			<div class="tlt">当前位置：待审信息</div>
			<table cellpadding="0" cellspacing="0" id="messsageList0">
				<tr>
					<th width="50">编号</th>
					<th width="690">信息内容</th>
					<th width="70">操作</th>
				</tr>
			</table>
			<div class="page">
				<div id="paging" class="paging"></div>
			</div>
		</div>
		<!-- //right1 -->
		<!-- right2 -->
		<div id="right2">
			<div class="tlt">当前位置：已发布信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除信息" />
			</p>
			<table cellpadding="0" cellspacing="0" id="messsageList1">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
				
			</table>
			<div class="page">
				<div id="paging1" class="paging"></div>
			</div>
		</div>
		<!-- //right2 -->
		<!-- right3 -->
		<div id="right3">
			<div class="tlt">当前位置：未通过信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除" />
			</p>
			<table cellpadding="0" cellspacing="0" id="messsageList2">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
			
			</table>
			<div class="page">
				<div id="paging2" class="paging"></div>
			</div>
		</div>
		<!-- //right3 -->
		<!-- right4 -->
		<div id="right4">
			<div class="tlt">当前位置：过期信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除" />
			</p>
			<table cellpadding="0" cellspacing="0" id="messsageList3">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
			</table>
			<div class="page">
				<div id="paging3" class="paging"></div>
			</div>
		</div>
		<!-- //right4 -->
		<!-- right5 -->
		<div id="right5">
			<div class="tlt">当前位置：创建管理员</div>
			<label>请输入管理员姓名：</label><input type="text"  class="text" name="userRealName" id="name"/>
			<input type="button" value="创建" class="btn" onclick="checkcreate()"/>
			<table id="createlist">
				
			</table>
		</div>
		<!-- //right5 -->
		<!-- right6 -->
		<div id="right6">
			<div class="tlt">当前位置：使用中管理员</div>
			<p>
				批量操作： <input type="button" value="全选" onclick="checkAll()" class="butt"/>
				 <input type="button" value="取消全选" onclick="uncheckAll()"class="butt"/><input type="button" value="删除" onclick="batchdelete()" class="butt" /><input
					type="button" value="冻结" onclick="batchcancle()" class="butt"/>
			</p>
			
			<table cellpadding="0" cellspacing="0" class="table1" id="usingAdminList" >
		
				
			
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right6 -->
		<!-- right7 -->
		<div id="right7">
			<div class="tlt">当前位置：已冻结管理员</div>
			<p>
				批量操作： <input type="button" value="全选" onclick="checkAll()"/>
				 <input type="button" value="取消全选" onclick="uncheckAll()"/><input type="button" value="删除" onclick="batchdelete()"/><input
					type="button" value="激活" onclick="batchrecover()" />
			</p>
			<table cellpadding="0" cellspacing="0" class="table1" id="deletedAdminList">
				<tr>
					<th width="50">序号</th>
					<th width="200">账号</th>
					<th width="200">昵称</th>
					<th width="250">操作</th>
				</tr>
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right7 -->
		<!-- right8 -->
		<div id="right8">
			<div class="tlt">当前位置：系统设置</div>
			<dl>
				<dt>信息字数设置:</dt>
				<dd>
					<input type="text" id="perMsgWords" class="text">字 <input
						type="button" value="保存" class="btn" onclick="updateperMsgWords()" />
				</dd>
			</dl>
			<dl>
				<dt>每人每天发布信息次数设置:</dt>
				<dd>
					<input type="text" id="sendMsgNum" class="text">次 <input
						type="button" value="保存" class="btn" onclick="updatesendMsgNum()" />
				</dd>
			</dl>
			<dl>
				<dt>密码重置设置:</dt>
				<dd>
					<input type="text" id="defaultPasswords" class="text">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="保存" class="btn"
						onclick="updatedefaultPasswords()" />
				</dd>
			</dl>
		</div>
		<!-- //right9 -->
	<div id="right10">
			<div class="tlt">当前位置：修改密码</div>
			<form action="updatePassword_userAction" name="updatePassword">
			<div align="center" >
请输入原密码:<input type="text" id="old" onblur="checkOld()" value=""/>
						<div style="display: none" id="u1">
									<font face="宋体" color="red">密码输入错误，请重新输入</font>
									</div>
									
									<br/>
				请输入新密码:
							<input type="password" onblur="checknew1()"
								name="user.password" id="new1" value="" />
							<div style="display: none" id="d1">
									<font face="宋体" color="red">密码不能为空</font>
								</div>
							<br/>
			请再输入新密码:
							<input type="password" id="new2" value=""/>
							<div style="display: none" id="d2">
									<font face="宋体" color="red">两次密码输入不一致</font>
								</div>

	<br/>
		<input type="hidden" value=<%=password%> id="oldPassword"> <input
			type="button" onclick="check()" value="确定">
			</div>
	</form>
		</div>
		</div>
		<div id="r1">
		<div class="tlt">当前位置：修改密码</div>
			修改成功
		</div>
</body>
</html>
