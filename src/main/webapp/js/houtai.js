function Tab(num) {
	var i;
	if (num == 9) {
		displayNone();
		displayOne(num);
		querySettings();
		document.getElementById("right10").style.display = "none";
	}else if(num==1){
		displayNone();
		displayOne(num);
		queryMessage(0);
		document.getElementById("right10").style.display = "none";
	}else if(num==2){
		displayNone();
		displayOne(num);
		queryMessage(1);
		document.getElementById("right10").style.display = "none";
	}else if(num==3){
		displayNone();
		displayOne(num);
		queryMessage(2);
		document.getElementById("right10").style.display = "none";
	}else if(num==4){
		displayNone();
		displayOne(num);
		queryMessage(3);
		document.getElementById("right10").style.display = "none";
	}else if(num==5){
		displayNone();
		displayOne(num);
		queryInfo(2);
		document.getElementById("right10").style.display = "none";
	}
	else if(num == 6){
		displayNone();
		displayOne(num);
		document.getElementById("right10").style.display = "none";
	}else if(num == 7){
		displayNone();
		displayOne(num);
		searchUsingAdmin(0);
		document.getElementById("right10").style.display = "none";
	}else if(num==8){
		displayNone();
		displayOne(num);
		searchUsingAdmin(1);
		document.getElementById("right10").style.display = "none";
	}else if(num==10){
		document.getElementById("right10").style.display = "block";
	}
}

function displayOne(m){
	for(var i=1;i<=10;i++){
		if(m!=i){
			//$("#right"+m).html("");
			//document.getElementById("right" + m).style.display = "none";
			$("#right"+m).hide();
		}
	}
	$("#right"+m).show();
}
function displayNone(){
	for(var i=1;i<=10;i++){
		$("#right"+i).hide();
	}
}
