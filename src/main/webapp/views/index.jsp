<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hi There,
	<BR>
	Welcome to siteinvokers

	<br>
	<h2> For adding of two numbers </h2>
	<form method="get" action="add">
		Enter 1st Number : <input type="text" name="num1" /><br>
		Enter 2nd Number : <input type="text" name="num2" /><br>

		<input type="submit"/>
	
	</form>

	<h2> For adding user </h2>
	<form method="post" action="addProgrammer">
		Enter your id : <input type="text" name="pid" /><br>
		Enter your name : <input type="text" name="pname" /><br>

		<input type="submit"/>
	
	</form>
	
</body>
</html>