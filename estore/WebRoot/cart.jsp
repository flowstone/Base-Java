<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的购物车</title>
<%@include file="inc/common_head.jsp"%>
</head>
<body>
	<%@include file="inc/header.jsp"%>
	<div class="block table">
		<div class="AreaR">
			<div class="block box">
				<div class="blank"></div>
				<div id="ur_here">
					当前位置: <a href="index.jsp">首页</a><code>&gt;</code>我的购物车
				</div>
			</div>
			<div class="blank"></div>
			<div class="box">
				<div class="box_1">
					<div class="userCenterBox boxCenterList clearfix"
						style="_height:1%;">
						<h5><span>我的购物车</span></h5>
						<table width="100%" align="center" border="0" cellpadding="5"
							cellspacing="1" bgcolor="#dddddd">
							<tr>
								<th bgcolor="#ffffff">商品名称</th>
								<th bgcolor="#ffffff">市场价</th>
								<th bgcolor="#ffffff">本店价</th>
								<th bgcolor="#ffffff">购买数量</th>
								<th bgcolor="#ffffff">小计</th>
								<th bgcolor="#ffffff" width="160px">操作</th>
							</tr>
							<tr>
								<td bgcolor="#ffffff" align="center" style="width:300px;">
									<!-- 商品图片 -->
									<a href="javascript:;" target="_blank">
										<img style="width:80px; height:80px;"
										src="images/201501/thumb_img/136_thumb_G_1420325642852.jpg"
										border="0" title="佳洁士全优7效牙膏+漱口水装" />
									</a><br />
									<!-- 商品名称 -->
									<a href="javascript:;" target="_blank" class="f6">佳洁士全优7效牙膏+漱口水装</a>
								</td>
								<td align="center" bgcolor="#ffffff">26.40元</td>
								<td align="center" bgcolor="#ffffff">22.00元</td>
								<td align="center" bgcolor="#ffffff">
									<input value="1" size="4" class="inputBg" style="text-align:center;" />
								</td>
								<td align="center" bgcolor="#ffffff">22.00元</td>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">删除</a>
								</td>
							</tr>
							<tr>
								<td bgcolor="#ffffff" align="center" style="width:300px;">
									<!-- 商品图片 -->
									<a href="javascript:;" target="_blank">
										<img style="width:80px; height:80px;"
										src="images/201501/thumb_img/139_thumb_G_1420324949779.jpg"
										border="0" title="珀莱雅(PROYA)新柔皙美白补水套装(洗颜霜120ml+玫瑰水120ml+保湿乳100ml)" />
									</a><br />
									<!-- 商品名称 -->
									<a href="javascript:;" target="_blank" class="f6">
										珀莱雅(PROYA)新柔皙美白补水套装(洗颜霜120ml+玫瑰水120ml+保湿乳100ml)
									</a>
								</td>
								<td align="center" bgcolor="#ffffff">193.00元</td>
								<td align="center" bgcolor="#ffffff">110.00元</td>
								<td align="center" bgcolor="#ffffff">
								<!-- 购物数量 -->
									<input value="2" size="4" class="inputBg" style="text-align:center;" />
								</td>
								<td align="center" bgcolor="#ffffff">220.00元</td>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">删除</a>
								</td>
							</tr>
							<tr>
								<td bgcolor="#ffffff" align="center" style="width:300px;">
									<!-- 商品图片 -->
									<a href="javascript:;" target="_blank">
										<img style="width:80px; height:80px;"
										src="images/201501/thumb_img/141_thumb_G_1420324798329.jpg"
										border="0" title="兰蔻清滢柔肤水400ml" />
									</a><br />
									<!-- 商品名称 -->
									<a href="javascript:;" target="_blank" class="f6">
										兰蔻清滢柔肤水400ml
									</a>
								</td>
								<td align="center" bgcolor="#ffffff">420.00元</td>
								<td align="center" bgcolor="#ffffff">110.00元</td>
								<td align="center" bgcolor="#ffffff">
									<input value="3" size="4" class="inputBg" style="text-align:center;" />
								</td>
								<td align="center" bgcolor="#ffffff">330.00元</td>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">删除</a>
								</td>
							</tr>
							<tr>
								<td colspan="6" style="text-align:right;padding-right:10px;font-size:25px;">
									购物金额小计&nbsp;<font color="red">572.00</font>元，
									共为您节省了&nbsp;<font color="red">1100.40</font>元
									<a href="orders_submit.jsp"><input value="去结算" type="button" class="btn" /></a>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="blank"></div>
		<div class="blank5"></div>
	</div>
	<%@include file="inc/footer.jsp"%>
</body>
</html>
