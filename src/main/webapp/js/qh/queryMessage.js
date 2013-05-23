var target="";
var btn1="";
var btn2="";
var oper="";
function queryMessage(stat){
	//提交的参数，name和inch是和struts action中对应的接收变量
	var params = "msgStatus="+stat;
	//0-待审核 1-已发布 2-未通过 3-已删除
	
	if(stat==0){
		target="#messsageList0";
		oper="<td><span><input class=\"messageList0\" type=\"button\" value=\"发布\" onclick=\"publishMessageStatus(this)\"/></span><br>" +
        "<span><input class=\"messageList01\" type=\"button\" value=\"不通过\" onclick=\"unpublishMessageStatus(this)\"/></span></td>";
	}else if(stat==1){
		alert(stat);
		target="#messsageList1";
		oper="<td><span><input class=\"messageList10\" type=\"button\" value=\"删除信息\"  onclick=\"deleteMessage1(this)\"/></span><br>" +
        "</td>";
	}else if(stat==2){
		target="#messsageList2";
		oper="<td><span><input class=\"messageList20\" type=\"button\" value=\"删除\"  onclick=\"deleteMessage2(this)\"/></span><br>" +
        "<span><input class=\"messageList21\"  type=\"button\" value=\"待审\"  onclick=\"waitMessage(this)\"/></span></td>";
	}else if(stat==3){
		target="#messsageList3";
		oper="<td></td>"
	}
	$("#paging").asynPage("qureyMessage.action",params,target,buildHtml,2,"messageList","totalSize");
}

function buildHtml(messageList){
	$(target).html("<tr>"+
			"<th width=\"50\">编号</th>"+
			"<th width=\"670\">信息内容</th>"+
			"<th width=\"50\">操作</th>"+
	"</tr>");
	$.each(messageList,function(i,message){
		var str = [
		       	"<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				"<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				oper+"</tr>"
		].join('');
		$(target).append(str);
	});
}



/*$.ajax({
	type : "POST",
	url : "qureyMessage.action",
	data : params,
	dataType : "json", //ajax返回值设置为json格式
	success : function(json) { //返回的json
		$(target).html("<tr>"+
				"<th width=\"50\">编号</th>"+
				"<th width=\"670\">信息内容</th>"+
				"<th width=\"50\">操作</th>"+
		"</tr>");
		$.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
			$(target).append(
					"<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
					"<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
					oper+"</tr>");
			//0状态的
			$("#tr"+i+"  .messageList0").attr("id","publish"+i);
			$("#tr"+i+"  .messageList01").attr("id","unpublish"+i);
			//1状态的
			$("#tr"+i+"  .messageList10").attr("id","delete1"+i);
			//2状态的
			$("#tr"+i+"  .messageList20").attr("id","delete2"+i);
			$("#tr"+i+"  .messageList21").attr("id","wait"+i);
			//alert($(".messageList0").attr("id"));
			//alert($("#publisherPhone"+i).text());
		}); 
	}
});*/