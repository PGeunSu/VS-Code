/*
산술연산자

+, -, *, /, %

*/

// const num = 5;
// const num1 = 2;

// const result =num+num1;

// console.log(result);
// console.log(num-num1);
// console.log(num*num1);
// console.log(num/num1);
// console.log(num%num1); //몫은 버리고 나머지 값 추출

// /*
// 단항 산술 연산자
// ++
// --

// */

// var x = 5;
// x++;  //=  X=X+1
// console.log(x)
// // x--; //=  X=x-1;

// var x= 5;;
// var res;

// //선할당 후 증가
// res=x++
// console.log(res,x);


// //선증가 후 할당
// res=++x;
// console.log(res,x) 

// //선할당 후 후감소
// res=x--;
// console.log(res,x)

// //선감소 후 할당
// res=--x;
// console.log(res,x)



//형변환 , prompt 입력이 무저권 문자열이기 떄문에
//(Number)입력 받은 데이터를 내가 원하는대로 숫자 타입으로 바꾼다
// const input = Number(prompt("첫번 째 숫자를 입력해라"));
// const input2 = Number(prompt("두번 째 숫자를 입력해라"));

// const sum=input+input2;

// console.log(input) //1
// console.log(input2)//2
// console.log(sum) //결과 : 12

/*
입력을 4개를 받는다.
국어, 수학, 영어, 과학
합계, 평균값 구하기
*/

// const k = 40;
// const s = 90;
// const y = 84;
// const g = 94;

// const k = Number(prompt("국어 점수"));
// const s = Number(prompt("수학 점수"));
// const y = Number(prompt("영어 점수"));
// const g = Number(prompt("과학 점수"));

// const sum= k+s+y+g;
// const average = sum/4;

// console.log(k);
// console.log(s);
// console.log(y);
// console.log(g);
// console.log(sum);
// console.log(average);


/*

할당 연산자
=

*/

// console.log(1==1);
// console.log(1==true);
// console.log(1===true);

// console.log(5!=8);
// console.log(5!=5);

// const test=2;
// //test값을 2로 나눈 나머지 값이 0 -> false
// const test1= test % 2 ? '홀수':'짝수'; //삼항 연산자(사용 빈도수가 높을 시 가독성이 떨어짐)

// console.log(test1)

// if(test%2) {
//     test1='홀수';
// }
// else{
//     test1='짝수';}


/*
논리 연산자
ㅣㅣor
&& and
! not
*/

// console.log(true||true);
// console.log(true||false);
// console.log(false||true);
// console.log(false||false);

// console.log(true&&true);
// console.log(true&&false);
// console.log(false&&true);
// console.log(false&&false);