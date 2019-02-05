<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.stas.controller.LoginController" %>
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
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST"
           action="/Kwetter/login" modelAttribute="user">
    <table>
        <tr>+
            <td><form:label path="userName">Name</form:label></td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td><form:label path="passWord">Password</form:label></td>
            <td><form:input path="passWord"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
