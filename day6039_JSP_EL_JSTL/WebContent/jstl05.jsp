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
		演示foreach标签,循环对象
	 --%>
	 <%--
	 	var 保存了控制循环变量数据的值
	 	varSatus 保存了循环过程中状态信息(索引号,循环总数,是否第一次或者最后一次)
	  --%>
	 <c:forEach begin="1" end="5" step="2" var="info">
	 ${info }
	 </c:forEach> 
	<c:forEach begin="1" end="10" step="1" var="info" varStatus="sta">
		<td>${sta.index }</td>		
		<td>${sta.count }</td>		
		<td>${sta.first }</td>		
		<td>${sta.last }</td>	<br/>	
	</c:forEach>
</body>

</html>