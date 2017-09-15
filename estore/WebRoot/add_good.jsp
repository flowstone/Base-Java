<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>添加商品</title>
</head>

<body>
	<!-- 
		表单中有文件上传组件
		需要修改表单的enctype属性，值为“multpart/form-data”
	 -->
	<form action="${root }/addGoodServlet" enctype="multipart/form-data" method="post">
		商品名称：<input name="name" /><br/>
		市场价：<input name="marketprice" /><br/>
		优惠价：<input name="estoreprice" /><br/>
		商品分类：<select name="category">
			<option value="">--请选择--</option>
			<option>衣服</option>
			<option>家具</option>
			<option>电子</option>
		</select><br/>
		库存数量：<input type="text" name="num" /><br/>
		图片：<input type="file" name="fileName" /><br/>
		商品描述：<textarea name="description"></textarea><br/>
		<input type="submit" value="提 交" />
	</form>
</body>
</html>
