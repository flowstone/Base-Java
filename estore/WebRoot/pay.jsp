<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
<%@include file="inc/common_head.jsp"%>
<title>在线支付-选择银行</title>
<style type="text/css">
	.mytable input,.mytable img{vertical-align:middle;}
	.mytable td{text-align:center;}
</style>
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
					在线支付-选择银行
				</div>
			</div>
			<div class="blank"></div>
			<div class="box">
				<div class="box_1">
					<form action="confirm.jsp" method="post">
						<div class="userCenterBox boxCenterList clearfix" style="_height:1%;">
							<h5><span>订单信息</span></h5>
							<!-- 订单编号和订单金额放在隐藏域中 -->
							<input type="hidden" name="orderid" value="123" />
							<input type="hidden" name="money" value="99" />
							<!-- 订单信息 -->
							<table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#dddddd">
								<tr>
									<td width="15%" align="right">订单编号：</td>
									<td align="left">2016052674732</td>
								</tr>
								<tr>
									<td align="right">订单金额：</td>
									<td align="left">99元</td>
								</tr>
							</table>
							<!-- 选择在线支付银行 -->
							<div class="blank"></div>
							<h5><span>选择在线支付银行</span></h5>
							<table class="mytable" width="100%" border="0" cellpadding="5" cellspacing="1"
								bgcolor="#dddddd">
								<tr>
									<td><input type="radio" name="pd_FrpId"
										value="CMBCHINA-NET" /> <img
										src="images/banklogo/CMBCHINA-NET.png" alt="招商银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="ICBC-NET" />
										<img src="images/banklogo/ICBC-NET.png" alt="工商银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="ABC-NET" />
										<img src="images/banklogo/ABC-NET.png" alt="农业银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="CCB-NET" />
										<img src="images/banklogo/CCB-NET.png" alt="建设银行" /></td>
								</tr>
								<tr>
									<td><input type="radio" name="pd_FrpId" value="CMBC-NET" />
										<img src="images/banklogo/CMBC-NET.png" alt="中国民生银行总行" /></td>
									<td><input type="radio" name="pd_FrpId" value="CEB-NET" />
										<img src="images/banklogo/CEB-NET.png" alt="光大银行 " /></td>
									<td><input type="radio" name="pd_FrpId" value="BOCO-NET" />
										<img src="images/banklogo/BOCO-NET.png" alt="交通银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="SDB-NET" />
										<img src="images/banklogo/SDB-NET.png" alt="深圳发展银行" /></td>
								</tr>
								<tr>
									<td><input type="radio" name="pd_FrpId" value="BCCB-NET" />
										<img src="images/banklogo/BCCB-NET.png" alt="北京银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="CIB-NET" />
										<img src="images/banklogo/CIB-NET.png" alt="兴业银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="SPDB-NET" />
										<img src="images/banklogo/SPDB-NET.png" alt="上海浦东发展银行" /></td>
									<td><input type="radio" name="pd_FrpId" value="ECITIC-NET" />
										<img src="images/banklogo/ECITIC-NET.png" alt="中信银行" /></td>
								</tr>
								<tr>
									<td colspan="4" style="text-align:right;padding-right:10px;font-size:25px;">
										<input type="submit" class="btn" value="确定支付" />
									</td>
								</tr>
							</table>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%@include file="inc/footer.jsp"%>
</body>
</html>