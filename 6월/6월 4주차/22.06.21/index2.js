


//join() : 원본배열의 모든 요소를 문자열로 변환.
//인수로 전달받은 문자열, 구분자로 연결한 문자열을 반환 (원본배열 건드림)
const arr=[1,2,3,4];
const result = arr.join('');
console.log(result); //1234


//reverse() : 원본배열의 순서를 반대로. (원본배열 건드림)
const arr1=[1,2,3,4];
const result1 = arr1.reverse();
console.log(result1); //4,3,2,1

//고차함수 (함수를 인수로 전달 받거나 함수를 리턴하는 함수)
//JavaScript는 고차함수를 지원함. 특히 배열은 매우 유용한 고차함수를 지원함.
const fruits = ['banana','apple','orange']
fruits.sort(); //(오름차순 정렬) ,reverse함수 사용하여 내림차순 정렬 가능
console.log(fruits); //apple, banana, orange 

//정리해둘것. (배열과 관련된 메서드)
//map, filter, reduce, some, every find

//1. 로또 번호 생성기 1~45  랜덤 숫자 6개 중복x   오름차순 정렬   