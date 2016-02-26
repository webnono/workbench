<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>修改密码</title>
  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>

</head>
<body>

<div class="pub-box login-box">
  <div class="login-tit f20">重置密码</div>
  <form action="/user/resetPassword" method="post">
    <div class="login-form" >
      <div class="cell">
        <input type="hidden" name="id" id="" class="text" value="${id}">
      </div>
      <div class="cell">
        <input type="password" name="new_password" id="" class="text" placeholder="输入新密码">
      </div>
      <div class="cell">
        <input type="password" name="new_password1" id="" class="text" placeholder="确认新密码">
      </div>


      <div class="cell"> <input type="submit" href="javascript:;" class="button btn-0c0" value="确认修改"></div>
    </div>
  </form>
</div>

</body>
</html>