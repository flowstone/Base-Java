<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<div id="Top">
	<div class="tops"></div>
	<div class=" block header_bg" style="margin-bottom:0px;">
		<div class="top_nav_header">
			<div class="top_nav">
				<script type="text/javascript">
					//初始化主菜单
					function sw_nav(obj, tag) {
						var DisSub = document.getElementById("DisSub_" + obj);
						var HandleLI = document.getElementById("HandleLI_"
								+ obj);
						if (tag == 1) {
							DisSub.style.display = "block";
						} else {
							DisSub.style.display = "none";
						}
					}
				</script>
				<div class="block">
					<div class="f_l left_login">
						<script type="text/javascript" src="js/utils.js"></script>
						<font id="ECS_MEMBERZONE"> 欢迎光临本店，
						<c:if test="${empty loginUser }">
							<a href="login.jsp">登录</a>
							<a href="register.jsp">注册</a>
						</c:if>
						<c:if test="${not empty loginUser}">
							${loginUser.nickname }
							<a href="${root }/loginOut.jsp">注销</a>
						</c:if>
						</font>
					</div>
					<ul class="top_bav_l">
						<li class="top_sc">&nbsp;&nbsp;<a href="javascript:void(0);"
							onclick="AddFavorite('我的网站',location.href)">收藏本站</a></li>
						<li>&nbsp;&nbsp;&nbsp;关注我们：</li>
						<li style="border:none" class="menuPopup"
							onMouseOver="sw_nav(1,1);" onMouseOut="sw_nav(1,0);"><a
							id="HandleLI_1" href="javascript:;" title="微博" class="attention"></a>
							<div id=DisSub_1 class="top_nav_box top_weibo">
								<a href="http://weibo.com/itcast?is_hot=1" target="_blank"
									title="新浪微博" class="top_weibo"></a> <a
									href="http://t.qq.com/myjayen" target="_blank" title="QQ微博"
									class="top_qq"></a>
							</div></li>
						<li class="menuPopup" onMouseOver="sw_nav(2,1);"
							onMouseOut="sw_nav(2,0);"><a id="HandleLI_2"
							href="javascript:;" title="微信" class="top_weixin"></a>
							<div id="DisSub_2" class="weixinBox" style="display: none;">
								<table width="100%" cellpadding=0 cellspacing=0 align="center">
									<tr>
										<td><img src="images/wx_cz.jpg"
											style="width:90px; height:90px;background:#0000CC" width="90"
											height="90"></td>
										<td><img src="images/wx_hm.jpg"
											style="width:90px; height:90px;background:#0000CC" width="90"
											height="90"></td>
									</tr>
									<tr>
										<td>官方微信</td>
										<td>XX官方微信</td>
									</tr>
								</table>
							</div></li>
					</ul>
					<div class="header_r">
						<a href="orders.jsp">我的订单</a>
						<a href="${root }/good?methodName=findAll">商品列表</a>
					</div>
				</div>
			</div>
		</div>
		<div class="clear_f"></div>
		<div class="header_top logo_wrap clearfix">
			<a class="logo_new" href="index.jsp"><img
				src="themes/ecmoban_jumei/images/logo.gif" /></a>
			<div class="ser_n">
				<form id="searchForm" class="searchBox clearfix" name="searchForm"
					onsubmit="return false;" method="get" action="">
					<span class="ipt1"><input name="keywords"
						placeholder="请输入您想购买的商品" type="text" id="keyword" value=""
						class="searchKey" /></span> <span class="ipt2"><input
						type="submit" name="imageField" class="fm_hd_btm_shbx_bttn"
						value="搜  索"></span>
				</form>
				<div class="clear_f"></div>
				<ul class="searchType none_f"></ul>
			</div>
			<ul class="cart_info">
				<li id="ECS_CARTINFO">
					<div class="top_cart">
						<img src="themes/ecmoban_jumei/images/cart.gif" /> 
						<a href="cart.jsp" class="shopborder">去购物车结算</a>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>
<div style="clear:both"></div>
<div class="menu_box clearfix">
	<%
		String uri = request.getRequestURI();
		boolean isIndex = uri.equals(request.getContextPath() + "/")
				|| uri.indexOf("index.jsp") > -1;
		String width = isIndex ? "1200px;" : "840px;";
		String className = isIndex ? "cur" : "";
	%>
	<div class="block" style="width:<%=width%>">
		<div class="menu">
			<a id="menu_index" href="index.jsp" class="<%=className%>">首页</a> <a
				href="javascript:;">设计师</a> <a href="javascript:;">化妆品</a> <a
				href="javascript:;">鞋包配饰</a> <a href="javascript:;">居家母婴</a> <a
				href="javascript:;">服饰内衣</a> <a href="javascript:;">团购商品</a>
		</div>
	</div>
</div>
<link href="themes/ecmoban_qq/images/qq.css" rel="stylesheet"
	type="text/css" />
