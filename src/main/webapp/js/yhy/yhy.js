
	function searchUsingAdmin() {

		//提交的参数，name和inch是和struts action中对应的接收变量
		var params = {
				
				userStatus:0
		};
		$.ajax({
			type : "POST",
			url : "editOrdinAdminAction.action",
			data : params,
			dataType : "json", //ajax返回值设置为json格式
			success : function(json) { //返回的json
					$("#usingAdmin").html("");
				 $.each(json.usersList, function(i, item) { //messageList是action中的list对的是get方法 
					 $("#usingAdmin").append(
							 
			                     );
				   }); 
			}
		});
	}


