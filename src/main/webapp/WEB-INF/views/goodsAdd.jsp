<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>商品发布</title>
  <link rel="stylesheet" href="/css/style.css">
  <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
  <script type="text/javascript" src="/js/common.js"></script>
  <style>
    .error {
      color: #ff0000;
      font-weight: bold;
    }
  </style>
</head>
<body>
<div class="pub-box login-box">
  <div class="login-tit f20">电商工作平台发布</div>
  <form:form class="login-form" action="/goods/save" method="post" commandName="goods">
    <div class="cell">
      <p style="color: red">${error}</p>
      <form:errors path="goodsUrl" cssClass="error" />
      <form:input type="text" id="goods_url" path="goodsUrl" class="text" placeholder="商品淘宝链接" style="width:100%" />
      <input class="text" type="button" value="获取商品详情" onclick="getTaoItem($('#goods_url').val())">
    </div>
    <div class="cell">
      <form:errors path="goodsName" cssClass="error" />
      <form:input type="text" id="goods_name" path="goodsName" class="text" placeholder="商品名称" style="width:100%" />
    </div>
    <div class="cell">
      <form:errors path="goodsCost" cssClass="error" />
      <form:input type="text" id="goods_cost" path="goodsCost" class="text" placeholder="商品成品价" style="width:100%" />
    </div>
    <div class="cell">
      <form:errors path="goodsTbPrice" cssClass="error" />
      <form:input type="text" id="goods_tb_price" path="goodsTbPrice" class="text" placeholder="商品淘宝价格" style="width:100%" />
    </div>
    <div class="cell">
      <form:errors path="goodsCategory" cssClass="error"/>
      <form:input type="text" id="goods_category" path="goodsCategory" class="text" placeholder="商品分类" style="width:100%"/>
    </div>
    <div class="cell">
      <input type="submit" value="添加商品" class="button btn-e90"/>
    </div>
  </form:form>
</div>
<script type="text/javascript">
  regTaobaoUrl = /(.*\.?taobao.com(\/|$))|(.*\.?tmall.com(\/|$))/i;
  function getTaoItem(url){

    if(url==''){
      alert('网址不能为空！');
      return false;
    }
    if (!url.match(regTaobaoUrl)){
      alert('这不是一个淘宝网址！');
      return false;
    }
    var url='http://yl.jfbxfyl.cn/index.php?mod=app&act=goods&url='+encodeURIComponent(url)+'&callback=?';
    $.getJSON(url,function(data){
      if(data==null){
        alert('商品不存在或者没参加淘客');
        return false;
      }
      taobaokeItem=data;
      $('#goods_name').val(taobaokeItem.title);
      $('#goods_tb_price').val(taobaokeItem.discount_price);
    });

  }
</script>
</body>
</html>
