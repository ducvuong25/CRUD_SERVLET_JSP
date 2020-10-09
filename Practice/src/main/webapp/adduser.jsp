<%-- 
    Document   : adduser
    Created on : Oct 9, 2020, 3:26:50 PM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add user</title>
    </head>
    <body>
        <form action="AddUser" method="POST">
            <div>   
                <h1>add user</h1>
                <label>User Name:</label>
                <input type="text" name="userName"  maxlength="30" required><br>
                <label>Password:</label>
                <input type="password" name="password" required><br>

                <label>email:</label>
                <input type="email" name="email" required><br>
                <label>role:</label>
                <select name="role">
                    <option value='admin'>admin</option>
                    <option value='maintain'>maintain</option>
                    <option value='service'>service</option>
                </select>

                <label>&nbsp;</label>
                <input type="submit" value = "add">
            </div>

        </form>
    </body>
</html>
