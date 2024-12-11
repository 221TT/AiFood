<%--注册界面--%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>用户注册</title>
</head>
<body>
<h2>注册</h2>
<form action="register" method="post">
    <label for="username">用户名:</label><br>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">密码:</label><br>
    <input type="password" id="password" name="password" required><br><br>

    <label for="email">电子邮件:</label><br>
    <input type="email" id="email" name="email" required><br><br>

    <input type="submit" value="注册">
</form>
<br>
<a href="login.jsp">已有账号？点击登录</a>
</body>
</html>

