<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.0.min.js"></script>
<script type="text/javascript">
function sendAjax() {
	$.ajax({
		type:"post",
		url:"ajaxAction.action",
		dataType:"json",
		success:function(msg){
			alert(msg);
		}
	});
}
</script>
</head>
<body>
    <!-- 点击按钮，发送ajax请求 -->
    <input type="button" value="点击我" onclick="sendAjax()">
</body>
</html>