<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>演示参数封装到Map</h1>
	<form action="login6.action" method="post">
		用户名1： <input type="text" name="users['one'].username"><br/>
		密码1：<input type="password" name="users['one'].password"><br/>
		用户名2： <input type="text" name="users['two'].username"><br/>
		密码2：<input type="password" name="users['two'].password"><br/>
		用户名3： <input type="text" name="users['three'].username"><br/>
		密码3：<input type="password" name="users['three'].password"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>