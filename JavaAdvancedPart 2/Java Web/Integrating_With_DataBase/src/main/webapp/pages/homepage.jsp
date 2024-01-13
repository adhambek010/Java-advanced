<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
    <%
    	if(request.getAttribute("title") == null){
    		out.print("<title>Home Page</title>");
    	}else{
    		out.print(("<title>") + request.getAttribute("title") + ("</title>"));
    	}
    %>
    	
    </title>
</head>
<body>
    <header>
        <img src="<%= request.getContextPath() %>/images/img.png" rel="icon">
        <h1>Welcome to Our Website</h1>
        <nav>
            <ul>
                <li><a href="<%= request.getContextPath() %>/Home?page=home">Home</a></li>
                <li><a href="<%= request.getContextPath() %>/Home?page=list">List of Users</a></li>
            </ul>
        </nav>
    </header>
    <section>
        <p>This is a simple website to showcase JSP pages.</p>
    </section>
    <footer>
        <p>&copy; 2023 Our Website. All rights reserved.</p>
    </footer>
</body>
</html>
