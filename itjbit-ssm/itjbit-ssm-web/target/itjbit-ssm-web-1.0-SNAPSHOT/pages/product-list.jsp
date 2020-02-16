<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<!-- 页面meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">




<title>数据 - AdminLTE2定制版</title>
<meta name="description" content="AdminLTE2定制版">
<meta name="keywords" content="AdminLTE2定制版">





</head>

<body>

<c:forEach items="${productList}" var="product">

	<tr>
		<td><input name="ids" type="checkbox"></td>
		<td>${product.id }</td>
		<td>${product.productNum }</td>
		<td>${product.productName }</td>
		<td>${product.cityName }</td>

		<td class="text-center">${product.productPrice }</td>
		<td>${product.productDesc }</td>
		<td class="text-center">${product.productStatus }</td>
		<td class="text-center">
			<button type="button" class="btn bg-olive btn-xs">订单</button>
			<button type="button" class="btn bg-olive btn-xs">详情</button>
			<button type="button" class="btn bg-olive btn-xs">编辑</button>
		</td>
	</tr>
</c:forEach>



</body>

</html>