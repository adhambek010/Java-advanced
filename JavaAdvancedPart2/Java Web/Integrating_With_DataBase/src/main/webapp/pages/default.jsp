<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Default Page</title>
</head>
<body>
    <header>
    	<img src="<%= request.getContextPath() %>/images/img.png" alt="Default Image">
        <h1>Default Page</h1>
        <nav>
            <ul>
                <li><a href="<%= request.getContextPath() %>/Home?page=home">Home</a></li>
                <li><a href="<%= request.getContextPath() %>/Home?page=list">List of Users</a></li>
            </ul>
        </nav>
    </header>
    <section>
        <p>This is the default page content.</p>
    </section>
    <footer>
        <p>&copy; 2023 Our Website. All rights reserved.</p>
    </footer>
</body>
</html>
