<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link type="text/css" href="../css/qt-index.css"   rel="stylesheet" />
<link type="text/css" href="../css/qt-lrtk.css" rel="stylesheet" />
<link type="text/css" href="../css/qt-style.css" rel="stylesheet" />
<link type="text/css" href="../css/qt-IE6.css" rel="stylesheet" media="all" />
<link type="text/css" href="../css/pagination.css" rel="stylesheet"  />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.pagination.js"></script>
<script type="text/javascript" src="../js/members.js"></script>
<script type="text/javascript" src="../js/qh/queryResultMessage.js"></script>
 <script type="text/javascript">
         
            function pageselectCallback(page_index, jq){
            	//alert("pageselectCallback");
			    var items_per_page = 5;//每页显示记录数
                var max_elem = Math.min((page_index+1) * items_per_page, members.length);
                var newcontent = '';
				//将集合数据拼装成HTML，然后在前台显示
                for(var i=page_index*items_per_page;i<max_elem;i++)
                {
                    newcontent += '<dt>' + members[i][0] + '</dt>';
                    newcontent += '<dd class="state">' + members[i][2] + '</dd>';
                    newcontent += '<dd class="party">' + members[i][3] + '</dd>';
                }
                $("#Searchresult").html(newcontent);
                return false;
            }
			//手动设置分页中的各参数值
			  function getPageOptions(){
				 // alert("getPageOptions");
                var opt = {callback: pageselectCallback};
					 opt["num_display_entries"] = 5;//中间页数
					 opt["num_edge_entries"] = 2;//前后边界页数
					 opt["prev_text"] = '上一页';//上一页 文本 
					 opt["next_text"] = '下一页';//下一页 文本
                return opt;
            }
			
            // 页面加载执行此函数
            
            $(document).ready(function(){
            	//alert("ready(function");
				var optInit= getPageOptions();//分页参数组
				//alert(members.length);
                $("#Pagination").pagination(members.length,optInit);
				//alert(members.length);
            });

        </script>
</head>
<body onload="getInfo()">
	<div class="wrap">
		<!-- header -->
		<div class="header">
			<div class="tlt"><img src="../image/qt-titlt.png" alt="校园信息自主发布平台" /></div>
			<ul class="link">
				<li><a href="#">设为首页</a></li>
				<li><a href="#">加入收藏</a></li>
			</ul>
			<p>2013年4月19日 星期五</p>
			<ul class="meun">
				<li><a href="welcome.jsp">首页</a></li>
				<li><a href="publishMessage.jsp">发布信息</a></li>
				<li><a href="queryResultMessage.jsp">浏览信息</a></li>
				<li><a href="#">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" class="btn" id="btnGet" />
				<input type="text" class="text" id="publisherPhone" >
			</div>
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- left -->
			<div class="left">
				<h2>查询结果</h2>
				<ul class="list" id="info">
					<!-- <li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>
					<li><a href="#">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li> -->
				</ul>
				<p class="page">
					<span><a href="#">首页</a></span>
					<span><a href="#">上一页</a></span>
					<span><a href="#">下一页</a></span>
					<span><a href="#">尾页</a></span>
				</p>
				<dl id="Searchresult">
                <dt>Search Results will be inserted here ...</dt>
                </dl>
				 <div id="Pagination" class="pagination"></div>
			</div>
			<!-- // left -->
			<!-- right -->
			<div class="right">
				<h2>发布协议</h2>
				<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容</p>
				<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内容协议内容协议内容</p><br>
			</div>
			<!-- // right -->
		</div>
		<!-- // contents -->
		<!-- footer -->
		<div class="footer">
			<p class="p1">版权所有：长春理工大学</p>
			<ul>
				<li>友情链接：</li>
				<li><a href="">长春理工大学</a></li>
				<li><a href="">吉林大学</a></li>
				<li><a href="">东北师范大学</a></li>
				<li class="bg"><a href="">长春大学</a></li>
			</ul>
			<p class="p1">地址:吉林省 长春市 卫星里 7089号  邮编：130022</p>
		</div>
		<!-- // footer -->
	</div>
</body>
</body>
</html>