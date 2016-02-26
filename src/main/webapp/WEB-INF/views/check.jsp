<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/2/26
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>检查完成</title>
</head>
<body>
  <span>一共有${totalCount}件商品参与检查</span> <br>
  <span> <a href="/goods/recycle">删除了${handledCount}件商品</a></span><br>
  <span><a href="/goods/list">回到首页</a></span><br>
</body>
</html>
