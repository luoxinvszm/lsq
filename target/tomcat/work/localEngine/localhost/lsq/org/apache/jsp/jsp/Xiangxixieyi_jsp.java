package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Xiangxixieyi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      ");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/index.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<title>详细协议</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t   <div class=\"contents1\">\r\n");
      out.write("      \t<div class=\"main\">\r\n");
      out.write("      \t\t<h1><font size=\"+1\">协议详细内容</font></h1>\r\n");
      out.write("            <ul class=\"btnbox\">\r\n");
      out.write("            \t<li><a href=\"");
      out.print(path);
      out.write("/jsp/publishMessage.jsp\">返回上一层</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <br/><br/><br/><br/>\r\n");
      out.write("       \t\t<div align=\"center\"><p>天天乐上墙ttlsq.com——\r\n");
      out.write("用户协议</p></div>\r\n");
      out.write("<br><br>\r\n");
      out.write("       \t\t\r\n");
      out.write("<h2 align=\"left\">一、接受协议</h2>\r\n");
      out.write("<p >\r\n");
      out.write("<font size=\"2\">\r\n");
      out.write("感谢您光临天天乐上墙(ttlsq.com)-校园信息发布平台。本平台根据以下服务条款为您提供服务。这些条款可由本平台随时更新，无须另行通知。本平台服务条款(以下简称本“服务条款”)一旦发生变动, 本平台将在网页上公布修改内容。修改后的服务条款一旦在网页上公布即有效代替原来的服务条款。您可随时访问本平台，查阅最新版服务条款。\r\n");
      out.write("您在使用本平台提供的各项服务之前，应仔细阅读本服务条款。如您不同意本服务条款及或随时对其的修改，您可以主动放弃本平台提供的服务；您一旦使用本平台服务，即视为您已了解并完全同意本服务条款各项内容，包括本平台对服务条款随时所做的任何修改。\r\n");
      out.write("</font>\r\n");
      out.write("</p>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">二、服务内容</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("天天乐上墙(ttlsq.com)-校园信息发布平台是主要用于在校大学生发布生活、学习等相关积极健康向上的公布信息。目前面向大学生群体提供免费服务，对学校类信息提供免费发布服务，对商家类信息的发布将会产生一定服务费用，以便本平台的正常运营。\r\n");
      out.write("\r\n");
      out.write("</font></p>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">三、用户使用规则</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("\t天天乐上墙(ttlsq.com)-校园信息发布平台郑重提请用户，发布信息为公开信息请慎重填写，并且发布信息必须填入个人验证信息才可提交，等待审核通过即可查询已公布信息，个人验证信息本平台将做到隐私保护，请用户放心。\r\n");
      out.write("用户所发信息内容必须遵守国家有关法律规定，任何想要发布的信息都不得含有以下内容： </font></p>\r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("<ul >\r\n");
      out.write("<li style=\"height:20px;\">(1)违反宪法确定的基本原则的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(2)危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(3)损害国家荣誉和利益，攻击党和政府的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(4)煽动民族仇恨、民族歧视，破坏民族团结的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(5)破坏国家、地区间友好关系的； </li>\r\n");
      out.write("<li style=\"height:20px;\">(6)违背中华民族传统美德、社会公德、论理道德、以及社会主义精神文明的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(7)破坏国家宗教政策，宣扬邪教和封建迷信的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(8)散布谣言或不实消息，扰乱社会秩序 ，破坏社会稳定的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(9)煽动、组织、教唆恐怖活动、非法集会、结社、游行、示威、聚众扰乱社会秩序的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(10)散布淫秽、色情、赌博、暴力、恐怖或者教唆犯罪的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(11)侮辱或诽谤他人，侵害他人合法权益的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(12)侵犯他人肖像权、姓名权、名誉权、隐私权或其他人身权利的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(13)使用漫骂、辱骂、中伤、恐吓、诅咒等不文明语言的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(14)以非法民间组织名义活动的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(15)侵犯他人著作权、信息网络传播权等合法权益的；</li>\r\n");
      out.write("<li style=\"height:20px;\">(16)含有法律、行政法规禁止的其他内容的。 </li>\r\n");
      out.write("<li style=\"height:20px;\">(17)用户承担一切因自己发布信息不当导致的民事、行政或刑事法律责任。</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">四、隐私保护</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("天天乐上墙(ttlsq.com)-校园信息发布平台不对外公开或向第三方提供单个用户的资料及用户在使用网络服务时存储在本平台的非公开内容，但下列情况除外：  </font></p>\r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("<ul >\r\n");
      out.write("<li style=\"height:20px;\">（1）事先获得用户的明确授权；</li>\r\n");
      out.write("<li style=\"height:20px;\">（2）根据有关的法律法规要求；</li>\r\n");
      out.write("<li style=\"height:20px;\">（3） 按照相关政府主管部门的要求；</li>\r\n");
      out.write("<li style=\"height:20px;\">（4）为维护社会公众的利益；</li>\r\n");
      out.write("<li style=\"height:20px;\">（5）为维护本平台的合法权益；</li>\r\n");
      out.write("<li style=\"height:20px;\">（6） 其他需要公开、编辑或透露个人信息的情况。</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">五、知识产权</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("天天乐上墙(ttlsq.com)-校园信息发布平台提供的网络服务中包含的任何文本、图片、图形、音频和或视频资料均受版权、商标和或其它财产所有权法律的保护。未经相关权利人同意，上述资料均不得在任何媒体直接或间接发布、播放、出于播放或发布目的而改写或再发行，或者被用于其他任何商业目的。所有这些资料或资料的任何部分仅可作为私人用途而保存在某台计算机内。本平台不就由上述资料产生或在传送或递交全部或部分上述资料过程中产生的延误、不准确、错误和遗漏或从中产生或由此产生的任何损害赔偿，以任何形式向用户或任何第三方负法律责任。\r\n");
      out.write("天天乐上墙(ttlsq.com)-校园信息发布平台为提供网络服务而使用的任何软件（包括但不限于软件中所含的任何图象、照片、动画、录像、录音、音乐、文字和附加程序、随附的帮助材料）的一切权利均属于该软件的著作权人，未经该软件的著作权人许可，用户不得对该软件进行反向工程（reverse engineer）、反向编译（decompile）或反汇编（disassemble）等。 \r\n");
      out.write("</font></p>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">六、免责声明</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("用户明确同意其使用天天乐上墙(ttlsq.com)-校园信息发布平台网络服务所存在的风险将完全由其本人承担；因其使用本平台服务而产生的一切后果也由其本人承担。本平台对用户及任何第三方不承担任何责任。\r\n");
      out.write("本平台不担保或保证网络服务一定能满足用户的要求，也不担保网络服务不会中断，对网络服务的及时性、安全性、准确性也都不作任何担保或保证。\r\n");
      out.write("本平台不保证为向用户提供便利而设置的外部链接的准确性和完整性，同时，对于该等外部链接指向的不由本平台实际控制的任何网页上的内容，本平台也不承担任何责任。\r\n");
      out.write("对于因不可抗力或本平台不能控制的原因造成的网络服务中断或其它缺陷，本平台不承担任何责任，但将尽力减少因此而给用户造成的损失和影响。\r\n");
      out.write("本平台对于任何自本网站而获得的他人的信息、内容或者广告宣传等任何资讯（以下统称“信息”），不保证真实、准确和完整性。如果任何单位或者个人通过上述“信息”而进行任何行为，须自行甄别真伪和谨慎预防风险。否则，无论何种原因，本网站不对任何非与本网站直接发生的交易和/或行为承担任何直接、间接、附带或衍生的损失和责任。\r\n");
      out.write("</font></p>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">七、责任限制</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("用户明确了解并同意，基于以下原因造成的包括但不限于利润、信誉、应用、数据损失或其它无形损失，本平台不承担任何直接、间接、附带、特别、衍生性或惩罚性赔偿责任（即使本平台事先已被告知发生此种赔偿之可能性亦然）：</font></p>\r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("<ul >\r\n");
      out.write("<li style=\"height:20px;\">(1)我们的服务之使用或无法使用；</li>\r\n");
      out.write("<li style=\"height:20px;\">(2)为替换从或通过我们的服务购买或取得之任何商品、数据、信息、服务，收到的讯息，或缔结之交易而发生的成本；</li>\r\n");
      out.write("<li style=\"height:20px;\">(3)用户的传输或数据遭到未获授权的存取或变造；</li>\r\n");
      out.write("<li style=\"height:20px;\">(4) 任何第三方在我们的服务中所作之声明或行为；</li>\r\n");
      out.write("<li style=\"height:20px;\">(5)与我们的服务相关的其它事宜，但本协议有明确规定的除外。 </li>\r\n");
      out.write("</ul></div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">八、终止服务</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("用户同意本平台有权基于其自行之考虑，因任何理由，包含但不限于缺乏使用或本平台认为用户已经违反本协议的文字及精神，而终止我们的服务之使用（或服务之任何部分），并将用户在我们的服务内的任何内容加以移除并删除。本平台亦得依其自行之考虑，于通知或未通知之情形下，随时终止我们的服务或其任何部分。用户同意依本协议任何规定提供之我们的服务，无需进行事先通知即可中断或终止，用户承认并同意，本平台可立即关闭或删除用户的所有相关信息及文件，及或禁止提供我们的服务。此外，用户同意若我们的服务之使用被中断或终止或用户的相关信息被关闭或删除，本平台对用户或任何第三人均不承担任何责任。 \r\n");
      out.write("</font></p>\r\n");
      out.write("<br><br>\r\n");
      out.write("<h2 align=\"left\">九、法律管辖与适用</h2>\r\n");
      out.write("<p><font size=\"2\">\r\n");
      out.write("本服务协议的生效、履行、解释及争议的解决均适用中华人民共和国法律。如就本协议内容或其执行发生任何争议，应尽量友好协商解决；协商不成时，则争议各方均一致同意将争议提交北京仲裁委员会仲裁解决。仲裁地点为北京。仲裁语言为中文。仲裁裁决为终局的，对各方均有法律约束力。 \r\n");
      out.write("特别提示：用户在进行使用平台之前，请确保本人已经完全理解并接受本协议所有条款（尤其是免责条款），否则，请不要使用。一旦用户发布信息，则表明用户已经完全理解并接受本协议所有条款，尤其是免责和责任限制条款。\r\n");
      out.write("</font></p>\r\n");
      out.write("               <br><br>                                         \r\n");
      out.write("       \t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("    <!-- // contents -->\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<p class=\"p1\">版权所有：长春理工大学</p>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>友情链接：</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://www.cust.edu.cn/\"  target=\"_blank\">长春理工大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">吉林大学</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">东北师范大学</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"bg\"><a href=\"\">长春大学</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p class=\"p1\">地址:吉林省 长春市 卫星路 7089号  邮编：130022</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t    \r\n");
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
