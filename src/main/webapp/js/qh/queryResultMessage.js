$(function() {
		$("#btnGet").click(function() {

			//提交的参数，name和inch是和struts action中对应的接收变量
			var params = {
				publisherPhone : $("#publisherPhone").val(),
				publishTime : "",
				msgStatus : 1
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
				                    "<li><a href='#'>" + item.msgConctent + "</a>"+item.publishTime+"</li>"  );
					   }); 
				}
			});
		});
	});