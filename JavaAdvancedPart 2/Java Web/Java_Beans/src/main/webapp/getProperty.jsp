<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Property</title>
</head>
<body>
	<p>This is Get Property page</p><br/>
	<jsp:useBean id="user" class="com.advanced.beans.User" scope="session"></jsp:useBean>
	First Name : <jsp:getProperty property="firstName" name="user" /><br/>
	Last Name : <jsp:getProperty property="lastName" name="user" />
</body>
</html>