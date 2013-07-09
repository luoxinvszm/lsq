//textare限制字数 
maxLen = 200; // max number of characters allowed
function checkMaxInput(form) {
if (form.message.value.length > maxLen) // if too long.... trim it!
form.message.value = form.message.value.substring(0, maxLen);
// otherwise, update 'characters left' counter
else form.remLen.value = maxLen - form.message.value.length;
}

//**********************************************************//
$(function() {
		$("#submitInfoBtn").click(function() {

			//提交的参数
			var params = {
					userName : $("#userName").val(),
					infoTitle:$("#infoTitle").val(),
					infoType : $("#infoType").val(),
					infoContent:$("#infoContent").val()
			};
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
					
					}
				
			});
		
		});
	});


