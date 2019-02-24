<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log-In</title>
</head>
<body>
<fieldset style="text-align:center;" >
	<legend>Login </legend>
		<form action="login.do" method="POST" align="center">
			User-name :<input type="text" name="uname" autofocus="autofocus" placeholder="Enter user name"><br><br>
			Password  :<input type="password" name="pwd" placeholder="enter pwd"><br><br>
			<input type="submit" value="Login">
		</form>
</fieldset>
</body>
</html>