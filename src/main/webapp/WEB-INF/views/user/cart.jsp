<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/user/tablib.jsp" %>

<head>
<link rel="stylesheet" href="/WebDiDong_PTPMCN/DiThoaiThongMinh-PTPMCN/FE/Layout/css/cart.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Giỏ hàng</title>
</head>
<body>

<div class="grid wide ">
    <div class="cart-box__content l-8 c-12">
        <div class="cart-heading__text">
            <a href="<c:url value="/trang-chu/"/>" class="cart-heading__text-link">
            <i class="fa-solid fa-angle-left fa-angle-left-color"></i>
                Mua thêm sản phẩm khác
            </a>
            <span>Giỏ hàng của bạn</span>
        </div>
        <div class="cart-container">
         	<c:if test="${!empty cart }">
        		<c:forEach var = "item" items = "${ cart }">
        			<ul class="cart-container__list c-12">
			                <li class="cart-container__item c-12">
			                 <div class="cart-container__item-check">
			                     <input type="checkbox" name="check[]" value="${item.value.product.id }" class = "cart-container__item">
			                 </div>
			                 <div class="cart-container__item-box c-3">
			                     <a href="" class="cart-container__box-img-link">
			                         <img src="<c:url value = "/assets/photos/${item.value.product.thumnail }"/>" alt="Đây là sản phẩm"/>
			                     </a>
			                     <div class="cart-container__item-xoa">
			                     <i class="fa-solid fa-angle-left fa-angle-left-color"></i>
			                     <a href="/ProjectSmartphoneMVC/deleteCart/${item.value.product.id }" class="">
			                         <span>Xóa</span>
			                     </a>
			                     </div>
			                 </div>
			                 <div class="cart-container__item-content c-4">
			                     <div class="cart-container__item-title">
			                         ${ item.value.product.title }
			                     </div>
			                     <div class="cart-container__item-salecontent">
			                         <div class="cart-container__item-sale">
			                             Mua online thêm quà:
			                         </div>
			                         <div class="cart-container__item-salechon">
			                             Chọn 1 trong 2 khuyến mãi:
			                         </div>
			                     </div>
			                     <span class= "cart-container__textmausp" >Màu: xanh</span>
			                 </div>
			                 <div class="cart-container__item-price-content c-4">
			                     <div class="cart-container__item-price-tren">
			                         <div class="cart-container__item-price">
			                         <fmt:formatNumber type="Number" groupingUsed="true" value="${item.value.product.price - item.value.product.price*item.value.product.discount/100}"/>đ
			                         	
			                         </div>
			                         <div class="cart-container__item-oulprice">
			                         	<fmt:formatNumber type="Number" groupingUsed="true" value="${item.value.product.price}"/>đ
			                         </div>
			                     </div>
			                     <div class="cart-container__item-update-SP">
			                         <input type="button" class= "tru" value= "-" name="truSL" id="">
			                         <input class= "value-quantity" value = "${item.value.quanty }" name="" id="quanty-cart-${item.value.product.id }">
			                         <input type="button" class = "cong" value = "+" name="congSL" id="">
			                     </div>
			                     
			                     <div class="cart-container__item-update-SP">
			                         <button  data-id= "${item.value.product.id}" class="cart-container__box-img-link edit__cart-btn">
			                         		Cập nhật
			                     	</button>
				                 </div>
				             </li>
				            </ul>
        		</c:forEach>
	            	</div>
	            	<h3 class="h3_title_from--giohang">
                    Thông tin mua hàng
                </h3>
                <form:form action="/ProjectSmartphoneMVC/order" method="POST" modelAttribute="order">
                	<div class="check-box__gioitinh">
                    <label for="" class="gender1">
                        <form:radiobutton value="male" name="gender" id="gender1" checked="checked" path ="gender"/>
                        <span>Anh</span>
                    </label>
                    <label for="" class="gender0">
                        <form:radiobutton value="female" name="gender" id="gender0" path ="gender"/>
                        <span>Chị</span>
                    </label>
                </div>
                <div class="form-input__muahang l-12 c-12">
                    <div class="form-input__hoten l-6 c-12">
                        <form:input type="text" name="name" id="name" required="true" placeholder="Họ tên" path = "user_name"/>
                        <br>
                    </div>
                    <div class="form-input__sdt l-6 c-12">
                        <form:input type="text" name="telephone" id="telephone" required="true" placeholder="Số điện thoại" path = "phone_number"/>
                        <br>
                    </div>
                </div>

                <div class="giohang_cachthuc--mua">
                    <h3 class="h3-title-cachthuc">Chọn cách thức mua hàng</h3>
                    <div class="typeReceive">
                        <label class = "typeReceive-giaohangtannoi" for="" title="Giao hàng tận nơi">
                            <input type="radio" name="receive" id="receive0">
                            <span>Giao hàng tận nơi</span>
                        </label>
                        <label class = "typeReceive-giaohangtannoi" for="receive1">
                            <input type="radio" name="receive" id="receive1" value="2">
                            <span>Nhận tại cữa hàng</span>
                        </label>
                    </div>

                </div>
                <div class="tabReceive">
                    <div class="mainTab">
                        <p class="tab-title">
                            Chọn địa chỉ để biết thời gian và phí vận chuyển (nếu có) 
                        </p>
                        <div class="row-giohang__tab l-12 c-12">
                            <div class="l-6 c-12 select_giohang-group">
                                <form:select name="matp" class="select_giohang-tinh" id="city" path = "tinh_tp">
                                    <option value="" class="option-giohang__tinh1">
                                    Tỉnh/Thành phố     
                                    </option>
                                </form:select>
                            </div>
                            <div class="l-6 c-12 select_giohang-group">
                                <form:select class="select_giohang-quan" name="maqh" id="district" path = "quan_huyen">
                                    <option value="" class="option_giohang-quan">
                                        Quận/Huyện
                                    </option>
                                </form:select>
                            </div>
                        </div>
                        <div class="row-giohang__tab-Phuong l-12 c-12">
                            <div class="l-6 c-12 select_giohang-group">
                                <form:select name="phuongxa" id="ward" class="select-giohang__phuong" path = "xa_phuong">
                                    <option value="" class="option-giohang__phuong">
                                        Phường/Xã
                                    </option>
                                </form:select>
                            </div>
                            <div class="l-6 c-12 select_giohang-group">
                                    <form:input name ="note" class="option-giohang__sonha" required="true" placeholder = "Số nhà tên đường" path = "note"/>
                            </div>
                        </div>
                    </div>
                </div>
				<div class="dathang-content">
					<div class="header_dathang">
						<span class="heading-text">Tổng tiền:</span>
						<span class="heading-text__gia"></span>
					</div>
					<div class="container_dieukien">
						<span class="text-dieukien">Cần thanh toán trước 849.000₫ trong 24h sau khi đặt hàng để giữ hàng</span>
					</div>
					<div class="button-container__dathang">
						<button type="submit" class = "button-container__dathang__btn" name ="btnDatHang">Đặt Hàng</button>
					</div>
                </form:form>
					<div class="footer-dathang">
						<span>Bạn có thể chọn hình thức thanh toán sau khi đặt hàng</span>
					</div>
				</div>
        		</c:if>
        		 <c:if test="${empty cart }">
							<div class="container_giohang_isemty">
	                            <img src="<c:url value = "/assets/img/cart/giohangis_emty.png"/>" alt="Hình giỏ hàng trống" class="giohang_rong">
	                        </div>
							<div>Giỏ hàng của bạn còn trống</div>
							<a href ="<c:url value="/trang-chu/"/>">Mua Ngay</a>
			     </c:if>
        </div>
    </div>
</div>
  
    </div>
</div>


<script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"/>"></script>
<script type="text/javascript">
	var citis = document.getElementById("city");
	var districts = document.getElementById("district");
	var wards = document.getElementById("ward");
	var Parameter = {
	  url: "https://raw.githubusercontent.com/kenzouno1/DiaGioiHanhChinhVN/master/data.json", 
	  method: "GET", 
	  responseType: "application/json", 
	};
	var promise = axios(Parameter);
	promise.then(function (result) {
	  renderCity(result.data);
	});
	
	function renderCity(data) {
	  for (const x of data) {
	    citis.options[citis.options.length] = new Option(x.Name, x.Id);
	  }
	  citis.onchange = function () {
	    district.length = 1;
	    ward.length = 1;
	    if(this.value != ""){
	      const result = data.filter(n => n.Id === this.value);
	
	      for (const k of result[0].Districts) {
	        district.options[district.options.length] = new Option(k.Name, k.Id);
	      }
	    }
	  };
	  district.onchange = function () {
	    ward.length = 1;
	    const dataCity = data.filter((n) => n.Id === citis.value);
	    if (this.value != "") {
	      const dataWards = dataCity[0].Districts.filter(n => n.Id === this.value)[0].Wards;
	
	      for (const w of dataWards) {
	        wards.options[wards.options.length] = new Option(w.Name, w.Id);
	      }
	    }
	  };
	}
</script>

<content tag= "script">
	<script type = "text/Javascript">
		$(".edit__cart-btn").on("click", function() {
			var id = $(this).data("id");
			var quanty = $("#quanty-cart-"+id).val();
			window.location="/ProjectSmartphoneMVC/editCart/"+id+"/"+quanty;
		});
</script>
</content>

<script type = "text/Javascript">
    // Xử lí tăng, giảm số lượng
    const $$$ = document.querySelector.bind(document);
    const $$$$ = document.querySelectorAll.bind(document);
    for(let  i = 0; i < $$$$('.cong').length; i++){
        let a1 = $$$$('.value-quantity')[i].value;
        console.log(a1);
        a1 = parseInt(a1);
        $$$$('.cong')[i].onclick = () => {
            a1++;
            $$$$('.value-quantity')[i].value = a1;
        }
        $$$$('.tru')[i].onclick = () => {
            if(a1 < 2) {
                return;
            }else {
                a1--;
                $$$$('.value-quantity')[i].value = a1;
            }
        }
    }
</script>
</body>
