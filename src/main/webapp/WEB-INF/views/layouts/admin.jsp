<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- điều khiển hiển thị thẻ <title> -->
    <title><decorator:title default="Master-layout"/></title>
	<link rel="icon" type="image/png" href="<c:url value ="https://gokisoft.com/uploads/2021/03/s-568-ico-web.jpg"/>"/>

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value ="/assets/css/dashboard.css"/>"/>
	<link rel="stylesheet" href="<c:url value ="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.1/font/bootstrap-icons.css"/>"/>

	<!-- jQuery library -->
	<script src="<c:url value ="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"/>"></script>

	<!-- Popper JS -->
	<script src="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"/>"></script>
	<!-- Latest compiled JavaScript -->
	<script src="<c:url value ="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value ="https://cdn.ckeditor.com/4.16.2/standard/ckeditor.js"/>"></script>
	<script src="<c:url value ="/ckfinder/ckfinder.js"/>"></script>
	<script src="<c:url value ="https://code.jquery.com/jquery-3.6.0.js"/>" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
	<!-- chart -->
	<link rel="stylesheet" href="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css"/>"/>
	<script src="<c:url value ="https://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"/>"></script>
	<script src="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"/>"></script>
	<script src="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"/>"></script>
	<!-- Font Awesome -->
	<link rel="stylesheet" href="<c:url value ="/chart/plugins/fontawesome-free/css/all.min.css"/>">
	<!-- Ionicons -->
	<link rel="stylesheet" href="<c:url value ="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css"/>"/>
	<!-- Theme style -->
	<link rel="stylesheet" href="<c:url value ="/chart/dist/css/adminlte.min.css"/>"/>
	<script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js"/>"></script>
	
	<style> 
	.nav-item:nth-child(7) {
		background-color: #c1c1c1;
	}
	.khuyenmaisale_top {
        margin-top: 50px;
    }

    .check-time__sale {
        display: flex;
    }

    .check-time__salestop {
        margin-left: 50px;
    }

    .btnbutton-submit {
        margin-left: 30px;
    }
	.nav-item:nth-child(7) {
		background-color: #c1c1c1;
	}

	.container-fluid__content-top  {
      margin-top: 50px;
	}
	.column-month{
		margin-left: 20px;
		margin-top: 50px;
		font-family: cursive;
	}
	</style>
	
</head>
	<%@include file="/WEB-INF/views/layouts/admin/header.jsp" %>

	<decorator:body/>

<%@include file="/WEB-INF/views/layouts/admin/footer.jsp" %>
</html>