<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购物车</title>

<link rel="stylesheet" href="./cart/css/style.css"/>
<link href="./cart/css/datouwang.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="./cart/js/demo.js"></script>

</head>
<body background="images/cartback.jpg" style="background-size: 100%" >
<br/><h1><a style="color: lightpink">!!! WELCOME TO VISIT !!!</a></h1><br/>
<h1>顾客姓名：<a style="color: cornflowerblue">${customer1.username}</a></h1>
<div class="catbox" style="position: relative;top: 150px;" >
	<table id="cartTable" >
		<thead>
			<tr>
				<th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
				<th>编号</th>
				<th>书名</th>
				<th>数量</th>
				<th>出版社</th>
				<th>作者</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${customer1.bookStoreList}" var="bookStore" varStatus="status">
			<tr>
				<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
				<td class="subtotal"><span style="color: deeppink">${bookStore.id}</span></td>
				<td class="subtotal" style="color: darkred">${bookStore.name}</td>
				<td class="subtotal" style="color: darkred"><span>${BookNumber[status.index]}</span></td>
				<td class="subtotal" style="color: darkred">${bookStore.press}</td>
				<td class="subtotal" style="color: darkred">${bookStore.author}</td>
			</tr>
		</c:forEach>
		</tbody>

	</table>

	<div class="foot" id="foot">
		<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>

		<div class="fr closing"><a href="${pageContext.request.contextPath}/tofindBookStore?username=${customer1.username}"><div class="fr closing">前往书城>></div></a></div>
			</div>

</div>
</div>
</body>
</html>
<script>
	function deleteUser(id){
	if(confirm("您确定删除吗？")){
       location.href="${pageContext.request.contextPath}/delUserServlet?id="+id;
	}
	}
</script>