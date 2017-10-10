<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	// 将session销毁 
	session.invalidate();
	// 跳转到登录页面 
	response.sendRedirect(request.getContextPath() + "/login.jsp");
%>
