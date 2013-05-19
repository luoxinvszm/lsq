package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/json2.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/asynPage.js\"></script>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#paging{\r\n");
      out.write("\t\t\t\tfloat:right;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#paging ul li{\r\n");
      out.write("\t\t\t\tfloat:left;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#paging ul li a{\r\n");
      out.write("\t\t\t\toutline:none;\r\n");
      out.write("\t\t\t\tblr:expression(this.onFocus=this.blur());\r\n");
      out.write("\t\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\t\tborder:1px solid #d5d5d5;\r\n");
      out.write("\t\t\t\tmargin-right:5px;\r\n");
      out.write("\t\t\t\tpadding:2px 5px 1px;\r\n");
      out.write("\t\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\tcolor:#1a66b3;\r\n");
      out.write("\t\t\t\tfont-size:11px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#paging ul li a.current{\r\n");
      out.write("\t\t\t\tborder:0px none #d5d5d5;\r\n");
      out.write("\t\t\t\tcolor:black;\r\n");
      out.write("\t\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#paging ul li a.last,#paging ul li a.first{\r\n");
      out.write("\t\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\t\tborder:1px solid #d5d5d5;\r\n");
      out.write("\t\t\t\tmargin-right:5px;\r\n");
      out.write("\t\t\t\tpadding:3px 5px 1px;\r\n");
      out.write("\t\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\tcolor:#1a66b3;\r\n");
      out.write("\t\t\t\tfont-size:11px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#paging .total{\r\n");
      out.write("\t\t\t\tborder:0px none #d5d5d5;\r\n");
      out.write("\t\t\t\tpadding:3px 5px 1px;\r\n");
      out.write("\t\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\tfont-size:12px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\tvar params = \"\";\r\n");
      out.write("\t\t    \t$(\"#paging\").asynPage(\"qureyMessage.action\",params,\"#datas\",buildHtml,5,\"list\",\"totalSize\");\r\n");
      out.write("    \t\t});\r\n");
      out.write("\t\t\tfunction buildHtml(messageList){\r\n");
      out.write("\t\t\t\talert(\"buildHtml...\");\r\n");
      out.write("\t\t\t\talert(messageList);\r\n");
      out.write("\t\t\t\t$.each(messageList,function(i,item){\r\n");
      out.write("\t\t\t\t\tvar tr = [\r\n");
      out.write("\t\t                '<tr>',\r\n");
      out.write("                \t \t'<td>',item.msgConctent,'</td>',\r\n");
      out.write("                  \t\t'<td>',item.publishTime,'</td>',\r\n");
      out.write("                \t\t'</tr>'\r\n");
      out.write("            \t\t].join('');\r\n");
      out.write("            \t\t$(\"#datas\").append(tr);\r\n");
      out.write("            \t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"align:center\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr><th>msgConctent</th><th>publishTime</th></tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"datas\"></tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"paging\" class=\"page\"></div>\r\n");
      out.write("\t</body>\r\n");
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
