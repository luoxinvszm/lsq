<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
function a(m){
	var id = m.id;
	alert(id);
	
}

</script>
</head>
<body>
	<form action="updateMessageStatus">
		<input type="text" name="mintus" value="1">
		<input type="text" name="status" value="status">
		<input type="text" name=publisherPhone value="publisherPhone">
		<input type="text" name="publishTime" value="publishTime">
		<input type="submit" value="搜索">
	</form>
	<span id="f">11111</span>
	<input id="n" class="aa" type="button" value="get" onclick="a(this)">
</body>
</html>