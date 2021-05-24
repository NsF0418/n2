<%--
  Created by IntelliJ IDEA.
  User: NsF
  Date: 2021/5/19
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function testJsAjax() {
            var xmlhttp = new XMLHttpRequest();
            //test1.txt提交的地址
            xmlhttp.open("GET","jsAjax?name=liuyan",true);
            xmlhttp.send();
            xmlhttp.onreadystatechange = function () {
                if(xmlhttp.readyState==4&&xmlhttp.status==200){
                    var msg = xmlhttp.responseText;
                    document.getElementById("msg").innerText=msg;
                }
            }

        }
    </script>
</head>
<body>
    <div id = "msg"></div>
    <input type="button" name="btn" value="JS原生方式实现异步" onclick="testJsAjax()">
</body>
</html>
student