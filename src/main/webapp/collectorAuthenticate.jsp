<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/16
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${checkAuth == null || checkAuth.isauthenticate == 2}">
    <c:if test="${checkAuth.isauthenticate == 2}">
        身份认证已被驳回， 请重新认证
    </c:if>
    <form action="upoladAuthenticate" method="post" enctype="multipart/form-data">
        <input type="hidden" name="userid.id" value="${user.id}">
        <table>
            <tr>
                <td>真实姓名：</td>
                <td>
                    <input type="text" name="realname">
                </td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>
                    <input type="radio" name="sex" value="0" checked="checked">男
                    <input type="radio" name="sex" value="1">女
                </td>
            </tr>
            <tr>
                <td>电话号码：</td>
                <td>
                    <input type="text" name="phone">
                </td>
            </tr>
            <tr>
                <td>真实照片：</td>
                <td>
                    <input type="file" name="file">
                </td>
            </tr>
            <tr>
                <td>常住地址：</td>
                <td>
                    <input type="text" name="permanentaddress">
                </td>
            </tr>
            <tr>
                <td>车辆类型：</td>
                <td>
                    <input type="text" name="cartype">
                </td>
            </tr>
            <tr>
                <td>紧急联系人：</td>
                <td>
                    <input type="text" name="contactman">
                </td>
            </tr>
            <tr>
                <td>身份证号码：</td>
                <td>
                    <input type="text" name="idcardnum">
                </td>
            </tr>
            <tr>
                <td>身份证正面：</td>
                <td>
                    <input type="file" name="file">
                </td>
            </tr>
            <tr>
                <td>身份证反面：</td>
                <td>
                    <input type="file" name="file">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="认证">
                </td>
            </tr>
        </table>
    </form>
</c:if>

<c:if test="${checkAuth != null}">
    <c:if test="${checkAuth.isauthenticate == 0}">
        已通过
    </c:if>
    <c:if test="${checkAuth.isauthenticate == 1}">
        审核中

    </c:if>
    <c:if test="${checkAuth.isauthenticate == 3}">
        被封号
    </c:if>
</c:if>
</body>
</html>
