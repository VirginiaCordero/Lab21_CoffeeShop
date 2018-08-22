
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="form-container">
		<form action="/summary" method="post">
			<fieldset>
				<legend>Subscribe here:</legend>
				<table>
					<tr>
						<td><label>First Name:</label></td>
						<td><input name="firstname" required minlength="[A-Z][a-z]*"></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><input name="lastname" required minlength="[A-Z][a-z]*"></td>
					</tr>
					<tr>
						<td><label>Phone Number:</label></td>
						<td><input name= "phonenumber" id="phonenumber" type="tel"
							pattern="^\d{3}-\d{3}-\d{4}$" placeholder="123-456-7890" title="(format: ###-###-####)"
							required>
							<span class="validity"></span></td>
					</tr>
					<tr>
						<td>E-mail:</td>
						<td><input name="email" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" id="psw" name="password"
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
							required></td>
					</tr> 
				</table>

				<p>I accept terms and conditions. Coffee is serious business.</p>
				<input type="radio" name="termsandconditions" value="agree">Agree
				<input type="radio" name="termsandconditions" value="disagree"
					checked> Disagree

				<p>
					<input type="checkbox" name="offersandpromos" value="true" checked>
					<input type="hidden" name="offersandpromos" value="false" /> I
					want to receive offers and promotions.
				</p>
				<button type="submit">Submit</button>
			</fieldset>
		</form>
	</div>

	<script>
		var myInput = document.getElementById("psw");
		var letter = document.getElementById("letter");
		var capital = document.getElementById("capital");
		var number = document.getElementById("number");
		var length = document.getElementById("length");

		// When the user clicks on the password field, show the message box
		myInput.onfocus = function() {
			document.getElementById("message").style.display = "block";
		}

		// When the user clicks outside of the password field, hide the message box
		myInput.onblur = function() {
			document.getElementById("message").style.display = "none";
		}

		// When the user starts to type something inside the password field
		myInput.onkeyup = function() {
			// Validate lowercase letters
			var lowerCaseLetters = /[a-z]/g;
			if (myInput.value.match(lowerCaseLetters)) {
				letter.classList.remove("invalid");
				letter.classList.add("valid");
			} else {
				letter.classList.remove("valid");
				letter.classList.add("invalid");
			}

			// Validate capital letters
			var upperCaseLetters = /[A-Z]/g;
			if (myInput.value.match(upperCaseLetters)) {
				capital.classList.remove("invalid");
				capital.classList.add("valid");
			} else {
				capital.classList.remove("valid");
				capital.classList.add("invalid");
			}

			// Validate numbers
			var numbers = /[0-9]/g;
			if (myInput.value.match(numbers)) {
				number.classList.remove("invalid");
				number.classList.add("valid");
			} else {
				number.classList.remove("valid");
				number.classList.add("invalid");
			}

			// Validate length
			if (myInput.value.length >= 8) {
				length.classList.remove("invalid");
				length.classList.add("valid");
			} else {
				length.classList.remove("valid");
				length.classList.add("invalid");
			}
		}
	</script>
</body>
</html>