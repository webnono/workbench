<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>登陆页面</title>
  <style>
    .error {
      color: #ff0000;
      font-weight: bold;
    }
  </style>

  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>
</head>
<body>
<div class="login-box">
  <div class="login-tit f20">电商工作平台</div>
  <form:form class="login-form" action="login" method="post" commandName="user">

    <div class="cell">
      <p style="color: red">${error}</p>
      <form:input type="text" path="username" class="text" placeholder="用户名" style="width:100%" />
      <form:errors path="username" cssClass="error" />
    </div>
    <div class="cell">
      <form:input type="password" path="password" class="text" placeholder="密码" style="width:100%"/>
      <form:errors path="password" cssClass="error"/>
    </div>
    <div class="cell">
      <%--<a href="javascript:;" type="submit" class="button btn-e90">登陆</a>--%>
      <input type="submit" value="登陆" class="button btn-e90"/>
    </div>
  </form:form>
</div>
</body>
</html>

