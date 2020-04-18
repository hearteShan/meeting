<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/3/9
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑个人信息</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../front/layui/css/layui.css">
    <link rel="stylesheet" href="../../front/css/bootstrap.css">
    <style>
        .fri {
            width: 300px;
            height: 300px;
            float: left;
        }
    </style>
</head>
<body>
    <a href="javascript:history.go(-1);">向上一页</a>
    <form method="post">
        <table class="table">
            <tr>
                <td>员工id:</td>
                <td><input name="id" type="text" value="${user.id}" readonly/></td>
            </tr>
            <tr>
                <td>员工姓名:</td>
                <td><input name="username" type="text" value="${user.username}"/></td>
            </tr>
            <tr>
                <td>员工性别:</td>
                <td><input name="gender" type="text" value="${user.gender}"/></td>
            </tr>
            <tr>
                <td>员工部门id:</td>
                <td><input name="departid" type="text" value="${user.departid}"></td>
            </tr>
            <tr>
                <td>员工邮箱:</td>
                <td><input name="email" type="text" value="${user.email}"></td>
            </tr>
            <tr>
                <td>员工电话:</td>
                <td><input name="tel" type="text" value="${user.tel}"></td>
            </tr>
            <td><input type="button" value="提交" class="log_btn" onclick="sub()"/></td>
        </table>

    </form>
</div>
</body>
<script type="text/javascript" src="../../front/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../../front/js/bootstrap.bundle.js"></script>
<script type="text/javascript" src="../../front/layui/layui.all.js"></script>
<script>
    function sub() {
        $.get('/edit',$('form').serialize(),function (r) {
            if(r.code==0){
                alert("修改成功");
                location.reload()
            }
        })
    }
</script>
</html>
