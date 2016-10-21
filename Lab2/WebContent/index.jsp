<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<s:head />
</head>
<body>
	<table border="1">
		<tr>
			<th>Author_ID</th>
			<th>Title</th>
			<th>Publisher</th>
			<th>PublishData</th>
			<th>Price</th>
			<th>ISBN</th>
			<th>操作</th>
		</tr>
		<s:iterator value="books">
			<tr>
				<td><s:property value="authorid" /></td>
				<td><a
					href="<%=request.getContextPath()%>/info.action?qisbn=<s:property value="isbn" />">
						<s:property value="title" />
				</a></td>
				<td><s:property value="publisher" /></td>
				<td><s:property value="publishdata" /></td>
				<td><s:property value="price" /></td>
				<td><s:property value="isbn" /></td>
				<td><a
					href="<%=request.getContextPath()%>/delete.action?qisbn=<s:property value="isbn" />">
						<input type=button value="删除" style="width: 60px;">
				</a> <a
					href="<%=request.getContextPath()%>/modify.action?qisbn=<s:property value="isbn" />">
						<input type=button value="修改" style="width: 60px;">
				</a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="add.jsp"><input type=button value="添加"
		style="width: 100px;"></a>
</html>