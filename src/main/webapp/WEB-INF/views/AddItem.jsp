<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>${title}</h1>
			
	<a href="/ItemAdmin">Go back to Admin Page</a>
	<div id="form-container">
		<form method="post">
			<fieldset>
				<legend>Add a new item:</legend>
				<table>
					<tr>
						<td><label for="name">Name:</label></td>
						<td><input class="form-control" id="name" name="name" value="${item.name}" required></td>
					</tr>
					<tr>
						<td><label>Description:</label></td>
						<td><input name="description" value="${item.description}"required></td>
					</tr>
					<tr>
						<td><label>Quantity</label></td>
						<td><input name="quantity" value="${item.quantity}"required></td>
					</tr>
					<tr>
						<td>Price:</td>
						<td><input name="price" value="${item.price}" required /></td>
					</tr>
				</table>
				<button type="submit">Save</button>
			</fieldset>
		</form>
	</div>
</body>
</html>