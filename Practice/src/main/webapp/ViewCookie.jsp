<%-- 
    Document   : ViewCookie
    Created on : Oct 3, 2020, 11:29:48 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Coookie Page</title>
        <style>
            table,td, th {
                border: 1px solid black;
                border-collapse: collapse;
            }
            td, th {
                pading: 5px;
            }
        </style>
    </head>
    <body>
        <h1>all coookie was sent to this page:</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Value</th>
            </tr>
            <c:forEach items="${cookie}" var="c">
                <tr>
                    <td>${c.value.name}</td>
                    <td>${c.value.value}</td>
                </tr>

            </c:forEach>

        </table>


    </body>
</html>
