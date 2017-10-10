<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>卖家功能首页</title>
  </head>
  
  <body>
	<a href="${root}/add_good.jsp">添加商品</a><br/>
	<a href="${root}/queryAllGoodsAdminServelt">查看商品</a>
</body>
</html>
