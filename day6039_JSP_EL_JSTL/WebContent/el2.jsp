<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		需要:获取四个容器中的数据
	 --%>
	 
	 <%
	 	pageContext.setAttribute("name", "小明", 4);
	 	pageContext.setAttribute("name", "小狸", 3);
	 	pageContext.setAttribute("name", "小花", 2);
	 	pageContext.setAttribute("name", "小丽", 1);
	 %>
	 
	 <%=pageContext.APPLICATION_SCOPE%>
	 <%=pageContext.SESSION_SCOPE %>
	 <%=pageContext.REQUEST_SCOPE %>
	 <%=pageContext.PAGE_SCOPE %>
	 
	 <hr>
	 ${applicationScope.name }
	 ${sessionScope.name }
	 ${requestScope.name }
	 ${pageScope.name }
	 ${name }
</body>
</html>