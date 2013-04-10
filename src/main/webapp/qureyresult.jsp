<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<ol>
		<s:iterator value="messageList" >；
			<s:property value="msgId"/>：
			<s:property value="msgTypeId" />；
			<s:property value="msgConctent" />：
			<s:property value="publisherName" />；
			<s:property value="publisherPhone" />：
			<s:property value="publishTime" />；
			<s:property value="msgRemark" />
			
		</s:iterator>
	</ol>
</body>
</html>