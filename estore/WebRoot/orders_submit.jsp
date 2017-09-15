<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="Generator" content="ECSHOP v2.7.3" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Keywords" content="" />
<meta name="Description" content="" />
<title>提交订单</title>
<%@include file="inc/common_head.jsp"%>
</head>
<body>
	<%@include file="inc/header.jsp"%>
	<div class="block clearfix"><div class="AreaR">
	<div class="block box"><div class="blank"></div>
		<div id="ur_here">
			当前位置: <a href="index.jsp">首页</a><code>&gt;</code>购物流程
		</div>
	</div><div class="blank"></div><div class="box"><div class="box_1">
	<div class="userCenterBox boxCenterList clearfix" style="_height:1%;">
	<form action="${root }/orders.jsp" method="post">
		<!---------收货人信息开始---------->
		<h5><span>收货人信息</span></h5>
		<table width="100%" align="center" border="0" cellpadding="5"
			cellspacing="1" bgcolor="#dddddd">
			<tr>
				<td bgcolor="#ffffff" align="right" width="120px">区域信息：</td>
				<td bgcolor="#ffffff">
					<!-- 省 -->
					<select id="province">
						<option value="">-- 请选择省 --</option>
					</select>&nbsp;&nbsp;&nbsp;
					<!-- 市 -->
					<select id="city">
						<option value="">-- 请选择市 --</option>
					</select>&nbsp;&nbsp;&nbsp;
					<!-- 县(区) -->
					<select id="district">
						<option value="">-- 请选择县(区) --</option>
					</select>
				</td>
			</tr>
			<tr>
				<td bgcolor="#ffffff" align="right">详细地址：</td>
				<td bgcolor="#ffffff">
					<input style="width:347px;" name="detailAddress"/>
				</td>
			</tr>
			<tr>
				<td bgcolor="#ffffff" align="right">邮政编码：</td>
				<td bgcolor="#ffffff"><input name="zipcode"/></td>
			</tr>
			<tr>
				<td bgcolor="#ffffff" align="right">收货人姓名：</td>
				<td bgcolor="#ffffff"><input name="name"/></td>
			</tr>
			<tr>
				<td bgcolor="#ffffff" align="right">联系电话：</td>
				<td bgcolor="#ffffff"><input name="telephone"/></td>
			</tr>
		</table>
		<!---------收货人信息结束---------->
		
		<!----------商品列表开始----------->
		<div class="blank"></div>
		<h5><span>商品列表</span></h5>
		<table width="100%" border="0" cellpadding="5" cellspacing="1"
			bgcolor="#dddddd">
			<tr>
				<th width="30%" align="center">商品名称</th>
				<th width="22%" align="center">市场价格</th>
				<th width="22%" align="center">商品价格</th>
				<th width="15%" align="center">购买数量</th>
				<th align="center">小计</th>
			</tr>
			<tr>
				<td>
					<a href="javascript:;" class="f6">佳洁士全优7效牙膏+漱口水装</a>
				</td>
				<td>26.40元</td>
				<td>22.00元</td>
				<td align="center">1</td>
				<td>22.00元</td>
			</tr>
			<tr>
				<td><a href="goods.php?id=139"
					target="_blank" class="f6">珀莱雅(PROYA)新柔皙美白补水套装(洗颜霜120ml+玫瑰水120ml+保湿乳100ml)</a>
				</td>
				<td>193.00元</td>
				<td>110.00元</td>
				<td align="center">2</td>
				<td>220.00元</td>
			</tr>
			<tr>
				<td><a href="goods.php?id=141"
					target="_blank" class="f6">兰蔻清滢柔肤水400ml</a></td>
				<td>420.00元</td>
				<td>110.00元</td>
				<td align="center">3</td>
				<td>330.00元</td>
			</tr>
			<tr>
				<td colspan="5" style="text-align:right;padding-right:10px;font-size:25px;">
					商品总价&nbsp;<font color="red">&yen;572.00</font>元
					<input type="submit" value="提交订单" class="btn" />
				</td>
			</tr>
		</table>
		<!----------商品列表结束----------->
	</form>
	</div></div></div></div></div>
	<%@include file="inc/footer.jsp"%>
</body>
</html>