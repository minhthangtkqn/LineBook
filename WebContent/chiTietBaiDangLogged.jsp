<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="vi">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>PRODUCT DETAIL</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/product_detail.css" rel="stylesheet">
<link rel="stylesheet" href="css/w3.css">


<script src="js/jquery.js"></script>
<script src="js/price-range.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<!--    <script src="js/jquery.scrollUp.min.js"></script>-->
<!--    <script src="js/jquery.prettyPhoto.js"></script>-->
</head>
<!--/head-->

<body>

	<jsp:include page="/homeHeader.jsp"></jsp:include>

	<!---content main-->
<div id="content_detail">

	<div id="content_detail_product">
		<!--example-->
		<div class="anh_product">
			<!--Ảnh chính được hiện thị-->
			<div class="pic">

				<!-- 				<div class="w3-display-container mySlides"> -->
				<!-- 					<img src="images/product-details/b1.jpg"> -->
				<!-- 					<div class="w3-display-bottomleft w3-container w3-black"></div> -->
				<!-- 				</div> -->
				<!-- 				<div class="w3-display-container mySlides"> -->
				<!-- 					<img src="images/product-details/b2.jpg"> -->
				<!-- 					<div class="w3-display-bottomleft w3-container w3-black"></div> -->
				<!-- 				</div> -->
				<!-- 				<div class="w3-display-container mySlides"> -->
				<!-- 					<img src="images/product-details/b3.jpg"> -->
				<!-- 					<div class="w3-display-bottomleft w3-container w3-black"></div> -->
				<!-- 				</div> -->

				<div class="w3-display-container mySlides">
					<bean:define id="linkAnh1" name="chiTietBaiDangForm"
						property="linkAnh1"></bean:define>
					<img src="${linkAnh1}">
					<div class="w3-display-bottomleft w3-container w3-black"></div>
				</div>

				<div class="w3-display-container mySlides">
					<bean:define id="linkAnh2" name="chiTietBaiDangForm"
						property="linkAnh2"></bean:define>
					<img src="${linkAnh2}">
					<div class="w3-display-bottomleft w3-container w3-black"></div>
				</div>

				<div class="w3-display-container mySlides">
					<bean:define id="linkAnh3" name="chiTietBaiDangForm"
						property="linkAnh3"></bean:define>
					<img src="${linkAnh3}">
					<div class="w3-display-bottomleft w3-container w3-black"></div>
				</div>

				<div class="w3-display-container mySlides">
					<bean:define id="linkAnh4" name="chiTietBaiDangForm"
						property="linkAnh4"></bean:define>
					<img src="${linkAnh4}">
					<div class="w3-display-bottomleft w3-container w3-black"></div>
				</div>

				<div class="w3-display-container mySlides">
					<bean:define id="linkAnh5" name="chiTietBaiDangForm"
						property="linkAnh5"></bean:define>
					<img src="${linkAnh5}">
					<div class="w3-display-bottomleft w3-container w3-black"></div>
				</div>


			</div>
			<!--/Ảnh chính được hiện thị-->

			<!--Ảnh nhỏ để zoom lớn-->
			<div class="zoom_pic">

				<div class="pics">
					<img class="demo w3-opacity w3-hover-opacity-off" src="${linkAnh1}"
						style="cursor: pointer;" onclick="currentDiv(1)" title="">
				</div>
				<div class="pics">
					<img class="demo w3-opacity w3-hover-opacity-off" src="${linkAnh2}"
						style="cursor: pointer;" onclick="currentDiv(2)" title="">
				</div>
				<div class="pics">
					<img class="demo w3-opacity w3-hover-opacity-off" src="${linkAnh3}"
						style="cursor: pointer;" onclick="currentDiv(3)" title="">
				</div>
				<div class="pics">
					<img class="demo w3-opacity w3-hover-opacity-off" src="${linkAnh4}"
						style="cursor: pointer;" onclick="currentDiv(1)" title="">
				</div>
				<div class="pics">
					<img class="demo w3-opacity w3-hover-opacity-off" src="${linkAnh5}"
						style="cursor: pointer;" onclick="currentDiv(1)" title="">
				</div>

			</div>
			<!--/Ảnh nhỏ để zoom lớn-->

		</div>

		<div class="des_product">
			<h2
				style="display: block; height: 50px; width: 100%; background-color: #189eff; line-height: 50px; color: white; text-align: center; font-size: 20px; margin: 0px; margin-bottom: 20px;">
				<b>THÔNG TIN SÁCH</b>
			</h2>
			<h3 style="color: red">
				<b><bean:write name="chiTietBaiDangForm" property="tenSach" /></b>
			</h3>
			<p style="">
				Tác giả:
				<bean:write name="chiTietBaiDangForm" property="tacGia" />
			</p>
			<p>Nhà xuất bản: <bean:write name="chiTietBaiDangForm" property="nxb" /></p>
			<p>Năm xuất bản: <bean:write name="chiTietBaiDangForm" property="namxb" /></p>
			<p>Ngày đăng bán: <bean:write name="chiTietBaiDangForm" property="ngayBan" /></p>
			<p>Tỉnh thành:	<bean:write name="chiTietBaiDangForm" property="tenTinhBan" /></p>
			<h5 style="color: red; font-size: 20px">
				<b>Giá: <bean:write name="chiTietBaiDangForm" property="gia" /></b>
			</h5>

		</div>

		<div class="thongtin_nguoiban">
			<p style="font-size: 17px; color: red; font-style: italic;">
				<b>Được đăng bởi</b>
			</p>
			<div class="anh_nguoiban">
				<bean:define id="anhNguoiBan" name="chiTietBaiDangForm" property="anhNguoiBan"></bean:define>
				<img style="height: 200px; width: 200px;" src="${anhNguoiBan}">
			</div>
			<div class="text_info">
				<p>Tài khoản: <bean:write name="chiTietBaiDangForm" property="taiKhoanNguoiBan" /></p>
				
				<p>
					Tên người bán:
					<bean:write name="chiTietBaiDangForm" property="hoTenNguoiBan" />
				</p>
				
				<p>Giới tính: <bean:write name="chiTietBaiDangForm" property="gioiTinh" /></p>
				<p>Năm sinh: <bean:write name="chiTietBaiDangForm" property="namSinhNguoiBan" /></p>
			</div>
			<!---gfsd-->
<!--			<button class="w3-btn w3-ripple w3-red" data-toggle="modal"-->
<!--				data-target="#myModal">Try Buy</button>-->
			<a href="mua-sach.do" class="w3-btn w3-ripple w3-red">Hỏi Mua</a>


			<!-- login -->
			<div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">×</button>
							<h6 style="color: red">
								<i>Đăng nhập để xem thông tin liên lạc !!</i>
							</h6>
							<h4>
								<b>Đăng nhập</b>
							</h4>
						</div>
						<div class="modal-body">
							<form role="form">
								<div class="form-group">
									<label for="tendangnhap">Tên đăng nhập </label> <input
										type="text" class="form-control" id="user"
										placeholder="Tên đăng nhập">
								</div>
								<div class="form-group">
									<label for="matkhau">Mật khẩu </label> <input type="password"
										class="form-control" id="pass" placeholder="Nhập mật khẩu">
								</div>
								<button type="submit" class="btn btn-block">Đăng nhập</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!--    <button  onclick="myFunction()" class="w3-btn w3-ripple w3-red" style="width: 100%;">Mua</button>-->

		<script>
			function myFunction() {
				alert("Vui lòng đăng nhập để xem thông tin liên lạc của người đăng!!!");
			}
		</script>
	</div>
</div>

	<jsp:include page="/footer.jsp"></jsp:include>

	<script>
		// Script to open and close sidebar when on tablets and phones
		function w3_open() {
			document.getElementById("mySidebar").style.display = "block";
			document.getElementById("myOverlay").style.display = "block";
		}

		function w3_close() {
			document.getElementById("mySidebar").style.display = "none";
			document.getElementById("myOverlay").style.display = "none";
		}

		// Slideshow Apartment Images
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function currentDiv(n) {
			showDivs(slideIndex = n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("mySlides");
			var dots = document.getElementsByClassName("demo");
			if (n > x.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = x.length
			}
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			for (i = 0; i < dots.length; i++) {
				dots[i].className = dots[i].className.replace(
						" w3-opacity-off", "");
			}
			x[slideIndex - 1].style.display = "block";
			dots[slideIndex - 1].className += " w3-opacity-off";
		}
	</script>

	<script>
		$(document).ready(
				function() {
					// Initialize Tooltip
					$('[data-toggle="tooltip"]').tooltip();

					// Add smooth scrolling to all links in navbar + footer link
					$(".navbar a, footer a[href='#myPage']").on('click',
							function(event) {

								// Make sure this.hash has a value before overriding default behavior
								if (this.hash !== "") {

									// Prevent default anchor click behavior
									event.preventDefault();

									// Store hash
									var hash = this.hash;

									// Using jQuery's animate() method to add smooth page scroll
									// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
									$('html, body').animate({
										scrollTop : $(hash).offset().top
									}, 900, function() {

										// Add hash (#) to URL when done scrolling (default click behavior)
										window.location.hash = hash;
									});
								} // End if
							});
				})
	</script>


</body>
</html>