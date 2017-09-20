<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文本框</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
$(function(){
	$('#tb').textbox({    
	    buttonText:'Search',    
	    iconCls:'icon-search', 
	    iconAlign:'left'       
	})
});

</script>

</head>
<body>
	<input class="easyui-textbox" data-options="iconCls:'icon-man'" style="width:300px"> <br>
	<input class="easyui-textbox" data-options="iconCls:'icon-lock','type':'password'" style="width:300px"><br> 
	<input id="tb" type="text" style="width:300px"><br>

</body>
</html>