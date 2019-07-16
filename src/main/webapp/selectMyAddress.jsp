<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/15
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="selectMyAddress" method="post">
        <a href="selectCommunity">添加地址</a>
        <table>
            <tr>
                <th>用户名称</th>
                <th>联系人</th>
                <th>性别</th>
                <th>电话号码</th>
                <th>门牌号</th>
                <th>小区名称</th>
            </tr>
            <c:forEach items="${myaddress}" var="c">
                <tr>
                    <td>${c.nickName}</td>
                    <td>${c.linkman}</td>
                    <td>
                        <c:if test="${c.sex==0}">
                            男
                        </c:if>
                        <c:if test="${c.sex==1}">
                            女
                        </c:if>
                    </td>
                    <td>${c.phone}</td>
                    <td>${c.housenum}</td>
                    <td>${c.communityname}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
