package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schoolInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>校园信息自主发布平台</title>\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-index1.css\"/>\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-style1.css\" />\r\n");
      out.write("<link type=\"text/css\"  rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/pagination.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/jquery-1.4.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/json2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage-School.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tvar params =null;\r\n");
      out.write("\t$(\"#paging\").asynPage2(\"querySchoolInfo\",params,\"#stu\",buildHtml,10,\"stuList\",\"totalSize\");\r\n");
      out.write("});\r\n");
      out.write("function buildHtml(stuList){\r\n");
      out.write("\t$.each(stuList,function(i,stu){\r\n");
      out.write("\t\tvar str = [\r\n");
      out.write("\t\t\t'<li><img src=\"");
      out.print(path);
      out.write("/image/qt-p_icon.jpg\"/>&nbsp;&nbsp;',\r\n");
      out.write("\t\t\tstu.infoDate,'&nbsp;&nbsp;----&nbsp;&nbsp;',\r\n");
      out.write("\t\t\t,stu.infoContent,'</li>'\r\n");
      out.write("\t\t].join('');\r\n");
      out.write("\t\t$(\"#stu\").append(str);\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t  <div class=\"contents1\">\r\n");
      out.write("      \t<div class=\"main\">\r\n");
      out.write("      \t\t<h1><font size=\"4px\">校园资讯</font></h1>\r\n");
      out.write("            <ul class=\"btnbox\">\r\n");
      out.write("            \t<li><a href=\"");
      out.print(path);
      out.write("/jsp/welcome.jsp\">返回首页</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("       \t\t<ul  id=\"stu\" class=\"list\">\r\n");
      out.write("            </ul>\r\n");
      out.write("          <!--分页控件 -->\r\n");
      out.write("\t\t\t<div id=\"paging\" class=\"paging\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("    <!-- // contents -->\r\n");
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
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
