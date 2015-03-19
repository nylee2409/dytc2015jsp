<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head><title>JSP/Servlet Example</title></head>
	
	<body>
		<h1>Servlet GET</h1>
		<form method="get" action="TestServlet">
			<ul>
				<li>Name : <input type="text" name="name"></li>
				<li>Hobby : <input type="checkbox" name="hobby" value="basketball">농구 <input type="checkbox" name="hobby" value="baseball">야구</li>
				<li>Gender : <input type="radio" name="gender" value="male">남자  <input type="checkbox" name="hobby" value="female">여자</li>
			</ul>
			<input type="submit" value="GET">
		</form>
		
		
		<h1>Servlet POST</h1>
		<form method="post" action="TestServlet">
			Name : <input type="text" name="name">
			<input type="submit" value="POST">
		</form>
		
		<h1>JSP GET/POST</h1>
		<form method="get" action="testProcess.jsp">
			Name : <input type="text" name="name">
			<input type="submit" value="POST">
		</form>
	</body>
</html>