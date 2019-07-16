<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/15
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="selectSubscribe" method="post">
        <a href="selectTime">我要预约</a>
        <a href="selectMyAddress">查看我的地址</a>
        <a href="checkAuthenticate">回收员身份认证</a>
        <a href="selectOrders">订单大厅</a>
        <a href="selectHistoryOrders">历史订单</a>
        <table>
            <tr>
                <th>用户名称</th>
                <th>地址名称</th>
                <th>预约日期</th>
                <th>预约时间段</th>
                <th>订单状态</th>
            </tr>
            <c:forEach items="${sub}" var="c">
                <tr>
                    <td>${c.nickName}</td>
                    <td>${c.address}</td>
                    <td>
                        <fmt:formatDate value="${c.subdate}" pattern="yyyy-MM-dd" />
                    </td>
                    <td>${c.slice}</td>
                    <td>
                        <c:if test="${c.orderstate==0}">
                            未派单
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
