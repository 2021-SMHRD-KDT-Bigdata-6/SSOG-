<%--@page import="model_board.BoardVO"--%>
<%--@page import="model_board.BoardDAO"--%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<link rel="shortcut icon" href="resources/img/favicon.ico">
    <title>Ŀ�´�Ƽ</title>
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
    #why{
    background-color: white !important;
    }
    .img-fluid.mb-4{
    border-radius: 100px;
    }
    .row{
    justify-content: center;
    }
    
    </style>
    
  </head>
  <body>
  <%--
  	String seq_num = request.getParameter("num");
  	BoardDAO dao = new BoardDAO();
  	BoardVO vo = dao.showOne(seq_num);
  
  
  --%>

<!-- ������COOK -->

  	<div>
  		<%@include file="includes/header.jsp" %>
  	</div>
    <!-- END nav -->
    
    <section class="hero-wrap hero-wrap-2" style="background-image: url('resources/images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end justify-content-center">
          <div class="col-md-9 ftco-animate mb-5 text-center">
          	<p class="breadcrumbs mb-0"><span class="mr-2"><a href="index.do">Home <i class="fa fa-chevron-right"></i></a></span> <span class="mr-2"><a href="b_poisonCook.do">Ŀ�´�Ƽ <i class="fa fa-chevron-right"></i></a></span> <span>������COOK</span></p>
            <h2 class="mb-0 bread">������COOK</h2>
          </div>
        </div>
      </div>
    </section>

    <section class="ftco-section ftco-degree-bg">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 ftco-animate">
          	<p>
              <img src="resources/images/image_1_1.jpg<%-- fileUpload/<%=vo.getFileName()%>--%>" alt="" class="img-fluid">
            </p>
            <div class="tagcloud" >
                <a href="#" class="tag-cloud-link" >#��������ŷ</a>
              
              </div>
            <p>���ѿ丮<%--=vo.getContent() --%></p>
            <div class="sidebar-box ftco-animate">
            </div>
            
            <!--  
            <h2 class="mb-3 mt-5">#2. Creative WordPress Themes</h2>
            <p>Temporibus ad error suscipit exercitationem hic molestiae totam obcaecati rerum, eius aut, in. Exercitationem atque quidem tempora maiores ex architecto voluptatum aut officia doloremque. Error dolore voluptas, omnis molestias odio dignissimos culpa ex earum nisi consequatur quos odit quasi repellat qui officiis reiciendis incidunt hic non? Debitis commodi aut, adipisci.</p>
            <p>
              <img src="images/image_2.jpg" alt="" class="img-fluid">
            </p>
            <p>Quisquam esse aliquam fuga distinctio, quidem delectus veritatis reiciendis. Nihil explicabo quod, est eos ipsum. Unde aut non tenetur tempore, nisi culpa voluptate maiores officiis quis vel ab consectetur suscipit veritatis nulla quos quia aspernatur perferendis, libero sint. Error, velit, porro. Deserunt minus, quibusdam iste enim veniam, modi rem maiores.</p>
            <p>Odit voluptatibus, eveniet vel nihil cum ullam dolores laborum, quo velit commodi rerum eum quidem pariatur! Quia fuga iste tenetur, ipsa vel nisi in dolorum consequatur, veritatis porro explicabo soluta commodi libero voluptatem similique id quidem? Blanditiis voluptates aperiam non magni. Reprehenderit nobis odit inventore, quia laboriosam harum excepturi ea.</p>
            <p>Adipisci vero culpa, eius nobis soluta. Dolore, maxime ullam ipsam quidem, dolor distinctio similique asperiores voluptas enim, exercitationem ratione aut adipisci modi quod quibusdam iusto, voluptates beatae iure nemo itaque laborum. Consequuntur et pariatur totam fuga eligendi vero dolorum provident. Voluptatibus, veritatis. Beatae numquam nam ab voluptatibus culpa, tenetur recusandae!</p>
            <p>Voluptas dolores dignissimos dolorum temporibus, autem aliquam ducimus at officia adipisci quasi nemo a perspiciatis provident magni laboriosam repudiandae iure iusto commodi debitis est blanditiis alias laborum sint dolore. Dolores, iure, reprehenderit. Error provident, pariatur cupiditate soluta doloremque aut ratione. Harum voluptates mollitia illo minus praesentium, rerum ipsa debitis, inventore?</p>
            <div class="tag-widget post-tag-container mb-5 mt-5">
              <div class="tagcloud">
                <a href="#" class="tag-cloud-link">Life</a>
                <a href="#" class="tag-cloud-link">Sport</a>
                <a href="#" class="tag-cloud-link">Tech</a>
                <a href="#" class="tag-cloud-link">Travel</a>
              </div>
            </div>
            -->
            <div class="about-author d-flex p-4 bg-light">
            </div>
            <div class="about-author d-flex p-4 bg-light" id="why">
              <div class="bio mr-5">
                <img src="resources/images/person_1.jpg" style=width:100px; alt="Image placeholder" class="img-fluid mb-4" id="bdrd">
              </div>
              <div class="desc">
                <h3>�Ľ���<%--=vo.getWriter() --%></h3>
                <p>hi</p>
              </div>
            </div>


            <div class="pt-5 mt-5">
              <h3 class="mb-5">comment(16)</h3>
              
            
              <ul class="comment-list">
                <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>���Ľųȳ���</h3>
                    <div class="meta">2021-11-20 8:21pm</div>
                    <p> ???�Һ��� �����䤻�������������������������������������������������������������������������������������������������������������������������������� </p>
                    <p><a href="#" class="reply">Reply</a></p>
                  </div>
                </li>

                <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>�߿˾Ƹ۸��غ�</h3>
                    <div class="meta">2021-11-20 8:33pm</div>
                    <p>���������������������������������������������������������������������������������������������Ҽ������������������������������������������������������������������������������������������������������������������������������������������������������������������������������</p>
                    <p><a href="#" class="reply">Reply</a></p>
                  </div>
                 </li>
                 
                    <li class="comment">
                      <div class="vcard bio">
                        <img src="resources/images/person_1.jpg" alt="Image placeholder">
                      </div>
                      <div class="comment-body">
                        <h3>�ΰǸ�</h3>
                        <div class="meta">2021-11-20 9:18pm</div>
                        <p>���������������������������������������������������������������������������������������������������ԤФ� ����������? �ȴ�ġ�̾��?</p>
                        <p><a href="#" class="reply">Reply</a></p>
                      </div>
                    </li>
                    
                    <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>herVillan</h3>
                    <div class="meta">2021-11-20 8:21pm</div>
                    <p> ��; </p>
                    <p><a href="#" class="reply">Reply</a></p>
                  </div>
                </li>
                
                <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>������������</h3>
                    <div class="meta">2021-11-20 8:21pm</div>
                    <p> �������� �ҳ��� �ִµ� �������� ���� ���� </p>
                    <p><a href="#" class="reply">Reply</a></p>
                  </div>
                </li>
                
                <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>Unbi</h3>
                    <div class="meta">2021-11-20 8:21pm</div>
                    <p> �츮���� ������ �ȵſ�~ </p>
                    <p><a href="#" class="reply">Reply</a></p>
                  </div>
                </li>
                   
                  </ul>
                </li>

              
              </ul>
              <!-- END comment-list -->
              
              <div class="comment-form-wrap pt-5">
                
            <div class="pt-5 mt-5">
              <ul class="comment-list">
                <li class="comment">
                  <div class="vcard bio">
                    <img src="resources/images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>�丮�˼�</h3>
                    <div class="meta"></div>
                  </div>
                </li>
                </ul>
                </div>
                  <div class="form-group">
                    <label for="message">Message</label>
                    <textarea name="" id="message" cols="30" rows="10" class="form-control"></textarea>
                  </div>
                  <div class="form-group">
                    <input type="submit" value="Post Comment" class="btn py-3 px-4 btn-primary">
                  </div>

                </form>
              </div>
            </div>

          </div> <!-- .col-md-8 -->
          <!--  
          <div class="col-lg-4 sidebar pl-lg-5 ftco-animate">
            <div class="sidebar-box">
              <form action="#" class="search-form">
                <div class="form-group">
                  <span class="fa fa-search"></span>
                  <input type="text" class="form-control" placeholder="Type a keyword and hit enter">
                </div>
              </form>
            </div>
            <div class="sidebar-box ftco-animate">
              <div class="categories">
                <h3>Services</h3>
                <li><a href="#">Relation Problem <span class="fa fa-chevron-right"></span></a></li>
                <li><a href="#">Couples Counseling <span class="fa fa-chevron-right"></span></a></li>
                <li><a href="#">Depression Treatment <span class="fa fa-chevron-right"></span></a></li>
                <li><a href="#">Family Problem <span class="fa fa-chevron-right"></span></a></li>
                <li><a href="#">Personal Problem <span class="fa fa-chevron-right"></span></a></li>
                <li><a href="#">Business Problem <span class="fa fa-chevron-right"></span></a></li>
              </div>
            </div>

            <div class="sidebar-box ftco-animate">
              <h3>Recent Blog</h3>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url(images/image_1.jpg);"></a>
                <div class="text">
                  <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="fa fa-calendar"></span> Apr. 18, 2020</a></div>
                    <div><a href="#"><span class="fa fa-user"></span> Admin</a></div>
                    <div><a href="#"><span class="fa fa-comment"></span> 19</a></div>
                  </div>
                </div>
              </div>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url(images/image_2.jpg);"></a>
                <div class="text">
                  <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="fa fa-calendar"></span> Apr. 18, 2020</a></div>
                    <div><a href="#"><span class="fa fa-user"></span> Admin</a></div>
                    <div><a href="#"><span class="fa fa-comment"></span> 19</a></div>
                  </div>
                </div>
              </div>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url(images/image_3.jpg);"></a>
                <div class="text">
                  <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="fa fa-calendar"></span> Apr. 18, 2020</a></div>
                    <div><a href="#"><span class="fa fa-user"></span> Admin</a></div>
                    <div><a href="#"><span class="fa fa-comment"></span> 19</a></div>
                  </div>
                </div>
              </div>
            </div>

            <div class="sidebar-box ftco-animate">
              <h3>Tag Cloud</h3>
              <div class="tagcloud">
                <a href="#" class="tag-cloud-link">counsel</a>
                <a href="#" class="tag-cloud-link">problem</a>
                <a href="#" class="tag-cloud-link">family</a>
                <a href="#" class="tag-cloud-link">personal</a>
                <a href="#" class="tag-cloud-link">business</a>
                <a href="#" class="tag-cloud-link">computer</a>
                <a href="#" class="tag-cloud-link">house</a>
                <a href="#" class="tag-cloud-link">technology</a>
              </div>
            </div>

            <div class="sidebar-box ftco-animate">
              <h3>Paragraph</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ducimus itaque, autem necessitatibus voluptate quod mollitia delectus aut, sunt placeat nam vero culpa sapiente consectetur similique, inventore eos fugit cupiditate numquam!</p>
            </div>
          </div>
		-->
        </div>
      </div>
    </section> <!-- .section -->

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