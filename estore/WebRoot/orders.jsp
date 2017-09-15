<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的订单</title>
<%@include file="inc/common_head.jsp"%>
</head>
<body>
	<%@include file="inc/header.jsp"%>
	<div class="block clearfix">
		<div class="AreaR">
			<div class="block box">
				<div class="blank"></div>
				<div id="ur_here">
					当前位置: <a href="index.jsp">首页</a><code>&gt;</code>我的订单
				</div>
			</div>
			<div class="blank"></div>
			<div class="box">
				<div class="box_1">
					<div class="userCenterBox boxCenterList clearfix" style="_height:1%;">
						<h5><span>我的订单</span></h5>
						<table width="100%" border="0" cellpadding="5" cellspacing="1"
							bgcolor="#dddddd">
							<tr align="center">
								<td bgcolor="#ffffff">订单号</td>
								<td bgcolor="#ffffff" width="200px">下单时间</td>
								<td bgcolor="#ffffff">订单总金额</td>
								<td bgcolor="#ffffff">订单状态</td>
								<td bgcolor="#ffffff" width="200px">操作</td>
							</tr>
							<tr>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">2016052674732</a>
								</td>
								<td align="center" bgcolor="#ffffff">2016-05-26 16:36:11</td>
								<td align="right" bgcolor="#ffffff">582.00元</td>
								<td align="center" bgcolor="#ffffff">
									<font color="red">未支付</font>
								</td>
								<td align="center" bgcolor="#ffffff">
									<a href="orders_detail.jsp">在线支付</a>&nbsp;
									<a href="javascript:;">取消订单</a>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">2016052674733</a>
								</td>
								<td align="center" bgcolor="#ffffff">2016-05-26 16:36:11</td>
								<td align="right" bgcolor="#ffffff">999.00元</td>
								<td align="center" bgcolor="#ffffff">
									<font color="green">已支付</font>
								</td>
								<td align="center" bgcolor="#ffffff">
									<a href="orders_detail.jsp">查看详情</a>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="#ffffff">
									<a href="javascript:;" class="f6">2016052627261</a>
								</td>
								<td align="center" bgcolor="#ffffff">2016-05-26 15:02:32</td>
								<td align="right" bgcolor="#ffffff">560.00元</td>
								<td align="center" bgcolor="#ffffff">
									<font color="gray">已过期</font>
								</td>
								<td align="center" bgcolor="#ffffff">
									<a href="orders_detail.jsp">查看详情</a>
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