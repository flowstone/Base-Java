<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="ff"  method="post" action="${root }/admin?methodName=addGood" enctype="multipart/form-data">
			<div style="margin:20px">
				<input class="easyui-textbox" name="name" style="width:30%" data-options="label:'商品名称:',required:true,missingMessage:'商品名称不能为空'">
			</div>
			<div style="margin:20px">
				<input class="easyui-numberbox" name="marketprice" style="width:30%" data-options="label:'市场价:',min:0,precision:2">
			</div>
			<div style="margin:20px">
				<input class="easyui-numberbox" name="estoreprice" style="width:30%" data-options="label:'优惠价:',min:0,precision:2">
			</div>

			<div style="margin:20px">
				<select class="easyui-combobox" name="category" label="商品分类" style="width:200px">
					<option>衣服</option>
					<option>家具</option>
					<option>电子</option>
				</select>
			</div>
			
			<div style="margin:20px">
				<input class="easyui-numberbox" name="num" style="width:30%" data-options="label:'库存数量:',min:0">
			</div>
			<div style="margin:20px">
				<input class="easyui-filebox" name="imgurl" style="width:30%" data-options="label:'图片:',prompt:'选择图片'">
			</div>
			<div style="margin:20px">
				<input class="easyui-textbox" name="description" style="width:30%" data-options="label:'商品描述:',multiline:true">
			</div>

			<div style="margin:20px 180px">
				<input type="submit"  class="easyui-linkbutton" " style="width:80px" value="添加商品"></a>
			</div>
			
		</form>

</body>
</html>