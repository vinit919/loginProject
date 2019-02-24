<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approval Page</title>
</head>
<body>
<fieldset style="text-align:center;" >
	<legend>Please Approval</legend>
		<form action="approve.do" method="POST" align="center">
			User-name :<input type="text" name="uname" autofocus="autofocus" placeholder="Enter user name"><br><br>
			Password  :<input type="password" name="pwd" placeholder="enter pwd"><br><br>
			Email-ID  :<input type="email" name="mail" placeholder="enter email"><br><br>
			<input type="submit" value="Approve">
		</form>
</fieldset>
</body>
</html>