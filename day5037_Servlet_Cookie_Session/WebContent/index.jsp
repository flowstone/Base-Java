<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//获取session中的用户名
		String username = (String)session.getAttribute("username");
		if (null != username && !"".equals(username)) {
			out.println("欢迎"+username);
		} else {
			out.println("<a href='/day5037_Servlet_Cookie_Session/login_verify.html'>登录</a>");
		}
	%>
</body>
</html>