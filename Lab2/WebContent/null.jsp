<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String acceptHeader=request.getHeader("accept");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="description" content="This is my page">
<meta http-equiv="refresh" content="0;URL=queryall.action" content="text/html; charset=utf-8">
<meta >
</head>

<body>
<p>你支持的浏览方式：<%=acceptHeader%></p>
</body>
</html>