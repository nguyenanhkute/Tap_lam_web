<%-- 
    Document   : header
    Created on : Oct 14, 2018, 8:54:35 PM
    Author     : N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>
    </head>
    <body>
        <div class="header">
		<div class="header-top">
                    <div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index.html"><img src="images/logo_2.png" alt="" ></a>
				</div>
				<div class="header-in">
					<ul class="icon1 sub-icon1">
						<li><a href="about.html">Thông tin</a></li>	
                                                <li><a href="contact.html">Hỗ trợ</a></li>
                                                <li><a href="checkout.html">Giỏ hàng (<span id="simpleCart_quantity" class="simpleCart_quantity"></span>)<img src="images/gio hang.png" alt=""> </a></li>   
				</div>
				<div class="clearfix"> </div>
			</div>
                    </div>
		</div>
		<div class="header-bottom">
		<div class="container">
			<div class="h_menu4">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li class="active"><a href="index.jsp"><i> </i>Trang chủ </a></li>
                                            <li ><a href="products.html" >Các loại bánh</a>
                                                <ul class="drop">
							<li><a href="products.html">Bánh chưng</a></li>
							<li><a href="products.html">Bánh tét</a></li>
							<li><a href="products.html">Bánh In </a></li>
							<li><a href="products.html">Bánh đậu xanh</a></li>
							<li><a href="products.html">Bánh quy</a></li>
							<li><a href="products.html">Bánh phu thê</a></li>
						</ul>
						</li> 						
                                            <li><a href="products.html" >  Mứt Tết</a>
                                                 <ul class="drop">
                                                        <li><a href="products.html">Mứt gừng</a></li>
							<li><a href="products.html">Mứt dừa</a></li>
							<li><a href="products.html">Mứt bí</a></li>
							<li><a href="products.html">Mứt cà rốt</a></li>
							<li><a href="products.html">Mứt trứng chim</a></li>
							<li><a href="products.html">Mứt đậu phộng</a></li>
                                                    </ul>
                                                </li>            
						<li><a href="products.html" >Đồ trang trí Tết</a>
                                                    <ul class="drop">
							<li><a href="products.html">Câu đối</a></li>
							<li><a href="products.html">Giây may mắn</a></li>
							<li><a href="products.html">Hoa Tết</a></li>
							<li><a href="products.html">Lồng đèn</a></li>
							<li><a href="products.html">Tranh Tết</a></li>
                                                    </ul>
                                                </li>
						<li><a href="products.html" >Các loại hạt</a>
                                                    <ul class="drop">
							<li><a href="products.html">Hạt điều</a></li>
							<li><a href="products.html">Hạt hướng dương </a></li>
							<li><a href="products.html">Hạt dẻ</a></li>
							<li><a href="products.html">Hạt dưa đỏ</a></li>
							<li><a href="products.html">Hạt bí</a></li>
                                                    </ul>
                                                </li>                                                
						<li><a href="products.html" >Hoa tươi ngày Tết </a>
                                                    <ul class="drop">
							<li><a href="products.html">Hoa cúc</a></li>
							<li><a href="products.html">Hoa Lay ơn</a></li>
							<li><a href="products.html">Hoa đồng tiền</a></li>
							<li><a href="products.html">Hoa lan</a></li>
							<li><a href="products.html">Hoa ly</a></li>
                                                    </ul>
                                                </li>
                                                <li><a href="products.html" >Các loại khác </a>
                                                    <ul class="drop">
                                                        <li><a href="procuct.html">Khay đựng bánh kẹo</a></li>
                                                        <li><a href="procuct.html">Phong bao lì xì</a></li>
                                                    </ul>
                                                </li>
                                                
				</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
		<div class="header-bottom-in">
			<div class="container">
			<div class="header-bottom-on">
                            <p class="wel"><a href="#">TÌM KIẾM NHANH </a></p>
			<div class="header-can">
				<ul class="social-in"></ul>
						
					<div class="down-top">		
							<select class="in-drop">
							  <option value="Dollars" class="in-of">Dollars</option>
							  <option value="Euro" class="in-of">Euro</option>
							  <option value="Yen" class="in-of">Yen</option>
							</select>
					 </div>
					<div class="search">
						<form>
							<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>
                                
                                        
			</div>
		</div>
		</div>
		</div>
	</div>
    </body>
</html>
