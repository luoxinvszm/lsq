package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>校园信息自主发布平台</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"  href=\"");
      out.print(path );
      out.write("/css/qt-index.css\"    />\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"  href=\"");
      out.print(path );
      out.write("/css/qt-style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path );
      out.write("/js/yzp/curDate.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body  onLoad=\"getEClock(clock)\">\r\n");
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
      out.write("\t\t\t<p id=\"clock\"></p><!--时钟 -->\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // header -->\r\n");
      out.write("\t\t<!-- contents -->\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<!-- left -->\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<h2>关于我们</h2>\r\n");
      out.write("\t\t\t\t<ul  id=\"datas\" class=\"list\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><p style=\"color:black\"><a href=\"http://www.ttlsq.com\" style=\"color:#00b8d5;\"><font size=\"3px\"><strong>天天乐上墙(ttlsq.com)-校园信息自主发布平台</strong></font></a>是一个服务于高校和企业之间的服务性平台。一方面可以充分满足在校大学生便捷、个性的信息发布需求，\r\n");
      out.write("\t\t\t\t以更高效、更环保的发布模式减少传统信息发布方式（如：广告粘贴板，纸质宣传单等）所造成的大量资源浪费和环境污染。\r\n");
      out.write("\t\t\t\t另一方面可有效的解决企业的技术难题，提高高校的科研成果和技术人才的效用，推动产学研融合。可以利用学生实习、社会实践，和社会关系，\r\n");
      out.write("\t\t\t\t把学校的优势（技术、人力）发布给社会，再利用校园信息自主发布平台，把学生从社会实践中获得的企业需要整理发布到校园信息平台，招募团队完成项目，\r\n");
      out.write("\t\t\t\t实现以项目为目标的专业合作，推动产学研融合。</p></li>\r\n");
      out.write("\t\t\t\t<li><p style=\"color:black\">\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">平台创新点与特色 :</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">1. 我们的校园信息自主发布平台可以随时随地的发布信息，信息接收者的覆盖面非常广。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">2. 主营业务:学生和老师发布的信息免费，这样有利于我们在目标市场立足。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">3. 校园信息自主发布平台的输出终端采用多媒体广告机，取代了校园里乱粘乱贴的广告牌和铺张浪费的宣传</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;单，既干净环保又节约资源。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">4. 校园信息自主发布平台的出现大大节约了校园广告的人力资源。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">5. 广告机采用分时段和滚动播出的方式，大大提高了信息发布量，可以更好的为客户服务。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">6. 目标市场很大，为所有高校。且与各高校传统的信息发布方式相比具有很强的竞争力。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">7. 基于校园信息自主发布平台可以充分实现产学研融合。</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:#00b8d5;\"><strong>联系方式 :</strong></p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ : 237505474</p>\r\n");
      out.write("\t\t\t\t<p style=\"color:black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话 : 18704499540</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
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
}
