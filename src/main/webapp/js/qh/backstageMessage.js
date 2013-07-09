function queryMessage(stat){
	if(stat==0){
		var time ="";
		var phone = "";
		var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
		$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
				4, "messageList", "totalSize");
	}else if(stat==1){
		var time ="";
		var phone = "";
		var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
		$("#paging1").asynPage("qureyMessage.action", params, "#messsageList1", buildHtml1,
				4, "messageList", "totalSize");
	}else if(stat==2){
		var time ="";
		var phone = "";
		var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
		$("#paging2").asynPage("qureyMessage.action", params, "#messsageList2", buildHtml2,
				4, "messageList", "totalSize");
	}else if(stat==3){
		var time ="";
		var phone = "";
		var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
		$("#paging3").asynPage("qureyMessage.action", params, "#messsageList3", buildHtml3,
				4, "messageList", "totalSize");
	}
}
//待审核展示
function buildHtml0(messageList){
	$.each(messageList,function(i,message){
		var str = [
		       '<tr id="tr'+i+'"><td><input type="checkbox"/>',
		       i+1,'</td><td><span id="messageContent'+i+'">',
		      message.msgConctent,
		      '</span><br /> <span>署名：',
		      message.publisherName,
		      '</span>电话：<span id="publisherPhone'+i+'">',
		      message.publisherPhone,
		      '</span>提交时间：<span id="publishTime'+i+'">',
		      message.publishTime,
		       '</span></td>',
		       '<td><span><input id="publish'+i+'" class="messageList0" name="publicMessage" type="button" value="发布" onclick="publishMessageStatus(this)"/></span><span>发布时间<input id="publishMintusLength'+i+'" type="text" value="1"/></span><br>',
		       '<span><input id="unpublish'+i+'" class="messageList01" type="button" value="不通过" onclick="unpublishMessageStatus(this)"/></span></td>',
		       '</tr>'    
		].join('');
		$("#messsageList0").append(str);
	});
}

//(待审中)发布方法
function publishMessageStatus(m){
	var idval = m.id;
	var tablelength = $("#messsageList0 tr").length;
	for(var i=0;i<tablelength;i++){
		var string = "publish"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
			var publishMintusLength = "#publishMintusLength"+i;
			var messageContent1 = "#messageContent"+i;
			//alert($(messageContent1).text());
			var params1= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:1,
					mintus:$(publishMintusLength).val(),
					msg:$(messageContent1).text()
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params1,
				dataType : "json", //ajax返回值设置为json格式
				success : function() { //返回的json
					var stat=0;
					var time ="";
					var phone = "";
					var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
					$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
							4, "messageList", "totalSize");
				}
			});
		}
	}
}
//(待审中)未通过的方法
function unpublishMessageStatus(m){
	var idval = m.id;
	var tablelength = $("#messsageList0 tr").length;
	for(var i=0;i<tablelength;i++){
		var string = "unpublish"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone"+i;
			var publishTime1	 = "#publishTime"+i;
			var params1= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:2,
					mintus:1,
				
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params1,
				dataType : "json", //ajax返回值设置为json格式
				success : function() { //返回的json
					var stat=0;
					var time ="";
					var phone = "";
					var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
					$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
							4, "messageList", "totalSize");
				}
			});
		}
	}
}

//已发布展示
function buildHtml1(messageList){
	$.each(messageList,function(i,message){
		var str = [
		       '<tr><td><input type="checkbox"/>',
		       i+1,'</td><td>',
		       message.msgConctent,
			   '<br /> <span>署名：',
			   message.publisherName,
			   '</span>电话：<span id="publisherPhone1'+i+'">',
			   message.publisherPhone,
			   '</span>提交时间：<span id="publishTime1'+i+'">',
			   message.publishTime,
			   '</span></td>',
		       '<td><span><input id="deletePublishMessage'+i+'" class="messageList10" type="button" value="删除信息" onclick="deletePublishMessage(this)"/></span><br>',
		       '</td>',
		       '</tr>'    
		].join('');
		$("#messsageList1").append(str);
	});
}

//(发布中)删除方法---------------------未完成，有bug
function deletePublishMessage(m){
	var idval = m.id;
	var tablelength = $("#messsageList1 tr").length;
	for(var i=0 ;i<tablelength;i++){
		var string = "deletePublishMessage"+i;
		if(string==idval){
			var publisherPhone1 = "#publisherPhone1"+i;
			var publishTime1	 = "#publishTime1"+i;
			var params1= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:3,
					mintus:1,
					
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params1,
				dataType : "json", //ajax返回值设置为json格式
				success : function() { //返回的json
					var stat=1;
					var time ="";
					var phone = "";
					var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
					$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
							4, "messageList", "totalSize");
				}
			});
		}
	}
}
//未通过展示
function buildHtml2(messageList){
	$.each(messageList,function(i,message){
		var str = [
		       '<tr><td><input type="checkbox"/>',
		       i+1,'</td><td>',
		       message.msgConctent,
			      '<br /> <span>署名：',
			      message.publisherName,
			      '</span>电话：<span id="publisherPhone2'+i+'">',
			      message.publisherPhone,
			      '</span>提交时间：<span id="publishTime2'+i+'">',
			      message.publishTime,
			       '</span></td>',
		       '<td><span><input id="deleteUnpublishMessage'+i+'" class="messageList20" type="button" value="删除" onclick="deleteUnpublishMessage(this)"/></span><br>',
		       '<span><input id="waitMessage'+i+'" class="messageList21" type="button" value="待审" onclick="waitMessage(this)"/></span></td>',
		       '</tr>'    
		].join('');
		$("#messsageList2").append(str);
	});
}

//（未通过）删除方法
function deleteUnpublishMessage(m){
	var idval = m.id;
	//alert(idval);
	var tablelength = $("#messsageList2 tr").length;
	//alert(tablelength);
	for(var i=0 ;i<tablelength;i++){
		var string = "deleteUnpublishMessage"+i;
		//alert(string);
		if(string==idval){
			var publisherPhone1 = "#publisherPhone2"+i;
			var publishTime1	 = "#publishTime2"+i;
			//alert($(publisherPhone1).text());
			var params1= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:3,
					mintus:1,
					
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params1,
				dataType : "json", //ajax返回值设置为json格式
				success : function() { //返回的json
					var stat=2;
					var time ="";
					var phone = "";
					var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
					$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
							4, "messageList", "totalSize");
				}
			});
		}
	}
}
//（未通过）待审方法
function waitMessage(m){
	var idval = m.id;
	//alert(idval);
	var tablelength = $("#messsageList2 tr").length;
	//alert(tablelength);
	for(var i=0 ;i<tablelength;i++){
		var string = "waitMessage"+i;
		//alert(string);
		if(string==idval){
			var publisherPhone1 = "#publisherPhone2"+i;
			var publishTime1	 = "#publishTime2"+i;
			//alert($(publisherPhone1).text());
			var params1= {
					publisherPhone:$(publisherPhone1).text(),
					publishTime:$(publishTime1).text(),
					status:0,
					mintus:1,
					
			};
			$.ajax({
				type : "POST",
				url : "updateMessageStatus.action",
				data : params1,
				dataType : "json", //ajax返回值设置为json格式
				success : function() { //返回的json
					var stat=2;
					var time ="";
					var phone = "";
					var params = "msgStatus="+stat+"&publishTime=" + time + "&publisherPhone=" + phone;
					$("#paging").asynPage("qureyMessage.action", params, "#messsageList0", buildHtml0,
							4, "messageList", "totalSize");
				}
			});
		}
	}
}
//已删除展示
function buildHtml3(messageList){
	$.each(messageList,function(i,message){
		var str = [
		       '<tr><td><input type="checkbox"/>',
		       i+1,'</td><td>',
		      message.msgConctent,
		      '<br /> <span>署名：',
		      message.publisherName,
		      '</span>电话：<span>',
		      message.publisherPhone,
		      '</span>提交时间：<span>',
		      message.publishTime,
		       '</span></td>',
		       '<td></td>',
		       '</tr>'    
		].join('');
		$("#messsageList3").append(str);
	});
}
