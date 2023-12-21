<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Hello JSP</title>
</head>
<body>

    <header>
        <h1>Welcome to Simple JSP Example</h1>
        <hr/>
    </header>

    <section>
        <h2>Current Date and Time</h2>
        <p>The current date and time is: <%= new java.util.Date() %></p>
    </section>

    <section>
        <h2>Simple Calculation</h2>
        <% 
            int a = 5;
            int b = 10;
            int sum = a + b;
        %>
        
        <%-- This is JSP comment --%>
        <!-- This is html comment -->
        <p>The sum of <%= a %> and <%= b %> is <%= sum %>.</p>
	</section>
	<section>
	<br>
        <%! int x = 22; %>
        <%!
        	String message(){
        	return "Adkham";
        }

        %>
        <h2>About myself</h2>
        <hr/>
        <p> My name is <%=new String("Salaydinov")%> <%=message() %> and my age is <%=x %>.</p>
        <p>I am future Software Engeneer and nowadays I am learning <%=new String("Java") %> </p>
    </section>
    
    <section>
    	<h3>Files in JSP</h3>
    	<hr/>
    	<!-- Ststic include -->
    	<%@ include file="file1.txt" %>
    	<br/>
    	<!-- Dynamic include -->
    	<jsp:include page="file2.txt"></jsp:include>
    </section>
</body>
</html>
