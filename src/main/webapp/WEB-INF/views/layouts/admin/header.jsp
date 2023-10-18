<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
    
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="<c:url value = "../../../../../ProjectSmartphoneMVC/trang-chu/"/>">Nhóm điện thoại</a>
  <input class="form-control form-control-dark w-100" type="text" placeholder="Tìm kiếm" aria-label="Search">
  <ul class="navbar-nav px-3">
    <li class="nav-item text-nowrap">
      <a class="nav-link" href="<c:url value="/authen/logout"/>">Thoát</a>
    </li>
  </ul>
</nav>	
<div class="container-fluid">
  <div class="row">
    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
      <div class="sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" href="<c:url value = "/admin/"/>">
              <i class="bi bi-house-fill"></i>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<c:url value ="/admin/product_type"/>">
              <i class="bi bi-folder"></i>
              Loại Sản Phẩm
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<c:url value ="/admin/product"/>">
              <i class="bi bi-file-earmark-text"></i>
              Sản Phẩm
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<c:url value ="/admin/order"/>">
              <i class="bi bi-minecart"></i>
              Quản Lý Đơn Hàng
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<c:url value ="/admin/user"/>">
              <i class="bi bi-people-fill"></i>
              Quản Lý Người Dùng
            </a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="<c:url value ="/admin/product/sale"/>">
                <i-people-fill"></i>
                  Khuyến mãi sản phẩm
              </a>
          </li>
          <li class="nav-iem">
            <a class="nav-link" href="<c:url value ="/admin/statistical"/>">
			      <i class="bi bi-people-fill"></i>
              Thống kê 
            </a>
          </li>
          
        </ul>
      </div>
    </nav>
    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">