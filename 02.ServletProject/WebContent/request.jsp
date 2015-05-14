<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<title>JSP/Servlet Example</title>
		<style>
			li {line-height:30px}
		
		</style>
	</head>
	
	<body>
		<h1>Request Form</h1>
		<hr>
		
		<form action="RequestServlet">
			<ul>
				<li><label>name : </label><input type="text" name="name"></li>
				<li><label>password : </label><input type="password" name="pwd"></li>
				<li><label>gender : </label><input type="radio" name="gender" value="m">남자 <input type="radio" name="gender" value="m">여자</li>
				<li><label>hobby : </label><input type="checkbox" name="hobby" value="soccer">축구  <input type="checkbox" name="hobby" value="basksetball">농구 <input type="checkbox" name="hobby" value="baseball">야구</li>
				<li>
					<label>subject : </label>
					<select name="subject">
						<option value="html">html</option>
						<option value="css">css</option>
						<option value="jsp">jsp</option>
					</select>
				</li>
				
				<li><label>color : </label><input type="color" name="color"></li>
				
			</ul>
		
			<input type="submit" value="request연습">
		</form>
	</body>
</html>