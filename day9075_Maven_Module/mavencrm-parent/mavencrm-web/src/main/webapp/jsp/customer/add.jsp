<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
<!-- 引入jquery库 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	//onload
	$(function(){
		//目标：初始化页面的几个下拉
		//$.post(请求地址，请求参数，回调函数，返回类型);
		//客户级别
		$.post("${pageContext.request.contextPath}/baseDict_listByTypeCode.action",{"dict_type_code":"006"},function(data){
			//data返回的结果数据（该数据被转换过）-json数组
			$(data).each(function(){
				//this每一次循环小对象
				var option=$("<option value='"+this.dict_id+"'>"+this.dict_item_name+"</option>");
				//加到select中
				$("#cust_level").append(option);
			});
			
		});
		
		//信息来源
		$.post("${pageContext.request.contextPath}/baseDict_listByTypeCode.action",{"dict_type_code":"002"},function(data){
			//data返回的结果数据（该数据被转换过）-json数组
			$(data).each(function(){
				//this每一次循环小对象
				var option=$("<option value='"+this.dict_id+"'>"+this.dict_item_name+"</option>");
				//加到select中
				$("#cust_source").append(option);
			});
			
		});
		//所属行业
		$.post("${pageContext.request.contextPath}/baseDict_listByTypeCode.action",{"dict_type_code":"001"},function(data){
			//data返回的结果数据（该数据被转换过）-json数组
			$(data).each(function(){
				//this每一次循环小对象
				var option=$("<option value='"+this.dict_id+"'>"+this.dict_item_name+"</option>");
				//加到select中
				$("#cust_industry").append(option);
			});
			
		});
	});

</script>
</HEAD>
<BODY>
	<!-- 错误信息回显 -->
	<s:actionerror/>
	<s:fielderror/>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/customer_add.action"
		enctype="multipart/form-data" method="post">
		

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
								<TD class=manageHead>当前位置：客户管理 &gt; 添加客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_name">
								</td>
								<td>客户级别 ：</td>
								<td>
								<!-- name:ognl表达式写法 -->
								<select id="cust_level" name="baseDictLevel.dict_id">
									<option value="">--请选择--</option>
								</select>
								</td>
							</TR>
							
							<TR>
								
								<td>信息来源 ：</td>
								<td>
								<select id="cust_source" name="baseDictSource.dict_id">
									<option value="">--请选择--</option>
								</select>
								</td>
								<td>所属行业 ：</td>
								<td>
								<select id="cust_industry" name="baseDictIndustry.dict_id">
									<option value="">--请选择--</option>
								</select>
								</td>
							</TR>
							<TR>
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_phone">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_mobile">
								</td>
							</TR>
							<TR>
								<td>资质上传 ：</td>
								<td colspan="3">
									<!-- <input type="file" name="upload"/> -->
									<s:file name="upload"/>
								</td>
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
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
	</FORM>
</BODY>
</HTML>
