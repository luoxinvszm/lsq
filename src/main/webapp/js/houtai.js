

function Tab(num)
{
	var i;
	for( i=1;i<=9;i++)
	if(i==num)
	{
		document.getElementById("right"+i).style.display="block";
	}else{
		document.getElementById("right"+i).style.display="none";
		}
}
