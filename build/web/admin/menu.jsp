<%-- 
    Document   : menu
    Created on : Nov 23, 2018, 12:04:20 AM
    Author     : N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <div id="leftBar">
	<ul>
		<li><a href="${root}/WebApplication1/admin/index.jsp">Trang chủ</a></li>
                <li><a href="${root}/WebApplication1/admin/Category.jsp">Loại sản phẩm</a></li>
		<li><a href="${root}/WebApplication1/admin/Product.jsp">Sản phẩm</a></li>
		<li><a href="${root}/WebApplication1/admin/nhacungcap.jsp">Nhà cung cấp</a></li>
	</ul>
	</div>
    </body>
</html>
