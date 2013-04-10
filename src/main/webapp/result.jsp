<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	username: ${requestScope.username }
	<br> password: ${requestScope.password }
	<a href="CreateManager.action">创建普通管理员</a>





username: ${requestScope.username }<br>
password: ${requestScope.password } 
<a href="createOrdin.action">创建普通管理员</a>
<a href="createSuper.action">创建超级管理员</a>


</body>
</html>