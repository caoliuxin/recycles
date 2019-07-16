<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/16
  Time: 17:07
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
    <form action="selectHistoryOrders" method="post">
        <input type="hidden" name="userid.id" value="${user.id}">
        <table>
            <tr>
                <th>预约人</th>
                <th>回收员</th>
                <th>订单编号</th>
                <th>接单时间</th>
                <th>订单状态</th>
            </tr>
            <c:forEach items="${historyOrder}" var="c">
                <tr>
                    <td>${c.subscribeid}</td>
                    <td>${c.collectorid}</td>
                    <td>${c.ordernum}</td>
                    <td>
                        <fmt:formatDate value="${c.createtime}" pattern="yyyy-MM-dd" />
                    </td>
                    <td>
                        <c:if test="${c.orderstate==0}">
                            已完成
                        </c:if>
                        <c:if test="${c.orderstate==1}">
                            已取消
                        </c:if>
                        <c:if test="${c.orderstate==2}">
                            未完成
                        </c:if>
                        <c:if test="${c.orderstate==3}">
                            已待取消
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
