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
		演示choose when otherwise 标签
	 --%>
	 
	 <%
	 	int num = 4;
	 	pageContext.setAttribute("num",num);
	 	
	 	int flag = 1;
	 	pageContext.setAttribute("flag",flag);
	 %>
	 <c:choose>
	 	<c:when test="${num==1 }">星期一</c:when>
	 	<c:when test="${num==2 }">星期二</c:when>
	 	<c:when test="${num==3 }">星期三</c:when>
	 	<c:when test="${num==4 }">星期四</c:when>
	 	<c:when test="${num==5 }">星期五</c:when>
	 	<c:when test="${num==6 }">星期六</c:when>
	 	<c:when test="${num==7 }">星期日</c:when>
	 	
	 	<c:when test="${flag==1 }">白天</c:when>
	 	<c:when test="${flag==2 }">黑夜</c:when>
	 	<c:otherwise>
	 		参数不合法
	 	</c:otherwise>
	 </c:choose>
</body>
</html>