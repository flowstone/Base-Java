<%--
  Created by IntelliJ IDEA.
  User: XueYao
  Date: 2017-12-10
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding=0 cellspacing=0 border="1" width="80%" style="text-align: center;margin:0 auto;">
    <thead>
    <tr>
        <th>ID</th>
        <th>UserName</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
