<%@page import="org.xueyao.domain.User"%>
<%@page import="java.util.*"%>
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
		el 获取复杂数据
	 --%>
	 
	<%
		User user = new User();
		user.setUsername("张三");
		pageContext.setAttribute("user",user);
	%>
	${empty user }
	
	<hr>
	${user!=null?user.username:"小明" } 	
	<hr>
	<%--演示EL执行运算 --%> 
	<%
		int x = 3;
		int y = 4;
		pageContext.setAttribute("x", x);
		pageContext.setAttribute("y", y);
	%>
	<%--
		使用EL表达式获取数据,最终都是讲数据转换成字符串,根据字符串,格式化数字,在进行计算
		如果数据不存在,不存在的数据,不参与运算
	 --%>
	 ${x+y }
	 ${x-y }
	 ${x*y }
	 ${x/y }
	 ${x%y }
	 <hr>
	 
	 <%
	 	boolean flag = true;
	 	boolean info = false;
	 	pageContext.setAttribute("flag", flag);
	 	pageContext.setAttribute("info", info);
	 %>
	 
	 <%-- ${flag & info } 爆出错误提示,包含所有运算--%>
</body>
</html>