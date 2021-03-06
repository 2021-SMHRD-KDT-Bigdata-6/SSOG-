<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<link rel="shortcut icon" href="resources/img/favicon.ico">
    <title>물가의 고수</title>
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
    
    <style type="text/css">
    #firstTitle{
    	color: white;
    }
    #subTitle{
    	color: #b7472a;
    }
    #bordercolor{
    border: 1px solid rgba(0, 0, 0, 0.7);
    }
    #padding{
    	margin-bottom : 0px;
    }
    #cmPadding{
    	padding-bottom: 48px;
    }
    .h2{
    	margin-bottom: 16px !important;
    }
  
    </style>
    
  </head>
  <body>

 	
 	
 	
<div>
	<%@include file="includes/header.jsp" %>
</div>
    <!-- END nav -->
    
    <div class="hero-wrap" style="background-image: url('resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-8 ftco-animate d-flex align-items-end">
          	<div class="text w-100 text-center">
	            <h1 class="mb-4">신선, <span>알뜰,</span> 우리의 <span> 먹거리</span>.</h1>
	            <p><a href="#" class="btn btn-primary py-2 px-4">구매하러 가기</a> <a href="#" class="btn btn-white btn-outline-white py-2 px-4"> S S O G </a></p>
            </div>
          </div>
        </div>
      </div>
    </div>

		<section class="ftco-section" style="padding-top: 144px;">
			<div class="container">
				<div class="row justify-content-center pb-5">
          <div class="col-md-7 heading-section text-center ftco-animate">
          	<span class="subheading">신선 알뜰 인기절정 재료로 만든!</span>
            <h2 class="h2">오늘의 it 추천메뉴!</h2>
          </div>
        </div>
				<div class="row">
					
					   <%--반복될 것 --%>
               <%for(int i = 0; i < 4; i++){ %>
               <div class="col-md-3 d-flex">
                  <div class="product ftco-animate">
                   	
                  
                     <div class="img d-flex align-items-center justify-content">
                     	<img src="resources/images/prod-<%=i+1 %>.jpg" style="width:255px; height: 350px;">
                     		<div class="desc">
                     			<p class="meta-prod d-flex" style="text-align:center;" >
                    				<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-shopping-bag"></span></a>
                        			<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-heart"></span></a>
                        			<a href="#" class="d-flex align-items-center justify-content-center"><span class="flaticon-visibility"></span></a>
                    			</p>
                    		</div>
                     </div>
                     		<div class="text text-center">
                        		<span class="seller">Best Seller</span>
                        		<span class="category">category</span>
                        		<h2>name1</h2>
                     		</div>
                  	</div>
              	 </div>
               <%} %>
              
					
					
					<%-- --%>
					</div>
				</div>
			
		</section>

				<div class="row justify-content-center pb-5" style="padding-top: 96px;">
          			<div class="col-md-7 heading-section text-center ftco-animate">
          				<span class="subheading">지금 기분이 어때요?</span>
            			<h2 class="h2">테마별 음식 추천</h2>
          			</div>
        		</div>
  <section class="ftco-section ftco-no-pb" id="padding" style="padding-bottom: 48px; padding-top: 0px">

			<div class="container">
				<div class="row">
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-1.jpg);"></div>
							<h3>이달의 제철상품</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-2.jpg);"></div>
							<h3>비오는 날엔</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-3.jpg);"></div>
							<h3>눈오는 날엔</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-4.jpg);"></div>
							<h3>월요일 저녁엔</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-5.jpg);"></div>
							<h3>스트레스 받을땐</h3>
						</div>
					</div>
					<div class="col-lg-2 col-md-4 ">
						<div class="sort w-100 text-center ftco-animate">
							<div class="img" style="background-image: url(resources/images/kind-6.jpg);"></div>
							<h3>우울할 땐</h3>
						</div>
					</div>

				</div>
			</div>
		</section>
    <section class="ftco-section testimony-section img bg2" id="cmPadding">
    	
      <div class="container">
        <div class="row justify-content-center mb-5">
          <div class="col-md-7 text-center heading-section heading-section-white ftco-animate text2">
          	<span class="subheading text2" id="subTitle">요리금손 다 모여라!</span>
            <h2 class="mb-3 text2">Happy Cook</h2>
          </div>
        </div>
        <div class="row ftco-animate">
          <div class="col-md-12">
            <div class="carousel-testimony owl-carousel ftco-owl">
              <% for(int i=1;i<6;i++){
            	  String[] arr = {"현진현진찌", "운비운비찌", "진웅진웅찌", "유경유경찌", "상윤상윤찌", "소연소연찌"};
              %><div class="item" >
                <div class="testimony-wrap py-4" id="bordercolor" style="text-align: center">
                		<div style="width: 100%; height:203px;">
                			<a href="b_happyCook.do"><img src="resources/images/image_<%=i %>.jpg" style="width:100%; height:100%;"/></a>
                		</div>
                		<div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></div>
                 		 <div class="text text2">
                   		 <p class="mb-4"></p>
                   		 <div class="d-flex align-items-center">
                    		<div class="user-img" style="background-image: url(resources/images/person_1.jpg)"></div>
                    		<div class="pl-3 text2">
		                   	 	<p class="name"><%=arr[i] %></p>
		                    	<span class="position">새싹회원</span>
		                  </div>
	                  	</div>
                  </div>
                </div>
              </div><% }%>
              
            </div>
          </div>
        </div>
      </div>
    </section>
   <section class="ftco-section testimony-section img bg2" style="padding-bottom: 144px;"> 
      <div class="container">
        <div class="row justify-content-center mb-5">
          <div class="col-md-7 text-center heading-section heading-section-white ftco-animate text2">
          	<span class="subheading text2" id="subTitle">요리인데..이제 독을 곁들인</span>
            <h2 class="mb-3 text2">Posion Cook</h2>
          </div>
        </div>
        <div class="row ftco-animate">
          <div class="col-md-12">
            <div class="carousel-testimony owl-carousel ftco-owl">
              <% for(int i=1;i<6;i++){
              	String[] arr = {"진웅진웅찌", "유경유경찌", "상윤상윤찌", "소연소연찌", "운비운비찌", "현진현진찌"};
              %><div class="item">
                <div class="testimony-wrap py-4" id="bordercolor" style="text-align:center">
                		<div style="width: 100%; height:203px;">
                			<a href="b_poisonCook.do"><img src="resources/images/image_<%=i %>_<%=i %>.jpg" style="width:100%; height:100%;"/></a>
                		</div>
                	<div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></div>
                  <div class="text text2">
                    <p class="mb-4"></p>
                    <div class="d-flex align-items-center">
                    	<div class="user-img" style="background-image: url(resources/images/person_1.jpg)"></div>
                    	<div class="pl-3 text2">
		                    <p class="name"><%=arr[i] %></p>
		                    <span class="position">새싹회원</span>
		                  </div>
	                  </div>
                  </div>
                </div>
              </div><% }%>
              
            </div>
          </div>
        </div>
      </div>
    </section>
    
<div>
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
    
  </body>
</html>