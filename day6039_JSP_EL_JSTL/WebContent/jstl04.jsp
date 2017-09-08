<%@page import="org.xueyao.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		演示out标签
		default设置没有数据的时候,默认输出
	 --%>
	 <%pageContext.setAttribute("str", "天天向上"); %>
	 <c:out value="${str }" default="好好学习"></c:out>
	 
	 <c:out value="<a href='http://www.baidu.com'>测试</a>" escapeXml="false"></c:out>
</body>
</html>