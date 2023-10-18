<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lí người dùng</title>
</head>
<body>
<div class="row">
	<div class="col-md-12" style="margin: 30px 0;">
		<h3>sửa người dùng</h3>
        <div class="panel panel-primary">
            <div class="panel-body">
            <c:forEach var ="item" items ="${userView }">
            	<form:form action="/ProjectSmartphoneMVC/admin/user/editor?id=${item.id }" method="POST" modelAttribute="user" >
                	<div style="color: red;text-align:center;">${status}</div>
					<div class="form-group" style="display:none;">
						<input type="number" name="id" value=""></input>
					</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">tên khách khàng:</label>
                        <form:input type="text" required="true" class="form-control" name="NameOfUser" path="fullname" placeholder="Nhập tên khách hàng" value="${item.fullname }"/>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Email:</label>
                        <form:input type="email" required="true" class="form-control" name="email" path="email" placeholder="Nhập email" value="${item.email }"/>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Địa chỉ:</label>
                        <form:input type="text" class="form-control" name="Address" path="address" value="${item.address }"/>
                    </div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Số điện thoại:</label>
                        <form:input type="text" class="form-control" name="Sdt" path="phone_number" value="${item.phone_number }"/>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Vai Trò:</label>
                        <c:if test="${item.role_id == 1 }">
                        	<input type="radio" name="role_id" checked = "true" value = "1">Admin</input>
                        	<input type="radio" name="role_id" value = "2">User</input>
                        </c:if>
                        <c:if test="${item.role_id == 2 }">
                        	<input type="radio" name="role_id" value = "1">Admin</input>
                        	<input type="radio" name="role_id" checked = "true" value = "2">User</input>
                        </c:if>
                    </div>
                    <button type="submit" class="btn btn-success">Save</button>
                </form:form>
            </c:forEach>
            </div>
        </div>
	</div>
</div>
</body>
</html>