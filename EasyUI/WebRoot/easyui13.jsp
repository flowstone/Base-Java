<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选项卡</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->

</head>
<body>
	<div id="tt" class="easyui-tabs" style="width:500px;height:250px;">
		    <div title="Tab1" style="padding:20px;">
				tab1
		    </div>
		    <div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;">
				tab2
		    </div>
		    <div title="Tab3" data-options="iconCls:'icon-reload',closable:true" style="padding:20px;">
				tab3
		    </div>
	</div>

</body>
</html>