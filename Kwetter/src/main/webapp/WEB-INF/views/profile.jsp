<%--
  Created by IntelliJ IDEA.
  User: Willem
  Date: 05/02/2019
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="POST"
           action="/Kwetter/login" modelAttribute="user">
    <table>
        <tr>+
            <td><form:label path="userName">Name</form:label></td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
${user.userName}
${user.password}


</body>
</html>
