/**
	* 获得系统当前时间方法-eclock-简单实现 
	* @param clock 
	* 使用说明：在你想加入时间的页面写入如下代码：
	*        1.导入该js文件---<script type="text/javascript" src="../js/curDate.js"></script>
	*        2.在页面载入加载方法-----<body onLoad="getEClock(clock)">
	*        3.在id="clock"位置显示时间----<p id="clock"></p>
	*  @author yzp
	*/
	function getEClock(clock) {
		var date = new Date();
		var year = date.getFullYear();//年-4位表示 如：2012 
		var month = date.getMonth() + 1;//月 0~11 所以要加 1才正确 
		var day = date.getDate();//日 1~31 
		var week = date.getDay();//星期 0~6 
		var weeks = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");//自己写的数组,为了匹配中文的星期 
		var xq = weeks[week];//星期 
		var hour = date.getHours();//小时0~23 
		var hourStr="";
		if(hour>=0&&hour<=9){
			
			hourStr="0"+hour.toString();
			
		}else{
			hourStr=hour.toString();
		}
		
		var min = date.getMinutes();//分钟0~59 
		var minStr="";
		if(min>=0&&min<=9){
			
			minStr="0"+min.toString();
			
		}else{
			minStr=min.toString();
		}
		var sec = date.getSeconds();//秒 0~59 
		var secStr="";
		if(sec>=0&&sec<=9){
			
			secStr="0"+sec.toString();
			
		}else{
			secStr=sec.toString();
		}
		var datetime = year + "年" + month + "月" + day + "日" + " " + xq + " ";
				//+ hourStr + ":" + minStr + ":" + secStr;//拼接一起,当然可以直接在这里修改显示格式 
		clock.innerHTML = "<font size='2px'>"+datetime+"</font>";//以html文本形式显示在页面上 
	}
	window.onload = function() {//window 对象调用onload在页面加载时执行该匿名函数 
		var timer = window.setInterval("getEClock(clock)", 1000);//setInterval("A()",B)每隔多少时间执行一次A方法 
	};