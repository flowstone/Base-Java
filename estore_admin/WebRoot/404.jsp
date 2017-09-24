<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>404</title>
<!-- Load CSS for the page -->
<link rel="stylesheet" href="404.css" />
<script src="js/404.js"></script>
</head>

<body data-hue="0">
	<!-- Background -->
	<div id="scene"></div>
	<!-- Foreground  -->
	<div class="main">
		<h1>404</h1>
		<p>That page couldn't be found.</p>
		<!--     <a href="#">Home</a> -->
	</div>

	<!-- Magic -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/chroma-js/1.1.1/chroma.min.js"></script>
	<script type="text/javascript" src="js/404.js"></script>
</body>

</html>
