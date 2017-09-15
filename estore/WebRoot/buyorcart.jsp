<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">

<head>
    <%@include file="inc/common_head.jsp"%>
</head>
<body>
<%@include file="inc/header.jsp" %>
<div style="width:350px;margin:0 aotu;text-align:right;">
	<div class="result-tip">
		<i class="icon-success"></i> 已成功加入购物车
	</div>
	
	<div>
		<input onclick="location.href='${root}/goods.jsp';"
		type="button" value="继续购物" class="btn2" />&nbsp;&nbsp;&nbsp;
		
		<input onclick="location.href='${root}/cart.jsp';" 
		type="button" value="去购物车结算" class="btn" />
	</div>
</div>
<%@include file="inc/footer.jsp" %>
</body>
</html>