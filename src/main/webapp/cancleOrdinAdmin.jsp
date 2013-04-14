<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	<s:iterator value="usersList" id="id">
	
	<s:property value="#id.getUsername()"/><a href="editOrdinAdminAction!deleteUser.action?userId=<s:property value="#id.getUserId()"/>">冻结账号</a><br>
	</s:iterator>
<%
	String username=session.getAttribute("username").toString();
	String password=session.getAttribute("password").toString();
%>
	<a href="login?username=<%=username%>& password=<%=password%>">返回首页</a>
	
</body>
</html>