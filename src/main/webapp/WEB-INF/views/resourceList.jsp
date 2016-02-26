<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>权限列表</title>
  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>
  <script type="text/javascript" src="/js/shop_list/shop_list.js"></script>
  <script type="text/javascript" src="/js/authority_list.js"></script>


</head>
<body>
<!--2015.5.6涓荤晫闈�-->
<form action="" id="mainForm" method="post">
  <div class="tabbox ma">
    <div>
      <!--nav-->
      <div class="nav">
        <div class="sheep"></div>
        <div class="nav-li">
          <ul>
            <li><i></i><a href="/user/list">会员管理</a></li>
            <li><i></i><a href="/goods/list">商品管理</a></li>
            <li><i></i><a href="javascript:;">商家管理</a></li>
            <li><i></i><a href="javascript:;">订单管理</a></li>
            <li><i></i><a href="javascript:;">业务员信息</a></li>
            <li class="active"><i></i><a href="/resource/list">资源权限管理</a></li>
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
      <!--鍒楄〃-->



      <div class="main-table">
        <!--搜索-->
        <div class="searchbox clearfix">
          <div class="search-item">
            <input type="text" class="text" id="goods-uploader" placeholder="上传人的姓名" value="${uploader}">
          </div>
          <div class="search-item">
            <input type="text" class="text" id="goods-name" placeholder="按商品名搜索" value="${nameGoods}">
          </div>
          <div class="search-item">
            <input type="text" class="text" placeholder="联系电话">
          </div>
          <div class="search-item searchbtn-box">
            <input type="button" onclick="search()" class="button btn-0c0" value="搜索">
          </div>
        </div>
        <!--end 搜索-->
        <table class="table">
          <thead>
          <tr>
            <th style="width:30px">&nbsp;</th >
            <th class="toe">资源权限管理</th>
          </tr>
          </thead>
          <tbody class="c666">
          <input type="hidden" name="authority_url" value="1"/>
          <c:forEach items="${authorityList}" var="authority">

              <c:if test="${authority_url.contains(authority.authority_url)}">
                <tr>
                <td><input type="checkbox" checked name="authority_url" value="${authority.authority_url}" ></td>
                <td><div class="toe">${authority.display_name}</div></td>
                <input type="hidden" name="username" value="${username}"/>
                </tr>
              </c:if>
            <c:if test="${!(authority_url.contains(authority.authority_url))}">
              <tr>
                <td><input type="checkbox"  name="authority_url" value="${authority.authority_url}" ></td>
                <td><div class="toe">${authority.display_name}</div></td>
                <input type="hidden" name="username" value="${username}"/>
              </tr>
            </c:if>

          </c:forEach>
          </tbody>
        </table>
        <!--分页-->
        <div class="page">
          <a class="page-link" href="/resource/list?pageNo=1">首页</a>
          <c:if test="${pageData.hasPreviousPage}">
            <a class="page-link" href="/resource/list?pageNo=${pageData.prePage}&goodsUploader=${uploader}&goodsName=${nameGoods}">前一页</a>
          </c:if>
          <c:forEach items="${pageData.getNavigatePageNums()}" var="nav">
            <c:if test="${nav == pageData.pageNo}">
              <a class="page-link" class="page-link" style="font-weight: bold;">${nav}</a>
            </c:if>
            <c:if test="${nav != pageData.pageNo}">
              <a class="page-link" href="/resource/list?pageNo=${nav}&goodsUploader=${uploader}&goodsName=${nameGoods}">${nav}</a>
            </c:if>
          </c:forEach>
          <c:if test="${pageData.hasNextPage}">
            <td>
              <a href="/resource/list?pageNo=${pageData.nextPage}&goodsUploader=${uploader}&goodsName=${nameGoods}">下一页</a>
            </td>
          </c:if>
          <a class="page-link" href="/resource/list?pageNo=${pageData.totalPages}&goodsUploader=${uploader}&goodsName=${nameGoods}">末页</a>
        </div>
        <!--end 分页〉-->
        <!--操作列表〃-->
        <div class="editbox clearfix">
          <div class="fl">
            <input type="button" id="allselect" value="全选" class="btn-select">
            <input type="button" id="invert" value="返选" class="btn-select">
            <input type="button" id="cancel" value="取消" class="btn-select">
          </div>
          <div class="fr">
            <%--<a class="btn-del" href="goods_list?method=findGoodsUrl">查找已经下架的商品</a>--%>
            <%--<a href="/goods/save"><input type="button" value="添加" class="btn-add"></a>--%>
            <a id="del-goods" href="javascript:revert();"> <input type="button" value="撤销删除"
                                                                  class="btn-del"></a>

            <a href="javascript:modify();"><input type="button" value="修改" class="btn-edit"></a>
            <input type="button" value="刷新" class="btn-ref">
            <a href="javascript:;"><input type="button" value="导出" class="btn-exp"></a>
          </div>
        </div>
        <!--end 操作列表〃-->
      </div>
      <!--end 鍒楄〃-->
      <!--6.24图片-->
      <img src="/images/flower/5.png" class="flower-img5" style="left:65%;top:33px">
      <img src="/images/flower/2.png" class="flower-img2" style="top:49%;left:-120px">
      <img src="/images/flower/6.png" class="flower-img6" style="right:-43px;top:575px">
      <!--<img src="images/flower/4.png" class="flower-img4">-->
      <%--<img src="images/m.png" style="top:17px;left:-210px; z-index:-1; opacity:.3">--%>
      <!--end 6.图片-->
    </div>
  </div>
  <!--end 2015.5.6涓荤晫闈�-->
</form>



<script>
  function newtime(){

    var time1 = $("#select-time").attr("value");
  }
</script>

</body>

</html>