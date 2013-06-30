var phoneList;
function autoPhone() {
	var actiondata = {
			inMessage:$("#publisherPhone").val()
	};
	$.ajax({
		type : "POST",
		url : "autoMessages.action",
		data :actiondata,
		dataType : "json",
		success : function(json) {
			/*
			 * $.each(json.msgContextList, function(i, item) {
			 * messagesList=item.msgConctent;
			 *  }
			 */
			phoneList = json.msgPhoneList;
			$(function() {
				$("#publisherPhone").autocomplete({
					source : phoneList
				});
			});
		}
	});
}
