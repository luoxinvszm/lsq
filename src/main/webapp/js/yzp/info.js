//textare限制字数 
maxLen = 200; // max number of characters allowed
function checkMaxInput(form) {
if (form.message.value.length > maxLen) // if too long.... trim it!
form.message.value = form.message.value.substring(0, maxLen);
// otherwise, update 'characters left' counter
else form.remLen.value = maxLen - form.message.value.length;
}

//**********************发布校园资讯&广告***************************//
$(function() {
		$("#submitInfoBtn").click(function() {

			//提交的参数
			var params = {
					userName : $("#userName").val(),
					infoTitle:$("#infoTitle").val(),
					infoType : $("#infoType").val(),
					infoContent:$("#infoContent").val()
			};
			$("#infoTitle").val("");
			$("#infoContent").val("");
//	        alert(params.userName);
//			alert(params.infoTitle);
//			alert(params.infoType);
//			alert(params.infoContent);
			$.ajax({
				type : "POST",
				url : "insertInfo.action",
				data : params,
				contentType: "application/x-www-form-urlencoded;charset=utf-8", 
				success : function() { //返回的json
					//发布后立即查询，实现即时更新效果
					$("#infos").html("");
					if($("#infoType").val()==0){
						//查询商家广告
						$("#infoTypeQuery").val(0);
						$("#paging5").asynPage3("queryBusInfo", null, "#datas", buildHtml,2, "busList", "totalSize");
					}
					if($("#infoType").val()==1){
						//查询校园资讯
						$("#infoTypeQuery").val(1);
						$("#paging5").asynPage2("querySchoolInfo", null, "#datas", buildHtml,2, "schoolList", "totalSize");
					}
					}
				
			});
		
		});
	});


//****************************************************************//
function queryInfo(temp){
	if(temp==2){
		//页面初始化加载查询
		//查询商家广告
		$("#paging5").asynPage3("queryBusInfo","","#datas",buildHtml,2,"busList","totalSize");

	}else if(temp==3){
		//根据infoType触发查询
			if($("#infoTypeQuery").val()==0){
				//查询商家广告
				$("#paging5").asynPage3("queryBusInfo", null, "#datas", buildHtml,2, "busList", "totalSize");
			}
			if($("#infoTypeQuery").val()==1){
				//查询校园资讯
				$("#paging5").asynPage2("querySchoolInfo", null, "#datas", buildHtml,2, "schoolList", "totalSize");
			}
		
	    }else{
		
	  }
	}
function buildHtml(List){
	$("#infos").html("");
	$.each(List,function(i,lis){
		var str = [
'<tr><td width="40"><input type="checkbox"/>',
			       i+1,'</td><td width="690"><span>标题:',lis.infoTitle,
			       '</span><br/><span>内容：',lis.infoContent,
			       '</span><span>管理员账号：',lis.userName,
			       '</span><span>发布时间：',lis.infoDate,
			       '</span></td><td width="40"><span><input type="button" value="删除" onclick="delInfo(',lis.infoId,')" /></span></td></tr>'
		].join('');
		$("#infos").append(str);
	});
}
function delInfo(temp){
	var params = {
			infoId : temp
		};
	$.ajax({
		type : "POST",
		url : "deleteInfo.action",
		data : params,
		success : function() { //返回的json
			//发布后立即查询，实现即时更新效果
			$("#infos").html("");
			if($("#infoTypeQuery").val()==0){
				//查询商家广告
				$("#paging5").asynPage3("queryBusInfo", null, "#datas", buildHtml,2, "busList", "totalSize");
			}
			if($("#infoTypeQuery").val()==1){
				//查询校园资讯
				$("#paging5").asynPage2("querySchoolInfo", null, "#datas", buildHtml,2, "schoolList", "totalSize");
			}
			}
		
	});
}




