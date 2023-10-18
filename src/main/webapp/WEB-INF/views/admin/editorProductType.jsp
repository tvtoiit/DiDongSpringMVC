<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm loại sản phẩm</title>
</head>
<body>
<div class="row">
	<div class="col-md-12" style="margin: 30px 0;">
		<h3>Thêm</h3>
        <div class="panel panel-primary">
            <div class="panel-body">
                <form:form action="/ProjectSmartphoneMVC/admin/product_type/editor" method="POST" modelAttribute="product_type" >
                	<div style="color: red;text-align:center;">${status}</div>
                    <div class="form-group">
                        <label for="" style="font-weight: bold;">tên loại sản phẩm:</label>
                        <form:input type="text" required="true" class="form-control" name="Name" placeholder="Nhập tên loại" path ="name"/>
                    </div>
                    <button type="submit" class="btn btn-success">Save</button>
                </form:form>
            </div>
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