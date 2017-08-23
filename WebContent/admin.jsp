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
<title>Admin | LineBook</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/admin.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
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
				href="#duyetbaidang " onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Duyệt bài đăng
				</a> 
				
				
				<a
				href="#nguoidungbikhoa " onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Người dùng bị khóa
				</a> 
				
				
				<a
				href="#quanlynguoidung" onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Quản lý người dùng
				</a> 
				
				
				<a
				href="#dangban" onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đang bán
				</a> 
				
				
				<a
				href="#daban" onclick="w3_close() "
				class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Đã bán
				</a> 
				
				
				
				<a 
				href="#quanlydanhmuc"
				onclick="w3_close() " class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Quản lý danh mục
				</a>
				
				<a 
				href="#quanlyvung"
				onclick="w3_close() " class="w3-bar-item w3-button w3-hover-blue "
				style="text-transform: uppercase;">Quản lý vùng
				</a>
				
				
			<div class="thongtincanhan ">
				<div class="anh_admin ">
					<img src="images/home/admin.png "
						style="height: 200px; width: 100%; background-color: blue;">
				</div>
				<div class="thongtin_admin ">
					<p>Tên TK:</p>
					<p>Họ tên:</p>
					<p>Email:</p>
					<p>Điện thoại:</p>

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
        <h4>Bài chờ duyệt</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-blue w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-user w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>99</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Người dùng mới</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-teal w3-padding-16">
        <div class="w3-left"><i class="glyphicon glyphicon-tags w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>23</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Đang bán</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
        <div class="w3-left"><i class="fa fa-users w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>50</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Người dùng</h4>
      </div>
    </div>
  </div>
  
  <!-- biểu diễn thống kê -->
  <div id="thongke_detail">
	  <div class="chart">
	  
	  </div>
	 
	  <div class="feed">
	  	 <div class="w3-twothird">
        <h5>Feeds</h5>
        <table class="w3-table w3-striped w3-white" style="height: 200px; width: 100%;">
          <tr>
            <td><i class="glyphicon-eye-close glyphicon glyphicon-warning-sign w3-text-red w3-large"></i></td>
            <td>New record, over 90 views.</td>
            <td><i>10 mins</i></td>
          </tr>
          <tr>
            <td><i class="glyphicon-eye-close glyphicon glyphicon-warning-sign w3-text-red w3-large"></i></td>
            <td>New record, over 90 views.</td>
            <td><i>10 mins</i></td>
          </tr>
          <tr>
            <td><i class="glyphicon-eye-close glyphicon glyphicon-warning-sign w3-text-red w3-large"></i></td>
            <td>New record, over 90 views.</td>
            <td><i>10 mins</i></td>
          </tr>
          <tr>
            <td><i class="glyphicon-eye-close glyphicon glyphicon-warning-sign w3-text-red w3-large"></i></td>
            <td>New record, over 90 views.</td>
            <td><i>10 mins</i></td>
          </tr>
         
        </table>
      </div>
	  </div>
  </div>
   <!-- /biểu diễn thống kê -->
  
  
		<!-- !PAGE CONTENT! -->
		<div class="w3-main ">

			<!-- Duyet bai dang section -->
			<div class="w3-container" id="duyetbaidang">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px;"><b>DUYỆT BÀI ĐĂNG</b></h3>
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
			<div class="w3-container" id="nguoidungbikhoa " style="margin-top: 50px;">
				
				<h3 style="text-transform: uppercase; color: #189eff; display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px"><b>NGƯỜI DÙNG BỊ KHÓA</b></h3>
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
			<div class="w3-container" id="quanlynguoidung">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
				height: 50px; width: 100%; border: solid 1px #189eff; line-height: 50px"><b>QUẢN LÝ NGƯỜI DÙNG</b></h3>
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
			<div class="w3-container" id="dangban">

				<h3 style="text-transform: uppercase; color: #189eff;display: block; padding-left:10px;
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
			<!-- /Dang ban section -->

			<!-- Da ban section -->
			<div class="w3-container" id="daban">

				<h3 style="text-transform: uppercase; color: #189eff;mardisplay: block; padding-left:10px;
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
			<!-- /Da ban section -->
		

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