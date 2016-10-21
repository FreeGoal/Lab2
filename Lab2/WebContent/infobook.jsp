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
			<th>PublishDate</th>
			<th>Price</th>
			<th>ISBN</th>
		</tr>
		<s:iterator value="books">
			<tr>
				<td><s:property value="authorid" /></td>
				<td><s:property value="title" /></td>
				<td><s:property value="publisher" /></td>
				<td><s:property value="publishdata" /></td>
				<td><s:property value="price" /></td>
				<td><s:property value="isbn" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>