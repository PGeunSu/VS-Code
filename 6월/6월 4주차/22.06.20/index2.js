
const a = 1; //(전역 변수)

function add(x,y){
    //매개변수 x,y는 함수 내부에서만 참조할 수 있다.
    //매개변수의 유효범위는 함수 내부에서만 가능.

    // const a = 1; : 지역변수  (함수가 끝나는 시점에서 메모리가 없어짐)

    console.log(x,y);
    return x+y; 
}
console.log(add(1,2));
// console.log(x,y); (error) 매개변수는 함수 내부에서만...

var var1 = 1; //전역변수)
if(true){
    var var2 =2; //코드 블럭 내에서 선언한 변수
    if(true){
        var var3 = 3; //중첩된 코드 블럭 내에서 선언한 변수
    }
}

function foo(){
    var var4 = 4; //함수 내에서
    function bar(){
        var var5 = 5; //중첩 함수 내에서
    }
}

console.log(var1);
console.log(var2);
console.log(var3);

//여기서부터 오류
// console.log(var4);
// console.log(var5);


/*
구분                                   스코프      변수
전역 전역변수 : 코드의 가장 바깥영역   전역 스포크 전역변수
지역 함수 몸체 내부                   지역 스포크 지역변수


*/
var x = "global X";
var y = "global Y";

function outer(){
    var z = "outer 안에 있는 지역변수 local Z"
    
    console.log(x);
    console.log(y);
    console.log(z);

    function inner(){
var x = "inner안에 있는 local x"
console.log(x);
    console.log(y);
    console.log(z);
    }
inner();
}
outer(); 

//전역변수의 단점

//전역변수는 생성주기가 긺 
//가독성 떨어짐 ,무분별한 난무 금지
//의도치 않은 재할당 주기가 이루어짐,\   메모리 리소스 낭비 

/* 전역변수 대체
1. 즉시실행 함수
2. 객체로 만들어버린다.
 */ 


var globlaX = 1;
if(true){
    var globalX = 10; //전역변수로 인식 (의도치 않은 결과가 나올 수 있음.)
}
console.log(globalX);

var i = 10;
for(var i = 0; i < 5; i++){

}

console.log(i)
//ES6를 사용하려면 var를 사용x
//재할당이 필요하다면 let

//변수를 선언할 때는 우선 const를 사용하고 재할당이 필요한 상황이라면 let으로 변경