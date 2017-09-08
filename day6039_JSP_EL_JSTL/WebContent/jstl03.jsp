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
		演示set标签
	 --%>
	 
	 <c:set  var="root" value="${pageContext.request.contextPath }" scope="session"></c:set>
	 ${sessionScope.root }
	 
	 <hr>
	 <%---修改数据演示 --%>
	 <%pageContext.setAttribute("user",new User()); %>
	 <%--
	 	target="${user}" 指定要修改的对象
	 	property="name" 指定要修改的属性
	  --%>
	  <%-- 下面结果和老师的结果不一样 --%>
	  ${user }
	  <c:set target="${user }" property="username" value="柳岩"></c:set>
	  ${user}
</body>
</html>