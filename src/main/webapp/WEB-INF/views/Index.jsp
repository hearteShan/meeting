<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/3/4
  Time: 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../front/layui/css/layui.css">
    <link rel="stylesheet" href="../../front/css/bootstrap.css">
    <style>
        .sec {
            width: 1390px;
            height: 85px;
            float: left;
        }

        。tri {
            width: 200px;
            height: 200px;
            float: left;
            background-color: greenyellow;
            border: 2px black solid;
            border-radius: 65%;

        }

        ul {
            width: 1280px;
            height: 75px;
            float: left;
            margin: auto;
            border: 2px black;
            align-content: center;
        }

        li {
            width: 320px;
            height: 70px;
            font-size: 30px;
            background: #fffbd7;
            border: 2px blue;
            float: left;
            align-content: center;
            padding: auto;
            margin: auto;
            line-height: 65px;
        }
    </style>
</head>
<body>
<nav class="nav"><%=request.getSession().getAttribute("username")%>,你好&nbsp<a href="/login">退出</a></nav>
<%
    String username = (String) request.getSession().getAttribute("username");
    String id = request.getParameter("id");
    out.println("Your name is: " + username + "<br>");
    out.println("Your id is: " + id);
%>
<div class="sec">
    <ul>
        <li><a onclick="edit(${id})">编辑个人信息</a></li>
        <li><a onclick="meetingsignlist(${id})">查看会议签到</a></li>
        <li><a onclick="meetinghistory(${id})">查看历史会议</a></li>
        <li><a onclick="signinlist(${id})">查看近期签到记录</a></li>
    </ul>
</div>

<div>
    <button onclick="signin(${id})" class="tri btn btn-danger">今日签到</button>
</div>


</body>
<script type="text/javascript" src="../../front/js/jquery.1.12.3.js"></script>
<script type="text/javascript" src="../../front/layui/layui.all.js"></script>
<script>

    function edit(id) {
        location = '/edituser?id=' + id;
    }
    function signinlist(id) {
        location='/signinList?id='+id
    }
function meetingsignlist(id) {
    location = '/meetingsign?id=' + id;
}
function meetinghistory(id) {
    location = '/meetinghis?id=' + id;
}
    function signin(id) {
        alert("1");
        jQuery.get('/signin?id='+id,function(r){
            alert("12")
            if(r.code==0){
                console.log(1);
                    alert("签到成功");
                alert(r.msg());
                console.log(r)
            }else{
                console.log(500);
                alert("签到失败");
                alert(r.msg())
            }
        })
    }

</script>
</html>
