<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
<s:head />
</head>
<body>
	<form action="add" method="post" name="form1" >
		作者编号：
		<s:textfield name="nauthorid" />
		<br />
		<br /> 题目：
		<s:textfield name="ntitle" />
		<br />
		<br /> 出版商：
		<s:textfield name="npublisher" />
		<br />
		<br /> 出版日期：
		<s:textfield name="npublishdata" />
		<br />
		<br /> 价格：
		<s:textfield name="nprice" />
		<br />
		<br /> ISBN：
		<s:textfield name="nisbn" />
		<br />
		<br />
		<s:submit value="提交" />
	</form>
</body>
</html>