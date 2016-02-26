<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>电商工作平台</title>
  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>


</head>
<body>
<!--2015.5.6主界面-->
<span color="red">${error}</span>
<form action="" id="mainForm" method="post">
  <div class="tabbox ma">
    <div>
      <!--nav-->
      <div class="nav">
        <div class="sheep"></div>
        <div class="nav-li">
          <ul>
            <li class="active"><i></i><a href="/user/list">会员管理</a></li>
            <li><i></i><a href="/goods/list">商品管理</a></li>
            <li><i></i><a href="javascript:;">商家管理</a></li>
            <li><i></i><a href="javascript:;">订单管理</a></li>
            <li><i></i><a href="javascript:;">业务员信息</a></li>
            <li><i></i><a href="/resource/list">资源权限管理</a></li>
            <li><i></i><a href="/goods/recycle">商品回收站</a></li>
          </ul>
        </div>
        <div class="jf-f"></div>
      </div>
      <!--end nav-->
      <!--header-->
      <div class="header clearfix">
        <h1 class="logo fl">
          <a href=""><img src="images/logo.png"></a>
        </h1>
        <div class="usermess fr clearfix">
          <div class="out"><a href="logout" class="red">[退出]</a></div>
          <div class="edit-password"><a href="resetPassword.jsp" class="link">修改密码</a></div>
          <div class="username cfff">当前用户：<span class="cfff"><shiro:principal/></span></div>
          <div class="edit-password"><a href="login.jsp" class="link">重新登录</a></div>
        </div>
      </div>
      <!--end header-->
      <!--列表-->



      <div class="main-table">
        <!--搜索-->
        <div class="searchbox clearfix">
          <div class="search-item">
            <input type="text" class="text" id="select-time" placeholder="时间"  value="" onchange="newtime()">
          </div>
          <div class="search-item">
            <input type="text" class="text" placeholder="商家名称">
          </div>
          <div class="search-item">
            <input type="text" class="text" placeholder="联系电话">
          </div>
          <div class="search-item searchbtn-box">
            <input type="button" class="button btn-0c0" value="搜索" >
          </div>
        </div>
        <!--end 搜索-->
        <table class="table">
          <thead>
          <tr>
            <th style="width:30px">&nbsp;</th >
            <th>业务员编号</th>
            <th class="toe">用户名</th>
            <th>权限</th>
            <th class="toe">密码</th>
          </tr>
          </thead>
          <tbody class="c666">
          <c:forEach items="${pageData.getDataList()}" var="user">
            <tr>

            <td><input type="checkbox"  name="id" value="${user.id}" ></td>
            <td>${user.id}</td>
            <td><div class="toe">${user.username}</div></td>
            <td><div class="toe"><a class="link" href="user_list?method=findUrl&pageNo=1&username=${user.username}">编辑权限</a></div></td>
            <td><div class="toe"><a class="link" href="/user/resetPassword?id=${user.id}">修改密码</a></div></td>

          </tr>
          </c:forEach>

          </tbody>
        </table>
        <!--分页-->

        <div class="page">
          <a class="page-link" href="/user/list?pageNo=1">首页</a>
          <c:if test="${pageData.hasPreviousPage}">
            <a class="page-link" href="/user/list?pageNo=${pageData.prePage}">前一页</a>
          </c:if>
          <c:forEach items="${pageData.getNavigatePageNums()}" var="nav">
            <c:if test="${nav == pageData.pageNo}">
              <a class="page-link" class="page-link" style="font-weight: bold;">${nav}</a>
            </c:if>
            <c:if test="${nav != pageData.pageNo}">
              <a class="page-link" href="/user/list?pageNo=${nav}">${nav}</a>
            </c:if>
          </c:forEach>
          <c:if test="${pageData.hasNextPage}">
            <td>
              <a href="/user/list?pageNo=${pageData.nextPage}">下一页</a>
            </td>
          </c:if>
          <a class="page-link" href="/user/list?pageNo=${pageData.totalPages}">末页</a>
        </div>

        <!--end 分页-->
        <!--操作列表-->
        <div class="editbox clearfix">
          <div class="fl">
            <input type="button" id="allselect" value="全选" class="btn-select">
            <input type="button" id="invert" value="返选" class="btn-select">
            <input type="button" id="cancel" value="取消" class="btn-select">
          </div>
          <div class="fr">
            <a  href="/user/save"><input type="button" value="添加新用户" class="btn-add"></a>
            <a id="del-goods" href="javascript:deleteBatch();"> <input type="button" value="删除" class="btn-del"></a>
            <input type="button" value="刷新" class="btn-ref">
            <a href="shop_list?method=excelExport"><input type="button" value="导出" class="btn-exp"></a>
          </div>
        </div>
        <!--end 操作列表-->
      </div>
      <!--end 列表-->
      <img src="/images/flower/5.png" class="flower-img5" style="left:65%;top:33px">
      <%--<img src="images/flower/2.png" class="flower-img2" style="top:49%;left:-120px">--%>
      <%--<img src="images/flower/6.png" class="flower-img6" style="right:-43px;top:575px">--%>
    </div>
  </div>
  <!--end 2015.5.6主界面-->
</form>


<!-- ajax联动效果-->
<script>
  function newtime(){
    //jquery获取文本框的值
    var time1 = $("#select-time").attr("value");
  }
  function deleteBatch(){
    $("#mainForm").attr("action","/user/delete?pageNo="+${pageData.pageNo});
    $("#mainForm").submit();
  }
</script>

</body>

</html>