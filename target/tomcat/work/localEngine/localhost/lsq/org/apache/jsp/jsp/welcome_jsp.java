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
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/jquery-ui-1.9.2.custom.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qt-jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qt-lrtk.js\"></script>\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/sxl/jquery-ui-1.9.2.custom.js\"></script>-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/sxl/autoMessage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/curDate.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"getEClock(clock)\">\r\n");
      out.write("\r\n");
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
      out.write("/jsp/browseMessage.jsp\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/aboutUs.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"\" class=\"btn\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text1\" value=\"2013-05-22\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"tags\" onkeyup=\"autoMessages()\"  value=\"信息\"/>\r\n");
      out.write("\t\t\t\t<div id=\"result\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- mian -->\r\n");
      out.write("\t\t\t<div class=\"mian\" id=\"zSlider\">\r\n");
      out.write("\t\t\t\t<div id=\"picshow\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"picshow_img\">\r\n");
      out.write("\t\t\t\t\t\t<ul>");
for(int i=0;i<3;i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\" id=\"datas");
      out.print(i+1);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p><a>信息内容信息内容信息内容信息内容信息内容信息内容信息内容</a>20120101</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"");
      out.print(path );
      out.write("/jsp/browseMessage.jsp\">more...</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"select_btn\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><p class=\"tlt\">屏幕一</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：西区主教一楼</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕二</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：西区图书馆一楼</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕三</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">地点：东区二教一楼</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // mian -->\r\n");
      out.write("\t\t\t<!-- //aboutus -->\r\n");
      out.write("\t\t\t<div class=\"aboutus\">\r\n");
      out.write("\t\t\t\t<h2>校园资讯</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\">\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我</p>\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的的介绍 关于我们绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介\r\n");
      out.write("\t\t\t\t\t绍 关于我们的介绍...</p>\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\" style=\"color:#fa9a2c\">more...</a></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- aboutus -->\r\n");
      out.write("\t\t\t<!-- systemintrduce -->\r\n");
      out.write("\t\t\t<div class=\"systemintrduce\">\r\n");
      out.write("\t\t\t\t<h2>广告栏</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\">\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我</p>\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的 关于我们的介绍...</p>\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\" style=\"color:#fa9a2c\">more...</a></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // systemintrduce -->\r\n");
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
      out.write("\t</div></body>\r\n");
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
