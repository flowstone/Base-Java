<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
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
	<%
		int[] arr = {11,22,33,44,55};
		pageContext.setAttribute("arr",arr);
	%>
	<%--var="num":保存的是数组中的元素 --%>
	<c:forEach items="${arr }" var="num">
		${num }
	</c:forEach>
	<hr>
	
	    <%
    	List<String> list = new ArrayList<String>();
    	list.add("跑男");
    	list.add("欢乐喜剧人");
    	list.add("极限挑战");
    	list.add("笑傲江湖");
    	list.add("爸爸去哪儿");
    	
    	pageContext.setAttribute("list", list);
     %>
	<c:forEach items="${list }" var="name">
		${name }
	</c:forEach>
	<hr>
	<%
    	Map<String,String> map = new HashMap<String,String>();
    	map.put("addr1", "东京");
    	map.put("addr2", "东莞");
    	map.put("addr3", "巴黎");
    	map.put("addr4", "东南亚");
    
    pageContext.setAttribute("map", map);
     %>
	<c:forEach items="${map }" var="entry">
		${entry.value }
		${entry.key }
	</c:forEach>
</body>

</html>