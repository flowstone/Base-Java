<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>选购中心</title>
<%@include file="inc/common_head.jsp"%>
</head>
<body>
	<%@include file="inc/header.jsp"%>
	<div class="block box">
		<div class="blank"></div>
		<div id="ur_here">
			当前位置: <a href="index.jsp">首页</a>
			<code>&gt;</code>
			商品列表
		</div>
	</div>
	<div class="blank"></div>
	<div class="block clearfix">
		<div class="AreaR">
			<div class="box">
				<div class="box_1">
					<h3>
						<span>商品列表</span>
					</h3>
					<!-- 商品列表开始 -->
					<div class="clearfix goodsBox" style="border:none; ">
						<!-- 第1个商品 -->
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="goods_detail.jsp">
								<img src="images/201501/thumb_img/141_thumb_G_1420324798329.jpg"
								class="goodsimg" />
							</a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="goods_detail.jsp" title="">兰蔻清滢柔肤水400ml</a>
							</p>
							市场价：<font class="market">120元</font><br /> 本店价：<font class="f1">99元
							</font>
						</div>
						
						<!-- 第2个商品 -->
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="goods_detail.jsp">
								<img src="images/201501/thumb_img/140_thumb_G_1420324897667.jpg"
								class="goodsimg" /></a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="goods_detail.jsp" title="">完美芦荟胶一对 40g*2</a>
							</p>
							市场价：<font class="market">155元</font><br /> 本店价：<font class="f1">109元
							</font>
						</div>
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="javascript:;"><img
								src="images/201501/thumb_img/139_thumb_G_1420324949779.jpg"
								class="goodsimg" /></a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="javascript:;" title="">珀莱雅(PROYA)新柔皙美白补水套装(洗颜霜120ml+玫...</a>
							</p>
							市场价：<font class="market">390元</font><br /> 本店价：<font class="f1">260元
							</font>
						</div>
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="javascript:;"><img
								src="images/201501/thumb_img/138_thumb_G_1420325127794.jpg"
								class="goodsimg" /></a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="javascript:;" title="">私密沐浴露+秘隐曼妙湿巾</a>
							</p>
							市场价：<font class="market">199元</font><br /> 本店价：<font class="f1">155元
							</font>
						</div>
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="javascript:;"><img
								src="images/201501/thumb_img/137_thumb_G_1420325495120.jpg"
								class="goodsimg" /></a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="javascript:;" title="">海绵宝宝多元海藻呵护洗沐500ml</a>
							</p>
							市场价：<font class="market">298元</font><br /> 本店价：<font class="f1">199元
							</font>
						</div>
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="javascript:;"><img
								src="images/201501/thumb_img/136_thumb_G_1420325642852.jpg"
								class="goodsimg" /></a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="javascript:;" title="">佳洁士全优7效牙膏+漱口水装</a>
							</p>
							市场价：<font class="market">69元</font><br /> 本店价：<font class="f1">55元
							</font>
						</div>
						<div class="goodsItem" style="padding: 10px 4px 15px 1px;">
							<a href="javascript:;"><img class="goodsimg"
								src="images/201501/thumb_img/134_thumb_G_1421183937155.jpg" />
							</a><br />
							<p style=" height:20px; overflow:hidden;">
								<a href="javascript:;" title="">飘柔（Rejoice）倍瑞丝护理专研顺滑优惠装（洗发露450...</a>
							</p>
							市场价：<font class="market">108元</font><br /> 本店价：<font class="f1">88元
							</font>
						</div>
					</div>
					<!-- 商品列表结束 -->
				</div>
			</div>
		</div>
	</div>
	<%@include file="inc/footer.jsp"%>
	<script type="text/javascript">
		window.onload = function() {
			fixpng();
		}
	</script>
</body>
</html>