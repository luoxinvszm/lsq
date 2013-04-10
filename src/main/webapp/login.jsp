<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
	<s:fielderror/>
	<form action="login">
		username:<input type="text" name="username"><s:fielderror fieldName="username"/><br>
		password:<input type="password" name="password"><s:fielderror fieldName="password"/><br>
		<input type="text" name="auth"/> <img src="authImg" id="img" border="0" onclick= "this.src='authImg?d'+(new Date().getTime());" alt="请输入此验证码，如看不清请点击刷新。" style="cursor:pointer" />  
<input type="submit" value="submit" onclick="f()"/>
	</form>
</body>
</html>