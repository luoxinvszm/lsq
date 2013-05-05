<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>校园信息自主发布平台</title>
<link  rel="stylesheet" type="text/css" href="../css/qt-index.css" />
<link type="text/css"   rel="stylesheet" href="../css/qt-lrtk.css"/>
<link href="css/qt-IE6.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="../js/qt-jquery.js"></script>
<script type="text/javascript" src="../js/qt-lrtk.js"></script>
<script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/qh.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
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
				<li><a href="#">首页</a></li>
				<li><a href="#">发布信息</a></li>
				<li><a href="#">浏览信息</a></li>
				<li><a href="#">关于我们</a></li>
			</ul>
			<div class="search">
				<input type="button" value="" class="btn"   onclick="submit()"/>
				<input type="text" class="text" id="publishTime"/>
				<div id="result"></div>
			</div>
		</div>
		<!-- // header -->
		<!-- contents -->
		<div class="contents">
			<!-- mian -->
			<div class="mian" id="zSlider">
				<div id="picshow">
					<div id="picshow_img">
						<ul>
							<li>
								<div class="message">
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<p><a href="#">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>
									<div class="more">
										<span><a href="#">首页</a></span>
										<span><a href="#">上一页</a></span>
										<span><a href="#">下一页</a></span>
										<span><a href="#">尾页</a></span>
									</div>
								</div>
							</li>
							<li>
								<div class="message">
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<p><a href="#">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>
									<div class="more">
										<span><a href="#">首页</a></span>
										<span><a href="#">上一页</a></span>
										<span><a href="#">下一页</a></span>
										<span><a href="#">尾页</a></span>
									</div>
								</div>
							</li>
							<li>
								<div class="message">
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<p><a href="#">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>
									<div class="more">
										<span><a href="#">首页</a></span>
										<span><a href="#">上一页</a></span>
										<span><a href="#">下一页</a></span>
										<span><a href="#">尾页</a></span>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
					<div id="select_btn">
						<ul>
				  			<li><p class="tlt">屏幕一</p><a href="#" target="_blank"><span class="select_text">第一条信息 第一条信息第一...</span></a></li>
				 			<li><p class="tlt">屏幕二</p><a href="#" target="_blank"><span class="select_text">第一条信息 第一条信息第一...</span></a></li>
				 			<li><p class="tlt">屏幕三</p><a href="#" target="_blank"><span class="select_text">第一条信息 第一条信息第一...</span></a></li>
					</ul>
				</div>	
			</div>
			<!-- // mian -->
			<!-- //aboutus -->
			<div class="aboutus">
				<h2>校园资讯</h2>
				<div class="word">
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍</p>
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介
					绍 关于我们的介绍的介绍 关于我们的介绍的介绍 关于我们的介绍的介绍 关于我们的介绍...</p>
				</div>
			</div>
			<!-- aboutus -->
			<!-- systemintrduce -->
			<div class="systemintrduce">
				<h2>广告栏</h2>
				<div class="word">
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍</p>
					<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的 关于我们的介绍...</p>
				</div>
			</div>
			<!-- // systemintrduce -->
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
	</div></body>
</body>
</html>