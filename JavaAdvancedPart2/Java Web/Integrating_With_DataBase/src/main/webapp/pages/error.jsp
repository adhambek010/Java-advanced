<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <img src="<%= request.getContextPath() %>/images/img.png" alt="Error Image">
    <title>Error Page</title>
</head>
<body>
    <header>
        <h1>Error</h1>
    </header>
    <section>
        <p>An unexpected error occurred. Please try again later.</p>
    </section>
    <footer>
        <p>&copy; 2023 Our Website. All rights reserved.</p>
    </footer>
</body>
</html>
