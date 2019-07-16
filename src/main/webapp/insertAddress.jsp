<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/15
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="insertAddress" method="post">
        <input type="hidden" name="userid.id" value="${user.id}">
        <table>
            <tr>
                <td>联系人：</td>
                <td>
                    <input type="text" name="linkman" value="">
                </td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" value="0" name="sex" checked="checked">男
                    <input type="radio" value="1" name="sex">女
                </td>
            </tr>
            <tr>
                <td>手机号码：</td>
                <td>
                    <input type="text" name="phone" value="">
                </td>
            </tr>
            <tr>
                <td>门牌号：</td>
                <td>
                    <input type="text" name="housenum" value="">
                </td>
            </tr>
            <tr>
                <td>选择小区：</td>
                <td>
                    <select name="communityid.id">
                        <c:forEach items="${comm}" var="c">
                            <option value="${c.id}">${c.id}${c.communityname}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="添加地址">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
