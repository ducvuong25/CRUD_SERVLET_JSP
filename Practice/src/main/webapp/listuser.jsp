<%-- 
    Document   : listUSer
    Created on : Oct 9, 2020, 3:03:35 PM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="AddUser">add user</a>
        <form action="Search" method="POST">
            <label>search by user Name:</label>
            <input type="text" name = "userName" required="">
            <input type="submit" value="search">
        </form>
        <table>
            <tr>
                <th>id</th>
                <th>UserName</th>
                <th>password</th>
                <th>email</th>
                <th>role</th>
                <th>action</th>
            </tr>
            
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>${user.role}</td>
                    <td><a href="Edit?id=${user.id}">edit</a>&nbsp;&nbsp;
                        <a href="Delete?id=${user.id}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <a href="/Logout">Log out</a>
    </body>
</html>
