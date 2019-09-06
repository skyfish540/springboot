<%--
  Created by IntelliJ IDEA.
  User: D
  Date: 2019/9/2
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<center>
    <table border="2">
        <tr>
            <td>用户名</td>
            <td>登录名</td>
            <td>登录密码</td>
            <td>Emil</td>
            <td>删除</td>
            <td>修改</td>
        </tr>
        <c:if test="${not empty userList}">
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.uname}</td>
                    <td>${user.loginName}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/user/delete?userId=${user.userId}">删除</a>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/user/toUpdate?userId=${user.userId}">更新</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</center>

</body>
</html>


</body>
</html>
