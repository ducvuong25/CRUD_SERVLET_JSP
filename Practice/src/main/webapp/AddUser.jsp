<%-- 
    Document   : AddUSer
    Created on : Oct 8, 2020, 9:23:10 AM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <body>
        <form action="AddUser"  method="POST">
            <div>   
                <h1>add a new user</h1>
                <label>User Name:</label>
                <input type="text" name="userName"  maxlength="30" required><br>
                <label>Password:</label>
                <input type="password" name="password" required><br>
                <label>Email:</label>
                <input type="email" name="email" required>
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
