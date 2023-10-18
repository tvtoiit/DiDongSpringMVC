<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý sale sản phẩm</title>
</head>
<body>
    <div class="row">
        <div class= "col-md-12 table-responsive khuyenmaisale_top">
            <h3>Quản lí Khuyến mãi sản phẩm</h3>
            <div style="color: red;text-align:center;margin-block: 20px;border-bottom-style: dotted;">${status}</div>
            <form:form action="/ProjectSmartphoneMVC/admin/product/sale" method="POST" modelAttribute="productsSale">
            <div class="check-time__sale">
                <div class="check-time__salestar">
                    Thời gian bắt đầu:<form:input type="datetime-local" required="true" name="timeStar" path="time_sale"/>
                </div>
                <div class="check-time__salestop">
                    Thời gian kết thúc: <form:input type="datetime-local" required="true" name="timeStop" path="time_salestop"/>
                </div>

                <div style="width: 40px; height:40px;" class="btnbutton-submit">
                    <input type="submit" class = "btn btn-warning" name="btntime" value = "Sale"/>
                </div>
            </div>
            <table class = "table table-bordered table-hover">
                <tr>
                    <th>   </th>
                    <th>STT</th>
                    <th>Tên SP</th>
					<th>Số lượng</th>
					<th>Giảm Giá</th>
                    <th>Số lượng bán</th>
					<th>Loại SP</th>
                    <th>Hình sản phẩm</th>
                </tr>
                <%int index = 0; %>
           	<c:forEach var="item" items="${productSaleManage}">
           	<% index += 1; %>
           		<tr>
		            <td>
		                <input type="checkbox" name="check_sale[]" id="check_sale" value = "${item.id }"/>
		            </td>
					<td><%out.print(index); %></td>
					<td>${item.title }</td>
					<td>${item.num }</td>
					<td> 
		                <input type="number" placeholder="discount" name="discount${item.id}"/>
		            </td>
		            <td> 
		                <input type="number" placeholder="số lượng sale" name="num_sale${item.id}"/>
		            </td>
					<td>${item.name }</td>
					<td><img src="<c:url value="/image/${item.thumnail }"/>" style="height: 120px; width: 100px;"></td>
				</tr>
           	</c:forEach>
            </table>
            </form:form> 
        </div>
    </div>
</body>
</html>