<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table width="100%" height="100%" >
		<tr height="150px" background="../image/header.png;" style="background-repeat: no-repeat; background-position: 100%;">
			<td colspan="2" align="center"><%@include file="/WEB-INF/JSP/header.jsp"%> </td>
		</tr>
		<tr height="150px">
			<td><%@include file="login.jsp" %> </td>
		</tr>
		<tr height="100px">
			<td colspan="2" align="center"><%@include file="/WEB-INF/JSP/footer.jsp"%> </td>
		</tr>
	</table>
</body>
</html>