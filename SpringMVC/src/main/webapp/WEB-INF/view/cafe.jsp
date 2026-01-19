<%@ page language="java" contentType="text/html; charset=UTF-8" 
    isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${myMom}</title>
</head>
<body>
<!-- <Redirects to this link when user fills this form> -->
<form action="processOrder">
<div>
	<h1 align="center">This is My MOM'S CAFE </h1>
	<br>
	<label for="myCoffee">Enter Item</label>
	<input type="text" id="myCoffee" name="foodtype">
	<input type="submit" value="order now" id="myCoffee">
</div>
</form>
</body>
</html>