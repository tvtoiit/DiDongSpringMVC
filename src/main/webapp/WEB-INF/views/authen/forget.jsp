<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/style.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/responsive.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/grid.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/toast.css"/>"/>
<link rel="stylesheet" href="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"/>" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
<title>Đổi mật khẩu</title>
</head>
<body>
<div class="main">
<form:form action="/ProjectSmartphoneMVC/authen/forget" method="POST" modelAttribute="userForget" class="form" id="form-1">
    <h3 class="heading">Đổi mật khẩu</h3>
    <div class="spacer"></div>
    <div style="color: red;text-align:center;">${status}</div>
    <div class="form-group">
        <label for="username" class="form-label">Nhập mật khẩu cũ: </label>
        <input name="oldPassword" required="true" type="password" minlength="6"  class="form-control"/>
        <span class="form-message"></span>
    </div>

    <div class="form-group">
        <label for="password" class="form-label">Nhập mật khẩu mới: </label>
         <form:input name="new_pass" required="true" type="password" minlength="6"  class="form-control" path="password"/>
        <span class="form-message"></span>
    </div>
    <div class="form-group">
        <label for="password" class="form-label">Nhập lại mật khẩu mới: </label>
       <input name="re_new_pass" required="true" type="password" minlength="6"  class="form-control"/>
        <span class="form-message"></span>
    </div>
    <div class="form-dangki c-12">
        <a href="<c:url value = "/trang-chu/"/>" class="form-dangki-link">Trang Chủ</a>
    </div>
    <button type="submit" class="form-submit">Đổi mật khẩu</button>
</form:form>
</div>
</body>
</html>