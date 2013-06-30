package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class publishMessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.release();
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
      out.write("    \t\r\n");
      out.write("    ");

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
      out.write("/css/qt-index.css\"   />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/qt-style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/qh/publishMessage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/curDate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function changeImage() {\r\n");
      out.write("\tvar date = new Date();\r\n");
      out.write("\tdocument.getElementById(\"auth\").src = 'authImg?id=' + date.getTime();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("/jsp/browseMessage.jsp?msgStatus=1&publishTime=&publisherPhone=\">浏览信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/jsp/aboutUs.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- left -->\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<h2>发布信息</h2>\r\n");
      out.write("\t\t\t\t<p class=\"p\"><strong>请认真填写下面信息</strong></p>\r\n");
      out.write("\t\t\t\t<font color=\"red\" face=\"songti\">");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("\t\t\t\t<dl class=\"dl\">\r\n");
      out.write("\t\t\t\t\t<dt>署名</dt>\r\n");
      out.write("\t\t\t\t\t<dd><input type=\"text\"  class=\"text\" id=\"publisherName\"/></dd>\r\n");
      out.write("\t\t\t\t\t<dt>电话号码</dt>\r\n");
      out.write("\t\t\t\t\t<dd><input type=\"text\" class=\"text\" id=\"publisherPhone\"/></dd>\r\n");
      out.write("\t\t\t\t\t<dt>验证码</dt>\r\n");
      out.write("\t\t\t\t\t<dd><input type=\"text\" class=\"text1\" id=\"authimg\"/><img src=\"authImg\"  id=\"auth\" style=\"width:100px;height:30px;\"/><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"changeImage()\">看不清</a></dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<p class=\"p\">请输入您要发布的信息</p>\r\n");
      out.write("\t\t\t\t<textarea class=\"textarea\" id=\"messageContext\"></textarea>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" checked class=\"check\" /><label>我已接受**协议</label>\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"提&nbsp;交\" class=\"btn\" id=\"btnGet\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // left -->\r\n");
      out.write("\t\t\t<!-- right -->\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<h2>发布协议</h2>\r\n");
      out.write("\t\t\t\t<p><font size=\"2px\" color=\"grey\">天天乐上墙(ttlsq.com)-校园信息自主发布平台郑重提请用户，发布信息为公开信息请慎重填写，\r\n");
      out.write("\t\t\t\t并且发布信息必须填入个人验证信息才可提交，等待审核通过即可查询已公布信息，个人验证信息本平台将做到隐私保护，请用户放心。</font>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p><font size=\"2px\" color=\"grey\">用户所发信息内容必须遵守国家有关法律规定，任何信息都不得含有以下内容： \r\n");
      out.write("\t\t\t\t\t(1)违反宪法确定的基本原则的；\r\n");
      out.write("\t\t\t\t\t(2)危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；\r\n");
      out.write("\t\t\t\t\t(3)损害国家荣誉和利益，攻击党和政府的信息;</font>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#00b8d5\"><strong><a href=\"Xiangxixieyi.jsp\">更多相关. . . .</a></strong></font>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // right -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // contents -->\r\n");
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

  private boolean _jspx_meth_s_005ffielderror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }
}
