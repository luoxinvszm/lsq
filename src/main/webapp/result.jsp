<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
username: ${requestScope.username }<br>
password: ${requestScope.password } 
<a href="CreateOrdin.action">创建普通管理员</a>
<a href="CreateSuper.action">创建超级管理员</a>
</body>
</html>