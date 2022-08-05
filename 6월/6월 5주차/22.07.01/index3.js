//Recursive(재귀) : 자신을 다시 호출하는 구조로 만들어진 녀석
//종료조건(기저조건)이 반드시 있어야 한다.

//d일반적인 반복문
let result = 0;
for (let i = 1; i < 101; i++) {
  result += i;
}
console.log(result); //5050
//수학적인 공식문
let num = 100;
console.log((num * (num + 1)) / 2); //5050

//재귀 함수
function sum(num) {
  if (num <= 1) return 1;
  return num + sum(num - 1);
}
console.log(sum(100)); //5050

//단점 : 상대적으로 메모리 소요가 높음, 속도가 느림 ,함수를 반복적으로 호출하기 떄문에 스텍 메모리가 늘어남,
//스택 오버플러워 현상이 일어날 수도 있음

//팩토리얼(factorial) : 자기 자신부터 1씩 감소해서 곱한 수
//ex : 5*4*3*2*1 = 120

function factorial(n) {
  let result = 1;

  for (let i = n; i >= 1; i--) {
    result *= i;
  }
  return result;
}
console.log(factorial(5)); //120

function factorialRecusive(n) {
  if (n == 1) return 1; //종료 조건
  return n * factorialRecusive(n - 1);
}

console.log(factorialRecusive(5));

//피보나치 수열
//1.반복문
//2.재귀 함수로
