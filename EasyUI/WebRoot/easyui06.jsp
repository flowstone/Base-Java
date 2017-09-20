<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dialog</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
$(function(){
	$('#dd').dialog({
	    title: 'My Dialog',
	    width: 400,
	    height: 200,
	    closed: false,
	    cache: false,
	    //引入一个外部的内容，使用的是ajax加载
	    href: 'video.jsp',
	    modal: true
	});
});

</script>
</head>
<body>
	<div id="dd">Dialog Content.</div>
</body>
</html>