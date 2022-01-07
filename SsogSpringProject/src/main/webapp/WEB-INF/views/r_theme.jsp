<%--@page import="java.util.Random"--%>
<%--@page import="jdk.internal.misc.FileSystemOption"--%>
<%--@page import="Controller.Controller_food"--%>
<%--@page import="java.util.ArrayList"--%>
<%--@page import="Model_Food.FoodDAO"--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<link rel="shortcut icon" href="resources/img/favicon.ico">
    <title>�׸���õ</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css2?family=Spectral:ital,wght@0,200;0,300;0,400;0,500;0,700;0,800;1,200;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/animate.css">
    <link rel="stylesheet" href="resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="resources/css/magnific-popup.css">
    <link rel="stylesheet" href="resources/css/flaticon.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <style>
    #menuW{
    	flex: 0 0 100%;
    	flex-grow: 0;
    	flex-shrink: 0;
   	 	flex-basis: 100%;
    	max-width: 100%;
    }
   	#icons{
		list-style : none;
		display : inline-block;
	}
	#category{
		width : 100%;
		margin : 0 auto;
	}
	#category li{
		float:left;
		width : 100px;
		height : 100px;
		border : 1px solid #ededed;
		text-align : center;
		color : #383838;
		box-sizing: border-box;
		font-size : 12px;
	}
	#category li:hover{
		font-weight : bold;
		background-color : #a23f25;
	}
	#category li:hover > img+a{
		filter:invert();
	}
	#category li a{
		color : #383838;
	}
	#category li a:hover{
		color : white;
	}
	#icons img:hover{
		filter:invert();
		/*filter : opacity(0.5) drop-shadow(0 0 0 white);*/
	}
	#icons img{
		width : 100%;
		height : 70px;
		padding : 20px;
		padding-bottom : 0;
		margin : 0 auto; 
		filter : opacity(0.5) drop-shadow(0 0 0 gray);
	}
	/*.container.slide{
		boder-top : 1px solid #ededed;
	}*/
	.footM{
    	margin-top : 100px;
    }
    </style>
  </head>
  <body>
  <%--
  	Random ran = new Random();
  	Controller_food dao = new Controller_food();
  	ArrayList<String> result = dao.getFoodInCategori("��");
  	System.out.println(result.get(1));
  	
  	//String[] fcate = new String[23] ;
  	
  	
  --%>
  
	<div>
   		<%@include file="includes/header.jsp" %>
    </div>
    <!-- END nav -->
    
    <section class="hero-wrap hero-wrap-2" style="background-image: url('resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
          <div class="col-md-9 ftco-animate mb-5 text-center">
          	<p class="breadcrumbs mb-0"><span class="mr-2"><a href="index.do">Home <i class="fa fa-chevron-right"></i></a></span> <span>�׸���õ <i class="fa fa-chevron-right"></i></span></p>
            <h2 class="mb-0 bread">�׸��� ��õ</h2>
          </div>
        </div>
      </div>
    </section>

  <section class="ftco-section ftco-no-pb" id="padding" style="padding-bottom: 48px; padding-top: 100px">

			<div class="container">
				<div class="row">
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-1.jpg);"></div>
							<h3>�̴��� ��ö��ǰ</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-2.jpg);"></div>
							<h3>����� ����</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-3.jpg);"></div>
							<h3>������ ����</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-4.jpg);"></div>
							<h3>������ ���ΰ</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-5.jpg);"></div>
							<h3>��Ʈ���� ������</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-6.jpg);"></div>
							<h3>����� ��</h3>
						</div>
					</div>

				</div>
			</div>
		</section>
		<section class="ftco-section ftco-no-pb" id="padding" style="padding-bottom: 10px; padding-top: 10px">
		<div class="container">
			<div id='category'>
				<ul id='icons'>
					<li class="fcategory" value="��"><a href="#"><img src="resources/img/icon_1.png">��/��</a></li>
					<li class="fcategory" value="���"><a href="#"><img src="resources/img/icon_2.png">���/����</a></li>
					<li class="fcategory" value="��"><a href="#"><img src="resources/img/icon_3.png">��/�� </a></li>
					<li class="fcategory" value="�"><a href="#"><img src="resources/img/icon_4.png">�/����</a></li>
					<li class="fcategory" value="����"><a href="#"><img src="resources/img/icon_5.png">����</a></li>
					<li class="fcategory" value="��"><a href="#"><img src="resources/img/icon_6.png">��/����</a></li>
					<li class="fcategory" value="����"><a href="#"><img src="resources/img/icon_7.png">����</a></li>
					<li class="fcategory" value="Ƣ��"><a href="#"><img src="resources/img/icon_8.png">Ƣ��</a></li>
					<li class="fcategory" value="��ħ"><a href="#"><img src="resources/img/icon_9.png">��ħ/��ħ/��ä</a></li>
					<li class="fcategory" value="��ġ"><a href="#"><img src="resources/img/icon_10.png">��ġ/����/�����</a></li>
					<li class="fcategory" value="������"><a href="#"><img src="resources/img/icon_11.png">������/����</a></li>
					<li class="fcategory" value="������ũ"><a href="#"><img src="resources/img/icon_12.png">����/������ũ</a></li>
					<li class="fcategory" value="���İ�Ƽ"><a href="#"><img src="resources/img/icon_13.png">���İ�Ƽ/�Ľ�Ÿ</a></li>
					<li class="fcategory" value="��"><a href="#"><img src="resources/img/icon_14.png">��/�巹��/�ҽ�</a></li>
					<li class="fcategory" value="��"><a href="#"><img src="resources/img/icon_15.png">��/��</a></li>
					<li class="fcategory" value="������ġ"><a href="#"><img src="resources/img/icon_16.png">������ġ/�佺Ʈ </a></li>
					<li class="fcategory" value="ũ��"><a href="#"><img src="resources/img/icon_17.png">����/Ǫ��/ũ��</a></li>
					<li class="fcategory" value="Ŀ��"><a href="#"><img src="resources/img/icon_18.png">Ŀ��/��</a></li>
					<li class="fcategory" value="�ֽ�"><a href="#"><img src="resources/img/icon_19.png">�ֽ�/�ǰ�����</a></li>
					<li class="fcategory" value="����"><a href="#"><img src="resources/img/icon_20.png">����/����ǰ</a></li>
					<li class="fcategory" value="�ַ�"><a href="#"><img src="resources/img/icon_21.png">�ַ�</a></li>
					<li class="fcategory" value="���"><a href="#"><img src="resources/img/icon_22.png">��/���̷�/����</a></li>
					<li class="fcategory" value="��Ÿ"><a href="#"><img src="resources/img/icon_23.png">��Ÿ�丮</a></li>
				</ul>
			</div>
		</div>
		<!-- <div class="container slide">
		<a href="#"><img src="img/theme_down.png" whith='12px' height='15px'>�׸��ݱ�</a>
		
		</div> -->
		</section>
<div class="w-100"></div>
    <section class="ftco-section">
			<div class="container">
				<div class="row">
					<div class="col-md-9" id="menuW">
						<div class="row mb-4">
							<div class="col-md-12 d-flex justify-content-between align-items-center">
								<h4 class="product-select">�ٻ۴���� ���� ��õ�޴�</h4>
								<select class="selectpicker" multiple>
				          <option>Brandy</option>
				          <option>Gin</option>
				          <option>Rum</option>
				          <option>Tequila</option>
				          <option>Vodka</option>
				          <option>Whiskey</option>
				        </select>
							</div>
						</div>
						<div class="row">
						<%for(int i = 1; i <= 12; i++ ){ %>
							<%--int num = ran.nextInt(20); --%>
							<div class="col-md-4 d-flex">
								<a href="r_recipe.do<%--r_recipe.jsp?fName=<%=result.get(num) %>--%>">
								<div class="product ftco-animate">
									<div class="img d-flex align-items-center justify-content-center" style="background-image: url(resources/img/<%=i%>.jpg<%--=dao.getImgUrl(result.get(num))--%>);">
										<div class="desc">
											<!-- <p class="meta-prod d-flex">
												<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-shopping-bag"></span></a>
												<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-heart"></span></a>
												<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-visibility"></span></a>
											</p> -->
										</div>
									</div>
									<div class="text text-center" style="width: 315px;">
										<span class="category">ī�װ�<%--=dao.showCategori(result.get(num)) --%></span>
										<h2><%--=result.get(num) --%>ī�װ�</h2>
										
									</div>
								</div>
								</a>
							</div>
							<%} %>
							
						</div>
						<div class="row mt-5">
		          <div class="col text-center">
		            <div class="block-27">
		              <ul>
		                <li><a href="#">&lt;</a></li>
		                <li class="active"><span>1</span></li>
		                <li><a href="#">2</a></li>
		                <li><a href="#">3</a></li>
		                <li><a href="#">4</a></li>
		                <li><a href="#">5</a></li>
		                <li><a href="#">&gt;</a></li>
		              </ul>
		            </div>
		          </div>
		        </div>
					</div>

					
					</div>
				</div>
			</div>
		</section>

	<div class="footM">
	    <%@include file="includes/footer.jsp" %>
	</div>
    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="resources/js/jquery.min.js"></script>
  <script src="resources/js/jquery-migrate-3.0.1.min.js"></script>
  <script src="resources/js/popper.min.js"></script>
  <script src="resources/js/bootstrap.min.js"></script>
  <script src="resources/js/jquery.easing.1.3.js"></script>
  <script src="resources/js/jquery.waypoints.min.js"></script>
  <script src="resources/js/jquery.stellar.min.js"></script>
  <script src="resources/js/owl.carousel.min.js"></script>
  <script src="resources/js/jquery.magnific-popup.min.js"></script>
  <script src="resources/js/jquery.animateNumber.min.js"></script>
  <script src="resources/js/scrollax.min.js"></script>
  <script src="resources/https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="resources/js/google-map.js"></script>
  <script src="resources/js/main.js"></script>
  <script>
  	let category = document.getElementsByClass('fcategory');
  	
  	category.onclick = function(){
  		category.value
  		
  	}
  	
  	
  </script>
    
  </body>
</html>