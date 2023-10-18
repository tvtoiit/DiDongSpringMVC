<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hóa Đơn</title>
</head>
<body>
    <div class="row" >
        <div class= "col-md-12 table-responsive">
            <h3>Quản lí Hóa Đơn</h3>
			<form:form action="/ProjectSmartphoneMVC/admin/order/status" method="POST" modelAttribute="ordersProduct">
			<a>
			<form:select id="hd" name="hoadon" class="btn btn-success" path = "name_status">
				<option value="1">Tất Cả Hóa Đơn</option>
				<option value="2">Hóa Đơn Đang Duyệt</option>
                <option value="3">Hóa Đơn Thành Công</option>
				<option value="4">Hóa Đơn Đã Hủy</option>
			</form:select>
			</a>
			<a><button name="xem" type="submit" class="btn btn-success" style="margin-top: -2px;margin-left: 10px;">Xem Hóa Đơn</button></a>
			</form:form>
            <table class = "table table-bordered table-hover">
            	<tr>
					<th>STT</th>
					<th>Mã HĐ</th>
					<th>Tên SP</th>
					<th>Tên khách hàng</th>
					<th>Số Lượng</th>
					<th>Thành Tiền</th>
					<th>Địa chỉ</th>
					<th>Trạng Thái</th>
					<th>Ngày đặt hàng</th>
					<c:if test="${hide == null}">
						<th style="width: 50px;">Tùy chỉnh</th>
						<th style="width: 50px;">Tùy chỉnh</th>
					</c:if>
				</tr>
				<%
				int index=0;
				%>
			<c:forEach var="item" items="${orders}">
			<%
				index+=1;
			%>
				<tr>
					<td><%out.print(index); %></td>
					<td>${item.maHD }</td>
					<td>${item.title }</td>
					<td>${item.user_name }</td>
					<td>${item.num }</td>
					<td><fmt:formatNumber type="number" groupingUsed="true" value="${item.money }" />₫</td>
					<c:if test="${item.note != ''}">
						<td>${item.note}, ${item.nameXa}-${item.nameQH}-${item.nameTP}</td>
					</c:if>
					<c:if test="${item.note == ''}">
						<td>${item.nameXa}-${item.nameQH}-${item.nameTP}</td>
					</c:if>
					<td>${item.name_status }</td>
					<td>${item.created_at }</td>
					<c:if test="${hide == null}">
						<th style="width: 40px; height:40px;" >
							<a class="btn btn-warning" href="/ProjectSmartphoneMVC/admin/order/approveOrder?id=${item.id}">Duyệt Đơn</a>
						</th>
						<th style="width: 50px;" >
							<a class="btn btn-danger" href="/ProjectSmartphoneMVC/admin/order/cancelOrder?id=${item.id}">Hủy Đơn</a>
						</th>
					</c:if>
				</tr>
			</c:forEach>
            </table>
        </div>
    </div>
	<script type="text/javascript">
		function approveOrder(ID) {
			option = confirm('Bạn có muốn Duyệt Hóa Đơn này không');
			if(!option) {
				return;
			}
			$.post('/ProjectSmartphoneMVC/admin/order/approveOrder', {
				'ID': ID
			}, function(data) {
				alert(data)
				location.reload()
			})
		}
		function cancelOrder(ID) {
			option = confirm('Bạn có muốn hủy hóa đơn này không');
			if(!option) {
				return;
			}
			$.post('/ProjectSmartphoneMVC/admin/order/approveOrder', {
				'ID': ID
			}, function(data) {
				alert(data)
				location.reload()
			})
		}
	</script>
</body>
</html>