<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head lang="en">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Trang chủ | LineBook (Home)</title>

	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/price-range.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/main.js"></script>

<!--<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>-->
<script src="js/jquery.autocomplete.js"></script>

<script>
	jQuery(function() {
		$("#bookname11").autocomplete("List.jsp")
	})
</script>
<!--<link href="css/bootstrap.min.css" rel="stylesheet">-->
<!--<link href="css/font-awesome.min.css" rel="stylesheet">-->
<!--<link href="css/prettyPhoto.css" rel="stylesheet">-->
<!--<link href="css/price-range.css" rel="stylesheet">-->
<!--<link href="css/animate.css" rel="stylesheet">-->
<!--<link href="css/main.css" rel="stylesheet">-->
<!--<link href="css/responsive.css" rel="stylesheet">-->
<!--<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">-->
<!--<link rel="shortcut icon" href="images/ico/favicon.ico">-->
<!--<link rel="apple-touch-icon-precomposed" sizes="144x144"-->
<!--	href="images/ico/apple-touch-icon-144-precomposed.png">-->
<!--<link rel="apple-touch-icon-precomposed" sizes="114x114"-->
<!--	href="images/ico/apple-touch-icon-114-precomposed.png">-->
<!--<link rel="apple-touch-icon-precomposed" sizes="72x72"-->
<!--	href="images/ico/apple-touch-icon-72-precomposed.png">-->
<!--<link rel="apple-touch-icon-precomposed"-->
<!--	href="images/ico/apple-touch-icon-57-precomposed.png">-->
</head>
<body>
	<!--   HEADER       -->
	<jsp:include page="/homeHeader.jsp"></jsp:include>
	<!--   END HEADER   -->
	
	
	<!--    BODY        -->
	<div id="slider-content">
		<div id="menu_ngang">
			<h4>
				<b>DANH MỤC</b>
			</h4>
			<ul>
				<li><a href="#"><b>Truyện tranh</b></a></li>
				<li><a href="#"><b>Tiểu thuyết</b></a></li>
				<li><a href="#"><b>Văn học nước ngoài</b></a></li>
				<li><a href="#"><b>Văn học Việt Nam</b></a></li>
				<li><a href="#"><b>Sách thủ công</b></a></li>
				<li><a href="#"><b>Kỹ năng sống</b></a></li>
				<li><a href="#"><b>Tài liệu tham khảo</b></a></li>
			</ul>
		</div>

		<!--slider-->
		<section id="slider">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<%
					int i = 0;
				%>
				<logic:iterate name="trangChuForm" property="dsBanner" id="banner">
					<%
						i++;
					%>
					<div class="item <%if (i == 1) {%>active<%}%>">
						<bean:define id="linkAnh" name="banner"
							property="linkAnh"></bean:define>
						<img src="${linkAnh}" alt="book1" width="1200" height="700">
						<div class="carousel-caption">
							<h3>
								<bean:write name="banner" property="tieuDe" />
							</h3>
							<p>"Những gì sách dạy chúng ta cũng giống như lửa. Chúng ta
								lấy nó từ nhà hàng xóm, thắp nó trong nhà ta, đem nó truyền cho
								người khác và nó trở thành tài sản của tất cả mọi người."</p>
						</div>
					</div>
				</logic:iterate>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		</section>
		<!--/slider-->

		<%-- 	<html:link styleClass="btn btn-primary" --%>
		<%-- 		action="/ket-qua-tim-kiem.do?page=1">Tim kiem</html:link> --%>

		<!-- -sanpham -->
		<!--book care-->
		<div class="book-care">
			<h3>
				<b>CÓ THỂ BẠN QUAN TÂM</b>
			</h3>

			<div class="box">
				<!-- sp -->
				<logic:iterate name="trangChuForm" property="dsGoiY" id="sp">
					<div class="sp">
						<bean:define id="linkAnh" name="sp" property="linkAnh"></bean:define>
						<bean:define id="maRaoBan" name="sp" property="maRaoBan"></bean:define>
						<a href="chi-tiet-bai-dang.do?maRaoBan=${maRaoBan}"><img
							src="${linkAnh}" class="w3-hover-opacity"
							style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
						<h5>
							<b><bean:write name="sp" property="tenSach" /></b>
						</h5>
						<p>
							<bean:write name="sp" property="tacGia" />
						</p>
						<h4>
							<b><bean:write name="sp" property="gia" /></b>
						</h4>
					</div>
				</logic:iterate>
				<!-- sp -->
			</div>
		</div>

	<!--book new-->
		<div class="book-new">
			<h3>
				<img src="images/home/newn.png"
					style="height: 30px; width: 70px; margin-right: 10px;"><b>SÁCH
					MỚI NHẤT </b>
			</h3>

			<div class="box">
				<!-- sp -->
				<logic:iterate name="trangChuForm" property="dsMoiNhat" id="sp">
					<div class="sp">
						<bean:define id="linkAnh" name="sp" property="linkAnh"></bean:define>
						<bean:define id="maRaoBan" name="sp" property="maRaoBan"></bean:define>
						<a href="chi-tiet-bai-dang.do?maRaoBan=${maRaoBan}"><img
							src="${linkAnh}" class="w3-hover-opacity"
							style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
						<h5>
							<b><bean:write name="sp" property="tenSach" /></b>
						</h5>
						<p>
							<bean:write name="sp" property="tacGia" />
						</p>
						<h4>
							<b><bean:write name="sp" property="gia" /></b>
						</h4>
					</div>
				</logic:iterate>
				<!-- sp -->
			</div>
		</div>

		<!--book hot-->
		<div class="book-hot">
			<h3>
				<img src="images/home/hotn.png" class="w3-hover-opacity"
					style="height: 50px; width: 70px; margin-right: 10px;"><b>SÁCH HOT</b>
			</h3>

			<div class="box">
				<!-- sp -->
				<logic:iterate name="trangChuForm" property="dsMoiNhat" id="sp">
					<div class="sp">
						<bean:define id="linkAnh" name="sp" property="linkAnh"></bean:define>
						<bean:define id="maRaoBan" name="sp" property="maRaoBan"></bean:define>
						<a href="chi-tiet-bai-dang.do?maRaoBan=${maRaoBan}"><img
							src="${linkAnh}" class="w3-hover-opacity"
							style="height: 73%; width: 90%; display: block; margin-left: 10px; margin-top: 10px;"></a>
						<h5>
							<b><bean:write name="sp" property="tenSach" /></b>
						</h5>
						<p>
							<bean:write name="sp" property="tacGia" />
						</p>
						<h4>
							<b><bean:write name="sp" property="gia" /></b>
						</h4>
					</div>
				</logic:iterate>
				<!-- sp -->
			</div>
		</div>

	</div>
	<!--    END BODY        -->
	
	
	<!--    FOOTER      -->
	<jsp:include page="/footer.jsp"></jsp:include>
	<!--    END FOOTER  -->
	<!---->
	<!--    <script src="js/jquery.js"></script>-->
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/main.js"></script>
</body>
</html>