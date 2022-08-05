const target = "AA BB 12,345";
const regExp = /[0-9]+/g;
console.log(target.match(regExp)); //(2) ['12', '345']

const regExp1 = /[\d,]+/g;
console.log(target.match(regExp1)); // ['12,345']

//0~9또는 ,가 한번이상 반복되는 문자열 전역검색
//let regExp = /[\d,]+/g;

//\D는 \d반대로 동작한다.(숫자가 아닌 문자를의미)
// regExp = /[\D,]+/g;
// console.log(target.match(regExp));

const target44 = "Aa Bb 12,345 _$%&";
// \w는 알파벳, 숫자, 언더스코어를 의미한다.
//[A-Za-z0-9_] 랑 동일하다.

//\W 알파벳, 숫자, 언더스코어가 아닌 문자를 의미
let regExp3 = /[\w,]+/g;
console.log(target.match(regExp));

const target1 = "AA BB 12 Aa Bb";
//^은 not의 의밀르 갖는다.
//숫자를 제외한 문자열 전역 검색
const regExp2 = /[^0-9]+/g;
console.log(target1.match(regExp2)); //(2) ['AA BB ', ' Aa Bb']

const address = "https://www.naver.com/";
//[] 밖의 ^ 는 문자열의 시작을 의미
const addrRegExp = /^https/;
console.log(addrRegExp.test(address)); //true

//$는 문자열의 마지막을 의미
const addrRegExp1 = /com$/;
console.log(addrRegExp1.test(address)); // false

//자주 사용되는 정규표현식
//1. 아이디로 사용 가능한 지 검사
//2. 메일주소 형식에 맞는 지 검사
//3. 특정 단어로 시작하는 지 검사
//4. 특정 단어로 끝나는 지 검사
//5. 숫자로만 이루어진 문자열인지 검사
//6. 하나 이상의 공백으로 시작하는 지 검사
//7. 핸드폰  번호 형식에 맞는 지 검사
//8. 특수문자 포함하는 지 검사

//
