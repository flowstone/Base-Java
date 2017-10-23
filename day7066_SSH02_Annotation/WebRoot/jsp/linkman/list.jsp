<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>联系人列表</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/default/easyui.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
<script type="text/javascript">

	

	
	$(function(){
		$('#dg')
		.datagrid(
				{
					url : '${pageContext.request.contextPath}/#',
					columns : [ [ {
						field : 'lkm_name',
						title : '联系人名称',
						width:100
					}, {
						field : 'lkm_gender',
						title : '性别',
						width:100
					}, {
						field : 'lkm_phone',
						title : '办公电话',
						width:100
					}, {
						field : 'lkm_mobile',
						title : '手机',
						width:100
					}, {
						field : 'lkm_email',
						title : '邮箱',
						width:100
					}, {
						field : 'lkm_position',
						title : '职位',
						width:100
					} ,{
						field : 'lkm_memo',
						title : '备注',
						width:100
					} ,{
						field : 'customer.cust_name',
						title : '所属客户',
						width:100
					} 
					] ],
					pagination:true,//显示分页工具栏
					pageList:[3,5,10],//每页显示多少条数据集合
					pageSize:3,//默认每页显示3条
					fitColumns:true
				});
	});
	
	//点击修改联系人时要执行的方法
	function editLinkman(){
		
	}
	
	function destroyLinkman(){
		
	}
</script>
</HEAD>
<BODY>
	<!-- 表格上方的工具栏 -->
	<div id="tb" style="padding: 3px">
		<!-- 操作栏：包括编辑、删除 -->
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editLinkman()">编辑联系人</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyLinkman()">删除联系人</a> 
		<br>
		<!-- 搜索栏 -->
		<span>联系人姓名:</span><input id="cust_name" type="text">
		<!-- 搜索按钮 -->
		<a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">筛选</a>
	</div>
	<!-- 显示数据的表格，toolbar属性：指定表格的工具栏 -->
	<table id="dg" toolbar="#tb" width="98%"></table>
</BODY>
</HTML>
