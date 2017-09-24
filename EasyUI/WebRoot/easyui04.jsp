<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css"
	href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
	$(function() {
		$('#win2').window({
			width : 600,
			height : 400,
			//modal:true,
			onBeforeClose : function() {
				alert("马上关闭窗口！！！");
			}
		});

		$("#btn").click(function() {

			$('#win2').panel('resize', {
				width : 200,
				height : 100
			});
		});

	});
</script>
</head>
<body>
	<input id="btn" type="button" value="重设尺寸">
	<div id="win2"></div>
</body>
</html>