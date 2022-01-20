let isFetching = false;
let lastId = 99999999;
let TABLE_ELE = document.querySelector('div.row.d-flex');
const drawList = (DATA) => {
    let listHtml = "";
    console.log(DATA);
    DATA.forEach((item, index) => {
    // 실제 json key 이름으로 맞춰주기
        const { num, boardCate, title, writer, filename, filepath, content, w_day } = item;
        const TR_ELE = document.createElement('div');
        // <div></div>
        TR_ELE.setAttribute("class", "col-lg-6 d-flex align-items-stretch ftco-animate fadeInUp ftco-animated");
        TR_ELE.setAttribute("style", "padding-left: 0px;");
        // <div class="col-lg-6 d-flex align-items-stretch ftco-animate fadeInUp ftco-animated"> </div>
        /*listHtml = `${data1}
                    ${data2}
                    ${data3}
                    ${data4}
                    ${data5}
                    ${data6}`;*/
         // 동적으로 바뀌어야 되는 내용들을 ${위에서추출한 변수이름} 으로 바꿔서 채워주기
        let inner = `<div class="blog-entry d-md-flex">
          		<a href="boardContents?num=${num}" class="block-20 img" style="background-image: url(${filepath});">
              </a>
              <div class="text p-4 bg-light" id="pdbtWhy">
              	<div class="meta">
              		<p><span class="fa fa-calendar">2022-01-13 15:27:47</span></p>
              	</div>
                <h3 class="heading mb-3"><a href="boardContents?num=${num}">${title}</a></h3>
               
            <div class="about-author d-flex p-4 bg-light" id="specialWhy">
              <div class="bio mr-5 md" style="height: 50px;width: 50px;">
                <img src="resources/images/person_1.jpg" style="width: 50px;" alt="Image placeholder" class="img-fluid mb-4 md" id="bdrd">
              </div>
              <div class="desc" style="display: flex; align-items: center; justify-content: center;">
                <h3 id="gogi" style="margin-bottom: 0px;">${writer}</h3>
              </div>
            </div>
                <p></p>
                <a href="boardContents?num=${num}" class="btn-custom">Continue <span class="fa fa-long-arrow-right"></span></a>

              </div>
            </div>`;
 
        if (index === DATA.length - 1){ lastId = num; }// 마지막건 ID 저장
 
        TR_ELE.innerHtml = inner;
        //TABLE_ELE를 
        TABLE_ELE.appendChild(TR_ELE);
    });
        isFetching = false; // callback이 끝났으니 isFetching 리셋
};
 

const getList = (url) => {
    isFetching = true; // 아직 callback이 끝나지 않았어요!
    console.log(lastId);
    //URL을 /load_happyCook 로 
  fetch(url+"?num="+lastId, {
    method: "POST",
    headers: {
    'Content-Type': 'application/json'
  },
    body: JSON.stringify({
      'num':lastId
    })
  })
    .then((res) => res.json())
    .then((resJson) => {
    	console.log(resJson);
      drawList(resJson);
    });
};
 /*
window.addEventListener("scroll", function () {
  const SCROLLED_HEIGHT = window.scrollY;
  const WINDOW_HEIGHT = window.innerHeight;
  const DOC_TOTAL_HEIGHT = document.body.offsetHeight;
    const IS_END = (WINDOW_HEIGHT + SCROLLED_HEIGHT > DOC_TOTAL_HEIGHT - 500);
 
  if (IS_BOTTOM && !isFetching) { // isFetching이 false일 때 조건 추가
    getList("/load_happyCook");
  }
});*/