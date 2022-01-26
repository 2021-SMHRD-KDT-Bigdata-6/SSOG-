// 무료 효과음 소스
// https://www.soundjay.com/

// 사용된 소리 소스
// https://www.soundjay.com/rain-sound-effect.html

function button_click() {
  var audio = new Audio('rain-02.mp3');
  audio.play();
}
 
// DOM api로 audio element 얻기
function button2_click() {
  var node = document.querySelector('#audio1');
  node.play();
}