function Tab(num) {
	var i;
	if (num == 8) {
		querySettings();
		document.getElementById("right10").style.display = "none";
	}else if(num==1){
		queryMessage(0);
		document.getElementById("right10").style.display = "none";
	}else if(num==2){
		queryMessage(1);
		document.getElementById("right10").style.display = "none";
	}else if(num==3){
		queryMessage(2);
		document.getElementById("right10").style.display = "none";
	}else if(num==4){
		queryMessage(3);
		document.getElementById("right10").style.display = "none";
	}else if(num == 6){
		searchUsingAdmin(0);
		document.getElementById("right10").style.display = "none";
	}else if(num == 7){
		searchUsingAdmin(1);
		document.getElementById("right10").style.display = "none";
	}else if(num==10){
		document.getElementById("right10").style.display = "block";
	}
	for (i = 1; i <= 10; i++) {
		if (i == num) {
			document.getElementById("right" + i).style.display = "block";
		} else {
			document.getElementById("right" + i).style.display = "none";
		}
	}

}
