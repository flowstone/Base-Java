<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>订单详情</title>
<%@include file="inc/common_head.jsp"%>
</head>
<body>
	<%@include file="inc/header.jsp"%>
	<div class="block clearfix">
		<div class="AreaR">
			<div class="block box">
				<div class="blank"></div>
				<div id="ur_here">
					当前位置: <a href="index.jsp">首页</a>
					<code>&gt;</code>
					用户中心
				</div>
			</div>
			<div class="blank"></div>
			<div class="box">
				<div class="box_1">
					<div class="userCenterBox boxCenterList clearfix"
						style="_height:1%;">
						<h5>
							<span>订单状态</span>
						</h5>
						<table width="100%" border="0" cellpadding="5" cellspacing="1"
							bgcolor="#dddddd">
							<tr>
								<td width="15%" align="right">订单编号：</td>
								<td align="left">2016052674732</td>
							</tr>
							<tr>
								<td width="15%" align="right">订单状态：</td>
								<td align="left">
									<font color="red">未支付</font>？
									<font color="green">已支付</font>？
									<font color="gray">已过期</font>？
								</td>
							</tr>
							<tr>
								<td width="15%" align="right">下单时间：</td>
								<td align="left">2016-05-26 16:36:11</td>
							</tr>
							<tr>
								<td align="right">收货人信息：</td>
								<td align="left">上海 上海市 闵行区 浦江镇街道 浦江丽都 6-502 小丽15852086521</td>
							</tr>
						</table>
						<div class="blank"></div>
						<h5><span>商品列表</span></h5>
						<table width="100%" border="0" cellpadding="5" cellspacing="1"
							bgcolor="#dddddd">
							<tr>
								<th width="22%" align="center">商品名称</th>
								<th width="29%" align="center">市场价格</th>
								<th width="26%" align="center">商品价格</th>
								<th width="10%" align="center">购买数量</th>
								<th width="20%" align="center">小计</th>
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
								<td><a href="javascript:;"
									target="_blank" class="f6">珀莱雅(PROYA)新柔皙美白补水套装(洗颜霜120ml+玫瑰水120ml+保湿乳100ml)</a>
								</td>
								<td>193.00元</td>
								<td>110.00元</td>
								<td align="center">2</td>
								<td>220.00元</td>
							</tr>
							<tr>
								<td><a href="javascript:;"
									target="_blank" class="f6">兰蔻清滢柔肤水400ml</a></td>
								<td>420.00元</td>
								<td>110.00元</td>
								<td align="center">3</td>
								<td>330.00元</td>
							</tr>
							<tr>
								<td colspan="5" style="text-align:right;padding-right:10px;font-size:25px;">
									商品总价&nbsp;<font color="red">&yen;572.00</font>元
									<a href="pay.jsp"><input value="确认支付" type="button" class="btn" /></a>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="inc/footer.jsp"%>
</body>
</html>