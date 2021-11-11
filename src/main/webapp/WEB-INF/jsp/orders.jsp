<%--
  Created by IntelliJ IDEA.
  User: Minus
  Date: 2021/11/7
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>订单查询1</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findOrdersByUsername" method="post">
	所属用户：<input type="text" name="username"/><br/>
	<input type="submit" value="查询">
</form>
</body>
</html>
