<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set property</title>
</head>
<body>
	<jsp:useBean id="user" class="com.advanced.beans.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="firstName" name="user" value= "Adkham"/><br/> 
	<jsp:setProperty property="lastName" name="user" value="Salaydinov"/><br/>
	<p>Values are updated</p>
</body>
</html>