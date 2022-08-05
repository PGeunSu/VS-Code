//함수
//f(x,y)=x+y

//자바스크립트에서의 핵심적인 부분
//함수는 필요할 때 여러번 사용가능하다.
//코드의 중복을 줄일 수 있으음, 유지보수를 쉽다.(수정이 쉬움), 중
//함수 이름을 정할 때는 기능에 맞게 지어줄것.

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//예약어,  노란색 : 함수이름(매개변수)
// function add(x,y){
//     값을 내뱉는다. (반환값)
//     return x+y;
// }

// function print(){
// console.log("함수 호출");
// }

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//  인수(인자값)
// console.log(add(1,2));
// add(1,3);

// const a = add(10,20)
// console.log(a)
//print(); (함수호출)

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
function call(a,b,c=10){ //c = default 매개변수
    return a+b+c;
}

console.log(call(1,3)); //=14

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
function add(a,b){
    return a+b;
}
console.log(add(1,2,3));    



/* 
함수 선언문
function sum(x,y){
    return x+y;
}
함수 표현식 (익명 함수)
var sum= function(x,y){
    return x+y;   
}
(기명 함수)
var sum= function dd(x,y){
    return x+y;

ES6 arrow Function(화살표 함수)
var sum = (x,y)=>x+y;   (사용 빈도 수가 제일 많음)
*/


//함수 오버로딩
//함수이름은 동일하지만  매개변수 갯수가 다르거나 타입이 다른 경우
 //JS에서의 정식문법은 아님
 function myFunc(a,b,c){
    const len=arguments.length;

    if(len==0){
        console.log("매개변수 없음");
    }
    else if(len==1){
        console.log("한개");
    }
     else{
    return a+b+c
}
 }
 myFunc(); 
 myFunc(1); 
 myFunc(1,2);

 //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 //즉시 실행함수 (단 한 번만 호출가능)
 (function(){

    let a = 3;
    let b = 5;
    console.log(a+b);
    console.log("? 이건뭐지");
 }());
//기명 즉시 실행함수
 (function dd(){

    console.log("기명 즉시 실행함수");
 }());
 
 //dd(); +> error...즉시 실행함수 이기 때문

 //즉시 실행 함수도 일반 함수처럼 값을 리턴할 수 있고 인수를 전달할 수 있다.
 var res = (function(a,b){
    return a*b;
 }(3,5)); // = 15
 console.log(res);

 //중첩 함수(내부 함수) : 추천하지 않는 함수
 function outer(){
    var x =1;

    function inner(){
        var y=2;
        console.log(x+y);
    }
  inner();
 }
 // inner(); //error->외부함수 안에 정의된 내부 함수는 외부함수 내에서만 호출할 수 있다.