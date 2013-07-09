package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ht_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.release();
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
      out.write("\t\r\n");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 894164699f041f384f04a336ee54ff0b1f80cd25
      out.write("\t");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
<<<<<<< HEAD
=======
=======
      out.write("\r\n");
 String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
>>>>>>> f7a234f1421c5b06c6c5a082d71b1dc3c8f3218a
>>>>>>> 894164699f041f384f04a336ee54ff0b1f80cd25

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>管理员登录</title>\r\n");
      out.write("<link href=\"");
      out.print(path );
      out.write("/css/ht-login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction changeImage() {\r\n");
      out.write("\t\tvar date = new Date();\r\n");
      out.write("\t\tdocument.getElementById(\"auth\").src = 'authImg?id=' + date.getTime();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction check1() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar id = document.getElementById(\"pass1\");\r\n");
      out.write("\t\tvar hid = document.getElementById(\"d1\");\r\n");
      out.write("\t\tif (\"\" == id.value) {\r\n");
      out.write("\t\t\thid.style.display = \"block\";\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\thid.style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkyan() {\r\n");
      out.write("\t\tvar username = document.getElementById(\"yanzhengma\");\r\n");
      out.write("\t\tvar u1 = document.getElementById(\"yan\");\r\n");
      out.write("\t\tif (\"\" == username.value) {\r\n");
      out.write("\t\t\tu1.style.display = \"block\";\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tu1.style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkuser() {\r\n");
      out.write("\t\tvar username = document.getElementById(\"zh\");\r\n");
      out.write("\t\tvar u1 = document.getElementById(\"u1\");\r\n");
      out.write("\t\tif (\"\" == username.value) {\r\n");
      out.write("\t\t\tu1.style.display = \"block\";\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tu1.style.display = \"none\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(path);
      out.write("/image/ht-login_h1.gif\" alt=\"校园信息自主发布平台\" />\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<img src=\"");
      out.print(path );
      out.write("/image/login_img.gif\" alt=\"login\" class=\"img\" />\r\n");
      out.write("\t\t<font color=\"red\" face=\"songti\">");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /jsp/ht-login.jsp(57,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("login");
    // /jsp/ht-login.jsp(57,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<dl>\r\n");
        out.write("\t\t\t\t<dt>用户名：</dt>\r\n");
        out.write("\t\t\t\t<dd>\r\n");
        out.write("\t\t\t\t\t<input type=\"text\" name=\"username\"\r\n");
        out.write("\t\t\t\t\t\tonblur=\"checkuser()\" id=\"zh\" class=\"text\" />\r\n");
        out.write("\t\t\t\t\t<div style=\"display: none\" id=\"u1\" class=\"font\">\r\n");
        out.write("\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">用户名不能为空</font>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</dd>\r\n");
        out.write("\t\t\t\t<dt>密码:</dt>\r\n");
        out.write("\t\t\t\t<dd>\r\n");
        out.write("\t\t\t\t\t<input type=\"password\"\r\n");
        out.write("\t\t\t\t\t\tname=\"password\" onblur=\"check1()\" id=\"pass1\" class=\"text\" />\r\n");
        out.write("\t\t\t\t\t<div style=\"display: none\" id=\"d1\" class=\"font\">\r\n");
        out.write("\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">密码不能为空</font>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</dd>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<dt>验证码:</dt>\r\n");
        out.write("\t\t\t\t<dd class=\"dd\">\r\n");
        out.write("\t\t\t\t\t<input type=\"text\" name=\"auth\" onblur=\"checkyan()\"\r\n");
        out.write("\t\t\t\t\t\t\t\tid=\"yanzhengma\" class=\"text\" />\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"img1\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<img src=\"authImg\" name=\"auth\" id=\"auth\" /><a\r\n");
        out.write("\t\t\t\t\t\t\t\thref=\"javascript:void(0)\" onclick=\"changeImage()\">看不清</a>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div style=\"display: none\" id=\"yan\" class=\"font\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">验证码不能为空</font>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</dd>\r\n");
        out.write("\t\t\t</dl>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t<div class=\"btnbox\">\r\n");
        out.write("\t\t\t\t<input type=\"submit\" value=\"登录\" class=\"btn\" />\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
