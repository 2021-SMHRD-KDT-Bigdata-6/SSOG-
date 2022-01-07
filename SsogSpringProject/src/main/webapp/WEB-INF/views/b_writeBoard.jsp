<%--@page import="Model_Member.MemberVO"--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<link rel="shortcut icon" href="resources/img/favicon.ico">
    <title>�Խñ��ۼ�</title>
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
    	#bgcolor{
    		background: #fbfbfb !important;
    	}
    	.col-md-7{
    		margin : 0 auto;
		    border: 1px solid #ededed99;
		    margin-bottom : 100px;
    	}
    	.filebox {
		    float: right;
		}
    	.filebox .upload-name {
		    display: inline-block;
		    height: 40px;
		    padding: 0 10px;
		    vertical-align: middle;
		    border: 1px solid #dddddd;
		    width: 60%;
		    color: #999999;
		    float : left;
		}
    	.filebox label {
		    display: inline-block;
		    padding: 10px 20px;
		    color: #fff;
		    vertical-align: middle;
		    background-color: #999999;
		    cursor: pointer;
		    height: 40px;
		    margin-left: 10px;
		    float : left;
		}
		.filebox input[type="file"] {
		    position: absolute;
		    width: 0;
		    height: 0;
		    padding: 0;
		    overflow: hidden;
		    border: 0;
		}
    </style>
  </head>
  <body>
  <%--
	MemberVO vo = (MemberVO)session.getAttribute("member");


	--%>
  
	<div>
    	<%@include file="includes/header.jsp" %>
    </div>
    
    <section class="hero-wrap hero-wrap-2" style="background-image: url('resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
          <div class="col-md-9 ftco-animate mb-5 text-center">
          	<p class="breadcrumbs mb-0"><span class="mr-2"><a href="index.do">Home <i class="fa fa-chevron-right"></i></a></span> <span>Ŀ�´�Ƽ <i class="fa fa-chevron-right"></i></span></p>
            <h2 class="mb-0 bread">�Խñ� �ۼ�</h2>
          </div>
        </div>
      </div>
    </section>

    <section class="ftco-section bg-light" id="bgcolor">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-md-12">
						<div class="wrapper px-md-4">
							<div class="row no-gutters">
								<div class="col-md-7">
									<div class="contact-wrap w-100 p-md-5 p-4">
										<h3 class="mb-4">�Խñ� �ۼ�</h3>
										<form action="WriterBoardService" method="POST" enctype="multipart/form-data" id="contactForm" name="contactForm" class="contactForm">
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
													<%--if(vo==null){ %>
														<label class="label" for="name">�ۼ���</label>
														<span style="margin-left:20px;"></span>
													<%}else{ %>
														<label class="label" for="name">�ۼ���</label>
														<span name="writer" style="margin-left:20px;"><%=vo.getMb_id() %></span>
													<%} --%>
														<label class="label" for="name">�ۼ���</label>
														<span style="margin-left:20px;"></span>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label class="label" for="name">ī�װ�</label>
														<select name="boardCate">
															<option name="boardCate">HappyCook</option>
															<option name="boardCate">PoisonCook</option>
														</select>
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label class="label" for="subject">����</label>
														<input type="text" class="form-control" name="title" id="subject" placeholder="����">
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<label class="label" for="#">����</label>
														<div class="filebox">
														    <input class="upload-name" value="÷������" placeholder="÷������">
														    <label for="file">����ã��</label> 
														    <input name="fileName" type="file" id="file">
														</div>
														<textarea name="content" class="form-control" id="message" cols="30" rows="10" placeholder="�����ۼ�"></textarea>
													</div>
												</div>
												<div class="col-md-12">
													<div class="form-group">
														<input type="submit" value="�Խñ� �ø���" class="btn btn-primary">
														<div class="submitting"></div>
													</div>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
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
  <script>
	  $("#file").on('change',function(){
		  var fileName = $("#file").val();
		  $(".upload-name").val(fileName);
		});
  </script>
    
  </body>
</html>