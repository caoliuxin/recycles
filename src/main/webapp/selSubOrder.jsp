<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-07-17
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center">
        <tr>
            <th>编号</th>
            <th>订单编号</th>
            <th>接单时间</th>
            <th>订单状态</th>
            <th>真实姓名</th>
            <th>电话</th>
        </tr>
        <c:forEach var="sub" items="${ maps}">
        <tr>
            <td>${sub.subscribeid}</td>
            <td>${sub.ordernum}</td>
            <td>${sub.createtime}</td>

            <td><c:if test="${sub.orderstate == 0 }">完成</c:if>
                <c:if test="${sub.orderstate == 1 }">.....</c:if>
                <c:if test="${sub.orderstate == 2 }">未完成</c:if>
            </td>
            <td>${sub.realname}</td>
            <td>${sub.phone}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
