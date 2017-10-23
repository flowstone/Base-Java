<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>客户列表</TITLE>
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

	$(function() {
		$('#dg')
				.datagrid(
						{
							url : '${pageContext.request.contextPath}/customer/CustomerServlet?method=listCustomer',
							columns : [ [ {
								field : 'custName',
								title : '客户名称',
								width:100
							}, {
								field : 'custLevel',
								title : '客户级别',
								width:100
							}, {
								field : 'custSource',
								title : '客户来源',
								width:100
							}, {
								field : 'custIndustry',
								title : '所属行业',
								width:100
							}, {
								field : 'custAddress',
								title : '联系地址',
								width:100
							}, {
								field : 'custPhone',
								title : '联系电话',
								width:100
							} ] ],
							fitColumns:true
						});

	});
	
	//点击搜索按钮执行的函数
	function doSearch() {
		$('#dg').datagrid('load', {
			'custName' : $('#cust_name').val(),
			'custLevel' : $('#cust_level').val(),
			'custSource' : $('#cust_source').val(),
			'custIndustry' : $('#cust_industry').val()
		});
	}
	
	
	//编辑客户函数
	function editCustomer(){
		location.href="#";
	}
	
	//删除客户函数
	function destroyCustomer(){
		location.href="#";
	}
</script>
</HEAD>
<BODY>
	<!-- 表格上方的工具栏 -->
	<div id="tb" style="padding: 3px">
		<!-- 操作栏：包括编辑、删除 -->
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editCustomer()">编辑客户</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyCustomer()">删除客户</a> 
		<br>
		<!-- 搜索栏 -->
		<span>客户姓名:</span><input id="cust_name" type="text">
		<span>客户级别:</span>
		<select id="cust_level">
			<option value="">---请选择---</option>
		</select>
		<span>客户来源:</span>
		<select id="cust_source">
			<option value="">---请选择---</option>
		</select>
		<span>所属行业:</span>
		<select id="cust_industry">
			<option value="">---请选择---</option>
		</select>
		<!-- 搜索按钮 -->
		<a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">筛选</a>
	</div>
	<!-- 显示数据的表格，toolbar属性：指定表格的工具栏 -->
	<table id="dg" toolbar="#tb" width="98%"></table>
</BODY>
</HTML>
