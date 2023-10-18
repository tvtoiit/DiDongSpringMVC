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
        <div class="tcol-md-12 table-responsive" style="margin-top: 30px;">
            <h3>Quản lí người dùng</h3>
            <table class="table table-bordered table-hover" style="margin-top: 15px;">
                    <tr>
                        <th>STT</th>
                        <th>Tên khách hàng</th>
                        <th>Địa chỉ</th>
                        <th>Số điện thoại</th>
                        <th>Email</th>
                        <th>Vai Trò</th>
						<th>Ngày tạo tài khoản</th>
						<th style="width: 50px;">Tùy chỉnh</th>
                    </tr>
                    <%int index = 0; %>
	            <c:forEach var ="item" items = "${users}">
	            	<% index +=1; %>
	            	<tr>
		                <td><%out.print(index); %></td>
		                <td>${item.fullname }</td>
		                <td>${item.address }</td>
		                <td>${item.phone_number }</td>
		                <td>${item.email }</td>
		                <td>${item.role_name }</td>
						<td>${item.created_at }</td>
		                <th style="width: 40px; height:40px;" >
		                    <a class="btn btn-warning" href="<c:url value="/admin/user/editor?id=${item.id }"/>">Edit</a>
		                </th>
		            </tr>
	            </c:forEach>
			</table>
        </div>
    </div>
</body>
</html>