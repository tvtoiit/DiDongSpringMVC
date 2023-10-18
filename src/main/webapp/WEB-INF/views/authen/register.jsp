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

<title>Đăng kí</title>
</head>
<body>
    <div class="main">
        <form:form action="/ProjectSmartphoneMVC/authen/register" method="POST" modelAttribute="userRegister" class="form" id="form-1">
          <h3 class="heading">Đăng kí tài khoản</h3>
          <div class="spacer"></div>
          <div style="color: red;text-align:center;">${status}</div>
          <div class="form-group">
            <label for="fullname" class="form-label">Họ và tên</label>
            <form:input id="fullname" name="fullname" required="true" type="text" placeholder="VD: trantoi" class="form-control" path="fullname"/>
            <span class="form-message"></span>
          </div>
      
          <div class="form-group">
            <label for="email" class="form-label">Email</label>
            <form:input id="email" name="email" required="true" type="email" placeholder="VD: email@domain.com" class="form-control" path="email"/>
            <span class="form-message"></span>
          </div>

          <div class="form-group">
            <label for="username" class="form-label">Tên tài khoản: </label>
            <form:input id="userName" name="userName" required="true" type="text"  placeholder="Nhập tên tài khoản" class="form-control" path="userName"/>
            <span class="form-message"></span>
          </div>
      
          <div class="form-group">
            <label for="password" class="form-label">Mật khẩu</label>
            <form:input id="password" name="password" required="true" type="password" minlength="6" placeholder="Nhập mật khẩu" class="form-control" path="password"/>
            <span class="form-message"></span>
          </div>
      
          <div class="form-group">
            <label for="password_confirmation" class="form-label">Nhập lại mật khẩu</label>
            <input id="password_confirmation" name="password_confirmation" placeholder="Nhập lại mật khẩu" minlength="6" required="true" type="password" class="form-control"/>
            <span class="form-message"></span>
          </div>
          <div class="form-dangki">
        		<a href="<c:url value="/authen/login/index.php"/>" class="form-dangki-link">Đăng nhập tài khoản</a>
    		</div>
          <button class="form-submit" type="submit">Đăng ký</button>
        </form:form>
      </div>
</body>
</html>