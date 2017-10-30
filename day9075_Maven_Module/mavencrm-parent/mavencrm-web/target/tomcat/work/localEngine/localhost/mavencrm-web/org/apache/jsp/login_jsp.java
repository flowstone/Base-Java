package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体\r\n");
      out.write("}\r\n");
      out.write("TD {\r\n");
      out.write("\tFONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction subForm(){\r\n");
      out.write("\t\tdocument.getElementById(\"form1\").submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.6000.16809\" name=GENERATOR></HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<FORM id=form1 action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/user_login.action\" name=form1  method=post target=\"_parent\">\r\n");
      out.write("\r\n");
      out.write("<DIV id=UpdatePanel1>\r\n");
      out.write("<DIV id=div1 \r\n");
      out.write("style=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("<DIV id=div2 \r\n");
      out.write("style=\"LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff\"></DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<DIV>&nbsp;&nbsp; </DIV>\r\n");
      out.write("<DIV>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>\r\n");
      out.write("  <TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD style=\"HEIGHT: 105px\"><IMG src=\"images/login_1.gif\" \r\n");
      out.write("  border=0></TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD background=images/login_2.jpg height=300>\r\n");
      out.write("      <TABLE height=300 cellPadding=0 width=900 border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD colSpan=2 height=35></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD width=360></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=2 border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              <TR>\r\n");
      out.write("              \t<!-- 错误信息提示 -->\r\n");
      out.write("              \t<font color=\"red\">\r\n");
      out.write("              \t\t");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \t</font>\r\n");
      out.write("              \t\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\" width=80>登 录 名：</TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\" width=150><INPUT id=txtName \r\n");
      out.write("                  style=\"WIDTH: 130px\" name=\"user_code\"></TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\" width=370><SPAN \r\n");
      out.write("                  id=RequiredFieldValidator3 \r\n");
      out.write("                  style=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入登录名</SPAN></TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\">登录密码：</TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\"><INPUT id=txtPwd style=\"WIDTH: 130px\" \r\n");
      out.write("                  type=password name=\"user_password\"></TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\"><SPAN id=RequiredFieldValidator4 \r\n");
      out.write("                  style=\"FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white\">请输入密码</SPAN></TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\">验证码：</TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\"><INPUT id=txtcode \r\n");
      out.write("                  style=\"WIDTH: 130px\" name=txtcode></TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 28px\">&nbsp;</TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 18px\"></TD>\r\n");
      out.write("                <TD style=\"HEIGHT: 18px\"></TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD></TD>\r\n");
      out.write("                <TD><INPUT id=btn \r\n");
      out.write("                  style=\"BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px\" \r\n");
      out.write("                  onclick='subForm()' \r\n");
      out.write("                  type=image src=\"images/login_button.gif\" name=btn> \r\n");
      out.write("                  <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/regist.jsp\">\r\n");
      out.write("                  \t<img src=\"images/regist_button.gif\">\r\n");
      out.write("                  </a>\r\n");
      out.write("              </TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD><IMG src=\"images/login_3.jpg\" \r\n");
      out.write("border=0></TD></TR></TBODY></TABLE></DIV></DIV>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</FORM></BODY></HTML>\r\n");
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

  private boolean _jspx_meth_s_005factionerror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }
}
