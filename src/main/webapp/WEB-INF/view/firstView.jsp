<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>First view</title>
</head>
<body>
<form:form action="showSecond" modelAttribute="product">
    Name: <form:input path="name"/>
    Price: <form:input path="price"/>
    Number: <form:select path="number">
                <form:options items="${product.numbers}"/>
            </form:select>
    <form:radiobuttons path="type" items="${product.types}"/>
    <input type="submit" value="submit">
</form:form>

</body>
</html>
