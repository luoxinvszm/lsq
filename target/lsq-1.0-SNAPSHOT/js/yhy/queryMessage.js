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
		oper="<td><span><input type=\"button\" value=\"发布\" /></span><br>" +
        "<span><input type=\"button\" value=\"不通过\" /></span></td>"
	}else if(stat==1){
		target="#messsageList1";
		oper="<td><span><input type=\"button\" value=\"删除信息\" /></span><br>" +
        "<span><input type=\"button\" value=\"撤销发布\" /></span></td>"
	}else if(stat==2){
		target="#messsageList2";
		oper="<td><span><input type=\"button\" value=\"删除\" /></span><br>" +
        "<span><input type=\"button\" value=\"待审\" /></span></td>"
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
		                    "<tr><td><input type=\"checkbox\" />"+i+"</td>" +
		                    "<td>"+item.msgConctent+"<br /> <span>署名："+item.publisherName+"</span><span>电话："+item.publisherPhone+"</span><span>提交时间："+item.publishTime+"</span></td>" +
		                    oper);
			   }); 
		}
	});
}