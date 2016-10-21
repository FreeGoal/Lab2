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
	<form action="addauthor" method="post" name="form2">
		作者编号：
		<s:textfield name="nauthorid" />
		<br />
		<br /> 姓名：
		<s:textfield name="nname" />
		<br />
		<br /> 年龄：
		<s:textfield name="nage" />
		<br />
		<br /> 国家：
		<s:textfield name="ncountry" />
		<br />
		<br />
		<s:submit value="提交" />
	</form>
</body>
</html>