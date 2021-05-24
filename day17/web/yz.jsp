<%--
  Created by IntelliJ IDEA.
  User: NsF
  Date: 2021/5/19
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/jQuery/jQuery%20v3.6.0min.js"></script>
</head>
<body>
    用户名：<input type="text" name="username" onblur="fun1(this.value)"><span id="s1"></span>
</body>
<script>
    function fun1(value) {
        $.ajax({
            url:"${pageContext.request.contextPath}/register",
            data:{"username":value},
            type:"post",
            success:function (d) {
                if(d==1){
                    $("#s1").html("<font color='red'>用户名已存在</font>")
                }else{
                    $("#s1").html("<font color='green'>√</font>")
                }
            }
        })
    }
</script>
</html>
