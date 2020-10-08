<%-- 
    Document   : listUser
    Created on : Oct 7, 2020, 7:28:33 PM
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

        <table>
            <tr>
                <th>email</th>
                <th>password</th>
                <th>full Name</th>
            </tr>
            <c:forEach items="${users}" var="u" >
                <tr>
                    <td>${u.email}</td>
                    <td>${u.password}</td>
                    <td>${u.fullName}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
