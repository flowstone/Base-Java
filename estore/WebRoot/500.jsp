<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>欢迎您！十分抱歉，服务器繁忙 ！</title>
<meta http-equiv=content-type content="text/html; charset=utf-8">
<meta http-equiv="refresh" content="10;url=http://127.0.0.1:8080/${root }">
<style type=text/css>
input {font-size: 12px}
td {font-size: 12px}
.p2 {font-size: 12px}
.p6 {font-size: 12px;color: #1b6ad8}
a {color: #1b6ad8;text-decoration: none}
a:hover {color: red}
</style>

<meta content="microsoft frontpage 5.0" name=generator>
<script type="text/javascript">
	var time = 9;
	window.onload = function() {
		window.setInterval("showTime()", 1000);
	};
	function showTime() {
		document.getElementById("s").innerHTML = time;
		time--;
	}
</script>
</head>
<body oncontextmenu="return false" onselectstart="return false">
	<p align=center></p>
	<p align=center></p>
	<table cellspacing=0 cellpadding=0 width=540 align=center border=0>
		<tbody>
			<tr>
				<td valign=top height=270>
					<div align=center>
						<br>
						<img height=211 src="images/error/error.gif" width=329><br>
						<br>
						<table cellspacing=0 cellpadding=0 width="80%" border=0>
							<TBODY>
        <TR>
          <TD><FONT class=p2>&nbsp;&nbsp;&nbsp; <FONT color=#ff0000><IMG 
            height=13 src="images/error/emessage.gif" 
            width=12>&nbsp;无法访问！<span id="s" style="color: orange;font-size: 28px;">10</span>
            			秒后跳到<a href="${pageContext.request.contextPath }/index.jsp">首页</a></FONT></FONT></TD></TR>
        <TR>
          <TD height=8></TD>
        <TR>
          <TD>
            <P><FONT color=#000000><BR>　　服务器忙啦！！</FONT>! 
      　</P></TD></TR></TBODY>
						</table>
					</div>
				</td>
			</tr>
			<tr>
				<td height=5></td>
			<tr>
				<td align=middle>
					<center>
						<table cellspacing=0 cellpadding=0 width=480 border=0>
							<tbody>
								<tr>
									<td width=6><img height=26 src="images/error/left.gif"
										width=7></td>
									<td background="images/error/bg.gif">
										<div align=center>
											<font class=p6> <a
												href="${pageContext.request.contextPath}/index.jsp">返回首页</a>
												| <a href="${pageContext.request.contextPath }/login.jsp">返回登录页</a>
											</font>
										</div>
									</td>
									<td width=7><img src="images/error/right.gif"></td>
								</tr>
							</tbody>
						</table>
					</center>
				</td>
			</tr>
		</tbody>
	</table>
	<p align=center></p>
	<p align=center></p>
</body>
</html>