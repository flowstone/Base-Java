package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD id=Head1>\r\n");
      out.write("<TITLE>模板</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<LINK href=\"css/Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"css/Manage.css\" type=text/css\r\n");
      out.write("\trel=stylesheet>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_019.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100%\" background=images/new_020.jpg\r\n");
      out.write("\t\t\t\t\t\theight=20></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_021.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t   <TD width=15 background=images/new_022.jpg>\r\n");
      out.write("\t\t\t   <IMG\tsrc=\"images/new_022.jpg\" border=0>\r\n");
      out.write("\t\t\t   </TD>\r\n");
      out.write("\t\t\t\t\t<TD align=\"center\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" height=300 border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\"><img src=\"images/welcome.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth=\"145\" height=\"46\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=images/new_023.jpg>\r\n");
      out.write("\t\t\t\t<IMG src=\"images/new_023.jpg\" border=0>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_024.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=middle width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\tbackground=images/new_025.jpg height=15></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_026.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
