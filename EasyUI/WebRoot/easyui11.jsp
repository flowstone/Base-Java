<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
	$(function() {
		$.messager.alert('Warning','The warning message');
		$.messager.confirm('Confirm','Are you sure you want to delete record?',function(r){
		    if (r){
				alert('ok');
		    }
		});
		
		/* 在屏幕的右下角显示一个消息窗口  */
		$.messager.show({
			title:'My Title',
			msg:'Message will be closed after 5 seconds.',
			timeout:5000,
			showType:'slide'
		});

		$.messager.show({
			title:'My Title',
			msg:'Message will be closed after 4 seconds.',
			showType:'show',
			style:{
				right:'',
				top:document.body.scrollTop+document.documentElement.scrollTop,
				bottom:''
			}
		});

		$.messager.alert('My Title','Here is a info message!','info');
		
		$.messager.confirm('Confirm', 'Are you sure to exit this system?', function(r){
			if (r){
				// exit action;
			}
		});

		
		$.messager.prompt('Prompt', 'Please enter your name:', function(r){
			if (r){
				alert('Your name is:' + r);
			}
		});

	});
</script>

</head>
<body>

</body>
</html>