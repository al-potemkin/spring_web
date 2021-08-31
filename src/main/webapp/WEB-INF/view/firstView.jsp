<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>First view</title>
</head>
<body>
<form:form action="showSecond" modelAttribute="product">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Price: <form:input path="price"/>
    <br>
    Number: <form:select path="number">
                <form:options items="${product.numbers}"/>
            </form:select>
    <br>
    <form:radiobuttons path="type" items="${product.types}"/>
    <br>
    <form:checkboxes path="info" items="${product.infoMap}"/>
    <input type="submit" value="submit">
</form:form>

</body>
</html>
