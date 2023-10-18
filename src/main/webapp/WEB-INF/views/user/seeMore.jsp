<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${nameType}</title>
</head>
<body>
	<div class="grid wide">
            <div class="header__nav-tab" > 
                <div class= "header__nav-tab-icon">
                    <img src="<c:url value= "/assets/img/quangcao-containner/dienthoai_1637814357.svg"/>" alt="" class="header__nav-tab-img">
                    <div class="header__nav-tab-vac">
                        <span>${nameType}</span>
                    </div>
                </div>
            </div>
           <div class="home-product">
                    <div class="grid-row">
                    <c:forEach var ="item" items="${productPage}">
            <div class="col l-2 m-4 c-6" >
            
                        <div class="home-product-item">
                                <div class="home-product-item-img" style='background-image:url(<c:url value="/assets/photos/${item.thumnail}"/>)'>
                                <h4 class="home-product-item-name">${item.title}</h4>
                            <div class="home-product-item-price">
                                <span class="home-product-item__price-current"><fmt:formatNumber type="number" groupingUsed="true" value="${(item.price - item.price*item.discount/100)}" />₫</span>
                                <span class="home-product-item__price-old"><fmt:formatNumber type="number" groupingUsed="true" value="${item.price}" />₫</span>
                            </div>
                            <div class="home-product-item__sale-off">
                                <span class="home-product-item__sale-off-percent">${item.discount}%</span>
                            </div>
                        </div>
                    </div>
       	 
           </div>
           </c:forEach>
                </div>
                <c:if test="${productpaginate.totalPage > 1}">
					<div class="home-phantrang">
						<ul class="home-phantrang--list">
					    <c:if test="${getPage > 1}">
					    	<a href="<c:url value ="/product/seemore?id=${idCategory}&page=${prev_page}"/>" > <li class="home-phantrang--item"> << </li></a>
					    </c:if>
						<c:forEach var="itempagine" begin="1" end="${ productpaginate.totalPage }" varStatus="loop">
							<c:if test="${(loop.index) == productpaginate.currentPage }">
								<a href="<c:url value ="/product/seemore?id=${idCategory }&page=${ loop.index }"/>" class="home-phantrang--itemlink"> <li class="home-phantrang--item">${loop.index}</li></a>
								
							</c:if>
							
							<c:if test="${(loop.index) != productpaginate.currentPage }">
								<a href="<c:url value ="/product/seemore?id=${idCategory }&page=${ loop.index }"/>" class="home-phantrang--itemlink"> <li class="home-phantrang--item">${loop.index}</li></a>
								
							</c:if>
						</c:forEach>
						<c:if test="${getPage < productpaginate.totalPage}">
							<a href="<c:url value ="/product/seemore?id=${idCategory}&page=${next_page}"/>" class="home-phantrang--itemlink"> <li class="home-phantrang--item"> >> </li></a>
						</c:if>
						</ul>
					</div>
  				</c:if>
		        </div>
		       
    </div>     
</body>
</html>