<%@page import="java.util.List"%>
<%@page import="org.xueyao.produce.domain.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%" align="center">
		<tr>
			<th>商品名称</th>
			<th>市场价格</th>
			<th>商场价格</th>
			<th>商品图片</th>
			<th>上架日期</th>
			<th>是否热门</th>
			<th>商品描述</th>
		</tr>
		<%
			//获取到request域对象中的集合
			List<Product> list = (List<Product>)request.getAttribute("allProdcut");
			if (null == list || 0 == list.size()) {
				out.println("<tr><td colspan='7'>暂无数据</td></tr>");
			} else  {
				//遍历集合
				for (Product p : list) {
					%>
					<tr>
						<td><%=p.getPname() %></td>
						<td><%=p.getMarket_price() %></td>
						<td><%=p.getShop_price() %></td>
						<td><img src="day5038_JSP/<%=p.getPimage()%>" width="50px;"/></td>
						<td><%=p.getpDate() %></td>
						<td><%=p.getIs_hot() %></td>
						<td><%=p.getPdesc() %></td>
					</tr>
					<%
				}
			}
		%>
	</table>
	
</body>
</html>