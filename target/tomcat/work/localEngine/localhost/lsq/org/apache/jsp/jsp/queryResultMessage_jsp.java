package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class queryResultMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link type=\"text/css\" href=\"../css/qt-index.css\"   rel=\"stylesheet\" />\r\n");
      out.write("<link type=\"text/css\" href=\"../css/qt-lrtk.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link type=\"text/css\" href=\"../css/qt-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qh/queryResultMessage.js\"></script>\r\n");
      out.write("<link href=\"css/qt-IE6.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t<input type=\"button\" value=\" huoqu\" class=\"btn\" id=\"btnGet\" />\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"publisherPhone\" value=\"publisherPhone\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- left -->\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<h2>查询结果</h2>\r\n");
      out.write("\t\t\t\t<ul class=\"list\" id=\"info\">\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">查找到的信息 查找到的信息 查找到的信 查找到的信 查找到的信 查找到的信</a>2013-4-5</li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<p class=\"page\">\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">首页</a></span>\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">上一页</a></span>\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">下一页</a></span>\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // left -->\r\n");
      out.write("\t\t\t<!-- right -->\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<h2>发布协议</h2>\r\n");
      out.write("\t\t\t\t<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容</p>\r\n");
      out.write("\t\t\t\t<p>协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内内容协议内容协议内容协议内容协议内容</p><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // right -->\r\n");
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
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
