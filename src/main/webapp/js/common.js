//KMP�㷨��next����
function next(sub){
	var a = new Array(sub.length);
	var i,j;
	a[0] = -1;
	var words = sub.replace(/(.)(?=[^$])/g,"$1,").split(",");//���ַ���ÿ���ַ���ϡ�����
	var length=sub.length;
	for(j=1;j<length;j++){
		i = a[j - 1];
		while(i >= 0 && words[j] != words[i+1]){
			i = a[i];
		}
		if(words[j] == words[i+1]){
			a[j] = i+1;
		}else{
			a[j] = -1;
		}
	}
	return a;
}
//KMP�㷨ƥ�䷽��
function pattern(str,sub,next){
	var ch1 = str.replace(/(.)(?=[^$])/g,"$1,").split(",");
	var ch2 = sub.replace(/(.)(?=[^$])/g,"$1,").split(",");
	var i = 0,j = 0;
	for(;i < ch1.length;){
		if(ch1[i] == ch2[j]) {
			if(j == ch2.length-1){
				return i-ch2.length+1;
				break;
			}
			i++;
			j++;
		}
		else if (j == 0){
			i++;
		}else{
			j = next[j-1]+1;
		}
	}
}

function replaceWords(words,pos,len){
	$("#messageContext").val(words.replace(words.substring(pos,pos+len),'!**!'));	
}