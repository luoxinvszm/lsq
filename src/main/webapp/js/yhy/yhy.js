function searchUsingAdmin(stat) {
	//提交的参数，name和inch是和struts action中对应的接收变量
	var params= {
			userStatus:stat
	};
	var target;
	var btn="";
	var oprea;
	var s ;
	if(stat==0){
		target="#usingAdminList";
		btn="冻结";
		oprea="cancle";
		s ="deleteuser"
	}else if(stat==1){
		target="#deletedAdminList";
		btn="激活";
		oprea="recover";
		s="deleteusers"
	}
	
	$.ajax({
		type : "POST",
		url : "editOrdinAdminAction.action",
		data : params,
		dataType : "json", //ajax返回值设置为json格式
		success : function(json) {//返回的json
				$(target).html("<tr>"+
							"<th width=\"50\">序号</th>"+
							"<th width=\"100\">用户名</th>"+"<th width=\"100\">昵称</th>"+
							"<th width=\"200\">操作</th>"+
							"</tr>");
			 $.each(json.usersList, function(i, item) { //messageList是action中的list对的是get方法 
				 $(target).append(
						 	"<tbody id=\""+i+"\">"+
		                    "<tr id=\"tr\"><td><input type=\"checkbox\" value=\""+item.username+"\" name=\"id\" id=\"userId\"/>"+(i+1)+"</td><td>"+item.username  +"</td>" +
		                    "<td>"+item.userRealName+"</td>" +
		                    "<td><input type=\"button\" value=\""+btn+"\" onclick=\""+oprea+"("+item.username+","+i+")\" />" +
		                    "<input type=\"button\" value=\"密码重置\" onclick=\"resetPassword("+item.username+")\"/>" +
		                    "<input type=\"button\" value=\"删除\" onclick=\""+s+"("+item.username+","+i+")\" /></td></tr></tbody>");
			   }); 
		}
	});
}
var a="";
function deleteuser(a,b){
	var str = document.getElementById("usingAdminList");
	var params={
		userId:a
	};
	var f = confirm("确定要删除吗？");
	if(f){
	var s = "删除成功";
	$.ajax({
		type : "POST",
		url : "deleteUserAction.action",
		data : params,
		dateType:"json",
		success : function(s) { 
			var tr= document.getElementById(b);
	    	str.removeChild(tr);
		},
		error: function(){
			alert("服务器繁忙，请稍后再试");
			
		}
	});
	}else{
		
	}
	
}
function deleteusers(a,b){
	var str = document.getElementById("deletedAdminList");
	var params={
		userId:a
	};
	var f = confirm("确定要删除吗？");
	if(f){
	var s = "删除成功";
	$.ajax({
		type : "POST",
		url : "deleteUserAction.action",
		data : params,
		dateType:"json",
		success : function(s) { 
			var tr= document.getElementById(b);
	    	str.removeChild(tr);
		},
		error: function(){
			alert("服务器繁忙，请稍后再试");
			
		}
	});
	}else{
		
	}
	
}
function resetPassword(d){
	var params={
			username:d,
		};
		var f = confirm("确定要重置吗？");
		var s = "重置成功";
		if(f){
		$.ajax({
			type : "POST",
			url : "resetUserAction.action",
			data : params,
			dateType:"json",
			success : function(s) { 
				alert("重置成功");//返回的json
				window.location.reload();
			},
			error: function(){
				alert("服务器繁忙，请稍后再试");
			}
		});
		}else{
			
		}
	
}
var d;
function cancle(d,t){
	var str = document.getElementById("usingAdminList");
	
	var params={
			username:d,
			status:0
		};
		var f = confirm("确定要冻结吗？");
		var s = "冻结成功";
		if(f){
		$.ajax({
			type : "POST",
			url : "cancleUserAction.action",
			data : params,
			dateType:"json",
			success : function(s) { 
		    	var tr= document.getElementById(t);
		    	str.removeChild(tr);
			},
			error: function(){
				alert("服务器繁忙，请稍后再试");
			}
		});
		}else{
			
		}
	
}
var w;
function recover(w,r){
	var str = document.getElementById("deletedAdminList");
	var sta=1;
		var params={
			username:w,
			status:sta
		};
		var f = confirm("确定要激活吗？");
		var s ="激活成功";
		if(f){
		$.ajax({
			type : "POST",
			url : "cancleUserAction.action",
			data : params,
			dateType:"json",
			success : function(s) { 
				var tr= document.getElementById(r);
		    	str.removeChild(tr);
			},
			error: function(){
				alert("服务器繁忙，请稍后再试");
			}
		});
		}else{
			
		}
	
}

var ids="";
var di=0;
function batchdelete(){
	var id = document.getElementsByName("id");
	for(var i=0;i<id.length;i++){
		if(id[i].checked){
			ids+=id[i].value+",";
			di++;
		}
	}
	alert(ids);
	if(di==0){
		alert("请选中你要删除的信息!");
		return ;
	}
	var params= {
			userIds:ids
	};
	var f = confirm("确定要删除吗？");
	if(f){
	$.ajax({
		type : "POST",
		url : "batchdeleteUserAction.action",
		data : params,
		dataType : "json", //ajax返回值设置为json格式
		success : function(json) {
			alert("删除成功");//返回的json
			window.location.reload();
		},
		error: function(){
			alert("服务器繁忙，请稍后再试");
			
		}
	});
	}else{
		
	}
	di=0;
	ids="";
	id=null;
}
function exit(){
	var flag = confirm("确定要退出吗");
	if(flag){
		window.location.href="SafeExitAction.action";
	}

}
var flag=false;
function checkOld() {
	var oldPassword = document.getElementById("oldPassword").value;
	var old = document.getElementById("old").value;
	var u1 = document.getElementById("u1");
	if (oldPassword != old) {
		u1.style.display = "block";
		flag=false;
	} else {
		flag=true;
		u1.style.display = "none";
	}
}
function check() {
	var new1 = document.getElementById("new1").value;
	var new2 = document.getElementById("new2").value;
	var d2 = document.getElementById("d2");
	var u1 = document.getElementById("u1");
	var r1 = document.getElementById("r1");
	var right= document.getElementById("right10");
	if (new1 != new2) {
		d2.style.display = "block";
	} else if(flag){
		d2.style.display = "none";
		alert("修改成功!");
		updatePassword.submit();
	}else if(!flag){
		u1.style.display="block";
		alert("请输入原密码!");
	}
}
function checknew1() {
	var new1 = document.getElementById("new1").value;
	var d1 = document.getElementById("d1");
	if ("" == new1) {
		d1.style.display = "block";
	} else {
		d1.style.display = "none";
	}
}
function checkAll(){
	
	var id = document.getElementsByName("id");
	for(var i=0;i<id.length;i++){
		id[i].checked=true;
			
		}
	
}
function uncheckAll(){
	var id = document.getElementsByName("id");
	for(var i=0;i<id.length;i++){
		id[i].checked=false;
			
		}
}
function batchcancle(){
	var id = document.getElementsByName("id");
	for(var i=0;i<id.length;i++){
		if(id[i].checked){
			ids+=id[i].value+",";
			di++;
		}
	}
	if(di==0){
		alert("请选中你要冻结的管理员!");
		return ;
	}
	var params= {
			userIds:ids,
			sta:0
	};
	var f = confirm("确定要冻结吗？");
	if(f){
	$.ajax({
		type : "POST",
		url : "batchcancleUserAction.action",
		data : params,
		dataType : "json", //ajax返回值设置为json格式
		success : function(json) {
			alert("冻结成功");//返回的json
			window.location.reload();
		},
		error: function(){
			alert("服务器繁忙，请稍后再试");
			
		}
	});
	}else{
		
	}
	di=0;
	ids="";
	id=null;
}
function batchrecover(){
	var id = document.getElementsByName("id");
	for(var i=0;i<id.length;i++){
		if(id[i].checked){
			ids+=id[i].value+",";
			di++;
		}
	}
	if(di==0){
		alert("请选中你要激活的管理员!");
		return ;
	}
	var params= {
			userIds:ids,
			sta:1
	};
	var f = confirm("确定要激活吗？");
	if(f){
	$.ajax({
		type : "POST",
		url : "batchcancleUserAction.action",
		data : params,
		dataType : "json", //ajax返回值设置为json格式
		success : function(json) {
			alert("冻结成功");//返回的json
		},
		error: function(){
			alert("服务器繁忙，请稍后再试");
			
		}
	});
	}else{
		
	}
	di=0;
	ids="";
	id=null;
}
function checkcreate(){
	var name=document.getElementById("name").value;
	alert(name);
	if(""==name ){
		alert("请输入管理员姓名!");
	}else{
		var tag = "#createlist";
		var flag =confirm("是否确定要创建？");
		if(flag==true){
			var params= {
					RealName:name
			};
			$.ajax({
				type : "POST",
				url : "createOrdin.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) {//返回的json
						$(tag).html("");
					 $.each(json.list, function(i, item) {
						 alert(123);//messageList是action中的list对的是get方法 
						 $(tag).append(
								 "<tr><td>恭喜您,创建成功!</td></tr>" +
								 "<tr><td>用户名:"+item.username+"</td></tr>"+
								 "<tr><td>真实姓名:"+item.userRealName+"</td></tr>" +
								 "<tr><td>初始密码:"+item.password+"</td></tr>");
					   }); 
				},
				error: function(){
					alert("服务器繁忙，请稍后再试");
					
				}
			});
			
		}
		else{
			return ;
		}
	}
	

}
