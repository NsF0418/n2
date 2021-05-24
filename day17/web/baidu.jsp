<%--
  Created by IntelliJ IDEA.
  User: NsF
  Date: 2021/5/19
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }

        #box {
            display: inline-block;
        }

        #search {
            width: 545px;
            height: 42px;
            border-color: #4E6EF2;
            border-top-left-radius: 10px;
            border-bottom-left-radius: 10px;
            float: left;
        }

        #btn {
            width: 108px;
            height: 42px;
            background-color: #4e6ef2;
            color: #fff;
            border: none;
            font-size: 17px;
            font-weight: 400;
            border-top-right-radius: 10px;
            border-bottom-right-radius: 10px;
            float: left;
        }

        #show {
            width: 545px;
            border: 1px solid #4e6ef2;
            position: relative;
            left: -55px;
            text-align: left;
        }
    </style>
    <script src="${pageContext.request.contextPath}/jQuery/jQuery%20v3.6.0min.js"></script>
</head>
<body>
<center>
    <img alt="" width="310" height="150" src="${pageContext.request.contextPath}"><br>
    <div id="box">
        <input id="search" type="text" name="search" onfocus="fun1(this.value)" onblur="fun2()">
        <button id="btn">百度一下</button>
    </div>
    <div id="show"></div>
</center>
</body>
<script>
    function fun1(value) {
        $.get("${pageContext.request.contextPath}/search",{"search":value},function (d) {
            $.each(d,function (index,user) {
                $("#show").append("<div>+user.name"+"</div>")

            })
        },"json")

    }
    function fun2() {
        $("#show").html("")
    }
</script>
</html>
