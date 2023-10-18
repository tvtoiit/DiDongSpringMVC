<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
<title>Quản Lý Sản Phẩm</title>
</head>
<body>
    <div class="row">
        <div class= "col-md-12 table-responsive">
            <h3>Quản lí sản phẩm</h3>
            <a href="<c:url value="/admin/product/editor"/>"><button type="submit" class="btn btn-success" style="margin-top: 10px;">Thêm sản phẩm</button></a>
            <table class = "table table-bordered table-hover">
                <tr>
                    <th>STT</th>
					<th>id</th>
                    <th>Tên SP</th>
                    <th>Giá nhập vào</th>
                    <th>Giá bán ra</th>
					<th>Giảm Giá</th>
					<th>Số lương</th>
                    <th>Thông tin SP</th>
					<th>Loại SP</th>
                    <th>Hình sản phẩm</th>
                    <th style="width: 50px;">Tùy chỉnh</th>
                </tr>
                <%
                int index = 0;
                %>
                <c:forEach var="itemProduct" items="${productManage}">
                <%
                	index += 1;
                %>
                	<tr>
						<td><%out.print(index); %></td>
						<td>${itemProduct.id}</td>
						<td>${itemProduct.title}</td>
						<td><fmt:formatNumber type="number" groupingUsed="true" value="${itemProduct.price}" />₫</td>
						<td><fmt:formatNumber type="number" groupingUsed="true" value="${(itemProduct.price - itemProduct.price * itemProduct.discount/100)}" />₫</td>
						<td>${itemProduct.discount}%</td>
						<td>${itemProduct.num}</td>
						<td>${itemProduct.description}</td>
						<td>${itemProduct.name}</td>
						<td><img src="<c:url value="../image/${itemProduct.thumnail}"/>" style="height: 120px; width: 100px;"></td>
						<th style="width: 40px; height:40px;" >
							<a class="btn btn-warning" href="product/update?id=${itemProduct.id}">Edit</a>
						</th>
					</tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>