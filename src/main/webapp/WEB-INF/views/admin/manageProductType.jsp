<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loại sản phẩm</title>
</head>
<body>
    <div class="row">
        <div class="col-md-12">
            <h1>Quản lí loại sản phẩm</h1>
            <a href="<c:url value="/admin/product_type/editor"/>"><button type="submit" class="btn btn-success" style="margin-top: 10px;">Thêm</button></a>
        </div>
        <div class="col-md-7">
            <table class = "table table-bordered table-hover">
                <tr>
                    <th>STT</th>
                    <th>Tên loại sản phẩm</th>
                </tr>
                <%
                int index = 0;
                %>
                <c:forEach var="item" items="${productTypeManage}">
                <%
                	index += 1;
                %>
                	<tr>
		                <td><%out.print(index); %></td>
		                <td>${item.name}</td>
		            </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>