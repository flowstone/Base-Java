<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="utf-8" http-equiv="charset">
</head>
<body>
<table>
	<tr>
		<td>id</td>
		<td>姓名</td>
		<td>生日</td>
	</tr>
	<c:forEach items="${userList }" var="user">
	<tr>
		<td>${user.id }</td>
		<td>${user.name }</td>
		<td>${user.birthday}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>