//디스트럭처링 할당(구조분해 할당)
//1개 이상 변수에 개별적으로 할당하는 것.


/*
//ES5 의 할당 방법
var arr=[1,2,3];
var one = arr[0];
var two = arr[1];
var three = arr[2];

console.log(one, two, three); // 1 2 3

*/ //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// ES6
// const arr = [1,2,3];
// const [one,two,three] = arr;

// //할당 기준은 인덱스 기준
// console.log(one,two,three);  // 1 2 3

// let x,y;           //이러한 방법도 존재하나 추천하지 않는 방법
// [x,y] = [1,2];

// const [a,b] = [1,2];
// console.log(a,b); //1,2

// const [c,d] = [1];
// console.log(c,d); //1 undefined

// const [e,f] = [1,2,3];
// console.log(e,f); //1 2    반드시 일치할 필요는 없다.

const [a,b,c=3] = [1,2];
console.log(a,b,c)  // 1 2 3 (default값)

const [e,f = 10, g=3] = [1,2];
console.log(e,f,g); // 1 2 3    (default)기본값보다 할당된 값이 우선시 된다.
       
//ES5
//             //key       value
// var user = {firstname : "Lee", lastname : "chang"};
// var firstName = user.firstname;
// var lastName = user.lastname;w

// console.log(firstName,lastName); //Lee chang


//ES6
// const user = {firstName : "Lee", lastName : "chang"};
// const{lastName,firstName} = user;
// console.log(firstName,lastName); //Lee chang

//객체 구조분해할당은 객체를 인수로 전달받는 함수의 매개변수에도 사용할 수 있음.

// function print(todo){
//     console.log( '할일 ${todo.contents}은 ${todo.completed ? "완료" : "비완료"}상태임')
// }

const todo = {id : 1, content : "HTML", completed : true};

//todo객체로부터 id프로퍼티만 가져온다.
const {id} = todo;