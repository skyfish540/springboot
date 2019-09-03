<%--
  Created by IntelliJ IDEA.
  User: D
  Date: 2019/9/2
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>添加用户</h3>
    <h4>${msg}</h4>
    <form action="${pageContext.request.contextPath}/user/add" method="post">
        <table border="2">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="uname" id="uname"></td>
            </tr>
            <tr>
                <td>登录名</td>
                <td><input type="text" name="loginName" id="loginName"></td>
            </tr>

            <tr>
                <td>登录密码</td>
                <td><input type="password" name="password" id="password"></td>
            </tr>

            <tr>
                <td>Emil</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" id="btnAdd">
                </td>
            </tr>

        </table>
    </form>
</center>

</body>
</html>
