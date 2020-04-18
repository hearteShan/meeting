<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/4/18
  Time: 5:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>历史会议</title>
    <link rel="stylesheet" href="../../front/layui/css/layui.css">
    <link rel="stylesheet" href="../../front/css/bootstrap.css">
</head>
<body>
<a href="javascript:history.go(-1);">向上一页</a>
<input id="id" type="text" name="id" value="<%=request.getAttribute("id")%>">
<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-card-body table-tool-mini">
            <table class="layui-table" id="tableUser" lay-filter="tableUser"></table>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../../front/layui/layui.js"></script>
<script>
    layui.use(['layer', 'table'], function () {
        var $ = layui.jquery;
        var layer = layui.layer;
        var table = layui.table;




        var id=$('#id').val();

        // 渲染表格
        var insTb = table.render({
            elem: '#tableUser',
            url: '/signinlist?id='+id,
            page:true,
            toolbar: true,
            cellMinWidth: 100,
            cols: [[
                {field: 'id', sort: true, title: 'id'},
                {field: 'datatime', sort: true, title: '签到时间'},
                {
                    field: 'departid', sort: true, title: '部门'}
            ]]
        });
    });


</script>
</html>

