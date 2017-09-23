<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css"
	href="${root}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${root}/easyui/themes/icon.css">
<script type="text/javascript" src="${root}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${root}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function() {
	//给菜单树添加点击事件
	$("#tt").tree({
		onClick: function(node){
				//node.text ：树的节点文本
				//使用js的方式，创建选项卡
				
				//问题：不能无限制的创建tabs
				//解决：如果当前选项卡不存在，创建，如果存在，选中
				var flag = $('#center').tabs("exists",node.text);
				console.log(flag);
				if(flag){
					
					//存在，选中
					$('#center').tabs("select",node.text);
					return;
				}
				
				if (node.text=== "商品查看") {
					//不存在，添加
					$('#center').tabs('add',{
					    title:node.text,
					    content:'<table id="'+node.text+'"></table>',
					    closable:true
					});
					
					//添加数据网格
					$("#"+node.text).datagrid({
						pagination: true, //分页
						rownumbers: true, //显示行号
						fit: true, //最大化
						url: '${root}/admin?methodName=pageGood',
						//修改列的field,和json中的key一致
						columns:[[
						          {field:'id',title:'id',width:100},
						          {field:'name',title:'商品名称',width:100},
						          {field:'marketprice',title:'市场价格',width:100},
						          {field:'estoreprice',title:'商城价格',width:100},
						          {field:'category',title:'分类',width:100},
						          {field:'num',title:'库存',width:100},
						          {field:'imgurl',title:'封面',width:100,formatter:function(value,row,indxe){
						        	  return "<img src='${root}"+value+"' style='width:50px;'>";
						          }},
						          {field:'description',title:'商品描述',width:200},
						          
						          ]]
					}); 
				} else if(node.text === '商品上传') {
					$("#center").tabs("add", {
						title: node.text,
						closable: true,
						href: 'addGood.jsp'
					});
				} else if(node.text === '热门统计'){
					//不存在，添加
					$('#center').tabs('add',{
					    title:node.text,
					    content:'<table id="hot"></table>',
					    closable:true
					});
					
					//添加数据网格
					$("#hot").datagrid({
						
						fit: true, //最大化
						url: '${root}/admin?methodName=hot',
						//修改列的field,和json中的key一致
						columns:[[
						          {field:'gid',title:'gid',width:100},
						          {field:'name',title:'商品名称',width:100},
						          {field:'hot',title:'热门商品',width:100}
						         
						          ]]
					}); 
				} else {
					
				}
					
			}
			
		});
	
});

</script>
</head>
<body class="easyui-layout">
    <div data-options="region:'north',title:'EStore商城后台管理系统',split:false" style="height:100px;"></div>
    <div data-options="region:'south',title:'本部信息',split:false" style="height:100px;">
        <a href="${pageContext.request.contextPath }">返回首页</a>
    	<a href="http://www.xueyao.me">联系我们</a>
    </div>
    <div data-options="region:'west',title:'商城管理菜单',split:false" style="width:200px;">
		<ul id="tt" class="easyui-tree">
			<li>
				<span>商品管理</span>
				<ul>
					<li><span>商品查看</span></li>
					<li><span>商品上传</span></li>
					<li><span>热门统计</span></li>
				</ul>
			</li>
			
		</ul>

	</div>
    <div data-options="region:'center',title:'管理界面'" style="padding:5px;background:#eee;">
 		<div id="center" class="easyui-tabs" style="width:500px;height:250px;" data-options="fit:true">
 		</div>
    </div>
</body>
</html>
