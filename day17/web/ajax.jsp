<%--
  Created by IntelliJ IDEA.
  User: NsF
  Date: 2021/5/21
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/jQuery/jQuery%20v3.6.0min.js"></script>
</head>
<body>
    <button type="button" name="search" onclick="fun5(this.value)" id = "btn">获取学生姓名</button>
</body>
<script>
    function fun5(value) {
        $.ajax({
            url:"${pageContext.request.contextPath}/dragonball",
            data:{"search":value},
            type:"post",
            async:true,
            dataType:"text",
        })
    }
</script>
</html>
