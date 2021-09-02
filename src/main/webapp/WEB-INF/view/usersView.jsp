<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Users</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col"></div>
        <div class="col-10">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">login</th>
                    <th scope="col">password</th>
                    <th scope="col">username</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <th scope="row">${user.userId}</th>
                        <td>${user.login}</td>
                        <td>${user.password}</td>
                        <td>${user.userSurname} ${user.userName}</td>
                        <td>
                            <c:url var="updateUserButton" value="/updateUser">
                                <c:param name="userId" value="${user.userId}"/>
                            </c:url>
                            <c:url var="deleteUserButton" value="/deleteUser">
                                <c:param name="userId" value="${user.userId}"/>
                            </c:url>
                            <div class="btn-group" role="group" aria-label="Basic example">
                                <input type="button" class="btn btn-secondary"
                                       onclick="window.location.href='${updateUserButton}'" value="Update"/>
                                <input type="button" class="btn btn-secondary"
                                       onclick="window.location.href='${deleteUserButton}'" value="Delete"/>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <input type="button" class="btn btn-info" onclick="window.location.href = 'add'" value="Add user"></input>
        </div>
        <div class="col"></div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>
</html>