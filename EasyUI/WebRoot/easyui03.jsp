<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的窗口</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->

<script type="text/javascript">
$(function(){
	$('#win2').window({
	    width:600,
	    height:400,
	    modal:true,
	    onBeforeClose:function(){alert("马上关闭窗口！！！");}
	});
});

</script>
</head>
<body>
	<!-- 写法一 -->
	<div id="win" class="easyui-window" title="My Window" style="width:600px;height:400px"
    data-options="iconCls:'icon-save',modal:true">
    	Window Content
	</div>
	
	<!-- 写法二 -->
	<div id="win2"></div>
</body>
</html>