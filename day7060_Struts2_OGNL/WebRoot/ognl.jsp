<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>演示ognl的几种用法</h1>
	直接在页面显示一个值：<s:property value="1"/><br/>
	调用对象里的方式：<s:property value="'hello'.toUpperCase()" /><br/>
	<!-- 使用类里的静态方法，必须开启OGNL调用静态方法的开关 -->
	直接调用类里的静态方法： <s:property value="@java.lang.Math@max(1,3)" /><br/>
	
	运算 ： <s:property value="1+4" />
</body>
</html>