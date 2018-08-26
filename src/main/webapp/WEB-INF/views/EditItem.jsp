<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="/ItemAdmin">Go back to Admin Page</a>
	<div id="form-container">
		<form method="post">
		<input type="hidden" name="id" value="${id}">
			<fieldset>
				<legend>Add a new item:</legend>
				<table>
					<tr>
						<td><label>Name:</label></td>
						<td><input name="name" required></td>
					</tr>
					<tr>
						<td><label>Description:</label></td>
						<td><input name="description" required></td>
					</tr>
					<tr>
						<td><label>Quantity</label></td>
						<td><input name="quantity" required></td>
					</tr>
					<tr>
						<td>Price:</td>
						<td><input name="price" /></td>
					</tr>
				</table>
				<button type="submit">Save</button>
			</fieldset>
		</form>
		</div>
</body>
</html>