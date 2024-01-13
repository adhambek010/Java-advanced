<%@page import="com.advanced.entity.User"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>List Of Users</title>
</head>
<body>
	<h3>List Users</h3>
	<table border="1">
		<thead>
			<tr>
				<th>User Id</th>
				<th>User Name</th>
				<th>User Email</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<User> listUsers = (List) request.getAttribute("users");
			for (User user : listUsers) {
				out.print("<tr>");
				out.print("<td>" + user.getUser_id() + "</td>");
				out.print("<td>" + user.getUsername() + "</td>");
				out.print("<td>" + user.getEmail() + "</td>");
				out.print("</tr>");
			}
			%>

		</tbody>
	</table>
</body>
</html>
