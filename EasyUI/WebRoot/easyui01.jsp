<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的面板</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
</head>
<body>
	<!-- 写法一: -->
	<div id="p" class="easyui-panel" style="width:500px;height:200px;padding:10px;"
        title="My Panel" iconCls="icon-save" collapsible="true">
    The panel content
	</div>
	
	
	<!-- 写法二: -->
	<div id="p" class="easyui-panel" style="width:500px;height:200px;padding:10px;"
        title="My Panel" data-options="iconCls:'icon-save',collapsible:true">
    The panel content
	</div>
	
</body>
</html>