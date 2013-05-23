function updateperMsgWords()
{
	var settingsValue=$("#perMsgWords").val();
	if (settingsValue == "" || settingsValue == null) {
		alert("用户名不能为空");
	} else {
		$.getJSON("systemSettings?method=perMsgWords&settingsValue=" + settingsValue);
	}	
}
function updatesendMsgNum()
{
	var settingsValue=$("#sendMsgNum").val();
	if (settingsValue == "" || settingsValue == null) {
		alert("用户名不能为空");
	} else {
		$.getJSON("systemSettings?method=sendMsgNum&settingsValue=" + settingsValue);
	}	
}
function updatedefaultPasswords()
{
	var settingsValue=$("#defaultPasswords").val();
	if (settingsValue == "" || settingsValue == null) {
		alert("用户名不能为空");
	} else {
		$.getJSON("systemSettings?method=defaultPasswords&settingsValue=" + settingsValue);
	}	
}
function querySettings() {
<<<<<<< HEAD
	$.getJSON("querySettings");
=======
	// $.getJSON("querySettings");
	$.ajax({
		type : "POST",
		url : "querySettings.action",
		dataType : "json", 
		success : function(json) {
			$("#sendMsgNum").val(json.settings[0].settingsValue);
			$("#perMsgWords").val(json.settings[1].settingsValue);
			$("#defaultPasswords").val(json.settings[2].settingsValue);
			}
		});
>>>>>>> a6a2aa3f0b2bfc3a7d9aae1e4ed3ffacc7d9f0d9
}