<%-- 
    Document   : contact
    Created on : Oct 2, 2018, 7:45:20 PM
    Author     : ThanhNguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>contact</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
         <div class="container"> 
	  <div class="map">
	     <iframe src="https://www.google.com/maps/place/Tr%C6%B0%E1%BB%9Dng+%C4%90%E1%BA%A1i+h%E1%BB%8Dc+C%C3%B4ng+ngh%E1%BB%87+Th%C3%B4ng+tin+%C4%90HQG-HCM/@10.8703343,106.8010438,17.26z/data=!4m5!3m4!1s0x317527587e9ad5bf:0xafa66f9c8be3c91!8m2!3d10.8703!4d106.8034513"> </iframe>
	   </div>
	   <div class="col-md-9 contact_left">
		 	  <h1>Liên hệ</h1>
	  			  <p>Cửa hàng bánh kẹo Tết là một cửa hàng không chỉ bán các loại bánh kẹo mà còn có bná những đồ trang trí Tết hay các loại hoa. Nếu các bạn có ý kiến góp ý cho cửa hàng thì liên hệ bằng cách để lại họ tên, email, chủ đề và nội dung để quản lsi có thể biết được những đóng góp của bạn. Cảm ơn vì sự tin dùng sản phẩm của hàng chúng tôi.</p>
	  			 <form>
					<div class="column_2">
                     	<input type="text" class="text"  placeholder="" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}">
					 	<input type="text" class="text"  placeholder="" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" style="margin-left:2.7%">
					 	<input type="text" class="text"  placeholder="" value="Subject" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Subject';}" style="margin-left:2.7%">
					</div>
					<div class="column_3">
	                   <textarea value="Message"  placeholder="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">Message</textarea>
	                </div>
	                <div class="form-submit1">
			          <input type="submit" value="Send Message">
					</div>
					<div class="clearfix"> </div>
				  </form>
		 </div>
		 <div class="col-md-3 contact_right">
		 	<h2>Thông tin liên hệ </h2>
		 	<address class="address">
              <p>Cửa hàng bánh kẹo Tết <br>khu phố 6, Linh Trung , Thủ Đức, Tp Hồ Chí Minh</p>
              <dl>
                 <dt></dt>
                 <dd>Freephone:<span> +1 800 254 2478</span></dd>
                 <dd>Telephone:<span> +1 800 547 5478</span></dd>
                 <dd>FAX: <span>+1 800 658 5784</span></dd>
                 <dd>E-mail:&nbsp; <a href="mailto@example.com">tetshop.com</a></dd>
              </dl>
           </address>
		 </div>
      </div>
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
