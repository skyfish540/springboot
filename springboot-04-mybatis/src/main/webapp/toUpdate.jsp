<%--
  Created by IntelliJ IDEA.
  User: D
  Date: 2019/9/3
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="/user/toUpdate" method="post">
        <table border="2">
            <tr>
                <td>用户名</td>
                <td>登录名</td>
                <td>登录密码</td>
                <td>Emil</td>
                <td>删除</td>
                <td>修改</td>
            </tr>
            <c:if test="${not empty user}">
                <c:forEach items="${user}" var="user">
                    <tr>
                        <td>${user.uname}</td>
                        <td>${user.loginName}</td>
                        <td>${user.password}</td>
                        <td>${user.email}</td>

                        <td><input type="submit" value="更新"></td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </form>
</center>
</body>
</html>
