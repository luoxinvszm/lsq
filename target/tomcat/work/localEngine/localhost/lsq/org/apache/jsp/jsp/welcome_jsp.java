package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>校园信息自主发布平台</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-index.css\" />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-lrtk.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qt-jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qt-lrtk.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/curDate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction submitForm(form){\r\n");
      out.write("\t\tvar phone = $()\r\n");
      out.write("\t\tvar datevalue = $(\"#publishTime\").val();\r\n");
      out.write("\t\tif(datevalue==\"日期\"){\r\n");
      out.write("\t\t\t$(\"#publishTime\").val(\"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- 电话号自动补全 -->\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/jquery-ui-1.9.2.custom.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qh/publishMessage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/sxl/jquery-ui-1.9.2.custom.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/sxl/autoPhone.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 信息遍历 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/jquery-1.4.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/json2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage-Stu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage-School.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage-Bus.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tvar params =null;\r\n");
      out.write("\t$(\"#paging1\").asynPage1(\"queryStuInfo\",params,\"#datas\",buildHtml1,7,\"stuList\",\"totalSize\");\r\n");
      out.write("\t$(\"#paging2\").asynPage2(\"querySchoolInfo\",params,\"#datas\",buildHtml2,4,\"schoolList\",\"totalSize\");\r\n");
      out.write("\t$(\"#paging3\").asynPage3(\"queryBusInfo\",params,\"#datas\",buildHtml3,4,\"busList\",\"totalSize\");\r\n");
      out.write("});\r\n");
      out.write("function buildHtml1(stuList){\r\n");
      out.write("\t$.each(stuList,function(i,stu){\r\n");
      out.write("\t\tvar str = [\r\n");
      out.write("\t\t    '<p><a href=\"#\">',\r\n");
      out.write("\t\t    stu.msgConctent,'</a>',\r\n");
      out.write("\t\t    stu.publishTime,'</p>'\r\n");
      out.write("\t\t].join('');\r\n");
      out.write("\t\t$(\"#stu\").append(str);\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("function buildHtml2(schoolList){\r\n");
      out.write("\t$.each(schoolList,function(i,school){\r\n");
      out.write("\t\tvar str = [\r\n");
      out.write("\t\t    '<p><img src=\"");
      out.print(path);
      out.write("/image/qt-p_icon.jpg\"/>&nbsp;&nbsp;',\r\n");
      out.write("\t\t    school.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',\r\n");
      out.write("\t\t    ,'<a href=\"#\">',school.infoTitle,'</a>',\r\n");
      out.write("\t\t    '</p>'\r\n");
      out.write("\t\t].join('');\r\n");
      out.write("\t\t$(\"#school\").append(str);\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("function buildHtml3(busList){\r\n");
      out.write("\t$.each(busList,function(i,bus){\r\n");
      out.write("\t\tvar str = [\r\n");
      out.write("\t\t\t'<p><img src=\"");
      out.print(path);
      out.write("/image/qt-p_icon.jpg\"/>&nbsp;&nbsp;',\r\n");
      out.write("\t\t\tbus.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',\r\n");
      out.write("\t\t\t,'<a href=\"#\">',bus.infoTitle,'</a>',\r\n");
      out.write("\t\t\t'</p>'\r\n");
      out.write("\t\t].join('');\r\n");
      out.write("\t\t$(\"#bus\").append(str);\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"getEClock(clock)\">\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"tlt\"><img src=\"");
      out.print(path );
      out.write("/image/qt-titlt.png\" alt=\"校园信息自主发布平台\" /></div>\r\n");
      out.write("\t\t\t<ul class=\"link\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onclick=\"this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.ttlsq.com/');\"> 设为首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href='#' onclick='window.external.AddFavorite(\"http://www.ttlsq.com/welcome.jsp\",\"天天乐上墙\")'> 加入收藏</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p id=\"clock\"></p>\r\n");
      out.write("\t\t\t<ul class=\"meun\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/welcome.jsp\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/publishMessage.jsp\" >发布信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/aboutUs.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form action=\"browseMessage.jsp\" method=\"get\" onsubmit=\"return submitForm(this);\">\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"msgStatus\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text1\" value=\"日期\" id=\"publishTime\" name=\"publishTime\" onClick=\"WdatePicker()\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" id=\"publisherPhone\" name=\"publisherPhone\" onkeydown=\"autoPhone()\"  value=\"电话号码\"/>\r\n");
      out.write("\t\t\t\t\t<div id=\"result\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- mian -->\r\n");
      out.write("\t\t\t<div class=\"mian\" id=\"zSlider\">\r\n");
      out.write("\t\t\t\t<div id=\"picshow\">\r\n");
      out.write("\t\t\t\t\t<div id=\"picshow_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\" id=\"stu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--此处为主页面学生信息  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"");
      out.print(path );
      out.write("/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=\">more...</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 左侧屏幕 <div id=\"select_btn\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><p class=\"tlt\">屏幕一</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：西区主教一楼</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕二</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：西区图书馆一楼</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕三</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：东区二教一楼</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\t -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // mian -->\r\n");
      out.write("\t\t\t<!-- //aboutus -->\r\n");
      out.write("\t\t\t<div class=\"aboutus\">\r\n");
      out.write("\t\t\t\t<h2>校园资讯</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\">\r\n");
      out.write("\t\t\t\t\t<div id=\"school\"></div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(path );
      out.write("/jsp/schoolInfo.jsp\" style=\"color:#fa9a2c\">more...</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- aboutus -->\r\n");
      out.write("\t\t\t<!-- systemintrduce -->\r\n");
      out.write("\t\t\t<div class=\"systemintrduce\">\r\n");
      out.write("\t\t\t\t<h2>广告栏</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\" >\r\n");
      out.write("\t\t\t\t\t<div id=\"bus\"></div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(path );
      out.write("/jsp/businessInfo.jsp\" style=\"color:#fa9a2c\">\r\n");
      out.write("\t\t\t\t\tmore...</a></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // systemintrduce -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // contents -->\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<p class=\"p1\">地址:吉林省 长春市 卫星路 7089号   | 邮编：130022</p>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>友情链接：</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://www.cust.edu.cn/\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p class=\"p1\">Copyright @ 2013 ttlsp | 吉ICP备13001629号</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // footer -->\r\n");
      out.write("\t</div></body>\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction addListener(element,e,fn){    \r\n");
      out.write("    \t \t\tif(element.addEventListener){    \r\n");
      out.write("          \t\t\telement.addEventListener(e,fn,false);    \r\n");
      out.write("     \t\t\t } else {    \r\n");
      out.write("         \t \t\telement.attachEvent(\"on\" + e,fn);    \r\n");
      out.write("     \t \t\t }    \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar publisherPhone = document.getElementById(\"publisherPhone\");\r\n");
      out.write("\t\t\taddListener(publisherPhone,\"click\",function(){\r\n");
      out.write("\t\t\t\tpublisherPhone.value = \"\";\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
