<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>校园信息自主发布平台管理系统</title>
<link href="../css/houtai.css" rel="stylesheet" type="text/css" />
<script src="../js/houtai.js" type="text/javascript"></script>
<script src="../js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="../js/backstage.js" type="text/javascript"></script>
</head>
<body>
	<!-- header -->
	<div class="header">
		<h1>信息管理系统</h1>
		<p>2012年8月1日 星期六</p>
		<p>hello 管理员名字</p>
		<div class="btnbox">
			<input type="button" value="修改密码" class="btn1" /><input
				type="button" value="安全退出" class="btn1" />
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
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="发布" />
				<input type="button" value="不通过" />
			</p>
			<table cellpadding="0" cellspacing="0">
				<tr>
					<th width="50">编号</th>
					<th width="690">信息内容</th>
					<th width="70">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span></td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息
						信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息
						信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息信息 信息信息<br /> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span>
					</td>
					<td><span><input type="button" value="发布" /></span><br>
						<span><input type="button" value="不通过" /></span></td>
				</tr>
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right1 -->
		<!-- right2 -->
		<div id="right2">
			<div class="tlt">当前位置：已发布信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除信息" /><input
					type="button" value="撤销发布" />
			</p>
			<table cellpadding="0" cellspacing="0">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />9</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除信息" /></span> <span><input
							type="button" value="撤销发布" /></span></td>
				</tr>
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right2 -->
		<!-- right3 -->
		<div id="right3">
			<div class="tlt">当前位置：未通过信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除" /><input
					type="button" value="待审" />
			</p>
			<table cellpadding="0" cellspacing="0">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />9</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />10</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>审核未通过时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span> <span><input
							type="button" value="待审" /></span></td>
				</tr>
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right3 -->
		<!-- right4 -->
		<div id="right4">
			<div class="tlt">当前位置：过期信息</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除" />
			</p>
			<table cellpadding="0" cellspacing="0">
				<tr>
					<th width="50">编号</th>
					<th width="670">信息内容</th>
					<th width="50">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />9</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />10</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>信息 信息信息<br> <span>署名：####</span><span>电话：187****000</span><span>提交时间：2013-4-17</span><span>到期时间：2013-4-17</span></td>
					<td><span><input type="button" value="删除" /></span></td>
				</tr>
			</table>
			<div class="page">
				<span><a href="#">首页</a></span> <span><a href="#">上一页</a></span> <span><a
					href="#">下一页</a></span> <span><a href="#">尾页</a></span>
			</div>
		</div>
		<!-- //right4 -->
		<!-- right5 -->
		<div id="right5">
			<div class="tlt">当前位置：创建管理员</div>
			<label>超级管理员：</label><input type="text" value="昵称：yhy" class="text" />
			<input type="button" value="创建" class="btn" />
		</div>
		<!-- //right5 -->
		<!-- right6 -->
		<div id="right6">
			<div class="tlt">当前位置：使用中管理员</div>
			<p>
				批量操作： <input type="checkbox" /><input type="button" value="删除" /><input
					type="button" value="冻结" />
			</p>
			<table cellpadding="0" cellspacing="0" class="table1">
				<tr>
					<th width="50">序号</th>
					<th width="200">账号</th>
					<th width="200">昵称</th>
					<th width="250">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />9</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />10</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="冻结" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
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
				批量操作： <input type="checkbox" /><input type="button" value="删除" /><input
					type="button" value="激活" />
			</p>
			<table cellpadding="0" cellspacing="0" class="table1">
				<tr>
					<th width="50">序号</th>
					<th width="200">账号</th>
					<th width="200">昵称</th>
					<th width="250">操作</th>
				</tr>
				<tr>
					<td><input type="checkbox" />1</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />2</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />3</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />4</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />5</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />6</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />7</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />8</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />9</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
				</tr>
				<tr>
					<td><input type="checkbox" />10</td>
					<td>11111</td>
					<td>昵称</td>
					<td><input type="button" value="激活" /><input type="button"
						value="信息重置" /><input type="button" value="删除" /></td>
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
	</div>
</body>
</html>
