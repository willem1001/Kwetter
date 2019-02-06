<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Willem
  Date: 05/02/2019
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Login</h3>
<form:form method="POST"
           action="/Kwetter/logUserIn" modelAttribute="user">
    <table>
        <tr>
            <td><form:label path="userName">Name</form:label></td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
