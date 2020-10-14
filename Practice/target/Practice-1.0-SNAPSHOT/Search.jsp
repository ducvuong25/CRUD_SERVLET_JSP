<%-- 
    Document   : Search
    Created on : Oct 11, 2020, 6:38:17 PM
    Author     : ducvuong25
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seach by user Name</title>
    </head>
    <body>
        <c:if test="${user != null}">
            <table>
                <tr>
                    <th>id</th>
                    <th>UserName</th>
                    <th>password</th>
                    <th>email</th>
                    <th>role</th>
                    <th>action</th>
                </tr>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.password}</td>

                    <td>${user.email}</td>


                    <td>${user.role}</td>
                    <td><a href="Edit?id=${user.id}">edit</a>&nbsp;&nbsp;
                        <a href="Delete?id=${user.id}">delete</a></td>
                </tr>
            </table>  
        </c:if>
        <p>${message}</p>
    </body>
</html>
