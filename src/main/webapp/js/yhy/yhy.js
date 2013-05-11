function searchUsingAdmin(stat) {
	//提交的参数，name和inch是和struts action中对应的接收变量
	var params= {
			userStatus:stat
	};
	var target;
	var btn="";
	if(stat==0){
		target="#usingAdminList";
		btn="<td><input type=\"button\" value=\"冻结\" />";
	}else if(stat==1){
		target="#deletedAdminList";
		btn="<td><input type=\"button\" value=\"激活\" />";
	}
	$.ajax({
		type : "POST",
		url : "editOrdinAdminAction.action",
		data : params,
		dataType : "json", //ajax返回值设置为json格式
		success : function(json) { //返回的json
				$(target).html("");
			 $.each(json.usersList, function(i, item) { //messageList是action中的list对的是get方法 
				 $(target).append(
		                    "<tr><td><input type=\"checkbox\" />"+i+"</td><td>"+item.username  +"</td>" +
		                    "<td>"+item.userRealName+"</td>" +
		                    btn +
		                    "<input type=\"button\" value=\"信息重置\" />" +
		                    "<input type=\"button\" value=\"删除\"/></td></tr>");
			   }); 
		}
	});
}
