<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
</head>
<body>
<div class="grid wide">
	
	
    <div class="chitiet-chitiet ">
		<div class="form-active-chitiet ">
		
			<c:forEach var = "itemproduct" items = "${product_Details}">
					<div class="header-chitiet-content">
									<h3>
										${itemproduct.title}
									</h3>
								</div> 
								<div class="chitiet-container l-12 m-12 c-12">
										<div class="chitiet-container-img">
											<div class="chitiet-container-above">
												<img src="<c:url value = "/image/${itemproduct.thumnail}"/>" alt="Điện thoại hình ảnh ở trên" class="chitiet-container-above-img">
											</div>
											
											<ul class="chitiet-container-below">
											<li class="chitiet-container-below-img">
												<a href="#" class="chitiet-container-link">
													<div class="chitiet-container-hinhnho">
														<img src="<c:url value ="/assets/img/icon_hot.svg"/>" alt="icon hot" class="chitiet-container-below-img-concon">
													</div>
													<span class = "chitiet-container-tenhinh">Điểm nổi bật</span>
												</a>
											</li>
											<li class="chitiet-container-below-imgimg">
												<a href="#" class="chitiet-container-link">
													<div class="chitiet-container-hinhnho">
														<img src="" alt="Điện thoại hình ảnh ở dưới" class="chitiet-container-below-img-con">
													</div>
													
												</a>
											</li>
											<li class="chitiet-container-below-img">
												<a href="#" class="chitiet-container-link">
													<div class="chitiet-container-hinhnho">
														<img src="<c:url value ="/assets/img/icon_camera.svg"/>" alt="icon icon_camera" class="chitiet-container-below-img-concon">
													</div>
													<span class = "chitiet-container-tenhinh">Chụp từ camera</span>
												</a>
											</li>
									</ul>
								</div>
						<div class="chitiet-container-embrace l-5 m-12 c-12">
							<div class="chitiet-container-price">
							
									<c:if test = "${sale == 1 }">
										<div class = "flashsale">
													<div class = "top_sale">
															<img src ="<c:url value = "/assets/img/magiamgia/flash.svg"/>"/>
														<div class = "right_sale">
															<img src ="<c:url value = "/assets/img/magiamgia/clock.svg"/>"/>
															<p class = "coun_down">
																"Kết thúc trong"
																<span class = "time_coundown">
																	<span class = "number_ number_day"></span>
																	<span class = "number_ number_hour"></span>
																	<span class = "number_ number_mili"></span>
																	<span class = "number_ number_secon"></span>
																</span>
															</p>
														</div>
													</div>
													<div class="mid_sale">
														<span class = "price_now"><fmt:formatNumber type="number" groupingUsed="true" value="${itemproduct.price}" /></span><sup class = "sub-chitiet">đ</sup>
														<span class = "_price"><fmt:formatNumber type="number" groupingUsed="true" value="${(itemproduct.price - itemproduct.price*itemproduct.discount/100)}" />đ</span>
														<span class = "discount_sale">${itemproduct.discount}%</span>
													</div>
												</div>
										</c:if>
										<c:if test = "${sale == 0 }">
											<h3>Giá: </h3>
											<div class="gia-chitiet">
												<h4 class = "gia-chitiet__1"><fmt:formatNumber type="number" groupingUsed="true" value="${(itemproduct.price - itemproduct.price*itemproduct.discount/100)}" /></h4><sup class = "sub-chitiet">₫</sup>
												<h4 class = "gia-chitiet__2"><fmt:formatNumber type="number" groupingUsed="true" value="${itemproduct.price}" /></h4><sup>₫</sup>
											</div>
										</c:if>
									
									</div>
									<div class="chitiet-container-nhandat">
										<span>Nhận đặt trước</span>
									</div>
							
										
											<div class="chitiet-container-chitiet-khuyenmai">
												<h4>Khuyến Mãi</h4>
												
												<ul class="chitiet-container-chitiet-khuyenmai-list">
											<c:forEach var = "itemdiscount" items = "${product_discounttext}">
													<li class="chitiet-container-chitiet-khuyenmai-item">
														${ itemdiscount.discount_text}
													</li>
											</c:forEach>
													</ul>
						
													</div>
													
													<div class="chitiet-buton-thanhtoan">
														<button class="chitiet-container-type-btn-tragop-phantram">
														<h4>Mua trả góp 0%</h4>
														<span>Duyệt hồ sơ trong 5 phút </span>
														</button>
		
														<button class="chitiet-container-type-btn-tragop-the" >
														<h4> Trả góp qua thẻ</h4>
														<span>Visa, Mastercart, JCB, Amex</span>
														</button>
													</div>
													<form:form action="/ProjectSmartphoneMVC/addCart/${itemproduct.id}/${sale}" method="POST">
														<input class="chitiet-container-type-btn" type="submit" name="add_cart" value="Thêm vào giỏ hàng"/>
													</form:form>
													<div class="chitiet-container-copy">
														<button class= "chitiet-container-copy-link">
															<span class="chitiet-container-boder">
																<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-link-45deg" viewBox="0 0 16 16">
																	<path d="M4.715 6.542 3.343 7.914a3 3 0 1 0 4.243 4.243l1.828-1.829A3 3 0 0 0 8.586 5.5L8 6.086a1.002 1.002 0 0 0-.154.199 2 2 0 0 1 .861 3.337L6.88 11.45a2 2 0 1 1-2.83-2.83l.793-.792a4.018 4.018 0 0 1-.128-1.287z" />
																	<path d="M6.586 4.672A3 3 0 0 0 7.414 9.5l.775-.776a2 2 0 0 1-.896-3.346L9.12 3.55a2 2 0 1 1 2.83 2.83l-.793.792c.112.42.155.855.128 1.287l1.372-1.372a3 3 0 1 0-4.243-4.243L6.586 4.672z" />
																</svg>
															</span>
															<span>Sao chép đường dẫn</span>
														</button>
														<button class= "chitiet-container-copy-thongtin">
															<span class="chitiet-container-boder">
																<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-clipboard2" viewBox="0 0 16 16">
																	<path d="M3.5 2a.5.5 0 0 0-.5.5v12a.5.5 0 0 0 .5.5h9a.5.5 0 0 0 .5-.5v-12a.5.5 0 0 0-.5-.5H12a.5.5 0 0 1 0-1h.5A1.5 1.5 0 0 1 14 2.5v12a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 14.5v-12A1.5 1.5 0 0 1 3.5 1H4a.5.5 0 0 1 0 1h-.5Z" />
																	<path d="M10 .5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5.5.5 0 0 1-.5.5.5.5 0 0 0-.5.5V2a.5.5 0 0 0 .5.5h5A.5.5 0 0 0 11 2v-.5a.5.5 0 0 0-.5-.5.5.5 0 0 1-.5-.5Z" />
																</svg>
															</span>
															<span>Sao chép thông tin</span>
														</button>
													</div>
												</div>
												<div class="tinhtrang-content l-3 m-12 c-12">
													<div class = "header__nav-type">
														<img src="<c:url value = "assets/img/thongso.svg"/>" alt="" class="header__nav-tab-img">
														<div class="header__nav-tab-vac">
															<span>Thông số kĩ thuật</span>
														</div>
													</div>
													<table class = "tinhtrang-table__cauhinh">
														<tbody>
														<c:forEach var = "itemconfig" items = "${product_configuration}">
																<tr class = "tr-1" > 
																	<td class = "title_charactestic">Độ phân giải</td>
																	<td class = "content_charactestic">1290 x 2796 pixels</td>
																</tr>
																<tr class = "tr-0">
																	<td class = "title_charactestic">Màn hình rộng</td>
																	<td class = "content_charactestic">${itemconfig.screen}</td>
																</tr>
																<tr class = "tr-1"> 
																	<td class = "title_charactestic">Độ phân giải camera sau</td>
																	<td class = "content_charactestic">${itemconfig.rear_camera}</td>
																</tr>
																<tr class = "tr-0">
																	<td class = "title_charactestic">Độ phân giải camera trước</td>
																	<td class = "content_charactestic">${itemconfig.front_camera}</td>
																</tr>
																<tr class = "tr-1"> 
																	<td class = "title_charactestic">Bộ nhớ trong</td>
																	<td class = "content_charactestic">${itemconfig.ram}</td>
																</tr>
																<tr class = "tr-0">
																	<td class = "title_charactestic">Dung lượng pin</td>
																	<td class = "content_charactestic">${itemconfig.pin}</td>
																</tr>
																<tr class = "tr-0">
																	<td class = "title_charactestic">Sim</td>
																	<td class = "content_charactestic">${itemconfig.sim}</td>
																</tr>
															</c:forEach>	
															</tbody>
															</table>
															<div class= "tinhtrang-button__chitiet">
																<a href="" class="tinhtrang-button__chitiet-link">
																	Xem cấu hình chi tiết
																</a>
															</div>
															</div>
														</div>
													</div>
												</div>
									</div>
								</div>
							</div>
							<div class="grid wide">
								<div class="comment_content">
									<!-- Comment -->
									<div class="l-9 c-12 comment_chitiet_content">
									<span id="message"></span>
										<div class="comment_heading">
											<div class="comment_heading-name">
												Đánh giá 
											</div>
										</div> 
										<div class="comment_form_content ">
												<div class="row l-3 c-3">
													<div class="row_cmt--1">
														<p class="row_cmt--col">
															<span>
																${stars}/5
															</span>
														</p>
														<div class="comment_1--start">
															<img src=" <c:url value = "/assets/img/Comment/star-fill.png"/>" alt="">
															&nbsp;
															<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="">
															&nbsp;
															<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="">
															&nbsp;
															<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="">
															&nbsp;
															<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="">
														</div>
														<p class="cmt_count">
															đánh giá
														</p>
													</div>
												</div>
												<div class="l-6 c-6">
													<div class="row_cmt--2">
														<div class="row_cmt--rating">
														<c:forEach var = "a" items = "[1,2,3,4,5]">
																	<div class="phantram_sao">
																		<div class="phantram_sao--p">
																				<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded">
																		</div>	
																	</div>
														</c:forEach>	
																<div class="row_cmt--progess1">
																	<div class="progress">
																		<div class="progress-bar" style="width:100%">
																		</div>
																	</div>
																</div>
																<p class="phantram-text">
																100%
																</p>
														</div>
														<div class="row_cmt--rating">
														<c:forEach var = "a" items = "[1,2,3,4]">
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																		<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>
														</c:forEach>
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																			<img src="<c:url value = "/assets/img/Comment/star-empty.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>	
																<div class="row_cmt--progess1">
																	<div class="progress">
																		<div class="progress-bar" style="width:100%">
																		</div>
																	</div>
																</div>
																<p class="phantram-text">
																100%
																</p>
														</div>
														<div class="row_cmt--rating">
														<c:forEach var = "a" items = "[1,2,3]">
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																		<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>
														</c:forEach>
														<c:forEach var ="a" items="[1,2]">
															<div class="phantram_sao">
																		<div class="phantram_sao--p">
																				<img src="<c:url value = "/assets/img/Comment/star-empty.png"/>" alt="" class="lazy-loaded">
																		</div>	
																	</div>	
														</c:forEach>
																
																<div class="row_cmt--progess1">
																	<div class="progress">
																		<div class="progress-bar" style="width:100%">
																		</div>
																	</div>
																</div>
																<p class="phantram-text">
																100%
																</p>
														</div>
														<div class="row_cmt--rating">
														<c:forEach var = "a" items = "[1,2]">
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																		<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>
														</c:forEach>
														<c:forEach var = "a" items="[1,2,3]">
														<div class="phantram_sao">
																	<div class="phantram_sao--p">
																			<img src="<c:url value = "/assets/img/Comment/star-empty.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>
														</c:forEach>
																<div class="row_cmt--progess1">
																	<div class="progress">
																		<div class="progress-bar" style="width:100%">
																		</div>
																	</div>
																</div>
																<p class="phantram-text">
																100%
																</p>
														</div>
														<div class="row_cmt--rating">
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																		<img src="<c:url value = "/assets/img/Comment/star-fill.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>
																<c:forEach var = "a" items = "[1,2,3,4]">
																<div class="phantram_sao">
																	<div class="phantram_sao--p">
																			<img src="<c:url value = "/assets/img/Comment/star-empty.png"/>" alt="" class="lazy-loaded">
																	</div>	
																</div>	
																</c:forEach>
																<div class="row_cmt--progess1">
																	<div class="progress">
																		<div class="progress-bar" style="width:100%">
																		</div>
																	</div>
																</div>
																<p class="phantram-text">
																100%
																</p>
														</div>
													</div>
													
												</div>
												<c:if test = "${!empty(idUser)}">
													<div class="row l-3 c-3">
														<div class="cmt_row--3">
															<p class="cmt_row--3-p">
																<a href="" class = "cmt_row--3-p__link">
																	<span class="cmt_row--text-1">
																		Viết đánh giá
																	</span>
																	<span class="cmt_row--text-2">
																		Đóng đánh giá
																	</span>
																</a>
															</p>
														</div>
													</div>
												</c:if>
												<c:if test = "${empty(idUser)}">
													<div class="row l-3 c-3">
														<div class="cmt_row--3">
															<p class="cmt_row--3-p">
																<a href="<c:url value="/authen/login"/>" class = "cmt_row--3-p__link">
																	<span class="cmt_row--text">
																		Viết đánh giá
																	</span>
																</a>
															</p>
														</div>
													</div>
												</c:if>
										</div>
										<form:form action="/ProjectSmartphoneMVC/insertComment/${itemproduct.id}" method="POST" modelAttribute="insertCom" class="comment-form">
											<div class="comments-content__container">
												<div class="comment-form">
													<div class="comment-form__content">
														<div class="comment-form__heading">
															<div class="comment-form__heading-text">
																Đánh giá của bạn về sản phẩm:
															</div>
														</div>
														<div id="rating">
															<form:radiobutton id="star5" name="rating" value="5" path="number_stars"/>
															<label class = "full" for="star5" title="Awesome - 5 stars"></label>
														
															<form:radiobutton id="star4" name="rating" value="4" path ="number_stars"/>
															<label class = "full" for="star4" title="Pretty good - 4 stars"></label>
														
															<form:radiobutton id="star3" name="rating" value="3" path ="number_stars"/>
															<label class = "full" for="star3" title="Meh - 3 stars"></label>
														
															<form:radiobutton id="star2" name="rating" value="2" path ="number_stars"/>
															<label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
														
															<form:radiobutton id="star1" name="rating" value="1" path ="number_stars"/>
															<label class = "full" for="star1" title="Sucks big time - 1 star"></label>
														</div>
													</div>
													<div class="comment-form__form-content">
														<div class="l-6 m-6 c-12">
															<form:textarea class ="form-control" placeholder="Nội dung đánh giá của bạn" name="comment" id="comment" path="content_comment"></form:textarea>
														</div>
														<div class="l-6 m-6 c-12">
															<div class="row-l-6__content">
																<div class="row_form-control-1">
																	<input type="text" class ="form-control-1 row_form-control-1__input" name="fullname" id="fullname" placeholder="Họ và tên" value="${fullname }"/>
																</div>
																<div class="row_form-control-2">
																	<input type="submit" class = "btn_submit-danhgia" name="submit" id="submit" value="Gửi đánh giá">
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										<form:input type="hidden" name="commentId" id="commentId" value="0" path="parent_id"/>
									</form:form>
										<!-- Code comment tại đây -->
										<script src = "<c:url value="/Javascript/comment.js"/>"></script>
										<div class="comment_chitiet--hienthi" id="showComments">
											<c:forEach var="itemCm" items="${comment}">
												<div class="comment_item--hienthi">
													<div class="comment_item-content">
														<div class="comment_item--info">
															<span class="comment_item--name">
																<strong class="comment_item--name-text">
																${itemCm.fullname}
																</strong>
															</span>
															<div class="comment_item--sao_hienthi">
															<c:if test="${itemCm.number_stars == 1}">
																<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																<c:forEach var="a" items="[1,2,3,4]">
																	<img src="<c:url value="/assets/img/Comment/star-empty.png"/>" class = "img-sao__danhgia" alt="">
																</c:forEach>
															</c:if>
															<c:if test="${itemCm.number_stars == 2}">
																<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																<c:forEach var="a" items="[1,2,3]">
																	<img src="<c:url value="/assets/img/Comment/star-empty.png"/>" class = "img-sao__danhgia" alt="">
																</c:forEach>
															</c:if>
															<c:if test="${itemCm.number_stars == 3}">
																<c:forEach var="a" items="[1,2,3]">
																	<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																</c:forEach>
																<c:forEach var="a" items="[1,2]">
																	<img src="<c:url value="/assets/img/Comment/star-empty.png"/>" class = "img-sao__danhgia" alt="">
																</c:forEach>
															</c:if>
															<c:if test="${itemCm.number_stars == 4}">
																<c:forEach var="a" items="[1,2,3,4]">
																	<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																</c:forEach>
																<img src="<c:url value="/assets/img/Comment/star-empty.png"/>" class = "img-sao__danhgia" alt="">
															</c:if>
															<c:if test="${itemCm.number_stars == 5}">
																<c:forEach var="a" items="[1,2,3,4,5]">
																	<img src="<c:url value="/assets/img/Comment/star-fill.png"/>" alt="">
																</c:forEach>
															</c:if>
															</div>
															<span class="comment_item--thoigian">${itemCm.time_comment}</span>
														</div>
														<c:if test="${!empty(roleID)}">
															<c:if test="${roleID == 1 }">
																<div class = "comment_item--admin__group">
																	<a href="<c:url value="/deleteComment/${itemCm.id}/${itemproduct.id }"/>" class = "comment_item--admin__xoa">Xóa</a>
																	<button class = "comment_item--admin__traloi reply" id="${itemCm.id }">Trả lời</button>
																</div>
															</c:if>
														</c:if>
														<div class="comment_content--noidung">
																${itemCm.content_comment}
														</div>
														<c:forEach var="itemReply" items="${commentReply}">
															<c:if test="${itemReply.value.commentDto.parent_id == itemCm.id}">
																<div class="wrapper-admin-rep">
																	<div class="wrapper_comment_content">
																		<div class="comment-info__admin">
																			<div class="comment-info__admin-name">
																				<span class="comment-info__admin-name-text">
																					${itemReply.value.commentDto.fullname}
																				</span>
																					<span class="comment-info__admin-name-title">
																						QTV
																					</span>
																			</div>
																			<div class = "comment_item--admin__group">
																			<c:if test="${!empty(roleID)}">
																				<c:if test="${roleID == 1 }">
																					<div class = "comment_item--admin__group">
																						<a href="<c:url value="/deleteComment/${itemReply.value.commentDto.id}/${itemproduct.id }"/>" class = "comment_item--admin__xoa">Xóa</a>
																					</div>
																				</c:if>
																			</c:if>
																			</div>
																			<div class="comment_content-noidung__admin">
																				${itemReply.value.commentDto.content_comment}
																			</div>
																		</div>
																	</div>
																</div>
															</c:if>
														</c:forEach>
													</div>
												</div>
											</c:forEach>
										</div>
										
									</div>
								</div>
							</div>


<!-- Model chi tiết sản phẩm -->


<div class="modal-chitiet m-12 c-12">
	<div class="model-container__chitiet m-10">
		<div class="model-heading">
			<span class="model-heading__text">
				THÔNG SỐ KỸ THUẬT CHI TIẾT ${itemproduct.title}
			</span>
			<button class="close-model-chitiet">×</button>
		</div>
		</c:forEach>
		<div class="model-container__content">
			<table class="model-content-detail">
				<tbody>
				<c:forEach var = "itemconfig2" items = "${product_configuration}">
					<tr>
						<td class="group_field">Kiểu màn hình</td>
					</tr>
					<tr>
						<td class="model-content-detail__title">Màn hình rộng</td>
						<td class="model-content-detail__charactestic">${itemconfig2.screen}</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">Hệ điều hành</td>
						<td class="model-content-detail__charactestic">${itemconfig2.operating_system}</td>
					</tr>
					<tr>
						<td class="group_field">Camera trước</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">Độ phân giải camera trước</td>
						<td class="model-content-detail__charactestic">${itemconfig2.front_camera}</td>
					</tr>
					<tr>
						<td class="group_field">Camera sau</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">Độ phân giải camera sau</td>
						<td class="model-content-detail__charactestic">${itemconfig2.rear_camera}</td>
					</tr>
					<tr>
						<td class="group_field">Hệ điều hành & CPU</td>
					</tr>
					<tr>
						<td class="model-content-detail__title">Chip xử lý</td>
						<td class="model-content-detail__charactestic">${itemconfig2.chip}</td>
					</tr>
					<tr>
						<td class="group_field">Bộ nhớ và lưu trữ</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">RAM</td>
						<td class="model-content-detail__charactestic">${itemconfig2.ram}</td>
					</tr>
					<tr>
						<td class="group_field">Kết nối</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">Sim</td>
						<td class="model-content-detail__charactestic">${itemconfig2.sim}</td>
					</tr>
					<tr>
						<td class="group_field">Pin & Sạc</td>
					</tr>
					<tr >
						<td class="model-content-detail__title">Pin</td>
						<td class="model-content-detail__charactestic">${itemconfig2.pin}</td>
					</tr>
					</c:forEach>
						<tr>
							<td class="group_field">Thông tin chung</td>
						</tr>
					<c:forEach var = "itemthoidiem" items = "${thongtinchung }">
						<tr>
							<td class="model-content-detail__title">Thời điểm ra mắt</td>
							<td class="model-content-detail__charactestic">${itemthoidiem.thoidiemramat}</td>
						</tr>
					</c:forEach>
						<tr>
							<td class="group_field">Tiện ích</td>
						</tr>
						<c:forEach var = "itemtienich" items = "${tienich}">
							<tr>
								<td class="model-content-detail__title">Bảo mật nâng cao</td>
								<td class="model-content-detail__charactestic">${itemtienich.baomatcao }</td>
							</tr>
							<tr>
								<td class="model-content-detail__title">Ghi âm</td>
								<td class="model-content-detail__charactestic">${itemtienich.ghiam }</td>
							</tr>
						</c:forEach>
						<tr>
							<td class="group_field">Thông tin sản phẩm</td>
						</tr>
						<c:forEach var = "itemconfig" items = "${InfomationProduct}">
							<tr>
								<td class="model-content-detail__title">Thương hiệu</td>
								<td class="model-content-detail__charactestic">${itemconfig.thuonghieu }</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<script type="text/javascript">
	const btnclodeModel = document.querySelector('.close-model-chitiet');
	const btnHienModel = document.querySelector('.tinhtrang-button__chitiet-link');
	const model = document.querySelector('.modal-chitiet');
	function showModelChiTiet() {
	    event.preventDefault();
	    model.classList.add('open')
	}
	
	function closeModelChiTiet() {
	    model.classList.remove('open');
	}
	
	btnHienModel.addEventListener('click',showModelChiTiet);
	btnclodeModel.addEventListener('click',closeModelChiTiet);

</script>
<script type="text/javascript">
$(document).ready(function(){ 
	$(document).on('click', '.reply', function(){
		var commentId = $(this).attr("id");
		$('#commentId').val(commentId);
		$('#comment').focus();
	});
});
</script>

<script type = "text/Javascript">
	var elementProductsale = document.querySelector('.time_coundown');
	var id = "<%= request.getParameter("id")%>";
var APIurl_sale = 'http://localhost/WebDiDong_PTPMCN/DiThoaiThongMinh-PTPMCN/PHPREST/api/sale/select_single.php?id='+id;

function start() {
    getProductSale(handleProductSale);
}
start();

function getProductSale (callback) {
    fetch(APIurl_sale)
        .then(function (respon) {
            return respon.json();
        })
        .then(callback);
}
function handleProductSale(data) {
    var elementProductsale = document.querySelector('.time_coundown');
    
    var html = data.data.map(function (item) {
    var noW1 = new Date().getTime();
    var timeStart = new Date(item.time_sale).getTime();
    var timeStop = new Date(item.time_salestop).getTime();//xem lấy time từ server..
        if(noW1>=timeStart && noW1 <= timeStop){
            setInterval(function () {
                var noW = new Date().getTime();
                var full = new Date(item.time_salestop).getTime();
                var D = full  -  noW;
                var Days =  Math.floor(D/(1000*60*60*24));
                var hours =  Math.floor(D/(1000*60*60));
                var minutes =  Math.floor(D/(1000*60));
                var seconds =  Math.floor(D/(1000));
                hours %=24
                minutes %=60
                seconds %= 60
                
                document.querySelector(".number_day").innerText = Days
                document.querySelector(".number_hour").innerText = hours
                document.querySelector(".number_mili").innerText = minutes
                document.querySelector(".number_secon").innerText = seconds
                
            },1000);
            
        }
    });

}
</script>
</body>
</html>