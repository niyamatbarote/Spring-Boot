<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h1> REGISTRATION DONE SUCCESSFULLY ..!! </h1>
 <h1>Your Name is : ${reg.user}</h1>
 <h1>Your Username is : ${reg.username}</h1>
 <h1>Your Pass is : ${reg.password}</h1>
 <h1>Your Country Name is : ${reg.country}</h1>
<!--  < This Method is Used to show the Elements which we Took INPUT as a Array OR ArrayList>  -->
	<h1> Your Hobbies are : <c:forEach var="temp" items="${reg.hobbies}">
		${temp}
	</c:forEach>
	</h1>
 <h1>Your Gender is : ${reg.gender}</h1>
 <h1> My Email ID is : ${reg.commune.email} </h1>

 <h1> My Phone Number is : ${reg.commune.contact.phone} </h1>
 </div>
</body>
</html>