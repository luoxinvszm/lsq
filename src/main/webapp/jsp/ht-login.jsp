<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>

<% String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<link href="<%=path %>/css/ht-login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function changeImage() {
		var date = new Date();
		document.getElementById("auth").src = 'authImg?id=' + date.getTime();
	}
	function check1() {

		var id = document.getElementById("pass1");
		var hid = document.getElementById("d1");
		if ("" == id.value) {
			hid.style.display = "block";
		} else {

			hid.style.display = "none";
		}
	}
	function checkyan() {
		var username = document.getElementById("yanzhengma");
		var u1 = document.getElementById("yan");
		if ("" == username.value) {
			u1.style.display = "block";
		} else {
			u1.style.display = "none";
		}
	}
	function checkuser() {
		var username = document.getElementById("zh");
		var u1 = document.getElementById("u1");
		if ("" == username.value) {
			u1.style.display = "block";
		} else {
			u1.style.display = "none";
		}
	}
</script>
</head>
<body>
	<div class="wrap">
		<h1>
			<img src="<%=path%>/image/ht-login_h1.gif" alt="校园信息自主发布平台" />
		</h1>
		<img src="<%=path %>/image/login_img.gif" alt="login" class="img" />
		<font color="red" face="songti"><s:fielderror /></font>
		<s:form action="login" method="post">
			<dl>
				<dt>用户名：</dt>
				<dd>
					<input type="text" name="username"
						onblur="checkuser()" id="zh" class="text" />
					<div style="display: none" id="u1" class="font">
						<font face="宋体" color="red">用户名不能为空</font>
					</div>
				</dd>
				<dt>密码:</dt>
				<dd>
					<input type="password"
						name="password" onblur="check1()" id="pass1" class="text" />
					<div style="display: none" id="d1" class="font">
						<font face="宋体" color="red">密码不能为空</font>
					</div>
				</dd>

				<dt>验证码:</dt>
				<dd class="dd">
					<input type="text" name="auth" onblur="checkyan()"
								id="yanzhengma" class="text" />
							<div class="img1">
								<img src="authImg" name="auth" id="auth" /><a
								href="javascript:void(0)" onclick="changeImage()">看不清</a>
							</div>
							<div style="display: none" id="yan" class="font">
									<font face="宋体" color="red">验证码不能为空</font>
								</div>
				</dd>
			</dl>



			<div class="btnbox">
				<input type="submit" value="登录" class="btn" />
			</div>
	</s:form>
	</div>
</body>
</html>
