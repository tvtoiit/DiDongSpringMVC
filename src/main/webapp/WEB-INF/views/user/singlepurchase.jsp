<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>
<head>
<title>Đơn mua</title>
</head>
<body>
	<div class="grid wide ">
    <div class="container-cart__order">
    <div class="l-3 left-cart">
        
        <a href="" class="cart-left_danhsachdon">
            Danh sách đơn hàng đã mua
        </a>
    </div>
    <c:if test = "${donmua.size() > 0}">
    	<div class="l-9 c-12 right-cart">
	         <div class="user-dathang">
	             <div class="user-dathang__left">
	                 <p class="ten-user__dathang">Chào bạn -</p>
	                 <p class="ten-user__dathang">${userName}</p>
	             </div>
	             <div class="user-dathang__right">
	                 
	             </div>
	         </div>
         <c:forEach var="item" items="${donmua}">
         	<div class="list-danhsach__order">
                    <b>Đơn hàng đã mua gần đây</b>
                    <div class="group-list__order">
                        <i>i</i>
                        <div>Đây là danh sách đơn hàng bạn đã mua từ ngày
                        </div>
                        <b>${item.created_at }</b>
                    </div>
                    <table class="bang-orer">
                        <tbody>
                            <tr>
                                <th>Mã đơn hàng</th>
                                <th>sản phẩm</th>
                                <th>giá</th>
                                <th class = "bang-orer__ngaymua">ngày đặt mua</th>
                                <th>trạng thái</th>
                            </tr>
                            <tr class="cot-order">
                                <td>
                                    <a href="" class="">${item.maHD}</a>
                                </td>
                                <td>
                                    <a href="" class="order_item">
                                        <img src="<c:url value="/image/${item.thumnail}"/>" alt="hình sản phẩm đơn hàng" class="order_item-img">
                                    </a>
                                    <div class="order-content">
                                        <a href="" class="name-product__order">${item.title}</a>
                                        <div class="deliverytime">Dự kiến giao: Trước 10:00 27/10/2022</div>
                                    </div>
                                </td>
                                <td>
                                    <b class="price-product__order"><fmt:formatNumber type="number" groupingUsed="true" value="${item.money}" />₫</b>
                                </td>
                                <td>
                                    <span class="date-product__order">${item.created_at }</span>
                                </td>
                                <td>
                                    <span class="data-status">${item.name_status }</span>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
         </c:forEach>
            </div>
    </c:if>
    
    	</div>
	</div>
</body>
</html>