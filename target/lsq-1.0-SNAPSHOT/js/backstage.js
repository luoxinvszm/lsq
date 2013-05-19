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
	$.getJSON("querySettings");
}