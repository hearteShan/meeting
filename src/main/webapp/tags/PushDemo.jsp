<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="e" uri="org.topteam/easyui" %>

<e:templateOverride name="head">
    <e:resource location="static" name="jquery.atmosphere.js"/>
    <script>

        var org.topteam.push = new jeasyui.push('/org.topteam.push/count',function(message){
            var d = eval('(' + message + ')');
            if (d && d.data)
                $("#count").html(d.data);
        });
        function startCount() {
            push.push('{"data":1000}');
        }
    </script>
</e:templateOverride>

<e:templateOverride name="body">
    <div class="tag-info">
        <h1>Push Demo</h1>
        <p></p>

        <div class="property">
            <p>下面的数字由服务端推送而来</p>
            Count:
            <span id="count">0</span>
        </div>


    </div>
</e:templateOverride>

<e:templateOverride name="script">
    <script type="text/javascript">
        SyntaxHighlighter.all();
    </script>
</e:templateOverride>
<%@include file="../_TagsDemoTemplate.jsp" %>
