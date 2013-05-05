<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建普通管理员</title>
<script type="text/javascript">
	function check(){
		var name=document.getElementById("name").value;
		if(""==name ){
			alert("请输入管理员姓名!");
		}else{
			var flag =confirm("是否确定要创建？");
			if(flag==true){
				createOrdin.submit();
			}else{
				return ;
			}
		}
		
	}

</script>
</head>
<body>
第一步----输入管理员姓名
<%
	request.setCharacterEncoding("utf-8");
%>
<form action="createOrdin.action" name="createOrdin">
<input  type="text" name="userRealName" id="name"/>
<input type="button" onclick="check()" value="创建"/>
</form>
</body>
</html>