<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head><%@include file="inc/common_head.jsp"%></head>
<body>
<%@include file="inc/header.jsp"%>
<div class="block clearfix"><div class="AreaR"><div class="block box"><div class="blank"></div>
<div id="ur_here">当前位置: <a href=".">首页</a><code>&gt;</code>用户支付确认</div></div>
<div class="blank"></div><div class="box"><div class="box_1">
<div class="userCenterBox boxCenterList clearfix" style="_height:1%;">
<h5><span>订单确认</span></h5>
<!-- 用户支付最终确认页面 -->
<form action="https://www.yeepay.com/app-merchant-proxy/node" method="post">
<table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#dddddd">
	<tr>
		<td align="right">订单编号：</td>
		<td>C4CA4238A0B923820DCC509A6F75849B</td>
	</tr>
	<tr>
		<td align="right">订单金额：</td>
		<td>
			<font style="color:red;font-weight:bold;">&yen;1999元</font>
		</td>
	</tr>
	<tr>
		<td align="right" colspan="2">
			<input type="submit" class="btn" value="确认支付" />
		</td>
	</tr>
</table>
<!-- 通过form的隐藏域，提交servlet中封装的参数给易宝 -->
<input type="hidden" name="pd_FrpId" value="${pd_FrpId }" />
<input type="hidden" name="p0_Cmd" value="${p0_Cmd }" />
<input type="hidden" name="p1_MerId" value="${p1_MerId }" />
<input type="hidden" name="p2_Order" value="${p2_Order }" />
<input type="hidden" name="p3_Amt" value="${p3_Amt }" />
<input type="hidden" name="p4_Cur" value="${p4_Cur }" />
<input type="hidden" name="p5_Pid" value="${p5_Pid }" />
<input type="hidden" name="p6_Pcat" value="${p6_Pcat }" />
<input type="hidden" name="p7_Pdesc" value="${p7_Pdesc }" />
<input type="hidden" name="p8_Url" value="${p8_Url }" />
<input type="hidden" name="p9_SAF" value="${p9_SAF }" />
<input type="hidden" name="pa_MP" value="${pa_MP }" />
<input type="hidden" name="pr_NeedResponse" value="${pr_NeedResponse }" />
<input type="hidden" name="hmac" value="${hmac }" />
</form></div></div></div></div></div>
<%@include file="inc/footer.jsp"%>
</body>
</html>