<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Signup</title>

<style>
/* ===== Same Love Calculator Theme ===== */
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, Helvetica, sans-serif;
}

/* Pink gradient background */
body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background: linear-gradient(135deg, #ff758c, #ff7eb3);
}

/* Card container */
.container{
    background:white;
    padding:40px;
    border-radius:15px;
    width:380px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

/* Title */
h1{
    text-align:center;
    color:#ff4d6d;
    margin-bottom:25px;
}

/* Form group */
.form-group{
    margin-bottom:15px;
    display:flex;
    flex-direction:column;
}

/* Labels */
label{
    font-size:14px;
    margin-bottom:5px;
    font-weight:bold;
}

/* Inputs & Select */
input, select{
    padding:10px;
    border-radius:8px;
    border:1px solid #ccc;
    font-size:14px;
    outline:none;
    transition:0.3s;
}

input:focus, select:focus{
    border-color:#ff4d6d;
    box-shadow:0 0 5px #ff4d6d55;
}

/* Checkbox & radio */
.options{
    display:flex;
    flex-wrap:wrap;
    gap:10px;
    font-size:13px;
}

/* Button (same style as love calculator) */
button{
    width:100%;
    padding:10px;
    border:none;
    border-radius:8px;
    background:#ff4d6d;
    color:white;
    font-size:15px;
    cursor:pointer;
    transition:0.3s;
    margin-top:10px;
}

button:hover{
    background:#e63956;
    transform:scale(1.03);
}


/* Sign In button (secondary style) */
.signin-btn{
    display:block;
    text-align:center;
    margin-top:10px;
    padding:10px;
    border-radius:8px;
    text-decoration:none;
    background:#fff;
    color:#ff4d6d;
    border:2px solid #ff4d6d;
    font-size:14px;
    transition:0.3s;
}

.signin-btn:hover{
    background:#ff4d6d;
    color:white;
}

</style>
</head>

<body>

<div class="container">

    <h1>❤️ Sign Up ❤️</h1>

    <form:form action="/signin" modelAttribute="up">

        <div class="form-group">
            <label>Full Name</label>
            <form:input path="user"  placeholder="Enter your name" required/>
        </div>

        <div class="form-group">
            <label>Username</label>
            <form:input path="username" type="text" placeholder="Choose username" required/>
        </div>

        <div class="form-group">
            <label>Password</label>
            <form:input path="password" type="password" placeholder="Enter password" required/>
        </div>

        <div class="form-group">
            <label>Country</label>
            <form:select path="country">
                <form:option value="India" >India</form:option>
                <form:option value="usa">USA</form:option>
                <form:option value="uk">UK</form:option>
                <form:option value="canada">Canada</form:option>
            </form:select>
        </div>

        <div class="form-group">
            <label>Hobbies</label>
            <div class="options">
                <label><form:input path="hobbies" type="checkbox"/> Cricket</label>
                <label><form:input path="hobbies" type="checkbox"/> Reading</label>
                <label><form:input path="hobbies" type="checkbox"/> Travel</label>
                <label><form:input path="hobbies" type="checkbox"/> Programming</label>
            </div>
        </div>

        <div class="form-group">
            <label>Gender</label>
            <div class="options">
                <label><form:input path="gender" type="radio" name="gender"/> Male</label>
                <label><form:input path="gender" type="radio" name="gender"/> Female</label>
            </div>
        </div>

        <button type="submit">Register</button>
        
        <a href="signin.jsp" class="signin-btn">Sign In</a>

    </form:form>
	
</div>

</body>
</html>