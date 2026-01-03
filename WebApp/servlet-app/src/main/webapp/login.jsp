<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/auth.css">
    <script src="js/validation.js"></script>
</head>

<body>
<div class="card">
    <h2>Login</h2>

    <form action="login" method="post" onsubmit="return validateLogin()">

        <div class="input-group">
            <span>👤</span>
            <input type="text" id="username" name="username" placeholder="Username">
        </div>

        <div class="input-group">
            <span>🔒</span>
            <input type="password" id="password" name="password" placeholder="Password">
        </div>

        <div class="remember">
            <input type="checkbox"> Remember me
        </div>

        <button type="submit">LOG IN</button>
    </form>

    <div class="error" id="clientError"></div>
    <div class="error">${error}</div>

    <div class="link">
        Not a member? <a href="register.jsp">Sign up now</a>
    </div>
</div>
</body>
</html>
