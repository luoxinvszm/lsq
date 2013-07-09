package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qureyresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head runat=\"server\">\r\n");
      out.write("<title>jQueryå®ç°CheckBoxå¨éãå¨ä¸é</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.4.4.min.js\" type=\"text/javascript\"></script>    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("           $(\"#checkAll\").click(function() {\r\n");
      out.write("                $('input[name=\"subBox\"]').attr(\"checked\",this.checked); \r\n");
      out.write("            });\r\n");
      out.write("            var $subBox = $(\"input[name='subBox']\");\r\n");
      out.write("            $subBox.click(function(){\r\n");
      out.write("\t\t\t\t$(\"#checkAll\").attr(\"checked\",$subBox.length == $(\"input[name='subBox']:checked\").length ? true : false);\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div>\r\n");
      out.write("        <input id=\"checkAll\" type=\"checkbox\" />å¨é\r\n");
      out.write("        <input name=\"subBox\" type=\"checkbox\" />é¡¹1\r\n");
      out.write("        <input name=\"subBox\" type=\"checkbox\" />é¡¹2\r\n");
      out.write("        <input name=\"subBox\" type=\"checkbox\" />é¡¹3\r\n");
      out.write("        <input name=\"subBox\" type=\"checkbox\" />é¡¹4\r\n");
      out.write("    </div>\r\n");
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
