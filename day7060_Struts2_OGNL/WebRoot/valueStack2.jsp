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
	取request域中的值：<s:property value="#request.username" /><br/>
	取session域中的值：<s:property value="#session.username" /><br/>
	取application域中的值：
	<s:property value="#application.username" /><br/>
	<!-- 
		#attr.username先从page域中寻找，再从request域中寻找，
		再从session域中寻找，再从application域中寻找
	 -->
	取page域中的值 ：<s:property value="#attr.username" /><br/>
	取参数值： <s:property value="#parameters.username[0]" />
	<hr>
	#的用法2：构造集合<br/>
	构造List集合，不要加#<br/>
	<s:iterator value="{'f','l','o','w','s','t','o','n','e'}" var="star">
		<s:property value="#star"/>
	</s:iterator>
	<p>构造map集合</p>
	<s:iterator value="#{1:'苹果',2:'菠萝',3:'哈密瓜' }" var="fruit">
		<s:property value="#fruit.key"/>:<s:property value="#fruit.value"/>
	</s:iterator>
	
	<hr>
	<p>%的用法</p>
	%的用法1：告诉执行环境，不要把字符串当成ognl,而是要原样输出<br/>
	<s:property value="%{'hello'}"/>或<br/>
	<s:property value="'hello'"/> <br/>
	%的用法2：告诉执行环境，把字符串看成ognl表达式去从值栈里取寻找值<br/>
	<s:textfield value="%{username}"></s:textfield>
</body>
</html>