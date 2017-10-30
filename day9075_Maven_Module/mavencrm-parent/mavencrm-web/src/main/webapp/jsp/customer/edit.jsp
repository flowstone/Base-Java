<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
			
			//选中
			//获取选中项的id的值(来自值栈)
			//var dict_id=${baseDictLevel.dict_id};
			//alert(dict_id);
			$("#cust_level option[value=${baseDictLevel.dict_id}]").attr("selected","selected");
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
			
			$("#cust_source option[value=${baseDictSource.dict_id}]").attr("selected","selected");
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
			
			$("#cust_industry option[value=${baseDictIndustry.dict_id}]").attr("selected","selected");
		});
	});

</script>
</HEAD>
<BODY>
	<!-- 错误回显 -->
	<s:fielderror/>
	<s:actionerror/>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/customer_edit.action"
		enctype="multipart/form-data" method=post>
		<input type="hidden" name="cust_id" value="${cust_id }"/>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg
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
								<TD class=manageHead>当前位置：客户管理 &gt; 修改客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							 
							<TR>
								<td>客户名称：</td>
								<td>
								<%-- <INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_name" value="${cust_name }"> --%>
								<!-- 表单struts2的标签：name支持ognl表达式 
								struts2的标签完全遵守dhtml规范，
								-->
								<s:textfield name="cust_name" cssClass="textbox" id="sChannel2" cssStyle="WIDTH: 180px" maxLength="50" />
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
														style="WIDTH: 180px" maxLength=50 name="cust_phone" value="${cust_phone }">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_mobile" value="${cust_mobile }">
								</td>
							</TR>
							<TR>
								<td>资质上传 ：</td>
								<td colspan="3">
									<input type="file" name="upload"/>
									<!-- <s:file name="upload"/> -->
									原来的资质：${cust_filename }
									<input type="hidden" name="cust_path" value="${cust_path }"/>
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
