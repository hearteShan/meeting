<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/2/29
  Time: 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工登录</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../front/css/bootstrap.css">
    <link rel="stylesheet" href="../../front/css/bootstrap-grid.css">
    <style>
        #all{
            width: 100%;
            height: 700px;
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,darkgray), color-stop(100%,gray));
        }

        #sec{
            width: 99%;
            height:700px;
            align-content: center;
            text-align: center;
            vertical-align: center;
            padding: 100px 300px 100px 750px;
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,darkgray), color-stop(100%,gray));

        }
        #sss{
            background: #a8bcb0;
            align-content: center;
            height: 300px;
                    border: 2px black solid;
                 }

    </style>
</head>
<body>
<div id="all">
<div id="sec">
    <div id="sss">
        <br/>
        <br/>
    <div width="200" class="h1">用户登录</div>
    <form action="/loginin" method="post">
    <div><label></label></div>
    <div>
        <span><input type="text" name="id" class="input-group-lg" required="required" placeholder="用户id"/></span>
    </div>

    <div><label></label></div>
    <div>
        <span><input type="text" name="password" class="input-group-lg" required="required" placeholder="用户密码"/></span>
    </div>
    <span><br/></span>
    <div><input type="submit" value="登录" class="log_btn"/></div>
    </form></div>
</div>
</div>
</body>
<script type="text/javascript" src="../../front/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../../front/js/bootstrap.bundle.js"></script>
<script>
</script>
</html>
