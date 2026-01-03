<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/auth.css">
</head>

<body>
<div class="card">
    <h2>Register</h2>

    <form action="register" method="post">

        <div class="input-group">
            <span>👤</span>
            <input type="text" name="username" placeholder="Username">
        </div>

        <div class="input-group">
            <span>🔒</span>
            <input type="password" name="password" placeholder="Password">
        </div>

        <button type="submit">SIGN UP</button>
    </form>

    <!-- Server-side error message -->
    <div class="error">${error}</div>

    <div class="link">
        Already registered? <a href="login.jsp">Login</a>
    </div>
</div>
</body>
</html>
