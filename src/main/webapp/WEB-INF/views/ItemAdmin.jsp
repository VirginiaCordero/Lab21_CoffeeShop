<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/">Go back to Menu</a>	
	<h1>Welcome to Ugly Duckling Coffee Shop</h1>
	<h3>Select Edit to edit item or delete to take it out</h3>
	<table>
		<tbody>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="product" items="${items}">
				<tr>
					<td>${product.name}</td>
					<td>${product.description }</td>
					<td>${product.quantity}</td>
					<td>${product.price}</td>
					<td><a href="/EditItem?id=${product.id}" }>Edit</a></td>
					<td><a href="/delete?id=${product.id}" onclick= "return confirm('are you sure?')">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/AddItem">Add a new Item</a>

</body>
</html>