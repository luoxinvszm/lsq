package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class systemSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<legend>信息设置</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>字数设置\r\n");
      out.write("\t\t\t\t<td>\r\n");
<<<<<<< HEAD
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
=======
<<<<<<< HEAD
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\" method=\"post\">\r\n");
=======
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
>>>>>>> 3ad80f1d7a0511bd9a32b7e82b3c564384b46d50
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"perMsgWords\" name=\"method\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"settingsValue\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"提交修改\" />\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>发送次数限制设置\r\n");
      out.write("\t\t\t\t<td>\r\n");
<<<<<<< HEAD
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
=======
<<<<<<< HEAD
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\" method=\"post\">\r\n");
=======
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
>>>>>>> 3ad80f1d7a0511bd9a32b7e82b3c564384b46d50
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"sendMsgNum\" name=\"method\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"settingsValue\"> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"提交修改\" />\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
      out.write("\t\t\t\t<td>默认密码设置\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"defaultPasswords\" name=\"method\">\r\n");
=======
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t\t\t<td>删除已发布信息时间设置\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"delReleasedMsgLong\" name=\"method\">\r\n");
<<<<<<< HEAD
=======
>>>>>>> 3ad80f1d7a0511bd9a32b7e82b3c564384b46d50
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"settingsValue\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" value=\"提交修改\" />\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>删除未通过信息时间设置\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<td><form action=\"systemSettings.action\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" value=\"delUnpassedMsgLong\" name=\"method\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"settingsValue\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" value=\"提交修改\" />\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
<<<<<<< HEAD
=======
>>>>>>> 3ad80f1d7a0511bd9a32b7e82b3c564384b46d50
>>>>>>> d0fcaa25c61edcdc76e18be616f07445a681612a
      out.write("\t\t</table>\r\n");
      out.write("\t</fieldset>\r\n");
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
