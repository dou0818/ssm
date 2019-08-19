<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/16/016
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>

    <title>Title</title>
        <script>
            $(function(){
               var permisid='${string}'.split(',');
               for (var i=0;i<permisid.length;i++){
                   $("input[name='permisid'][value='" + permisid[i] + "']").attr("checked",
                       "checked");
               }
            });
        </script>
</head>
<body>
<form action="<%=path%>/uprope" method="post">
    <table class="table table-striped">
        <tr>
            <td><input type="checkbox" name="permisId"/></td>
            <td>权限类型</td>
            <td>权限名称</td>
        </tr>
        <c:forEach items="${permisList}" var="v">
            <tr>
                <td><input type="checkbox" name="permisid" value="${v.id}"/></td>
                <td>${v.permistitle}</td>
                <td>${v.permisname}</td>
            </tr>
        </c:forEach>

    </table>

    <button type="submit" class="btn btn-primary">提交修改</button>
</form>
</body>
</html>
