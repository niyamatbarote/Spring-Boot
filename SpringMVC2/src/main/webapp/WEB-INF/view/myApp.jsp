<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Love Calculator</title>

    <style>
        /* ===== Reset ===== */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        /* ===== Background ===== */
        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #ff758c, #ff7eb3);
        }

        /* ===== Card Container ===== */
        .container {
            background: white;
            padding: 40px;
            border-radius: 15px;
            width: 350px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            text-align: center;
        }

        /* ===== Title ===== */
        h1 {
            color: #ff4d6d;
            margin-bottom: 25px;
        }

        /* ===== Inputs ===== */
        .input-box {
            width: 100%;
            margin-bottom: 15px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border-radius: 8px;
            border: 1px solid #ccc;
            outline: none;
            font-size: 14px;
            transition: 0.3s;
        }

        input[type="text"]:focus {
            border-color: #ff4d6d;
            box-shadow: 0 0 5px #ff4d6d55;
        }

        /* ===== Checkbox ===== */
        .terms {
            display: flex;
            align-items: center;
            font-size: 13px;
            margin-bottom: 20px;
            text-align: left;
        }

        .terms input {
            margin-right: 8px;
        }

        /* ===== Button ===== */
        button {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 8px;
            background: #ff4d6d;
            color: white;
            font-size: 15px;
            cursor: pointer;
            transition: 0.3s;
        }

        button:hover {
            background: #e63956;
            transform: scale(1.03);
        }

        /* ===== Result placeholder ===== */
        .result {
            margin-top: 15px;
            font-weight: bold;
            color: #333;
        }
    </style>
    
    
    <!-- <JavaScript Code> -->
    <!-- < FORM VALIDATION SAMPLE CODE> -->
    <script type="text/javascript">
    	
    function validUserName() {
		var user = document.getElementById('yourName').value;
		var crush = document.getElementById('crushName').value;
		
		if (user.length < 2) {
			alert("Ener at least one Character in Your Name..!!");
			return false;
		}
		
		if (crush.length < 2) {
			alert("Ener at least one Character in Crush Name..!!");
			return false;
		}
		return true;
	}
    
    </script>
</head>

<body>

    <div class="container">
        <h1>❤️ Love Calculator ❤️</h1>

<!-- <model Attribute is important here> -->
        <form:form action="process" method="get" modelAttribute="info" >
            <div class="input-box">
            <!-- < Mkae sure you set THE PATH> -->
                <form:input type="text" path="yourName" placeholder="Your Name" />
            </div>

            <div class="input-box">
                <form:input type="text" path="crushName" placeholder="Crush Name" />
            </div>

            <div class="terms">
                <input type="checkbox" required>
                <label>I agree this is just for Fun 😄</label>
            </div>

            <button type="submit">Calculate</button>

            <div class="result"></div>
        </form:form>
    </div>

</body>
</html>