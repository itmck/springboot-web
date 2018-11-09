<%--
  Created by IntelliJ IDEA.
  User: 34745
  Date: 2018/10/18
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- load css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/loginMax.css">
</head>

<body>
<div id="main">
    <div id="content">
        <form action="${pageContext.request.contextPath}/shiro/login" method="post">
            <h4 id="theam">"Game live"登录</h4>
            <input type="text" name="username" placeholder="姓名"
                   style="border-bottom: 1px solid darkgray;"/><br/> <input
                type="password" name="password" placeholder="密码"
                style="border-bottom: 1px solid darkgray;"/><br/>
            <div id="btn_div" style="text-align: center;">
                <button class="btn" style="width: 100px; height: 40px;"
                        type="submit">登录
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
