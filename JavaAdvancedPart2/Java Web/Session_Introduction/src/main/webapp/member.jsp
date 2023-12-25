<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member area</title>
</head>
<body>
<%
	String userName = null;
	String sessionId = null;
	
	if(request.getSession().getAttribute("userName") == null){
		response.sendRedirect("login.jsp");
	}else{
		userName = request.getSession().getAttribute("userName").toString();
		sessionId = request.getSession().getId();
	}
%>

	<p>User Name : <%=userName %></p><br/>
	<p>Session Id: <%=sessionId %></p><br/>
	<hr/>
	<h3>Member area</h3>
	
	<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
		<input type="hidden", name="action" value="destroy">
		<input type="submit" value="logout">
	</form>
</body>
</html>