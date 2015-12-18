<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>电商工作平台</title>
<link rel="stylesheet" href="/css/style.css">
<script type="text/javascript" src="/js/jquery.1.8.2.js"></script>
<script type="text/javascript" src="/js/common.js"></script>

</head>
<body>
    <!--2015.5.6主界面-->
    <div class="tabbox ma">
        <div>
        	<!--nav-->
        	<div class="nav">
            	<div class="sheep"></div>
                <div class="nav-li">
                    <ul>
                        <li class="active"><i></i><a href="javascript:;">会员管理</a></li>
                        <li><i></i><a href="javascript:;">商品管理</a></li>
                        <shiro:hasPermission name="user:create">
                            <li><i></i><a href="javascript:;">订单管理</a></li>
                        </shiro:hasPermission>
                        <li><i></i><a href="javascript:;">业务员信息</a></li>
                        <li><i></i><a href="javascript:;">管理员权限</a></li>
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
                    <div class="out"><a href="/logout" class="red">[退出]</a></div>
                    <div class="edit-password"><a href="" class="link">修改密码</a></div>
                    <div class="username cfff">当前用户：<span class="cfff"><shiro:principal/></span></div>
                </div>
            </div>
            <!--end header-->
            <!--列表-->
            <div class="main-table">
            	<!--搜索-->
                <div class="searchbox clearfix">
                	<div class="search-item">
                    	<input type="text" class="text" placeholder="商家编号">
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
                      <th style="width:30px">&nbsp;</th>
                      <th class="toe">商品名称</th>
                      <th class="toe">地址链接</th>
                      <th>成本价</th>
                      <th>状态</th>
                      <th>修改价格</th>
                    </tr>
                  </thead>
                  <tbody class="c666">
                    <tr>
                      <td>
                      	<input type="checkbox"/>
                      </td>
                      <td><div class="toe">茧子</div></td>
                      <td><div class="toe"><a class="link" href="">淘宝网</a></div></td>
                      <td>25元</td>
                      <td><a class="btn-rec f12" href="#">领取</a></td>
                      <td>
                      	<div class="e-box pr" id="1">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td><a href="javascript:;" class=" cfather">检测</a></td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                     <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                     <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                     <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                    <tr>
                      <td><input type="checkbox"></td>
                      <td><div class="toe">grfdgfd</div></td>
                      <td><div class="toe"><a class="link" href="" target="_blank">淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网淘宝网</a></div></td>
                      <td>4544445</td>
                      <td>已领：<span class="cfather">张晶晶</span><span class="caa ml10 f12">2015.1.1</span></td>
                      <td>
                      	<div class="e-box pr" id="2">
                        	<span class="price">3</span><a href="javascript:;" class="db-click">修改</a>
                        </div>
                      </td>
                    </tr>
                  </tbody>
                </table>
                <!--分页-->
                <div class="page">
                	<a href="javascript:;">第一页</a>
                    <a href="javascript:;" class=" active">1</a>
                    <a href="javascript:;">2</a>
                    <a href="javascript:;">最后一页</a>
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
                        <input type="button" value="添加" class="btn-add">
                        <input type="button" value="删除" class="btn-del">
                        <input type="button" value="修改" class="btn-edit">
                        <input type="button" value="刷新" class="btn-ref">
                        <input type="button" value="导出" class="btn-exp">
                    </div>
                </div>
                <!--end 操作列表-->
            </div>
            <!--end 列表-->
            <!--6.24花瓣界面-->
            <img src="images/flower/5.png" class="flower-img5" style="left:65%;top:33px; z-index:10">
    		<!--end 6.24花瓣界面-->
        </div>
    </div>
</body>
</html>