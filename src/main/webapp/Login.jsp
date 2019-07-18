<%--
  Created by IntelliJ IDEA.
  User: 24188
  Date: 2019/7/15
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>

    <link rel="stylesheet" href="log/css/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="log/css/style.css">
    <script src="log/js/jquery.min.js"></script>
    <script src="log/js/index.js"></script>
</head>
<body>

<div class="materialContainer">
    <form method="post" action="/login">
    <div class="box">
        <div class="title">登录</div>
        <div class="input">
            <label for="name">用户名</label>
            <input type="text" name="name" id="name">
            <span class="spin"></span>
        </div>
        <div class="input">
            <label for="pass">密码</label>
            <input type="password" name="pass" id="pass">
            <span class="spin"></span>
        </div>
        <div class="button login">
            <button>
                <span>登录</span>
                <i class="fa fa-check"></i>
            </button>
        </div>
        <a href="Regist.jsp" class="pass-forgot">注册账号</a>
    </div>
    </form>
</div>
</body>
</html>
