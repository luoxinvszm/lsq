//发送信息的方法
$(function() {
		$("#btnGet").click(function() {

			//提交的参数，name和inch是和struts action中对应的接收变量
			var params = {
				publisherPhone : $("#publisherPhone").val(),
				publisherName :$("#publisherName").val(),
				messageContext : $("#messageContext").val(),
				auth:$("#authimg").val(),
				msgRemark:""
			};
			$.ajax({
				type : "POST",
				url : "insertMessage.action",
				data : params,
				dataType : "json", //ajax返回值设置为json格式
				success : function(json) { //返回的json
					var i = json.result;
					if(i==0){
						alert("发送成功，等待管理员审核");
						window.location.href="welcome.jsp";
					}
				}
			});
		});
	});


