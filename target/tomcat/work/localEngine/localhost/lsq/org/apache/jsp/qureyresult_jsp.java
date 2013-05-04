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
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/javascript\">\r\n");
      out.write("function loadInfo() {\r\n");
      out.write("    $.getJSON(\"qureyMessage.action\", function(data) {\r\n");
      out.write("        $(\"#info\").html(\"\");//清空info内容\r\n");
      out.write("        $.each(data.messageList, function(i, item) {\r\n");
      out.write("            $(\"#info\").append(\r\n");
      out.write("                    \"<div>\" + item.password + \"</div>\" + \r\n");
      out.write("                    \"<div>\" + item.username    + \"</div><hr/>\");\r\n");
      out.write("        });\r\n");
      out.write("        });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#btnGet\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t//提交的参数，name和inch是和struts action中对应的接收变量\r\n");
      out.write("\t\t\tvar params = {\r\n");
      out.write("\t\t\t\tpublisherPhone : $(\"#publisherPhone\").val(),\r\n");
      out.write("\t\t\t\tpublishTime : $(\"#publishTime\").val(),\r\n");
      out.write("\t\t\t\tmsgStatus : $(\"#msgStatus\").val()\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"qureyMessage.action\",\r\n");
      out.write("\t\t\t\tdata : params,\r\n");
      out.write("\t\t\t\tdataType : \"json\", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）\r\n");
      out.write("\t\t\t\tsuccess : function(json) {\r\n");
      out.write("\t\t\t \t\t//var obj = $.parseJSON(json); //使用这个方法解析json\r\n");
      out.write("\t\t\t\t\t//var state_value = obj.messageList; //result是和action中定义的result变量的get方法对应的\r\n");
      out.write("\t\t\t\t\t//alert(state_value); \r\n");
      out.write("\t\t\t\t\t $.each(json.messageList, function(i, item) {\r\n");
      out.write("\t\t\t\t\t\t $(\"#info\").append(\r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.msgId + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.msgTypeId + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.msgStatus + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.msgConctent + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.publisherName + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.publisherPhone + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.msgRemark + \"</div>\" + \r\n");
      out.write("\t\t\t\t                    \"<div>\" + item.publishTime + \"</div><hr/>\");\r\n");
      out.write("\t\t\t\t\t   }); \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"text\" id=\"publisherPhone\" value=\"publisherPhone\">\r\n");
      out.write("\t<input type=\"text\" id=\"publishTime\" value=\"publishTime\">\r\n");
      out.write("\t<input type=\"text\" id=\"msgStatus\" value=\"msgStatus\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"button\" value=\"获取\" id=\"btnGet\" />\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"info\"></div>\r\n");
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
