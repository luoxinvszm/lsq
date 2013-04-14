<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<script type="text/javascript">
	var flag=false;
	function checkOld() {
		var oldPassword = document.getElementById("oldPassword").value;
		var old = document.getElementById("old").value;
		var u1 = document.getElementById("u1");
		if (oldPassword != old) {
			u1.style.display = "block";
			flag=false;
		} else {
			flag=true;
			u1.style.display = "none";
		}
	}
	function check() {
		var new1 = document.getElementById("new1").value;
		var new2 = document.getElementById("new2").value;
		var d2 = document.getElementById("d2");
		var u1 = document.getElementById("u1");
		if (new1 != new2) {
			d2.style.display = "block";
		} else if(flag){
			d2.style.display = "none";
			updatePassword.submit();
		}else if(!flag){
			u1.style.display="block";
			alert("请输入原密码!");
		}
	}
	function checknew1() {
		var new1 = document.getElementById("new1").value;
		var d1 = document.getElementById("d1");
		if ("" == new1) {
			d1.style.display = "block";
		} else {
			d1.style.display = "none";
		}
	}
</script>
</head>
<body>
	<%
		String password = session.getAttribute("password").toString();
	%>
	<form action="updatePassword_userAction" name="updatePassword">
		<table cellspacing="20" align="center">
			<tr>
				<td>请输入原密码:</td>
				<td><table width="500px">
						<tr>
							<td><input type="text" id="old" onblur="checkOld()" value=""/></td>
							<td><div style="display: none" id="u1">
									<font face="宋体" color="red">密码输入错误，请重新输入</font>
								</div></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>请输入新密码:</td>
				<td><table width="500px">
						<tr>
							<td><input type="password" onblur="checknew1()"
								name="user.password" id="new1" value="" /></td>
							<td><div style="display: none" id="d1">
									<font face="宋体" color="red">密码不能为空</font>
								</div></td>
						</tr>
					</table></td>
			</tr>
			<tr>
				<td>请再输入新密码:</td>
				<td><table width="500px">
						<tr>
							<td><input type="password" id="new2" value=""/></td>
							<td><div style="display: none" id="d2">
									<font face="宋体" color="red">两次密码输入不一致</font>
								</div></td>
						</tr>
					</table></td>
			</tr>

		</table>
		<input type="hidden" value=<%=password%> id="oldPassword"> <input
			type="button" onclick="check()" value="确定">

	</form>





</body>
</html>