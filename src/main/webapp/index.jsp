<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="/ssmshiro_war_exploded/js/jquery-1.4.2.js"></script>

<script>
    var urls = "/ssmshiro_war_exploded/restful";

    function subget() {
        $.ajax({
            type: "GET",
            url: urls,
            data: "id="+$("#id").val(),
            success: function (data) {
                alert(JSON.stringify(data));
            }
        });
    }

    function subpost() {
        $.ajax({
            type: "POST",
            url: urls,
            data: "rolename="+$("#rolename").val()+"&description="+$("#description").val(),
            success: function (data) {
                alert(JSON.stringify(data));
            }
        });
    }

    function subdelete() {
        $.ajax({
            type: "DELETE",
            url: urls+"?id="+$("#id").val(),
            success: function (data) {
                alert(JSON.stringify(data));
            }
        });
    }


</script>

<body>
<h2>Hello World!</h2>


<input value="get方式请求" type="button" onclick="subget()">
<input value="post方式请求" type="button" onclick="subpost()">
<input value="delete方式请求" type="button" onclick="subdelete()">
<hr>
id:<input id="id"><br>
角色名字:<input id="rolename"><br>
描述:<input id="description">


</body>
</html>
