
var messagesList;
function autoMessages() {
	$.ajax({
		type : "POST",
		url : "autoMessages.action",
		dataType : "json",
		success : function(json) {
			/*$.each(json.msgContextList, function(i, item) {
				messagesList=item.msgConctent;

			}*/
			messagesList=json.msgContextList;
			$(function() {
				$("#tags").autocomplete({
					source : messagesList
				});
			});
		}
	});
}

