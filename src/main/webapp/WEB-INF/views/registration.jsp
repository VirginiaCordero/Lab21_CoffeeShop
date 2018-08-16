<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/summary">
		<p>
			First Name: <input name="firstname" />
		</p>
		<p>
			Last Name: <input name="lastname" />
		</p>
		<p>
			E-mail: <input name="email" />
		</p>
		<p>
			Password: <input type="password" name="password" />
		</p>
		<p> I accept terms and conditions. Coffee is serious business.<br> 
			<input type="radio" name="radioBox" value="agree"> Agree<br> 
			<input type="radio" name="radioBox" value="disagree" checked> Disagree<br>	
		</p>
		<p> 
			<input type="checkbox" name="termsCheckbox" checked>
			I want to receive offers and promotions.
		</p>
		<button type="submit">Submit</button>		
	</form>

</body>
</html>