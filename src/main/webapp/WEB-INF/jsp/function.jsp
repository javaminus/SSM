<%--
  Created by IntelliJ IDEA.
  User: Minus
  Date: 2021/11/9
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/buyBook" method="post">
	用户名：<input type="text" name="username" value="${username}"/><br/>
	书名：<input type="text" name="name" value="${bookName}"/><br/>
	购买数量：<input type="text" name="number"/><br/>
	<input type="submit" value="购买">
</form>
</body>
</html>
