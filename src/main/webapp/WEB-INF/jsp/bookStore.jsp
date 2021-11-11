<%--
  Created by IntelliJ IDEA.
  User: Minus
  Date: 2021/11/9
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>书城</title>
	<link rel="stylesheet" href="./cart/css/style.css"/>
	<link href="./cart/css/datouwang.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="./cart/js/demo.js"></script>

</head>
<body background="images/cartback.jpg" style="background-size: 100%" >
<br/><div style="text-align: center"><h1><a style="color: #a7cbff">!!! WELCOME TO VISIT !!!</a></h1><br/></div>
<div style="text-align: center"><h1><a style="color: cornflowerblue;text-align: center">欢迎用户：${username} 来到黑马书城</a></h1></div>
<div class="catbox" style="position: relative;top: 150px;" >
	<table id="cartTable" >
		<thead>
		<tr>
			<th><label><input class="check-all check" type="checkbox"/>&nbsp全选</label></th>
			<th>商品编号</th>
			<th>书名</th>
			<th>出版社</th>
			<th>作者</th>
			<th>库存</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${allBook}" var="book" varStatus="status">
			<tr>
				<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
				<td class="subtotal"><span style="color: deeppink">${book.id}</span></td>
				<td class="subtotal" style="color: darkred">${book.name}</td>
				<td class="subtotal" style="color: darkred"><span>${book.press}</span></td>
				<td class="subtotal" style="color: darkred">${book.author}</td>
				<td class="subtotal" style="color: darkred">${book.amount}本</td>
				<td class="operation" style="color: darkred">
					<span class="delete" );>
						<a href="${pageContext.request.contextPath}/toFunction?username=${username}&bookName=${book.name}" style="color: deeppink">购买</a></span>
			</tr>
		</c:forEach>
		</tbody>

	</table>

	<div class="foot" id="foot">
		<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>

	</div>

</div>
</div>
</body>
</html>