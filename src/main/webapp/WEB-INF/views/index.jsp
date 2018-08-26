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

<!-- 	<link
		href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/pulse/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-c0rj6xRl6Zm4U4BwLaWhUoP/xPI8Sq+9Gt0F+JO5DSLZN0Ur0Ihc6rU59Rbgk1zV"
		crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script> -->

	<!--  link to the user registration page -->
	<a href="/ItemAdmin">Admin Login </a>
	<h1>Welcome to Ugly Duckling Coffee Shop</h1>
	<h3>this is our menu:</h3>
	<p>is this showing up?</p>
	<table>	
		<tbody>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
			</tr>		
			<c:forEach var="product" items="${items}">
				<tr>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	

		<%--        Item <c:out value = "${items.}"/><p>
      </c:forEach> --%>
		<p>If you wish to register for special promotions please sign up
			to our rewards program below</p>
		<a href="/registration"> Register here</a>
</body>
</html>