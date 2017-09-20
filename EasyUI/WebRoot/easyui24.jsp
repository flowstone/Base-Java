<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Js方式创建数据表格</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
$(function() {
	$('#dg').datagrid({
		url : 'datagrid_data.json',
		columns : [ [ {
			field : 'code',
			title : 'Code',
			width : 100
		}, {
			field : 'name',
			title : 'Name',
			width : 100
		}, {
			field : 'price',
			title : 'Price',
			width : 100,
			align : 'right'
		}, {
			field : 'image',
			title : 'image',
			width : 100,
			align : 'right',
			//value是json数据  row是行 index行的索引
			formatter:function(value,row,index){
				return '<img src="'+value+'" style="width:50px">';
			}
		} ] ]
	});

	});
</script>
</head>
<body>
		<table id="dg"></table>
</body>
</html>