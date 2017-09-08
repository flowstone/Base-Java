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
	 	//演示数组
	 	int[] arr = {1,2,3,4,57};
	 	pageContext.setAttribute("arr",arr);
	 %>
	 
	 可以通过角标获取数据:${arr[0] }
	 <hr>
	 <%
	 	List<String> list = new ArrayList<String>();
	 	list.add("白米饭");
	 	list.add("咸菜");
	 	list.add("紫菜汤");
	 	
	 	pageContext.setAttribute("list", list);
	 	
	 	Map<String,String> map = new HashMap<String,String>();
	 	map.put("sj1","诺基亚");
	 	map.put("sj2","黑莓");
	 	map.put("sj3","摩托罗拉");
	 	map.put("sj4","大哥大");
	 	map.put("aa.bb.cc","波导手机中的战斗机");
	 	
	 	pageContext.setAttribute("map", map);
	 %>
	 可以通过角标获取数据: ${list[0] }
	 <hr>
	 通过map的key获取数据
	 ${map.sj1 }
	 ${map["aa.bb.cc"] }
	 <hr>
	 
	 <%--EL获取自定义对象 --%>
	 <%
	 	User u = new User();
	 	u.setUsername("李四");
	 	u.setAge(18);
	 	
	 	pageContext.setAttribute("u",u);
	 %>
	 通过相同的属性名称获取数据:
	 ${u }
	 ${u.username }
	 ${u.age }
	 
	 <%--所有可以使用点的地方,都可以使用[]获取数据 --%>
	 ${u["age"] }
</body>
</html>