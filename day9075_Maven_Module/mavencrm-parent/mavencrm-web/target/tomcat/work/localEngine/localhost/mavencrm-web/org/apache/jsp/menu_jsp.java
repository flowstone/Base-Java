package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd\">\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD id=Head1>\r\n");
      out.write("<TITLE>导航</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<STYLE type=text/css>\r\n");
      out.write("BODY {\r\n");
      out.write("\tPADDING-RIGHT: 0px;\r\n");
      out.write("\tPADDING-LEFT: 0px;\r\n");
      out.write("\tPADDING-BOTTOM: 0px;\r\n");
      out.write("\tMARGIN: 0px;\r\n");
      out.write("\tPADDING-TOP: 0px;\r\n");
      out.write("\tBACKGROUND-COLOR: #2a8dc8\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("BODY {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("TD {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("DIV {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("P {\r\n");
      out.write("\tFONT-SIZE: 11px;\r\n");
      out.write("\tCOLOR: #003366;\r\n");
      out.write("\tFONT-FAMILY: Verdana\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mainMenu {\r\n");
      out.write("\tFONT-WEIGHT: bold;\r\n");
      out.write("\tFONT-SIZE: 14px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tCOLOR: #000000\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:link {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #0055bb;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:visited {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #0055bb;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.style2:hover {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.active {\r\n");
      out.write("\tPADDING-LEFT: 4px;\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("\tTEXT-DECORATION: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".span {\r\n");
      out.write("\tCOLOR: #ff0000;\r\n");
      out.write("}\r\n");
      out.write("</STYLE>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("\tfunction MenuDisplay(obj_id) {\r\n");
      out.write("\t\tfor (var i = 1; i <= 9; i++) {\r\n");
      out.write("\t\t\tvar obj = document.getElementById('table_' + i);\r\n");
      out.write("\t\t\tif(obj){\r\n");
      out.write("\t\t\t\tdocument.getElementById('table_' + i).style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('table_' + i + 'Span').innerText = '＋';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar obj = document.getElementById(obj_id);\r\n");
      out.write("\t\tif(obj){\r\n");
      out.write("\t\t\tif (obj.style.display == 'none') {\r\n");
      out.write("\t\t\t\tobj.style.display = 'block';\r\n");
      out.write("\t\t\t\tdocument.getElementById(obj_id + 'Span').innerText = '－';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tobj.style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById(obj_id + 'Span').innerText = '＋';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\t<FORM id=form1 name=form1 action=YHMenu.aspx method=post>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_005.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=middle width=180 background=images/new_006.jpg\r\n");
      out.write("\t\t\t\t\t\theight=35><B>人力资源 －功能菜单</B></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_007.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=images/new_008.jpg></TD>\r\n");
      out.write("\t\t\t\t\t<TD vAlign=top width=180 bgColor=#ffffff>\r\n");
      out.write("\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=3 width=165 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_1');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_1Span>＋</SPAN> 客户管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_1 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/customer_showadd.action\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 新增客户</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/customer_listPage.action\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 客户列表</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_2');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_2Span>＋</SPAN> 联系人管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_2 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fa_005f0(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fa_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_5');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_5Span>＋</SPAN> 客户拜访管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_5 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fa_005f2(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fa_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_3');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_3Span>＋</SPAN> 综合查询</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_3 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 客户信息查询</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 联系人信息查询</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－ 客户拜访记录查询</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_4');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_4Span>＋</SPAN> 统计分析</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_4 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－客户行业统计</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－客户来源统计</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD background=images/new_027.jpg height=1></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=mainMenu onClick=\"MenuDisplay('table_6');\"><SPAN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=span id=table_6Span>＋</SPAN>系统管理</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TABLE id=table_6 style=\"DISPLAY: none\" cellSpacing=0\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcellPadding=2 width=155 align=center border=0>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－角色管理</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－用户管理</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<TD class=menuSmall><A class=style2 href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttarget=main>－数据字典</A></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=images/new_009.jpg></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_010.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=middle width=180 background=images/new_011.jpg\r\n");
      out.write("\t\t\t\t\t\theight=15></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"images/new_012.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t</FORM>\r\n");
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

  private boolean _jspx_meth_s_005fa_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f0.setParent(null);
    // /menu.jsp(160,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setAction("linkMan_showadd");
    // /menu.jsp(160,13) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setNamespace("/");
    // /menu.jsp(160,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setCssClass("style2");
    // /menu.jsp(160,13) null
    _jspx_th_s_005fa_005f0.setDynamicAttribute(null, "target", new String("main"));
    int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
    if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t－ 新增联系人\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f1.setParent(null);
    // /menu.jsp(168,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setAction("linkMan_listPage");
    // /menu.jsp(168,13) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setNamespace("/");
    // /menu.jsp(168,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setCssClass("style2");
    // /menu.jsp(168,13) null
    _jspx_th_s_005fa_005f1.setDynamicAttribute(null, "target", new String("main"));
    int _jspx_eval_s_005fa_005f1 = _jspx_th_s_005fa_005f1.doStartTag();
    if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t－联系人列表\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f2.setParent(null);
    // /menu.jsp(192,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setAction("saleVisit_showadd");
    // /menu.jsp(192,13) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setNamespace("/");
    // /menu.jsp(192,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setCssClass("style2");
    // /menu.jsp(192,13) null
    _jspx_th_s_005fa_005f2.setDynamicAttribute(null, "target", new String("main"));
    int _jspx_eval_s_005fa_005f2 = _jspx_th_s_005fa_005f2.doStartTag();
    if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t－新增客户拜访\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f3.setParent(null);
    // /menu.jsp(200,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setAction("saleVisit_listPage");
    // /menu.jsp(200,13) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setNamespace("/");
    // /menu.jsp(200,13) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setCssClass("style2");
    // /menu.jsp(200,13) null
    _jspx_th_s_005fa_005f3.setDynamicAttribute(null, "target", new String("main"));
    int _jspx_eval_s_005fa_005f3 = _jspx_th_s_005fa_005f3.doStartTag();
    if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t－客户拜访列表\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fa_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005ftarget_005fnamespace_005fcssClass_005faction.reuse(_jspx_th_s_005fa_005f3);
    return false;
  }
}
