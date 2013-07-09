<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<title>jQuery实现CheckBox全选、全不选</title>
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>    
<script type="text/javascript">
        $(function() {
           $("#checkAll").click(function() {
                $('input[name="subBox"]').attr("checked",this.checked); 
            });
            var $subBox = $("input[name='subBox']");
            $subBox.click(function(){
				$("#checkAll").attr("checked",$subBox.length == $("input[name='subBox']:checked").length ? true : false);
            });
        });
    </script>

</head>
<body>
    <div>
        <input id="checkAll" type="checkbox" />全选
        <input name="subBox" type="checkbox" />1
        <input name="subBox" type="checkbox" />2
        <input name="subBox" type="checkbox" />3
        <input name="subBox" type="checkbox" />4
    </div>
</body>
</html>
