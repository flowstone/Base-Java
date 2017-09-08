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
	<%-- var 设置一个变量空间,将test的结果保存下来,然后,默认
		存入page容器中
	 --%>
	<%--scope="session" 设置var中的数据保存在哪个容器中 --%> 
	<c:if test="true" var="hehe" scope="session">
		测试if标签,EL表达式方式
	</c:if>
	<hr>
	pageScope:${pageScope.hehe }<br/>
	requestScope:${requestScope.hehe }<br/>
	sessionScope:${sessionScope.hehe }<br/>
	applicationScope:${applicationScope.hehe }<br/>
</body>
</html>