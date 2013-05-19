function Tab(num) {
	var i;
	if (num == 8) {
		querySettings();
	}else if(num==1){
		queryMessage(0);
	}else if(num==2){
		queryMessage(1);
	}else if(num==3){
		queryMessage(2);
	}else if(num==4){
		queryMessage(3);
	}else if(num == 6){
		searchUsingAdmin(0);
	}else if(num == 7){
		searchUsingAdmin(1);
	}
	for (i = 1; i <= 9; i++) {
		if (i == num) {
			document.getElementById("right" + i).style.display = "block";
		} else {
			document.getElementById("right" + i).style.display = "none";
		}
	}

}
