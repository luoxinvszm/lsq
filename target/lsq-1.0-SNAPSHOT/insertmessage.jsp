<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertMessage">
		messageContext:<textarea rows="5" cols="15" name="messageContext"></textarea><br>
		publisherName:<input type="text" name="publisherName"><br>
		publisherPhone:<input type="text" name="publisherPhone"><br>
		msgRemark:<input type="text" name="msgRemark"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>