<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>用户登录</title>
</head>
<body>
<h2>登录</h2>
<form action="login" method="post">
    <label for="username">用户名:</label><br>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">密码:</label><br>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="登录">
</form>
<br>
<a href="register.jsp">没有账号？点击注册</a>
</body>
</html>

