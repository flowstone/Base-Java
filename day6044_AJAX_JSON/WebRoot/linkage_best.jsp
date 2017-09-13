<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>省市县页面</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function loadData(value, ele){
	$.get(
			"${root}/getData?parentid="+value,
			function(data) {
				//alert(data);
				$(data).each(function(){
					//创建option标签
					ele.append("<option value='"+this.codeid+"'>"+this.cityName+"</option>");
				}); 
			},"json");
}
$(function() {
	var $pro = $("#province");
	var $city = $("#city");
	var $area = $("#area");
	
	loadData(0,$pro);
	
	$pro.change(function(){
		$city.prop("length",1);
		$area.prop("length",1);
		loadData(this.value, $city);
	});

	$city.change(function(){
		$area.prop("length",1);
		loadData(this.value,$area);			
	});

	
});
</script>
</head>
<body>
	<center>
		<select id="province" name="province">
			<option value="none">--请选择省--</option>
		</select>
		<select id="city" name="city">
			<option value="none">--请选择市--</option>
		</select>
		<select id="area" name="area">
			<option value="none">--请选择县--</option>
		</select>
	</center>
</body>
</html>