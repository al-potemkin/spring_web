<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>First view</title>
</head>
<body>
<form:form action="showSecond" modelAttribute="product">
    Name: <form:input path="name"/>
    <br>
    Price: <form:input path="price"/>
    <br>
    <input type="submit" value="submit">
</form:form>

</body>
</html>
