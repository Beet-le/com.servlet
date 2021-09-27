<%--
  Created by IntelliJ IDEA.
  User: Beetle
  Date: 2021/9/26
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Denglu</title>
</head>
<body>
<h1>登录</h1>
        <div style="text-align: center">
            <form action="${pageContext.request.contexPath}/login" method="pose">
                用户名：<input type="text" name="username"> <br>
                密 码：<input type="password" name="password"><br>
                <input type="checkbox" name="hobbys" value="A">

                <input type="checkbox" name="hobbys" value="B">

                <input type="checkbox" name="hobbys" value="C">

                <input type="submit" name="hobbys" value="D"><br>
                <input type="submit">
            </form>
        </div>
</body>
</html>
