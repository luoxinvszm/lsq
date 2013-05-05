<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>

<script type="text/javascript">
	$(function() {
		$("#btnGet").click(function() {

			//提交的参数，name和inch是和struts action中对应的接收变量
			var params = {
				publisherPhone : $("#publisherPhone").val(),
				publishTime : $("#publishTime").val(),
				msgStatus : $("#msgStatus").val()
			};
			$.ajax({
				type : "POST",
				url : "qureyMessage.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
						$("#info").html("");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#info").append(
				                    "<div>" + item.msgId + "</div>" + 
				                    "<div>" + item.msgTypeId + "</div>" + 
				                    "<div>" + item.msgStatus + "</div>" + 
				                    "<div>" + item.msgConctent + "</div>" + 
				                    "<div>" + item.publisherName + "</div>" + 
				                    "<div>" + item.publisherPhone + "</div>" + 
				                    "<div>" + item.msgRemark + "</div>" + 
				                    "<div>" + item.publishTime + "</div><hr/>");
					   }); 
				}
			});
		});
	});
</script>
</head>
<body>

	<input type="text" id="publisherPhone" value="publisherPhone">
	<input type="text" id="publishTime" value="publishTime">
	<input type="text" id="msgStatus" value="msgStatus">
	<br>

	<input type="button" value="获取" id="btnGet" />
	<br>
	<div id="info"></div>
</body>
</html>