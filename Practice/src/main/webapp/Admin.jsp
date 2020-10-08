<%-- 
    Document   : ListUsers
    Created on : Oct 8, 2020, 8:38:40 AM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <title>admin page</title>
        <style>
            table,th,td {
                border: 1px solid black;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <h1>well come: ${userName}</h1>
        <a href="AddUser.jsp">add user</a>
        <table>
            <tr>
                <th>id</th>
                <th>user Name</th>
                <th>password</th>
                <th>email</th>
                <th>role</th>
                <th>action</th>
            </tr>
            <c:forEach items="${users}" var="u" >
                <tr>
                    <td>${u.id}</td>
                    <td>${u.userName}</td>
                    <td>${u.password}</td>
                    <td>${u.email}</td>
                    <td>${u.role}</td>
                    <td><a href="Edit?id=${u.id}">edit</a>&nbsp; <a href="Delete?id=${u.id}">delete</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
