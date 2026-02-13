<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign-up</title>
</head>
<body>
<div class="container">

	<form:form action="signup" method="get" modelAttribute="in">
	
	
	<div>
	<label>Username : </label>
	<form:input type="text" path="username"/>
	</div>
	
	<div>
	<label>Password : </label>
	<form:input type="text" path="pass"/>
	</div>
	
	<div>
	<input type="checkbox" required="required">	
	<label>i agree terms and conditions</label>
	</div>
	
	<div>
	<button type="submit">SIGN IN</button>
	</div>
	
	</form:form>
	
	</div>

</body>
</html>