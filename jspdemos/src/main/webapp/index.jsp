<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from HTML</h1>
	<%=" <h1>Hello from JSP</h1>" %>
	<%
		int x=10;
		int y=11;
	%>
	<input type="text" value="<%= x + y%>"><br/>
	
	<%
		for(int i=0; i<=5; i++){
			out.print("i = "+ i + "<br/>");
		}
	%>
		The current date is <%= new Date() %> <br/>
	
	<form action="">
		Enter Name: <input type="text" name="fname">
		<input type="submit" name="click" value="Click me">
	</form>
	<%
		if(request.getParameter("click") !=null){
			out.print("Hello " + request.getParameter("fname"));
		}
	%>
	
	<%@include file="footer.html" %>
	
</body>
</html>