<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh_CN">
  <head>
    <meta charset="utf-8">
    <title>江理图书管理系统</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="图书馆管理系统">
    <meta name="author" content="都颜汗">

    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
    
    <script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
        .glyphicon-book:before{content:"\e043"}
    </style>

    <!-- Le jsp5 shim, for IE6-8 support of jsp5 elements -->
    <!--[if lt IE 9]>
      <script src="http://jsp5shim.googlecode.com/svn/trunk/jsp5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
    
    <div class="navbar">
        <div class="navbar-inner">
                <ul class="nav pull-right">
                    
                    <li><a href="#" class="hidden-phone visible-tablet visible-desktop" role="button">设置</a></li>
                    <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i>
                            	<c:if test="${admin != null }">
                            		${admin.admName }
                            	</c:if>
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">个人账户</a></li>
                            <li class="divider"></li>
                            <li><a tabindex="-1" class="visible-phone" href="#">设置</a></li>
                            <li class="divider visible-phone"></li>
                            <li><a tabindex="-1" href="${pageContext.request.contextPath }/LogoutServlet">退出登录</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand" href="${pageContext.request.contextPath }/IndexAdminServlet"><span class="first">江理图书馆</span> <span class="second">管理系统</span></a>
        </div>
    </div>
    


    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>





    <div class="sidebar-nav">
        <form class="search form-inline">
            <input type="text" placeholder="搜索...">
        </form>

        <a href="${pageContext.request.contextPath }/AllInfoAdminServlet" class="nav-header" ><i class="icon-home"></i>概览面板</a>

        <a href="#book-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-book"></i>图书管理<i class="icon-chevron-up"></i></a>
        <ul id="book-menu" class="nav nav-list collapse">
            <li ><a href="${pageContext.request.contextPath }/FindAllBooksAdminServlet">总览图书列表</a></li>
            <li ><a href="${pageContext.request.contextPath }/FindBookAdminServlet">查询删改图书</a></li>
            <li ><a href="${pageContext.request.contextPath }/AddBookAdminServlet">添加图书信息</a></li>
        </ul>

        <a href="#reader-menu" class="nav-header" data-toggle="collapse"><i class="icon-user"></i>读者管理<i class="icon-chevron-up"></i></a>
        <ul id="reader-menu" class="nav nav-list collapse in">
            <li><a href="${pageContext.request.contextPath }/FindAllUsersAdminServlet">总览读者列表</a></li>
            <li class="active"><a href="${pageContext.request.contextPath }/FindUserAdminServlet">查询删改读者</a></li>
            <li ><a href="${pageContext.request.contextPath }/AddUserAdminServlet">添加读者信息</a></li>
        </ul>

        <a href="#borrow-menu" class="nav-header collapsed" data-toggle="collapse"><i class="icon-retweet"></i>借阅管理<i class="icon-chevron-up"></i></a>
        <ul id="borrow-menu" class="nav nav-list collapse">
            <li ><a href="borrows_list.jsp">总览借阅列表</a></li>
            <li ><a href="rud_borrow.jsp">查询删改借阅</a></li>
            <li ><a href="add_borrow.jsp">添加借阅信息</a></li>
        </ul>

        <a href="reset-password.jsp" class="nav-header" ><i class="icon-edit"></i>重置密码</a>

    </div>
    

    
    <div class="content">
        
        <div class="header">
            
            <h1 class="page-title">查询删改读者</h1>
        </div>
        
        <ul class="breadcrumb">
            <li><a href="index.jsp">管理主页</a> <span class="divider">/</span></li>
            <li class="active">读者管理->查询删改读者
        </ul>

        <div class="container-fluid">
            <div class="row-fluid">
                    
<div class="btn-toolbar">
   <!--  <button class="btn btn-primary"><i class="icon-plus"></i> New User</button>
    <button class="btn">Import</button>
    <button class="btn">Export</button> -->
  <div style="height:10px;"></div>
  <form class="search form-inline" action="${pageContext.request.contextPath }/FindUserServlet" method="post">
     <input name="rdName" class="span12" placeholder="此处请填写读者姓名丨快速搜索读者..." type="text">
  </form>
  
</div>
<div class="well">
    <table class="table">
      <thead>
        <tr>
          <tr>
          <th>借书证号</th>
          <th>密码</th>
          <th>姓名</th>
          <th>性别</th>
          <th>手机号</th>
          <th>身份证号</th>
          <th>邮箱</th>
          <th>家庭住址</th>
          <th>办卡日期</th>
          <th style="width: 26px;">op</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${userList}" var="user" varStatus="st">
        
    		<form name="form" action="?" method="post">
        		<tr>
	    			<td><input name="rdCardId" type="hidden" value="${user.rdCardId }">${user.rdCardId }</td>
	    			<td><input name="rdPassword" type="hidden" value="${user.rdPassword }">${user.rdPassword }</td>
	    			<td><input name="rdName" type="hidden" value="${user.rdName }">${user.rdName }</td>
	    			<td><input name="rdSex" type="hidden" value="${user.rdSex }">${user.rdSex }</td>
	    			<td><input name="rdPhone" type="hidden" value="${user.rdPhone }">${user.rdPhone }</td>
	    			<td><input name="rdCardNo" type="hidden" value="${user.rdCardNo }">${user.rdCardNo }</td>
	    			<td><input name="rdEmail" type="hidden" value="${user.rdEmail }">${user.rdEmail }</td>
	    			<td><input name="rdAddr" type="hidden" value="${user.rdAddr }">${user.rdAddr }</td>
	    			<td><input name="rdCCdTime" type="hidden" value="${user.rdCCdTime }">${user.rdCCdTime }</td>
	    			<td>
	            		<a href="javascript:void(0)" onclick="transmit(${st.index})"><i class="icon-pencil"></i></a>
	           	    	<a href="javascript:void(0)" onclick="deleteUser(${st.index})" role="button" data-toggle="modal"><i class="icon-remove"></i></a>
	          		</td>
    			</tr>
    		</form>
    	
    	</c:forEach>
      </tbody>
    </table>
</div>

<!-- 下面这个div是用于删除时确认用户是否真正要删除的确认框 -->
<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">删除确认</h3>
    </div>
    <div class="modal-body">
        <p class="error-text"><i class="icon-warning-sign modal-icon"></i>确定删除这本书吗?</p>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
        <button class="btn btn-danger" data-dismiss="modal">删除</button>
    </div>
</div>


                    
                    <footer>
                        <hr>
                        
                        <p class="pull-right">Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                        

                        <p>&copy; 2012 <a href="#" target="_blank">Portnine</a></p>
                    </footer>
                    
            </div>
        </div>
    </div>
    


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    <script type="text/javascript">
    	function transmit(i){
    	document.getElementsByName("form")[i].action = "${pageContext.request.contextPath }/UpdateUserAdminServlet";
    		document.getElementsByName("form")[i].submit();
    	}
    	
    	function deleteUser(j){
    		document.getElementsByName("form")[j].action = "${pageContext.request.contextPath }/DeleteUserAdminServlet";
    		document.getElementsByName("form")[j].submit();
    	}
    </script>
    
  </body>
</html>


