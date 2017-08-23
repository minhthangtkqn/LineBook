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
<title>User | LineBook</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/admin.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/product_detail.css" rel="stylesheet">
<link rel="stylesheet" href="css/w3.css">

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>

</head>
<!--/head-->

<body>

	<!---start-->
   	<jsp:include page="/homeHeader.jsp"></jsp:include>

	<!--    BODY        -->

<div id="content_admin">
	<div class="menu_doc">
		<bean:define id="nguoiDung" name="trangNguoiDungForm" property="nguoiDung"></bean:define>
		<nav
			class="w3-sidebar w3-bar-block w3-white w3-animate-left w3-text-grey w3-collapse w3-top w3-center"
			style="z-index: 3; width: 250px; font-weight: bold; margin-top: 230px;"
			id=" mySidebar">
			<br>
			<h3 class="w3-padding-60 w3-center " style="color: #189eff">
				<b>MANAGEMENT</b>
			</h3>
			<a href="javascript:void(0) " onclick="w3_close() "
				class="w3-bar-item w3-button w3-padding w3-hide-large ">CLOSE</a> 
				<a
				href="#dangchoduyet " onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đang chờ duyệt
				</a> 
				
				
				<a
				href="#dangban " onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đang bán
				</a> 
				
				
				<a
				href="#damua" onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đã mua
				</a> 
				
				
				<a
				href="#daban" onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đã bán
				</a> 
				
				
			<div class="thongtincanhan">
				<div class="anh_admin">
					<bean:define id="anh" name="nguoiDung" property="anh"></bean:define>
					<img src="${anh}"
						style="height: 250px; width: 100%; background-color: blue;">
				</div>
				<div class="thongtin_admin ">
					<p>Tên TK: <bean:write name="nguoiDung" property="taiKhoan" /></p>
					<p>Họ tên: <bean:write name="nguoiDung" property="hoTen" /></p>
					<p>Email: <bean:write name="nguoiDung" property="email" /></p>
					<p>Điện thoại: <bean:write name="nguoiDung" property="dienThoai" /></p>

				<button class="w3-btn w3-ripple w3-blue" data-toggle="modal"
				data-target="#myModal" style="height: 50px; width: 100%">Sửa thông tin</button>	
				</div>
			</div>
		</nav>


		<!-- Overlay effect when opening sidebar on small screens -->
		<div class="w3-overlay w3-hide-large w3-animate-opacity "
			onclick="w3_close() " style="cursor: pointer"
			title="close side menu " id="myOverlay "></div>
	</div>


	<div class="content_main ">
		<!-- Sidebar/menu -->


	  <!-- Header -->
	  <header class="w3-container" style="padding-top:22px; color: #189eff; font-size:17px;">
	    <h5><b><i class="glyphicon glyphicon-signal" style="color: #189eff;"></i> Thống kê</b></h5>
	  </header>
	
<div class="w3-row-padding w3-margin-bottom">
    <div class="w3-quarter">
      <div class="w3-container w3-red w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-check w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>52</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Đang chờ duyệt</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-blue w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-tags w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>99</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Đang bán</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-teal w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-shopping-cart w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>23</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Đã mua</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-folder-open w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>50</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Đã bán</h4>
      </div>
    </div>
  
  </div>
  
  <!-- gợi ý sách -->
	<div class="book-idea">
		<h3>
	<b>GỢI Ý SÁCH </b>
		</h3>

		<div class="box">
			<!-- sp1 -->

			<div class="sp">
				<a href="#"><img src="images/product-details/b9.jpg"
					class="w3-hover-opacity"
					style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
				<h5>
					<b>The Secret tree</b>
				</h5>
				<p>Trần Trà My</p>
				<h4>
					<b>54.000đ</b>
				</h4>
			</div>
			<!-- sp2 -->
			<div class="sp">
				<a href="#"><img src="images/product-details/b10.jpg"
					class="w3-hover-opacity"
					style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
				<h5>
					<b>The Secret tree</b>
				</h5>
				<p>Kieracass</p>
				<h4>
					<b>109.000đ</b>
				</h4>
			</div>
			<!-- sp3 -->
			<div class="sp">
				<a href="#"><img src="images/product-details/b11.jpg"
					class="w3-hover-opacity"
					style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
				<h5>
					<b>The Secret tree</b>
				</h5>
				<p>Rando Kim</p>
				<h4>
					<b>50.000đ</b>
				</h4>
			</div>
			<!-- sp4 -->
			<div class="sp">
				<a href="#"><img src="images/product-details/b12.jpg"
					class="w3-hover-opacity"
					style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
				<h5>
					<b>The Secret tree</b>
				</h5>
				<p>Natalic</p>
				<h4>
					<b>78.000đ</b>
				</h4>
			</div>
			<!-- sp5 -->
		</div>
	</div>
   <!-- /Gợi ý sách -->
  
  
		<!-- !PAGE CONTENT! -->
		<div class="w3-main ">

			<!-- Duyet bai dang section -->
			<div class="w3-container" id="dangchoduyet">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px;"><b>ĐANG CHỜ DUYỆT</b></h3>
				<table class="w3-table w3-striped ">
					<tr>
						<th>STT</th>
						<th>Ảnh người dùng</th>
						<th>Tên tài khoản</th>
						<th>Họ tên</th>
						<th>Điện thoại</th>
						<th>Email</th>
						<th>Địa chỉ</th>
						<th>Ngày sinh</th>
						<th>Khóa</th>
						<th>Xóa</th>
					</tr>
					<tr>
						<td>1</td>
						<td><img src=" "></td>
						<td>myhao123</td>
						<td>Nguyễn Thị Mỹ Hảo</td>
						<td>0963614541</td>
						<td>myhao123@gmail.com</td>
						<td>Đà Nẵng</td>
						<td>26/8/1995</td>
						<td><span class="glyphicon glyphicon-lock "
							style="color: red; font-size: 15px; margin-left: 12px;"></span></td>
						<td><span class="glyphicon glyphicon-trash "
							style="color: red; font-size: 15px; margin-left: 7px;"></span></td>
					</tr>

				</table>
			</div>
			<!--/Duyet bai dang-->



			<!-- Nguoi dung bi khoa section -->
			<div class="w3-container" id="dangban" style="margin-top: 50px;">
				
				<h3 style="text-transform: uppercase; color: #189eff; display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px"><b>ĐANG BÁN</b></h3>
				<table class="w3-table w3-striped ">
					<tr>
						<th>STT</th>
						<th>Ảnh người dùng</th>
						<th>Tên tài khoản</th>
						<th>Họ tên</th>
						<th>Điện thoại</th>
						<th>Email</th>
						<th>Địa chỉ</th>
						<th>Ngày sinh</th>
						<th>Khóa</th>
						<th>Xóa</th>
					</tr>
					<tr>
						<td>1</td>
						<td><img src=" "></td>
						<td>myhao123</td>
						<td>Nguyễn Thị Mỹ Hảo</td>
						<td>0963614541</td>
						<td>myhao123@gmail.com</td>
						<td>Đà Nẵng</td>
						<td>26/8/1995</td>
						<td><span class="glyphicon glyphicon-lock "
							style="color: red; font-size: 15px; margin-left: 12px;"></span></td>
						<td><span class="glyphicon glyphicon-trash "
							style="color: red; font-size: 15px; margin-left: 7px;"></span></td>
					</tr>

				</table>
			</div>
			<!-- Nguoi dung bi khoa section -->

			<!-- Quan ly nguoi dung section -->
			<div class="w3-container" id="damua">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px"><b>ĐÃ MUA</b></h3>
				<table class="w3-table w3-striped ">
					<tr>
						<th>STT</th>
						<th>Ảnh người dùng</th>
						<th>Tên tài khoản</th>
						<th>Họ tên</th>
						<th>Điện thoại</th>
						<th>Email</th>
						<th>Địa chỉ</th>
						<th>Ngày sinh</th>
						<th>Khóa</th>
						<th>Xóa</th>
					</tr>
					<tr>
						<td>1</td>
						<td><img src=" "></td>
						<td>myhao123</td>
						<td>Nguyễn Thị Mỹ Hảo</td>
						<td>0963614541</td>
						<td>myhao123@gmail.com</td>
						<td>Đà Nẵng</td>
						<td>26/8/1995</td>
						<td><span class="glyphicon glyphicon-lock "
							style="color: red; font-size: 15px; margin-left: 12px;"></span></td>
						<td><span class="glyphicon glyphicon-trash "
							style="color: red; font-size: 15px; margin-left: 7px;"></span></td>
					</tr>

				</table>
			</div>
			<!-- /Quan ly nguoi dung section -->

			<!-- Dang ban section -->
			<div class="w3-container" id="daban">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px"><b>ĐÃ BÁN</b></h3>
				<table class="w3-table w3-striped ">
					<tr>
						<th>STT</th>
						<th>Ảnh người dùng</th>
						<th>Tên tài khoản</th>
						<th>Họ tên</th>
						<th>Điện thoại</th>
						<th>Email</th>
						<th>Địa chỉ</th>
						<th>Ngày sinh</th>
						<th>Khóa</th>
						<th>Xóa</th>
					</tr>
					<tr>
						<td>1</td>
						<td><img src=" "></td>
						<td>myhao123</td>
						<td>Nguyễn Thị Mỹ Hảo</td>
						<td>0963614541</td>
						<td>myhao123@gmail.com</td>
						<td>Đà Nẵng</td>
						<td>26/8/1995</td>
						<td><span class="glyphicon glyphicon-lock "
							style="color: red; font-size: 15px; margin-left: 12px;"></span></td>
						<td><span class="glyphicon glyphicon-trash "
							style="color: red; font-size: 15px; margin-left: 7px;"></span></td>
					</tr>

				</table>
			</div>
			<!-- /Dang ban section -->

			<!-- End page content -->
		</div>

		<script>
			// Script to open and close sidebar
			function w3_open() {
				document.getElementById("mySidebar ").style.display = "block ";
				document.getElementById("myOverlay ").style.display = "block ";
			}

			function w3_close() {
				document.getElementById("mySidebar ").style.display = "none ";
				document.getElementById("myOverlay ").style.display = "none ";
			}

			// Modal Image Gallery
			function onClick(element) {
				document.getElementById("img01 ").src = element.src;
				document.getElementById("modal01 ").style.display = "block ";
				var captionText = document.getElementById("caption ");
				captionText.innerHTML = element.alt;
			}
		</script>
	</div>
</div>

<!--    END BODY    --><!--    BODY        -->

<!--    END BODY    -->
	<!--end-->

</body>
</html>