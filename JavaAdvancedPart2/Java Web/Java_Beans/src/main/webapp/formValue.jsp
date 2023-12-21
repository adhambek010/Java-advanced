<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Get Property</title>
</head>
<body>
    Values submitted from form<br/>
    <jsp:useBean id="user" class="com.advanced.beans.User" scope="session" />

    <%-- Set the properties before displaying them --%>
    <jsp:setProperty property="firstName" name="user" value="${param.firstName}" />
    <jsp:setProperty property="lastName" name="user" value="${param.lastName}" />

    First Name : <%= request.getParameter("firstName") %><br/>
    Last Name : <%= request.getParameter("lastName") %><br/>

</body>
</html>
