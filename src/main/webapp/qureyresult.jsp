<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
function loadInfo() {
    $.getJSON("QueryMessageAction", function(data) {
        $("#info").html("");//清空info内容
        $.each(data.messageList, function(i, item) {
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
        });
}
</script>
</head>
<body>
	<input type="button" value="查查！"  onclick="loadInfo()" >
	<div id="info"></div>
</body>
</html>