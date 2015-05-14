<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head><title>JSP/Servlet Example</title></head>
	
	<body>
		<h1> GET/POST 방식 </h1>
		<hr>
		
		<!-- Servlet GET 방식  -->
		<h2>Servlet GET</h2>
		<form method="get" action="TestServlet">
			Name : <input type="text" name="name">
			<input type="submit" value="GET">
		</form>
		
		<hr>
		
		<!-- Servlet POST 방식  -->
		<h2>Servlet POST</h2>
		<form method="post" action="TestServlet">
			Name : <input type="text" name="name">
			<input type="submit" value="POST">
		</form>
		
		<hr>
		
		<!-- JSP GET/POST 방식  -->
		<h2>JSP GET/POST</h2>
		<form method="get" action="testProcess.jsp">
			Name : <input type="text" name="name">
			<input type="submit" value="POST">
		</form>
	</body>
</html>