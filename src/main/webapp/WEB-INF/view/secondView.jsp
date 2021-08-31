<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second view</title>
</head>
<body>
<h2>Name: ${product.name}</h2>
<h2>Price: ${product.price}</h2>
<h2>Field: ${product.field}</h2>
<h2>Number: ${product.number}</h2>
<h2>Type: ${product.type}</h2>
<ul>
    <c:forEach var="info" items="${product.info}">
        <li><h2>${info}</h2></li>
    </c:forEach>
</ul>
</body>
</html>
