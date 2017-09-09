<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${root}/css/left.css" rel="stylesheet" type="text/css"/>
<link rel="StyleSheet" href="${root}/css/dtree.css" type="text/css" />
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	
	<script type="text/javascript" src="${root}/js/dtree.js"></script>
	<script type="text/javascript">
	
		d = new dTree('d');
		//第一个参数，节点编号，第二个参数，上一个节点编号，第三个参数，显示文字，
		//第四个参数，发送请求的路径，第五个参数，设置标题，鼠标移上去有提示
		//第六个参数，获取到的内容显示在哪个Frame中
		//根节点为-1
		d.add('01',-1,'系统菜单树');
		//根节点下的子节点
		d.add('0102','01','分类管理','','','mainFrame');
		d.add('010201','0102','分类管理','${root}/findAllCategory','','mainFrame');
		d.add('0104','01','商品管理');
		d.add('010401','0104','商品管理','${root}/admin/product/list.jsp','','mainFrame');
		document.write(d);
		
	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
