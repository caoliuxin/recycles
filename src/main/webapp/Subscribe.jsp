<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/15
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="insertSubscribe" method="post">
        <input type="hidden" name="userid.id" value="${user.id}">
        <table>
            <tr>
                <td>选择地址:</td>
                <td>
                    <select name="addressid.id">
                        <c:forEach items="${address}" var="c">
                            <option value="${c.id}">${c.address}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>选择日期:</td>
                <td>
                    <input type="text" name="subdate">
                </td>
            </tr>
            <tr>
                <td>选择时间段:</td>
                <td>
                    <select name="subquantumdate.id">
                        <c:forEach items="${times}" var="c">
                            <option value="${c.id}">${c.slice}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>备注:</td>
                <td>
                    <input type="text" name="remark">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="预约">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
