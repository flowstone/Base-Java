<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>下拉菜单</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
</head>
<body>
	<input class="easyui-combobox" name="language"
        data-options="
            url:'combobox_data1.json',
            valueField:'id',
            textField:'text',
            panelHeight:'auto',
            onSelect:function(record){
                alert(record.text)
            }">
	

</body>
</html>