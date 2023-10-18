<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm/sửa sản phẩm</title>
</head>
<body>
<div class="row">
	<div class="col-md-12" style="margin: 30px 0;">
		<h3>Thêm/sửa sản phẩm</h3>
        <div class="panel panel-primary">
	<c:if test = "${productManageUpdate.size() != null}">
		<c:forEach var="item" items = "${productManageUpdate}">
            <div class="panel-body">
                <form:form action="/ProjectSmartphoneMVC/admin/product/update" method="POST" modelAttribute="product">
					<div style="color: red;text-align:center;">${status}</div>
					<div class="form-group" style="display:none;">
						<form:input type="number" name="id" value="${item.id }" path="id"/>
					</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Tên sản phẩm:</label>
                        <form:input type="text" required="true" class="form-control" name="title" placeholder="Nhập tên sản phẩm" value="${item.title }" path="title"/>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Tên Loại Sản Phẩm:</label>
                        <td>
							<form:select name='IDLSP' path="product_type">
								<option value="0"> --Chọn Loại Sản Phẩm--</option>
								<c:forEach var="itemType" items = "${product_type}">
									<option value="${itemType.id }" <c:if test="${itemType.id == item.product_type }">selected="selected"</c:if>>${itemType.name }</option>
								</c:forEach>
							</form:select>
						</td>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Giá Sản Phẩm:</label>
                        <form:input class="form-control" type="number" required="true"  name="price" value="${item.price }" path="price" />
                    </div>
					<div class="from-group">
						<label for="" style="font-weight: bold;">Giảm Giá: </label>
                        <form:input class="form-control" type="text" required="true"  name="discount" value="${item.discount }" path="discount"/>
					</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Số lượng:</label>
                        <form:input class="form-control" type="number" required="true"  name="number" value="${item.num }" path ="num"/>
                    </div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Thông tin sản phẩm:</label>
                        <textarea class="form-group" id="" style="width: 100%;" rows="5" name="description" path="description">${item.description}</textarea>
                    </div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Ảnh sản phẩm:</label>
                        <form:input name="avatar" type="file" accept="image/*" path="thumnail"/>
						<img src="<c:url value = "/image/${item.thumnail}"/>" style="width: 80px; height:80px;"/>
                    </div>
					<div class="form-group" style="display:none;">
						<input type="text" name="avatar1" value="${item.thumnail }"></input>
					</div>
                    <button type="submit" class="btn btn-success">Save</button>
                </form:form>
            </div>	
		</c:forEach>			
	</c:if>
		<c:if test = "${productManageUpdate.size() == null}">
            <div class="panel-body">
                <form:form action="/ProjectSmartphoneMVC/admin/product/editor" method="POST" modelAttribute="product" >
					<div style="color: red;text-align:center;">${status }</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Tên sản phẩm:</label>
                        <form:input type="text" required="true" class="form-control" placeholder="Nhập tên sản phẩm" path="title" />
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Tên Loại Sản Phẩm:</label>
                        <td>
						<form:select path='product_type'>
								<option value='0'> --Chọn Loại Sản Phẩm--</option>
								<c:forEach var="itemType" items = "${product_type}">
									<option value="${itemType.id }">${itemType.name}</option>
								</c:forEach>
							</form:select>
						</td>
                    </div>
					<div class="form-group">
                        <label for="" style="font-weight: bold;">Giá Sản Phẩm:</label>
                        <form:input class="form-control" type="number" required="true" placeholder="Nhập giá sản phẩm" path="price" />
                    </div>
					<div class="from-group">
						<label for="" style="font-weight: bold;">Giảm Giá: </label>
                        <form:input class="form-control" type="text" required="true" placeholder="Nhập mã giảm giá sản phẩm" path="discount" />
					</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Số lượng:</label>
                        <form:input class="form-control" type="number" required="true" placeholder="Nhập số lượng sản phẩm" path="num" />
                    </div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Thông tin sản phẩm:</label>
                        <form:textarea class="form-group" name="description" id="" style="width: 100%;" rows="5" path="description"/>
                    </div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">Ảnh sản phẩm:</label>
                        <form:input name="avatar" accept="image/*" type="file" path="thumnail"/>
                    </div>
                    <button type="submit" class="btn btn-success">Save</button>
                </form:form>
            </div>
		</c:if>
 		</div>
	</div>
</div>				
<script type="text/javascript">
    
    // CKEDITOR.replace( 'description' );
    CKEDITOR.replace( 'description', {
        // filebrowserBrowseUrl: '';
        filebrowserBrowseUrl: '<c:url value="/ckfinder/ckfinder.html"/>'
    } );
</script>
</body>
</html>