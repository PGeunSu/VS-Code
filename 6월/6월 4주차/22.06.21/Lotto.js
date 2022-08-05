
function game(){
let lottoNum = [];
  for (i = 0; i < 6; i++) {
    randomNum = Math.floor(Math.random() * 45 + 1); // *45 + 1 = (1에서 부터 45사이에 숫자 출력)
    if (lottoNum.indexOf(randomNum) === -1) {
      lottoNum.push(randomNum); //중복 되는 값 처리
    } else {
        i--;
    }
    
  }

  // 첫번 째 방법ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  lottoNum.sort(function(a,b){
    return a-b;
  });

  console.log(lottoNum);


  //화살표 함수 사용 방법ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//   let result = lottoNum.sort((a,b)=>a-b);
//   console.log(result)

document.getElementById("lottoNum").innerHTML = lottoNum;

}                                               