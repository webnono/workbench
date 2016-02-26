<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>权限管理</title>
  <link rel="stylesheet" href="css/style.css">
  <script type="text/javascript" src="js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="js/common.js"></script>

</head>
<body>
<div class="pub-box login-box">
  <div class="login-tit f20">权限管理</div>
  <form action="/resource/update" method="post">
    <div class="login-form" >
      <div class="cell">
        <input type="hiddent" name="resource_id" id="">
      </div>

      <div class="cell">
        <input type="text" name="resource_name" id="" class="text" placeholder="权限名称" required>
      </div>

      <div class="cell">
        <input type="text" name="resource_url" id="" class="text" placeholder="权限地址" required>
      </div>

      <div class="cell"> <input type="submit" href="javascript:;" class="button btn-0c0"></div>
    </div>
  </form>
</div>

</body>
</html>
