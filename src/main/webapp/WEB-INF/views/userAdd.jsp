<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
  <title>添加会员</title>
  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>

</head>
<body>

<div class="pub-box login-box">
  <div class="login-tit f20">添加会员</div>
  <form action="/user/save" method="post">
    <div class="login-form" >
      <div class="cell">
        <input type="text" name="username" id="" class="text" placeholder="用户名">
      </div>
      <div class="cell">
        <input type="password" name="password" id="" class="text" placeholder="密码">
      </div>


      <div class="cell"> <input type="submit" href="javascript:;" class="button btn-0c0"></div>
    </div>
  </form>
</div>

</body>
</html>