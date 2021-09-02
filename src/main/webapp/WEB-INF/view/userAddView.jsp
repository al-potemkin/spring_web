<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col"></div>
        <div class="col-10">
            <form:form action="saveNewUser" modelAttribute="user">
                <form:hidden path="userId"/>
                <div class="mb-3 input-group">
                    <span class="input-group-text">First and last name</span>
                    <form:input path="userName" type="text" aria-label="First name" class="form-control"/>
                    <form:input path="userSurname" type="text" aria-label="Last name" class="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="loginInput" class="form-label">Login</label>
                    <form:input path="login" type="login" class="form-control" id="loginInput"/>
                </div>
                <div class="mb-3">
                    <label for="passwordInput" class="form-label">Password</label>
                    <form:input path="password" type="password" class="form-control" id="passwordInput"/>
                </div>
                <div class="mb-3">
                    <div class="btn-group" role="group" aria-label="Basic example">
                        <input type="submit" class="btn btn-info" value="Submit"/>
                        <input type="button" class="btn btn-secondary"
                               onclick="window.location.href='/'" value="Back to main page"/>
                    </div>
                </div>
            </form:form>
        </div>
        <div class="col"></div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
</body>
</html>