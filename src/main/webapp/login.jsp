<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>管理员登陆界面</title>
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
		function checkyan(){
		var username=document.getElementById("yanzhengma");
			var u1 = document.getElementById("yan");
			if(""==username.value){
			u1.style.display="block";
			}
			else{
			u1.style.display="none";
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
	<font color="red" face="songti"><s:fielderror /></font>
	<s:form action="login" method="post">
		<table cellspacing="20" align="center">
			<tr>
				<td>请输入用户名:</td>
				<td><table width="500px">
						<tr>
							<td><input type="text" name="username"
								style="width: 200px; height: 30px;" onblur="checkuser()" id="zh" />
							</td>
							<td><div style="display: none" id="u1">
									<font face="宋体" color="red">用户名不能为空</font>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>请输入密码</td>
				<td><table width="500px">
						<tr>
							<td><input type="password"
								style="width: 200px; height: 30px; bgcolor: yellow"
								name="password" onblur="check1()" id="pass1" />
							</td>
							<td><div style="display: none" id="d1">
									<font face="宋体" color="red">密码不能为空</font>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>请输入验证码：</td>
				<td><table>
						<tr>
							<td><input type="text" name="auth" onblur="checkyan()"
								id="yanzhengma" />
							</td>
							<td><img src="authImg" name="auth" id="auth"/><a
								href="javascript:void(0)" onclick="changeImage()">看不清</a>
							</td>
							<td><div style="display: none" id="yan">
									<font face="宋体" color="red">验证码不能为空</font>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		
		<tr><td align="center"><input type="submit" value="submit" /></td></tr>
	</table>
	</s:form>
</body>
</html>