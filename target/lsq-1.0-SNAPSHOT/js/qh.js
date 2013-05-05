function submit() {
	var jqueryobj = $("#publishTime");
	var publishTime = jqueryobj.val();
	if (publishTime == "" || publishTime == null) {
		alert("publishTime不能为空");
	} else {
		$.getJSON("qureyMessage?publishTime=" + publishTime, function(data) {//向action请求提交数据
			var resultObj = $("#result");
			resultObj.html("");//清空result
			resultObj.html(data.publishTime);//json方式解析由action返回的数据,并在页面显示,其他解析方式如下
			// document.getElementById("result").innerHTML="username:"+data.username;
		});
	}
}
//------------------json数据解析------------------
//$.getJSON("loginAction", function(data) {
// $("#result").html("");//清空info内容
//-----------------直接对数据解析------------------
// $("#result").append(data.username);
//-----------------数组,list的解析方式-------------
// $.each(data.users, function(i, item) {
//   $("#info").append(
//        "<div>" + item.username + "</div>" + 
//         "<div>" + item.password+ "</div><hr/>");
//  });
//-----------------解析map数据--------------
//  $.each(data.usersMap,function(key,value){
//      $("#mapinfo").append(key+"----"+value+"<br/><hr/>");
//   });
// });