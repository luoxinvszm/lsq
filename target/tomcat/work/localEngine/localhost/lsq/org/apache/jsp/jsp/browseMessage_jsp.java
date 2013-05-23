package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class browseMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>校园信息自主发布平台</title>\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-index.css\"/>\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-style.css\" />\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/pagination.css\"  />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/jquery-1.4.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/json2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage-Msg.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/curDate.js\"></script>\r\n");
<<<<<<< HEAD
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/WdatePicker.js\"></script>\r\n");
      out.write("\r\n");
=======
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
>>>>>>> 47cfb7073804b1342abf3a65057535e306b76878
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction GetRequest() {\r\n");
      out.write("\t\t\t\t   var url = location.search; //获取url中\"?\"符后的字串\r\n");
      out.write("\t\t\t\t   var theRequest = new Object();\r\n");
      out.write("\t\t\t\t   if (url.indexOf(\"?\") != -1) {\r\n");
      out.write("\t\t\t\t      var str = url.substr(1);\r\n");
      out.write("\t\t\t\t      strs = str.split(\"&\");\r\n");
      out.write("\t\t\t\t      for(var i = 0; i < strs.length; i ++) {\r\n");
      out.write("\t\t\t\t         theRequest[strs[i].split(\"=\")[0]]=unescape(strs[i].split(\"=\")[1]);\r\n");
      out.write("\t\t\t\t      }\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   return theRequest;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//88888888888\r\n");
      out.write("\t\t\tvar Request = new Object();\r\n");
      out.write("\t\t\tRequest = GetRequest();\r\n");
      out.write("\t\t\tvar publisherPhone,publishTime,msgStatus;\r\n");
      out.write("\t\t\tpublisherPhone = Request['publisherPhone'];\r\n");
      out.write("\t\t\tpublishTime = Request['publishTime'];\r\n");
      out.write("\t\t\tmsgStatus = Request['msgStatus'];\r\n");
      out.write("\t\t\t/* alert(publisherPhone);\r\n");
      out.write("\t\t\talert(publishTime);\r\n");
      out.write("\t\t\talert(msgStatus); */\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\tvar params = \"msgStatus=\"+msgStatus+\"&publishTime=\"+publishTime+\"&publisherPhone=\"+publisherPhone;\r\n");
      out.write("\t\t    \t$(\"#paging\").asynPage(\"qureyMessage.action\",params,\"#datas\",buildHtml,2,\"messageList\",\"totalSize\");\r\n");
      out.write("    \t\t});\r\n");
      out.write("\t\t\tfunction buildHtml(messageList){\r\n");
      out.write("\t\t\t\t$.each(messageList,function(i,message){\r\n");
      out.write("\t\t\t\t\tvar str = [\r\n");
      out.write("\t\t\t\t\t    '<li><a href=\"#\">',\r\n");
      out.write("                \t \tmessage.msgConctent,'</a>',\r\n");
      out.write("                  \t\tmessage.publishTime,'</li>'\r\n");
      out.write("            \t\t].join('');\r\n");
      out.write("            \t\t$(\"#datas\").append(str);\r\n");
      out.write("            \t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
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
      out.write("\t\t\t<p id=\"clock\"></p><!--时钟-->\r\n");
      out.write("\t\t\t<ul class=\"meun\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/welcome.jsp\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/publishMessage.jsp\">发布信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/browseMessage.jsp\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/aboutUs.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\" \" class=\"btn\" onclick=\"submit()\" />\r\n");
<<<<<<< HEAD
      out.write("\t\t\t\t<input type=\"text\" class=\"text1\" value=\"日期\"name=\"publishTime\" onClick=\"WdatePicker()\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"queryExp\" value=\"电话号码\" />\r\n");
      out.write("\t\t\t\t\r\n");
=======
      out.write("\t\t\t\t<input type=\"text\" class=\"text1\" value=\"2013-05-22\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"publisherPhone\" name=\"publisherPhone\" onkeyup=\"autoPhone()\"  value=\"电话号码\"/>\t\r\n");
>>>>>>> 47cfb7073804b1342abf3a65057535e306b76878
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- left -->\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<h2>浏览信息</h2>\r\n");
      out.write("\t\t\t\t<ul  id=\"datas\" class=\"list\">\r\n");
      out.write("\t\t\t\t\t<li style=\"margin-right: 290px;margin-top: 60px\"><font>正在努力加载数据...</font></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<!--分页控件 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"paging\" class=\"paging\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // left -->\r\n");
      out.write("\t\t\t<!-- right -->\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<h2>发布协议</h2>\r\n");
      out.write("\t\t\t\t<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容</p>\r\n");
      out.write("\t\t\t\t<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内内容协议内容协议内内容协议内容协议内内容\r\n");
      out.write("\t\t\t\t协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内容协议内容协议内容</p><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // right -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // contents -->\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<p class=\"p1\">地址:吉林省 长春市 卫星里 7089号   | 邮编：130022</p>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>友情链接：</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p class=\"p1\">Copyright @ 2013 ttlsp | 京ICP备13001629号</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // footer -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
