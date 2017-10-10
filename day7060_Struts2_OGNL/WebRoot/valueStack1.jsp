<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	1.通过名字取对象栈里的数据：<s:property value="username" /><br/>
	2.通过下标取对象栈里的数据：<s:property value="[1].top" /><br/>
	3.取出对象栈栈顶的元素：<s:property value="[0].top.username"/><br/>
	
	
	<hr>
	取出上下文栈里的数据： <s:property value="#username" /><br/>
	取出上下文栈里的数据： <s:property value="#password" /><br/>
	没有加#  优先从对象栈搜索，如果对象栈中没有，再搜索上下文栈；一旦搜索到立马停止搜索：
	<s:property value="password"/><br/>
	找的是Action中的属性： <s:property value="age" />
</body>
</html>