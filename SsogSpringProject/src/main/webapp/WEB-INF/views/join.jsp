<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<link rel="shortcut icon" href="resources/img/favicon.ico">
    <title>ȸ������</title>
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
    .auto{
    	margin : 0 auto;
    }
    .align{
    	text-align: center;
    }
    #buttonSize{
    	width : 50%;
    	margin : 0 auto;
    	border : 0;
    	padding-top : 0 !important;
    }
    #topH{
    	height: 200px !important;
    }
    #topH2{
    	height: 220px !important;
    }
    .genderM{
    	margin : 1rem;
    	
    }
    .genderM2{
    	margin-bottom : 2rem;
    }
    #btnSt{
    	margin-left : 1rem;
    	background-color : #f7f7f7;
    	border : 1px solid #a5a5a5;
    	
    }
    .footM{
    	margin-top : 100px;
    }
    </style>
  </head>
  <body>
	<div>
    	<%@include file="includes/header.jsp" %>
    </div>
    <!-- END nav -->
    
    <section class="hero-wrap hero-wrap-2" id="topH" style="background-image: url('resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay" id="topH"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center" id="topH2">
          <div class="col-md-9 ftco-animate mb-5 text-center">
          	
            <h2 class="mb-0 bread">ȸ������</h2>
          </div>
        </div>
      </div>
    </section>

    <section class="ftco-section">
    	<div class="container">
    		<div class="row justify-content-center">
          <div class="col-xl-10 ftco-animate">
			<form action="join.do" method="post" class="billing-form">
				<!-- <h3 class="mb-4 billing-heading align">������ ���</h3> -->
	          	<div class="row align-items-end">
	          		<div class="col-md-6 auto">
	                <div class="form-group">
	                	<label for="mb_id">���̵�</label><input id="btnSt" type="button" value="�ߺ�üũ" onclick="IdCheck()">
	                  <input name='mb_id' id="idCheck" type="text" class="form-control" placeholder="���̵� �Է����ּ���.">
	                </div>
	              </div>
				<div class="w-100"></div>
		            <div class="col-md-6 auto">
		            	<div class="form-group">
	                	<label for="mb_pwd">��й�ȣ</label>
	                  <input name='mb_pwd' type="password" class="form-control" placeholder="��й�ȣ�� �Է����ּ���.">
	                </div>
		            </div>
				<div class="w-100"></div>
		            <div class="col-md-6 auto">
		            	<div class="form-group">
	                	<label for="mb_name">�̸�</label>
	                  <input name='mb_name' type="text" class="form-control" placeholder="">
	                </div>
		            </div>
				<div class="w-100"></div>
		            <div class="col-md-6 auto">
		            	<div class="form-group">
	                	<label for="mb_phone">����ó</label>
	                  <input name='mb_phone' type="text" class="form-control" placeholder="���ڸ� �Է����ּ���.">
	                </div>
		            </div>
				<div class="w-100"></div>
		            <div class="col-md-6 auto">
		            	<div class="form-group">
	                	<label for="mb_addr">�ּ�</label>
	                  <input name='mb_addr' type="text" class="form-control" placeholder="">
	                </div>
		            </div>
				<div class="w-100"></div>
		            <div class="col-md-6 auto">
		            	<div class="form-group genderM2">
	                	<label for="mb_gender">����</label>
		                  <span class='genderM'><input type="radio" name='mb_gender' value="1">����</span>
		                  <span><input type="radio" name='mb_gender' value="2">����</span>
	                </div>
		            </div>
		            
		        <div class="w-100"></div>
		        <div class="cart-detail p-3 p-md-4" id="buttonSize">
		        	<input type='submit' value='ȸ������' class="btn btn-primary py-3 px-4">
		        </div>
	             
                <div class="w-100"></div>
		            
	            </div>
	          </form><!-- END -->

          </div> <!-- .col-md-8 -->
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

  <%--<script>
				function IdCheck(){
					//var input = document.getElementById('input_e');
					//alert(input.value)
					//vlaue : input�±׿� ������ �� 
					//innerHTML : �±� ���̿� �ִ� html ���� <p><span>b</span>a</p>
					//innerText : �±� ���̿� �ִ� text
					var input = $('#idCheck').val()
					
					$.ajax({
						type : "post",	//������ ���۹��
						data : {id : input},		//������ ������ ������
						url : "join.do",	//�������
						dataType : "text",	//������� ������ Ÿ��(JSON)
						success : function(data){
							if(data=="true"){ 	//�ִ� ���̵�
								alert('����� �Ұ����� ���̵� �Դϴ�')
								
							}else{	//���� ���̵�
								alert('��� ������ ���̵� �Դϴ�')
								
							}
						},
						error : function(){
							alert('����!')
						}
						
					})
				}
			
			
	</script> --%>
			
  </body>
</html>