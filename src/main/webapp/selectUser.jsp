<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/13
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="select" method="post">
        <c:forEach items="${user}" var="c">
            ${c.uid}
            ${c.uname}
            ${c.password}
        </c:forEach>
    </form>
</body>
</html>
