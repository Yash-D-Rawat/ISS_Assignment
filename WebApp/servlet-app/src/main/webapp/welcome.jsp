<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="css/auth.css">
</head>

<body>

<div class="welcome-card">
    <h1>Welcome, ${sessionScope.user}</h1>

    <h3>Authentication Successful</h3>

    <p>
        You have successfully logged in and reached the end of the assignment.
        This page represents a protected post-authentication landing screen
        within the application.
    </p>

    <a href="logout">Logout</a>
</div>

</body>
</html>
