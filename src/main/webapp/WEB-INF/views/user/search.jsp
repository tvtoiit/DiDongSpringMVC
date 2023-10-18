<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>

<head>
<title>Tìm kiếm sản phẩm</title>
</head>
<body>
<div class="grid wide home-product" style="display: flex;margin-top: 50px;">
	<c:forEach var= "item" items = "${search }">
		
			<a class="chitiet-item__product col l-2-4 m-4 c-6" style="text-decoration: none;" >
                    <div class="home-product-item">
                            <div class="home-product-item-img" style="background-image:url(/ProjectSmartphoneMVC/image/${item.thumnail});"></div>
                            <h4 class="home-product-item-name">${item.title}</h4>
                        <div class="home-product-item-price">
                            <span class="home-product-item__price-current"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price - item.price*item.discount/100 }" />₫</span>
                            <span class="home-product-item__price-old"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}" />₫</span>
                        </div>
                        <div class="home-product-item__sale-off">
                            <span class="home-product-item__sale-off-percent">${item.discount}%</span>
                        </div>
                    </div>
                </a>
            
	</c:forEach>
	</div>
</body>
</html>