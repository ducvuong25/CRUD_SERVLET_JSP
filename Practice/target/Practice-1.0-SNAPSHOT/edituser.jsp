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
        <form action="Edit" method="POST">
            <div> 
                <h1>Edit user</h1>
                <input type="hidden" name="id" value="${user.id}"
                <label>User Name:</label>
                <input type="text" name="userName"   value="${user.userName}"  maxlength="30" required><br>
                <label>Password:</label>
                <input type="password" name="password"    value="${user.password}" required><br>

                <label>email:</label>
                <input type="email" name="email"   value="${user.email}" required><br>
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
