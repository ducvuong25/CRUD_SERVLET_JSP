<%-- 
    Document   : login
    Created on : Oct 3, 2020, 9:34:52 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>login page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            form {
                margin: 10px auto;
                width: 30%;
                border: 3px solid black;
            }


            h1 {
                color: #007C7E;
                text-align: center;
            }

            label {
                display: inline-block;
                width: 30%;
                text-align: left;
            }
            input {
                width: 60%;
                margin-bottom: 5px; 
            }

            div {
                width: fit-content;
                margin: 5px auto;
            }
            p{
                color: red;
            }
        </style>
    </head>
    <body>
        <form action="Login" method="POST">
            <div>   
                <h1>Login to the system</h1>
                <label>User Name:</label>
                <input type="text" name="userName"  maxlength="30" required><br>
                <label>Password:</label>
                <input type="password" name="password" required><br>
                <label>&nbsp;</label>
                <input type="submit" value = "Login">
            </div>
            <p>${message}</p>

        </form>

    </body>
</html>
