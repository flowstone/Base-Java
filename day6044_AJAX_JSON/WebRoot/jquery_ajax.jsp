<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>
<body>
	<script type="text/javascript">
		$.ajax({
			//请求方式 
			type: "POST",
			//请求路径
			url: "${root}/ajax",
			//发送参数
			data: "name=John&location=Boston",
			//返回的数据类型:
			dataType: "text",
			//回调函数
			//请求成功的回调函数
			success: function(msg) {
				alert("Data Saved:"+msg);
			},
			//请求失败的回调函数
			error: function(msg) {
				alert("Error");
			}
		});
		
		/*
			url:待载入页面的URL地址
			data:待发送Key/value参数
			callback:载入成功时回调函数
			type: 返回内容 ,xml,html,script,json,text
		*/
		$.get(
			"ajax",
			{name: "John", time: "2pm"},
			function (data) {
				alert("Data Loaded1:" +data);
			}
		);
		
		/*
			url: 待载入页面的URL地址
			data: 待发送 key/value参数
			callback: 载入成功时回调函数
			type: 返回内容格式,xml,html,script,json,text,_default
		*/
		$.post(
			"ajax",
			{name: "John", time: "2pm"},
			function(data){
				alert("Data Loaded2:"+data);
			}
		);
	</script>
</body>
</html>