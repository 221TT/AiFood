<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AI 食材识别与食谱推荐</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<!-- 导航栏 -->
<nav>
    <div class="container">
        <a href="index.jsp" class="logo">AI 食材识别</a>
        <ul>
            <li><a href="login.jsp">登录</a></li>
            <li><a href="register.jsp">注册</a></li>
            <li><a href="recipes.jsp">食谱推荐</a></li>
            <li><a href="favorites.jsp">我的收藏</a></li>
        </ul>
    </div>
</nav>

<!-- 首页主体内容 -->
<div class="main-content">
    <div class="welcome-section">
        <h1>欢迎来到 AI 食材识别平台！</h1>
        <p>通过 AI 技术识别您的食材，快速推荐美味食谱。</p>
    </div>

    <!-- 上传食材图片 -->
    <div class="upload-section">
        <h2>上传您的食材图片</h2>
        <form action="upload" method="POST" enctype="multipart/form-data">
            <input type="file" name="file" accept="image/*" required>
            <button type="submit">上传并识别食材</button>
        </form>
    </div>

    <!-- 食谱推荐 -->
    <div class="recipe-recommendations">
        <h2>根据食材推荐的食谱</h2>
        <div class="recipe-list">
            <div class="recipe-item">
                <img src="images/recipe1.jpg" alt="食谱1">
                <h3>西红柿炒蛋</h3>
                <p>简易家庭版，营养美味！</p>
            </div>
            <div class="recipe-item">
                <img src="images/recipe2.jpg" alt="食谱2">
                <h3>宫保鸡丁</h3>
                <p>经典川菜，香辣可口！</p>
            </div>
            <div class="recipe-item">
                <img src="images/recipe3.jpg" alt="食谱3">
                <h3>麻辣火锅</h3>
                <p>热腾腾的火锅，完美的聚餐选择！</p>
            </div>
        </div>
    </div>
</div>

<!-- 页脚 -->
<footer>
    <div class="container">
        <p>&copy; 2024 AI 食材识别与食谱推荐平台 | 联系我们</p>
    </div>
</footer>

<script src="js/scripts.js"></script>
</body>
</html>
