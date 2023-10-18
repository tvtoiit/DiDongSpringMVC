<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>
<title>Di Động Thông Minh</title>
<body>
<%@include file="/WEB-INF/views/layouts/user/slide.jsp" %>
<%@include file="/WEB-INF/views/layouts/user/sale.jsp" %>
<div class="grid wide">
<div class="product-laysanpham">
	<c:forEach var ="item_type" items="${product_type}">
		 <div class="header__nav-tab" > 
            <div class = "header__nav-type">
                <img src="<c:url value ="/assets/img/quangcao-containner/dienthoai_1637814357.svg"/>" alt="" class="header__nav-tab-img"/>
                <div class="header__nav-tab-vac">
                    <span>${item_type.name}</span>
                </div>
            </div>
            <div class = "header__nav-tab-xemthem">
                <a href="<c:url value="/product/seemore?id=${item_type.id}&page=1"/>" class="header__nav-tab-xemthem-link">Xem thêm</a>
            </div>
        </div>
		<div class="home-product">
       		<div class="grid-row">
       		<c:forEach var="item_product" items="${product}">
       			<c:if test = "${item_type.id == item_product.product_type}"> <!-- xem lại phần này, nếu có cách tối ưu hơn -->
	       			<a href ="<c:url value ="/product?id=${item_product.id}&sale=0"/>" class="chitiet-item__product col l-2-4 m-4 c-6" style="text-decoration: none;">
	                    <div class="home-product-item">
	                            <div class="home-product-item-img" style='background-image:url(<c:url value ="/image/${item_product.thumnail}"/>)'></div>
	                            <h4 class="home-product-item-name">${item_product.title }</h4>
	                        <div class="home-product-item-price">
	                            <span class="home-product-item__price-current"><fmt:formatNumber type="number" groupingUsed="true" value="${item_product.price - item_product.price*item_product.discount/100 }" />₫</span>
	                            <span class="home-product-item__price-old"><fmt:formatNumber type="number" groupingUsed="true" value="${item_product.price}" />₫</span>
	                        </div>
	                        <div class="home-product-item__sale-off">
	                            <span class="home-product-item__sale-off-percent">${item_product.discount }%</span>
	                        </div>
	                        <div class="rate-like__start">
	                            <div class="star-rating">
	                                <img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded__starthome">
	                                <img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded__starthome">
	                                <img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded__starthome">
	                                <img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded__starthome">
	                                <img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded__starthome">
	                            </div>
	                            <div class="btn-like__starthome">
	                                <svg width="16" height="15" viewBox="0 0 16 15" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M14.8571 4.76562C14.8571 6.43359 13.2054 7.98307 13.1786 8.01042L8 13.1055L2.8125 8.0013C2.79464 7.98307 1.14286 6.43359 1.14286 4.76562C1.14286 2.20443 2.83929 1.66667 4.26786 1.66667C5.59822 1.66667 7.09822 3.13411 7.5625 3.69922C7.77679 3.96354 8.22322 3.96354 8.4375 3.69922C8.90179 3.13411 10.4018 1.66667 11.7321 1.66667C13.1607 1.66667 14.8571 2.20443 14.8571 4.76562ZM16 4.76562C16 2.09505 14.4018 0.5 11.7321 0.5C10.1696 0.5 8.70536 1.75781 8 2.46875C7.29464 1.75781 5.83036 0.5 4.26786 0.5C1.59821 0.5 0 2.09505 0 4.76562C0 6.95312 1.96429 8.78516 2.03571 8.84896L7.60714 14.3359C7.71429 14.4453 7.85714 14.5 8 14.5C8.14286 14.5 8.28572 14.4453 8.39286 14.3359L13.9554 8.86719C14.0357 8.78516 16 6.95312 16 4.76562Z" fill="#FF6700"></path></svg>
	                                <span>Yêu thích</span>
	                            </div>
	                        </div>
	                    </div>
	                </a>
                </c:if>
       		</c:forEach>
       			</div>
       		</div>
	</c:forEach>
</div>
</div>
</body>
