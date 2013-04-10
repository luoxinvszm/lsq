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
	<font color="red" face="songti"><s:fielderror/></font>
	<form action="login" method="post">
		
		用户:<input type="text" name="username"><br>
		密码:<input type="password" name="password"><br>
		<input type="submit" value="submit" />
	</form>
</body>
</html>