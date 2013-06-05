package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.*;

public final class backstage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>校园信息自主发布平台管理系统</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/css/houtai.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/houtai.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/jquery-1.9.1.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/backstage.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yhy/yhy.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yhy/queryMessage.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"\">\r\n");

	String userRealName=session.getAttribute("userRealName").toString();
	String time = new SimpleDateFormat("yyyy年MM月dd日 EE").format(new Date());

	String password = session.getAttribute("password").toString();

      out.write("\r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<h1>信息管理系统</h1>\r\n");
      out.write("\t\t<p>");
      out.print(time);
      out.write("</p>\r\n");
      out.write("\t\t<p>欢迎您 &nbsp;&nbsp;&nbsp;");
      out.print(userRealName);
      out.write("</p>\r\n");
      out.write("\t\t<div class=\"btnbox\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"修改密码\" class=\"btn1\" onclick=\"Tab(10)\"/><input\r\n");
      out.write("\t\t\t\ttype=\"button\" value=\"安全退出\" class=\"btn1\" onclick=\"exit()\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- // header -->\r\n");
      out.write("\t<!-- left -->\r\n");
      out.write("\t<div class=\"contents\">\r\n");
      out.write("\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t<ul id=\"listUL\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(1)\">待审信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(2)\">已发布信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(3)\">未通过的信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(4)\">发布过期信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(5)\">创建管理员</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(6)\">使用中管理员</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(7)\">已冻结管理员</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" onClick=\"Tab(8)\">系统设置</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //left -->\r\n");
      out.write("\t\t<!-- right1 -->\r\n");
      out.write("\t\t<div id=\"right1\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：待审信息</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"checkbox\" /><input type=\"button\" value=\"发布\" />\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"不通过\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"messsageList0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"690\">信息内容</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"70\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">首页</a></span> <span><a href=\"#\">上一页</a></span> <span><a\r\n");
      out.write("\t\t\t\t\thref=\"#\">下一页</a></span> <span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right1 -->\r\n");
      out.write("\t\t<!-- right2 -->\r\n");
      out.write("\t\t<div id=\"right2\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：已发布信息</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"checkbox\" /><input type=\"button\" value=\"删除信息\" /><input\r\n");
      out.write("\t\t\t\t\ttype=\"button\" value=\"撤销发布\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"messsageList1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"670\">信息内容</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<div id=\"paging\" class=\"paging\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right2 -->\r\n");
      out.write("\t\t<!-- right3 -->\r\n");
      out.write("\t\t<div id=\"right3\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：未通过信息</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"checkbox\" /><input type=\"button\" value=\"删除\" /><input\r\n");
      out.write("\t\t\t\t\ttype=\"button\" value=\"待审\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"messsageList2\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"670\">信息内容</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">首页</a></span> <span><a href=\"#\">上一页</a></span> <span><a\r\n");
      out.write("\t\t\t\t\thref=\"#\">下一页</a></span> <span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right3 -->\r\n");
      out.write("\t\t<!-- right4 -->\r\n");
      out.write("\t\t<div id=\"right4\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：过期信息</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"checkbox\" /><input type=\"button\" value=\"删除\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"messsageList3\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"670\">信息内容</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">首页</a></span> <span><a href=\"#\">上一页</a></span> <span><a\r\n");
      out.write("\t\t\t\t\thref=\"#\">下一页</a></span> <span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right4 -->\r\n");
      out.write("\t\t<!-- right5 -->\r\n");
      out.write("\t\t<div id=\"right5\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：创建管理员</div>\r\n");
      out.write("\t\t\t<label>请输入管理员姓名：</label><input type=\"text\"  class=\"text\" name=\"userRealName\" id=\"name\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"创建\" class=\"btn\" onclick=\"checkcreate()\"/>\r\n");
      out.write("\t\t\t<table id=\"createlist\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right5 -->\r\n");
      out.write("\t\t<!-- right6 -->\r\n");
      out.write("\t\t<div id=\"right6\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：使用中管理员</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"button\" value=\"全选\" onclick=\"checkAll()\" class=\"butt\"/>\r\n");
      out.write("\t\t\t\t <input type=\"button\" value=\"取消全选\" onclick=\"uncheckAll()\"class=\"butt\"/><input type=\"button\" value=\"删除\" onclick=\"batchdelete()\" class=\"butt\" /><input\r\n");
      out.write("\t\t\t\t\ttype=\"button\" value=\"冻结\" onclick=\"batchcancle()\" class=\"butt\"/>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" class=\"table1\" id=\"usingAdminList\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">首页</a></span> <span><a href=\"#\">上一页</a></span> <span><a\r\n");
      out.write("\t\t\t\t\thref=\"#\">下一页</a></span> <span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right6 -->\r\n");
      out.write("\t\t<!-- right7 -->\r\n");
      out.write("\t\t<div id=\"right7\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：已冻结管理员</div>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t批量操作： <input type=\"button\" value=\"全选\" onclick=\"checkAll()\"/>\r\n");
      out.write("\t\t\t\t <input type=\"button\" value=\"取消全选\" onclick=\"uncheckAll()\"/><input type=\"button\" value=\"删除\" onclick=\"batchdelete()\"/><input\r\n");
      out.write("\t\t\t\t\ttype=\"button\" value=\"激活\" onclick=\"batchrecover()\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" class=\"table1\" id=\"deletedAdminList\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\">序号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"200\">账号</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"200\">昵称</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"250\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"page\">\r\n");
      out.write("\t\t\t\t<span><a href=\"#\">首页</a></span> <span><a href=\"#\">上一页</a></span> <span><a\r\n");
      out.write("\t\t\t\t\thref=\"#\">下一页</a></span> <span><a href=\"#\">尾页</a></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right7 -->\r\n");
      out.write("\t\t<!-- right8 -->\r\n");
      out.write("\t\t<div id=\"right8\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：系统设置</div>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>信息字数设置:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"perMsgWords\" class=\"text\">字 <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"button\" value=\"保存\" class=\"btn\" onclick=\"updateperMsgWords()\" />\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>每人每天发布信息次数设置:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sendMsgNum\" class=\"text\">次 <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"button\" value=\"保存\" class=\"btn\" onclick=\"updatesendMsgNum()\" />\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>密码重置设置:</dt>\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"defaultPasswords\" class=\"text\">&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"保存\" class=\"btn\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"updatedefaultPasswords()\" />\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //right9 -->\r\n");
      out.write("\t<div id=\"right10\">\r\n");
      out.write("\t\t\t<div class=\"tlt\">当前位置：修改密码</div>\r\n");
      out.write("\t\t\t<form action=\"updatePassword_userAction\" name=\"updatePassword\">\r\n");
      out.write("\t\t\t<div align=\"center\" >\r\n");
      out.write("请输入原密码:<input type=\"text\" id=\"old\" onblur=\"checkOld()\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: none\" id=\"u1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">密码输入错误，请重新输入</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t请输入新密码:\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" onblur=\"checknew1()\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"user.password\" id=\"new1\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"display: none\" id=\"d1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">密码不能为空</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t请再输入新密码:\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" id=\"new2\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"display: none\" id=\"d2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font face=\"宋体\" color=\"red\">两次密码输入不一致</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t\t<input type=\"hidden\" value=");
      out.print(password);
      out.write(" id=\"oldPassword\"> <input\r\n");
      out.write("\t\t\ttype=\"button\" onclick=\"check()\" value=\"确定\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"r1\">\r\n");
      out.write("\t\t<div class=\"tlt\">当前位置：修改密码</div>\r\n");
      out.write("\t\t\t修改成功\r\n");
      out.write("\t\t</div>\r\n");
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
