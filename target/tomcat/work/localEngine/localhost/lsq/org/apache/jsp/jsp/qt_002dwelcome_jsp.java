package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qt_002dwelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>校园信息自主发布平台</title>\r\n");
      out.write("<link  rel=\"stylesheet\" type=\"text/css\" href=\"../css/qt-index.css\" />\r\n");
      out.write("<link type=\"text/css\"   rel=\"stylesheet\" href=\"../css/qt-lrtk.css\"/>\r\n");
      out.write("<link href=\"css/qt-IE6.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qt-jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qt-lrtk.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qh.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"tlt\"><img src=\"../image/qt-titlt.png\" alt=\"校园信息自主发布平台\" /></div>\r\n");
      out.write("\t\t\t<ul class=\"link\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">设为首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">加入收藏</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p>2013年4月19日 星期五</p>\r\n");
      out.write("\t\t\t<ul class=\"meun\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">发布信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"\" class=\"btn\"   onclick=\"submit()\"/>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"publishTime\"/>\r\n");
      out.write("\t\t\t\t<div id=\"result\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- mian -->\r\n");
      out.write("\t\t\t<div class=\"mian\" id=\"zSlider\">\r\n");
      out.write("\t\t\t\t<div id=\"picshow\">\r\n");
      out.write("\t\t\t\t\t<div id=\"picshow_img\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1信息1 信息1</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">首页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">上一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">下一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息2信息2 信息信息2 信息2信息2 信息2</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">首页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">上一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">下一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3信息3 信息3</a>2013-3-30</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">首页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">上一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">下一页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"select_btn\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  \t\t\t<li><p class=\"tlt\">屏幕一</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">第一条信息 第一条信息第一...</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕二</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">第一条信息 第一条信息第一...</span></a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><p class=\"tlt\">屏幕三</p><a href=\"#\" target=\"_blank\"><span class=\"select_text\">第一条信息 第一条信息第一...</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // mian -->\r\n");
      out.write("\t\t\t<!-- //aboutus -->\r\n");
      out.write("\t\t\t<div class=\"aboutus\">\r\n");
      out.write("\t\t\t\t<h2>校园资讯</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\">\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍</p>\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介\r\n");
      out.write("\t\t\t\t\t绍 关于我们的介绍的介绍 关于我们的介绍的介绍 关于我们的介绍的介绍 关于我们的介绍...</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- aboutus -->\r\n");
      out.write("\t\t\t<!-- systemintrduce -->\r\n");
      out.write("\t\t\t<div class=\"systemintrduce\">\r\n");
      out.write("\t\t\t\t<h2>广告栏</h2>\r\n");
      out.write("\t\t\t\t<div class=\"word\">\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的介绍</p>\r\n");
      out.write("\t\t\t\t\t<p>介绍关于我们的介绍 关于我们的介绍 关于我们的介绍 关于我们的 关于我们的介绍...</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // systemintrduce -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // contents -->\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<p class=\"p1\">版权所有：长春理工大学</p>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>友情链接：</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">吉林大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">东北师范大学</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"bg\"><a href=\"\">长春大学</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p class=\"p1\">地址:吉林省 长春市 卫星里 7089号  邮编：130022</p>\r\n");
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
