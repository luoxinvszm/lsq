var messagesList;
function autoMessages() {
	var actiondata = {
			inMessage:$("#tags").val()
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
			messagesList = json.msgContextList;
			$(function() {
				$("#tags").autocomplete({
					source : messagesList
				});
			});
		}
	});
}
