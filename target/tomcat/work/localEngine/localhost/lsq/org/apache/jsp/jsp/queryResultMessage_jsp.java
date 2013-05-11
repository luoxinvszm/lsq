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
      out.write("<link type=\"text/css\" href=\"../css/qt-IE6.css\" rel=\"stylesheet\" media=\"all\" />\r\n");
      out.write("<link type=\"text/css\" href=\"../css/pagination.css\" rel=\"stylesheet\"  />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.pagination.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/members.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qh/queryResultMessage.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("         \r\n");
      out.write("            function pageselectCallback(page_index, jq){\r\n");
      out.write("            \t//alert(\"pageselectCallback\");\r\n");
      out.write("\t\t\t    var items_per_page = 5;//每页显示记录数\r\n");
      out.write("                var max_elem = Math.min((page_index+1) * items_per_page, members.length);\r\n");
      out.write("                var newcontent = '';\r\n");
      out.write("\t\t\t\t//将集合数据拼装成HTML，然后在前台显示\r\n");
      out.write("                for(var i=page_index*items_per_page;i<max_elem;i++)\r\n");
      out.write("                {\r\n");
      out.write("                    newcontent += '<dt>' + members[i][0] + '</dt>';\r\n");
      out.write("                    newcontent += '<dd class=\"state\">' + members[i][2] + '</dd>';\r\n");
      out.write("                    newcontent += '<dd class=\"party\">' + members[i][3] + '</dd>';\r\n");
      out.write("                }\r\n");
      out.write("                $(\"#Searchresult\").html(newcontent);\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t//手动设置分页中的各参数值\r\n");
      out.write("\t\t\t  function getPageOptions(){\r\n");
      out.write("\t\t\t\t // alert(\"getPageOptions\");\r\n");
      out.write("                var opt = {callback: pageselectCallback};\r\n");
      out.write("\t\t\t\t\t opt[\"num_display_entries\"] = 5;//中间页数\r\n");
      out.write("\t\t\t\t\t opt[\"num_edge_entries\"] = 2;//前后边界页数\r\n");
      out.write("\t\t\t\t\t opt[\"prev_text\"] = '上一页';//上一页 文本 \r\n");
      out.write("\t\t\t\t\t opt[\"next_text\"] = '下一页';//下一页 文本\r\n");
      out.write("                return opt;\r\n");
      out.write("            }\r\n");
      out.write("\t\t\t\r\n");
      out.write("            // 页面加载执行此函数\r\n");
      out.write("            \r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("            \t//alert(\"ready(function\");\r\n");
      out.write("\t\t\t\tvar optInit= getPageOptions();//分页参数组\r\n");
      out.write("\t\t\t\t//alert(members.length);\r\n");
      out.write("                $(\"#Pagination\").pagination(members.length,optInit);\r\n");
      out.write("\t\t\t\t//alert(members.length);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"getInfo()\">\r\n");
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
      out.write("\t\t\t\t<li><a href=\"welcome.jsp\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"publishMessage.jsp\">发布信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"queryResultMessage.jsp\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"btn\" id=\"btnGet\" />\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"text\" id=\"publisherPhone\" >\r\n");
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
      out.write("\t\t\t\t<dl id=\"Searchresult\">\r\n");
      out.write("                <dt>Search Results will be inserted here ...</dt>\r\n");
      out.write("                </dl>\r\n");
      out.write("\t\t\t\t <div id=\"Pagination\" class=\"pagination\"></div>\r\n");
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
