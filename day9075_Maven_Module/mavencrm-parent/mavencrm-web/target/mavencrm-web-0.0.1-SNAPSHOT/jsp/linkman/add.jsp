<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加联系人</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
		
	<s:form action="linkMan_add" namespace="/" method="post" id="form1" name="form1">
	
	
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						 height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：联系人管理 &gt; 添加联系人</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<tr>
								<td>所属客户：</td>
								<td colspan="3">
									<%-- list接收是一个集合
									一旦你给不是直接list或map，{'xx','xx'},#{'xx':'xx'}
									给的集合，自动遍历
									现在list：{customer1,customer2}
									必须使用两个属性，告诉列表，哪个是value，哪个是key
									 --%>
									<s:select list="customerList" name="customer.cust_id" listKey="cust_id" listValue="cust_name"/>
								</td>
							</tr>
							<TR>
								<td>联系人名称：</td>
								<td>
									<s:textfield name="lkm_name" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>
								</td>
								<td>联系人性别：</td>
								<td>
									<s:radio list="#{'1':'男','0':'女'}" name="lkm_gender"/>
								</td>
							</TR>
							<TR>
								<td>联系人办公电话 ：</td>
								<td>
								<s:textfield name="lkm_phone" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>						
								</td>
								<td>联系人手机 ：</td>
								<td>
								<s:textfield name="lkm_mobile" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>	
								</td>
							</TR>
							<TR>
								<td>联系人邮箱 ：</td>
								<td>
								<s:textfield name="lkm_email" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>						
								</td>
								<td>联系人：</td>
								<td>
								<s:textfield name="lkm_qq" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>	
								</td>
							</TR>
							<TR>
								<td>联系人职位 ：</td>
								<td>
								<s:textfield name="lkm_position" cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50"/>						
								</td>
								<td>联系人备注</td>
								<td>
									<s:textarea name="lkm_memo" rows="3" cols="20"/>
								</td>
							</TR>
							<TR>
								<td>爱好 ：</td>
								<td colspan="3">
									<s:checkboxlist list="{'睡觉','打豆豆','大宝剑'}" name="lkm_hobby"/>		
								</td>
							</TR>
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value="保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</s:form>
</BODY>
</HTML>
