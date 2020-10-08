<%-- 
    Document   : EditUser
    Created on : Oct 8, 2020, 10:32:56 AM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit user</title>
    </head>
    <body>
        <form action="Edit"  method="POST">
            <div>   
                <h1>Edit user</h1>

                <input type="hidden"  name="id" value ="${user.id}">

                <label>User Name:</label>
                <input type="text" name="userName" value="${user.userName}" maxlength="30" required><br>
                <label>Password:</label>
                <input type="password" name="password" value="${user.password}" required><br>
                <label>Email:</label>
                <input type="email" name="email" value="${user.email}" required>
                <label>Role:</label>
                <select name="role">
                    <option  value="admin">Admin</option>
                    <option  value="maintain">Mantain</option>
                    <option  value="service">Service</option>
                </select>
                <label>&nbsp;</label>
                <input type="submit" value = "Login">
            </div>

        </form>
    </body>
</html>
