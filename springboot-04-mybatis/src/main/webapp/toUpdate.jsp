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
    <h2>用户信息修改</h2>
    <form action="${pageContext.request.contextPath}/user/update" method="post">
        <table border="2">
            <tr>
                <td>
                    <input type="hidden" name="userId" value="${user.userId}">
                </td>
            </tr>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="uname" value="${user.uname}">
                </td>
            </tr>
            <tr>
                <td>登录名</td>
                <td>
                    <input type="text" name="loginName" value="${user.loginName}">
                </td>
            </tr>
            <tr>
                <td>登录密码</td>
                <td>
                    <input type="text" readonly name="password" value="${user.password}">
                </td>
            </tr>
            <tr>
                <td>Emil</td>
                <td>
                    <input type="text" name="email" value="${user.email}">
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="更新">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
