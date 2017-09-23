<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录界面</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js">
</script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js">
</script>
</head>
<body>
<div id="win" class="easyui-window" title="My Window" style="width:300px;height:200px"
    data-options="modal:true" align="center">
    <br>
    <form id="denglu" action="${root}/user?methodName=login" method="post" >
    ${msg }
    <div>
		<label for="username">用户名:</label>
		<input class="easyui-textbox" type="text" name="email" />
    </div>
    <br>
    <div>
		<label for="description">&nbsp;&nbsp;&nbsp;密码:</label>
		<input class="easyui-textbox" name="password" data-options="type:'password'">
    </div>
    <br>
     <div>
		<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
		<a href="javascript:;" class="easyui-linkbutton" data-options="size:'large'" style="width:150px;" onclick="$('#denglu').submit();">登陆</a>
    </div>
    
</form>
</div>

</body>
</html>