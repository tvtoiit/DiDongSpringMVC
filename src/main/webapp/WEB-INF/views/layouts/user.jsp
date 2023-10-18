<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- điều khiển hiển thị thẻ <title> -->
    <title><decorator:title default="Master-layout"/></title>
    
    <link rel="stylesheet" href="<c:url value ="/assets/css/base.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/css/main.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/css/grid.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/css/responsive.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/font/fontawesome-free-6.1.2-web/css/all.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/css/cart.css"/>"/>
    <link rel="stylesheet" href="<c:url value ="/assets/css/sale.css"/>"/>
	<script src = "<c:url value ="https://code.jquery.com/jquery-3.1.1.min.js"/>"></script>
	<!--<script src="comments_product/js/comments.js"></script>  -->
	
	
	<link rel="stylesheet" href="<c:url value ="/assets/css/chitiet.css"/>"/>
</head>
<%@include file="/WEB-INF/views/layouts/user/header.jsp" %>
	<decorator:body/>
	
	<decorator:getProperty property="page.script"></decorator:getProperty>

<%@include file="/WEB-INF/views/layouts/user/footer.jsp" %>
</html>

