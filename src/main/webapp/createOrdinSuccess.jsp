<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>创建成功</title>
</head>
<body>恭喜您 创建成功
<%
	String username=session.getAttribute("username").toString();
	String password=session.getAttribute("password").toString();
%>
username: ${requestScope.username }<br/>
password: ${requestScope.password } <br/>
userRealName:${requestScope.sname } 
<a href="login?username=<%=username%>& password=<%=password%>">返回继续添加</a>

</body>
</html>