<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>加载json数据自动创建表格</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->

</head>
<body>
<table class="easyui-datagrid" style="width:400px;height:250px"
    data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true">
    <thead>
		<tr>
			<th data-options="field:'code',width:100">Code</th>
			<th data-options="field:'name',width:100">Name</th>
			<th data-options="field:'price',width:100,align:'right'">Price</th>
		</tr>
    </thead>
</table>

</body>
</html>