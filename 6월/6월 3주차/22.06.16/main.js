console.log(1);
// void : 타입
// 자바스크립트 같은 경우에 ;(세미클론이)을 사용할 필요가 없지만 예의상 사용한다.
console.log("안녕? 지옥으로 온 걸 환영한다.");

//var : 식별자
//변수는 하나의 값을 저장하기 위해 존재(데이터 저장)


var number = 1;

console.log("변수 number에 저장된 값은?",number)

//변수를 사용하려면 반드시 선언이 필요하다.
//선언할 떄는 var, let, const 키워드를 사용한다.
//var은 여러 단점이 있는데, 가장 대표적인 것은
//블록레벨 스코프를 지원하지 않고 함수레벨 스코프를 지원한다.
//var의 단점을 보완해주는 것이 let, const키워드임

var score =100; //변수선언과 동시에 초기화
score=200; //재할당 (메모리 공간 낭비)
console.log("변수 score에 저장된 값은? :" ,score);

//재선언 
var num =10000;
var num = 20;
console.log(num);
//var은 재선언과, 재할당이 가능하다(단점)
//오류가 뜨지않기 때문에

let letNum = 10;
console.log("변수 letNum에 저장된 값은?" , letNum);
letNum = 20;
console.log("변수 letNum에 저장된 값은?" , letNum);

//let 키워드는 재선언 블가능, 재할당 가능
// let letNum = 20; ,

var player; //변수선언
player = "플레이어" //할당
console.log("선언만 했을떄 : ",player)


let test;
test="테스트";
console.log(test)

//const 키워드는 선언과 동시에 초기화를 해야 오류가 나지 않는다.
//재할당, 재선언 불가능

const constNumber = 10;
console.log(constNumber);

// var, let const 중 주로 const로 쓰며 값이 바뀔수도 있는 상황인 경우 let 키워드 사용
// var은 거의 사용하지 않음

//한글로 변수선언은 가능하나 절대 사용하지 않는다.(회사에서 짤림 ㅋ)
const 한글="한글로 변수 선언";
console.log(한글);

//변수선언에는 특수문자, 첫글자가 숫자, 사전에 정의된 키워드 불가능 ,(대소문자 구분가능     )
// const first-name; ,(1st) ,//const this;


//카멜표기법(합성어의 경우 두번째 단어의 첫시작은 대문자로)
// const firstName;

//스네이크 표기법 
// first_name;

//파스칼 표기법 (1,2번째 단어의 첫시작을 대문자로)
// FirstName;

// strFirstName;

/*
데이터 타입
-원시타입
  -숫자타입(숫자, 정수 ,실수 구분없이 하나의 숫자타입만 존재)
  -문자열 타입(문자열)
  -분리언 타입(true,false) (많이 쓰면 해석하기 어려워짐)
  -undefined(var키워드로 선언된 변수에 암묵적으로 할당된 값)
  -null(값이 없다는 것을 의도적으로 명시할 때 사용)
    
-객체타입
  -객체,함수,배열....
 */

  const integer = 10;
  const double = 10.12;
  const negative = -20;
  const str="안 녕?";
  const isCheck= false;

  console.log(typeof integar);
  console.log(typeof double);
  console.log(typeof negative);
  console.log(typeof str);
  console.log(typeof isCheck);

  const binary = 0b01000001; //10진수로 65
  const hex = 0x41; //16진수 65
  console.log(binary);  
  console.log(hex);

  //자바 스크립트는 데이터 타입을 제공하지 않기 때문에 10진수로 해석
   
//   1,   1,0000
//=,==,=== (=은 대입,  ==은 비교 ===타입까지 동일한가 비교)
//자바스크립트는 정수로 표시된다 한들 실수(.000)로 해석 
//정수만을 위한 타입은 존재하지 않음 
  console.log(1===1.0);


// '(a)'(싱글쿼터), "(ㅁㄴ)"(더블쿼터), ``(백터); 
//싱글쿼터 : 단일문자
//더블쿼터 : 문자



const str1 = "브라우저에 띄우려면 document.write를 사용"
document.write(str1); 
window.document.write(str1);
//위에 사용되는 문자는 동일하게 사용

//오류창)
// alert("안녕");  

// //명령 프롬포트 적용(입력창)
// prompt("입력해라");


