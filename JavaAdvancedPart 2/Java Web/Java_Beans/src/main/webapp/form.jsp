<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Set Property</title>
</head>
<body>
    Values submitted from form<br/>
    <jsp:useBean id="user" class="com.advanced.beans.User" scope="session"></jsp:useBean>
    <form action="formValue.jsp" method="post">
        First Name: <input type="text" name="firstName" value='<jsp:setProperty property="firstName" name="user"/>'><br/>
        Last Name: <input type="text" name="lastName" value='<jsp:setProperty property="lastName" name="user"/>'><br/>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
