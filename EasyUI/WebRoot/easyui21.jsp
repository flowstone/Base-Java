<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 <c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Combbox下拉列表</title>
<!-- 导入资源 start -->
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${root }/easyui/themes/icon.css">
<script type="text/javascript" src="${root }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root }/easyui/jquery.easyui.min.js"></script>
<!-- 导入资源 end -->
<script type="text/javascript">
$(function(){
	$('#cc').combobox({    
	    url:'combobox.json',    
	    valueField:'cid', //option中value   
	    textField:'cname' //option中文本
	});
});

</script>

</head>
<body>
<select id="xx" class="easyui-combobox" name="dept" style="width:200px;">   
    <option value="aa">aitem1</option>   
    <option>bitem2</option>   
    <option>bitem3</option>   
    <option>ditem4</option>   
    <option>eitem5</option>   
</select>  
<hr>
<input id="cc" name="dept" value="aa">  

</body>
</html>