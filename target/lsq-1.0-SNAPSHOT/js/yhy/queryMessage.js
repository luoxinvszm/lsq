function queryMessage(stat){
	//提交的参数，name和inch是和struts action中对应的接收变量
	var params= {
			publisherPhone:"",
			publishTime:"",
			msgStatus:stat
	};
	//0-待审核 1-已发布 2-未通过 3-已删除
	
	var target="";
	var btn1="";
	var btn2="";
	var oper="";
	if(stat==0){
		target="#messsageList0";
		oper="<td><span><input class=\"messageList0\" type=\"button\" value=\"发布\" onclick=\"publishMessageStatus(this)\"/></span><br>" +
        "<span><input class=\"messageList01\" type=\"button\" value=\"不通过\" onclick=\"unpublishMessageStatus(this)\"/></span></td>";
	}else if(stat==1){
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
	$.ajax({
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
	});
}



function publishMessageStatus(m){
	// alert($("#publisherPhone0").text());
	var idval = m.id;
	oper="<td><span><input class=\"messageList0\" type=\"button\" value=\"发布\" onclick=\"publishMessageStatus(this)\"/></span><br>" +
    "<span><input type=\"button\" class=\"messageList01\" value=\"不通过\" onclick=\"unpublishMessageStatus(this)\"/></span></td>";
	//alert(idval);
	var tablelength = $("#messsageList0 tr").length;
	//alert(tablelength);
	for(var i = 0;i<tablelength;i++){
		var string = "publish"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
		//	alert(publisherPhone1+" "+publishTime1);
			
			var params= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:1,
					mintus:1,
					nowStatus:0
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					$("#messsageList0").html("");
						$("#messsageList0").html("<tr>"+
							"<th width=\"50\">编号</th>"+
							"<th width=\"670\">信息内容</th>"+
							"<th width=\"50\">操作</th>"+
							"</tr>");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#messsageList0").append(
				                    "<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				                    oper+"</tr>");
						 			$("#tr"+i+"  .messageList0").attr("id","publish"+i);
						 			$("#tr"+i+"  .messageList01").attr("id","unpublish"+i);
						 			//alert($(".messageList0").attr("id"));
						 			//alert($("#publisherPhone"+i).text());
					   }); 
				}
			});
		}
	}
		
}

function unpublishMessageStatus(m){
	// alert($("#publisherPhone0").text());
	var idval = m.id;
	oper="<td><span><input class=\"messageList0\" type=\"button\" value=\"发布\" onclick=\"publishMessageStatus(this)\"/></span><br>" +
    "<span><input type=\"button\" class=\"messageList01\" value=\"不通过\" onclick=\"unpublishMessageStatus(this)\"/></span></td>";
	//alert(idval);
	var tablelength = $("#messsageList0 tr").length;
	//alert(tablelength);
	for(var i = 0;i<tablelength;i++){
		var string = "unpublish"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
		//	alert(publisherPhone1+" "+publishTime1);
			
			var params= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:2,
					mintus:1,
					nowStatus:0
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					$("#messsageList0").html("");
						$("#messsageList0").html("<tr>"+
							"<th width=\"50\">编号</th>"+
							"<th width=\"670\">信息内容</th>"+
							"<th width=\"50\">操作</th>"+
							"</tr>");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#messsageList0").append(
				                    "<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				                    oper+"</tr>");
						 			$("#tr"+i+"  .messageList0").attr("id","publish"+i);
						 			$("#tr"+i+"  .messageList01").attr("id","unpublish"+i);
					   }); 
				}
			});
		}
	}
}

function deleteMessage1(m){
	// alert($("#publisherPhone0").text());
	var idval = m.id;
	oper="<td><span><input class=\"messageList10\" type=\"button\" value=\"删除信息\"  onclick=\"deleteMessage1(this)\"/></span><br>" +
    "</td>";
	//alert(idval);
	var tablelength = $("#messsageList1 tr").length;
	//alert(tablelength);
	for(var i = 0;i<tablelength;i++){
		var string = "delete1"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
		//	alert(publisherPhone1+" "+publishTime1);
			
			var params= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:3,
					mintus:1,
					nowStatus:1
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					$("#messsageList1").html("");
						$("#messsageList1").html("<tr>"+
							"<th width=\"50\">编号</th>"+
							"<th width=\"670\">信息内容</th>"+
							"<th width=\"50\">操作</th>"+
							"</tr>");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#messsageList1").append(
				                    "<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				                    oper+"</tr>");
						 			$("#tr"+i+"  .messageList10").attr("id","delete1"+i);
						 			//alert($(".messageList0").attr("id"));
						 			//alert($("#publisherPhone"+i).text());
					   }); 
				}
			});
		}
	}
}


function deleteMessage2(m){
	// alert($("#publisherPhone0").text());
	var idval = m.id;
	oper="<td><span><input class=\"messageList20\" type=\"button\" value=\"删除\"  onclick=\"deleteMessage2(this)\"/></span><br>" +
    "<span><input class=\"messageList21\"  type=\"button\" value=\"待审\" onclick=\"waitMessage(this)\" /></span></td>";
	//alert(idval);
	var tablelength = $("#messsageList2 tr").length;
	//alert(tablelength);
	for(var i = 0;i<tablelength;i++){
		var string = "delete2"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
		//	alert(publisherPhone1+" "+publishTime1);
			
			var params= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:3,
					mintus:1,
					nowStatus:2
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					$("#messsageList2").html("");
						$("#messsageList2").html("<tr>"+
							"<th width=\"50\">编号</th>"+
							"<th width=\"670\">信息内容</th>"+
							"<th width=\"50\">操作</th>"+
							"</tr>");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#messsageList2").append(
				                    "<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				                    oper+"</tr>");
						 			$("#tr"+i+"  .messageList20").attr("id","delete2"+i);
						 			//alert($(".messageList0").attr("id"));
						 			//alert($("#publisherPhone"+i).text());
					   }); 
				}
			});
		}
	}
}

function waitMessage(m){
	// alert($("#publisherPhone0").text());
	var idval = m.id;
	oper="<td><span><input class=\"messageList20\" type=\"button\" value=\"删除\"  onclick=\"deleteMessage2(this)\"/></span><br>" +
    "<span><input class=\"messageList21\"  type=\"button\" value=\"待审\" onclick=\"waitMessage(this)\" /></span></td>";
	//alert(idval);
	var tablelength = $("#messsageList2 tr").length;
	//alert(tablelength);
	for(var i = 0;i<tablelength;i++){
		var string = "wait"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
		//	alert(publisherPhone1+" "+publishTime1);
			
			var params= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:0,
					mintus:1,
					nowStatus:2
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					$("#messsageList2").html("");
						$("#messsageList2").html("<tr>"+
							"<th width=\"50\">编号</th>"+
							"<th width=\"670\">信息内容</th>"+
							"<th width=\"50\">操作</th>"+
							"</tr>");
					 $.each(json.messageList, function(i, item) { //messageList是action中的list对的是get方法 
						 $("#messsageList2").append(
				                    "<tr id=\"tr"+i+"\"><td><input type=\"checkbox\" />"+i+"</td>" +
				                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span>电话：<span id=\"publisherPhone"+i+"\">"+item.publisherPhone+"</span>提交时间：<span id=\"publishTime"+i+"\">"+item.publishTime+"</span></td>" +
				                    oper+"</tr>");
						 			$("#tr"+i+"  .messageList21").attr("id","wait"+i);
						 			//alert($(".messageList0").attr("id"));
						 			//alert($("#publisherPhone"+i).text());
					   }); 
				}
			});
		}
	}
}
