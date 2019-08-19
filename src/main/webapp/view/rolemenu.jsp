<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/16/016
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path=request.getContextPath();%>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Title</title>
</head>
<body>
<table class="table table-striped">
    <tr>
        <td>角色名</td>
        <td>描述</td>
        <td>查询权限</td>
    </tr>
    <c:forEach items="${roleList}" var="v">
        <tr>
            <td>${v.rolename}</td>
            <td>${v.description}</td>
            <td><a href="<%=path%>/selpermis?roleid=${v.id}"/>查询</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
