<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>电商工作平台</title>
    <link rel="stylesheet" href="/css/style.css">
    <script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
    <script type="text/javascript" src="/js/common.js"></script>
</head>
<body>
<!--2015.5.6主界面-->
<form action="" id="mainForm" method="post">
    <div class="tabbox ma">

        <div>
            <!--nav-->
            <div class="nav">
                <div class="sheep"></div>
                <div class="nav-li">
                    <ul>
                        <li><i></i><a href="user_list?method=findAll&pageNo=1">会员管理</a></li>
                        <li class="active"><i></i><a href="goods_list?method=findAll&pageNo=1">商品管理</a></li>
                        <li><i></i><a href="shop_list?method=findAll&pageNo=1">商家管理</a></li>
                        <li><i></i><a href="javascript:;">订单管理</a></li>
                        <li><i></i><a href="javascript:;">业务员信息</a></li>
                        <li><i></i><a href="authority_list?method=findAll&pageNo=1">管理员权限</a></li>
                        <li><i></i><a href="goods_list?method=findRecycle&pageNo=1">商品回收站</a></li>
                    </ul>
                </div>
                <div class="jf-f"></div>
            </div>
            <!--end nav-->
            <!--header-->
            <div class="header clearfix">
                <h1 class="logo fl">
                    <a href=""><img src="/images/logo.png"></a>
                </h1>

                <div class="usermess fr clearfix">
                    <div class="out">你今日上传商品<span style="color:red;"></span>件</div>
                    <div class="out"><a href="/charts/getPersonData.html">历史统计</a></div>
                    <div class="out"><a href="/logout" class="red">[退出]</a></div>
                    <div class="edit-password"><a href="update_password.jsp" class="link">修改密码</a></div>
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
                        <input type="text" class="text" id="select-user" placeholder="上传人的姓名">
                    </div>
                    <div class="search-item">
                        <input type="text" class="text" id="select-goods" placeholder="按商品名搜索">
                    </div>
                    <div class="search-item">
                        <input type="text" class="text" placeholder="联系电话">
                    </div>
                    <div class="search-item searchbtn-box">
                        <input type="button" class="button btn-0c0" value="搜索">
                    </div>
                </div>
                <!--end 搜索-->
                <table class="table">
                    <thead>
                    <tr>
                        <th style="width:30px">&nbsp;</th>
                        <th>商品ID</th>
                        <th class="toe">商品名称</th>
                        <th class="toe">地址链接</th>
                        <th>成本价</th>
                        <th>淘宝价格</th>
                        <th>是否已领取</th>
                        <th>分类</th>
                        <th>领取时间</th>
                        <th>商品状态</th>
                        <th>检查下架</th>
                    </tr>
                    </thead>
                    <tbody class="c666">
                    <c:forEach items="${pageData.getDataList()}" var="goods">
                        <tr>
                            <td><input name="goods_id" value="${goods.goodsId}" type="checkbox"></td>
                            <td>${goods.goodsId}</td>
                            <td>
                                <div class="toe">${goods.goodsName}</div>
                            </td>
                            <td>
                                <div class="toe"><a class="link" target="_blank" href="${goods.goodsUrl}">淘宝网</a></div>
                            </td>
                            <td>${goods.goodsCost}元</td>
                            <td>${goods.goodsTbPrice}元</td>
                            <c:if test="${goods.goodsStatus}">
                                <td><a id="goods_uploader" class="btn-rec f12" href="#">${goods.goodsUploader}</a></td>
                            </c:if>
                            <c:if test="${!goods.goodsStatus}">
                                <td><a id="goods_uploader" class="btn-rec f12"
                                       href="/goods/claim?pageNo=${pageData.pageNo}&goodsUploader=<shiro:principal/>&goodsId=${goods.goodsId}">领取</a>
                                </td>
                            </c:if>
                            <td>${goods.goodsCategory}</td>
                            <td class="get-time">${goods.goodsDeletetime}</td>
                            <td>
                                <div class="e-box pr">
                                    <span class="price">1</span><a href="javascript:;" class="db-click">修改</a>
                                </div>
                            </td>
                            <td><a id='${goods.goodsId}' class="cfather fwb f12"
                                   href="javascript:getTaoItem('${goods.goodsUrl}');">检查</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <!--分页-->

                <div class="page">
                    <a class="page-link" href="/goods/list?pageNo=1">首页</a>
                    <c:if test="${pageData.hasPreviousPage}">
                        <a class="page-link" href="/goods/list?pageNo=${pageData.prePage}">前一页</a>
                    </c:if>
                    <c:forEach items="${pageData.getNavigatePageNums()}" var="nav">
                        <c:if test="${nav == pageData.pageNo}">
                            <a class="page-link" class="page-link" style="font-weight: bold;">${nav}</a>
                        </c:if>
                        <c:if test="${nav != pageData.pageNo}">
                            <a class="page-link" href="/goods/list?pageNo=${nav}">${nav}</a>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageData.hasNextPage}">
                        <td>
                            <a href="/goods/list?pageNo=${pageData.nextPage}">下一页</a>
                        </td>
                    </c:if>
                    <a class="page-link" href="/goods/list?pageNo=${pageData.totalPages}">末页</a>
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
                        <a class="btn-del" href="goods_list?method=findGoodsUrl">查找已经下架的商品</a>
                        <a href="task_publish.jsp"><input type="button" value="添加" class="btn-add"></a>
                        <a id="del-goods" href="javascript:deleteBatch();"> <input type="button" value="删除"
                                                                                   class="btn-del"></a>

                        <a href="javascript:modify();"><input type="button" value="修改" class="btn-edit"></a>
                        <input type="button" value="刷新" class="btn-ref">
                        <a href="javascript:;"><input type="button" value="导出" class="btn-exp"></a>
                    </div>
                </div>
                <!--end 操作列表-->
            </div>
            <!--end 列表-->
            <!--6.24花瓣界面-->
            <img src="/images/flower/5.png" class="flower-img5" style="left:65%;top:33px">
            <!--end 6.24花瓣界面-->
        </div>
    </div>
    <!--end 2015.5.6主界面-->
</form>
</body>
</html>
