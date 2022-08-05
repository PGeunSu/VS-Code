//RegExp(정규 표현식)
//일정 한 패턴을 가진 문자열 집합
//반복문이나 조건문 없이 패턴을 정의하고 테스트 하는 것으로 간단 히 체크가 가능하다.
//주석이나 공백을 허용하지 않고 여러가지 기호를 혼합해서 사용하기 때문에 가독성이 떨어진다.
//정규표현식은 문자열을 대상으로 패턴 매칭 기능을 제공

//패턴 매칭 기능 : 특정 패턴과 일치하는 문자열을 검색하거나 추출 or 치환할 수 있는 기능

//010-1234-1234 (숫자3 - 숫자 4 - 숫자 4)

const phone = "010-1234-1234";

//정규 표현식 리터럴로 핸들폰 전화번호 패턴 정의
const regExp = /^\d{3}-\d{4}-\d{4}$/;

console.log(regExp.test(phone)); //true

const target = "Is this all there is?";

const targetRegExp = /is/i; // 패턴 : is , 플래그 : i : 대소문자를 구분하지 않고 검색

//test : target문자열에 대해서 정규표현식 targetRegExp의 패턴 검색
//매칭 결과를 불리언 값을 return
console.log(targetRegExp.test(target)); //true

//exec : 인수로 전달받은 문자열에 대해 정규표현식의 패턴을 검색
//매칭 결과를 배열로 return. 해당 결과가 없으면 null return
console.log(targetRegExp.exec(target));

//플래그 : 옵션(선택적으로 사용 할 수 있다. 순서와 상관없이 하나 이상의 플래그를 동시에 설정할 수도 있다.)
// 설정하지 않은 경우 대소문자를 구별해서 패턴을 검색 (default)
//정규 표현식의 검색 방식을 설정하기 위해 사용
// i : 대소문자르 구분하지 않고 검색
// g : 대상 문자열 내에서 패턴과 일하는 모든 문자열 검색
// m : 문자열의 행이 바뀌더라도 패턴검색을 계속 함.

// . 은 임의의 문자 한개를 의미함.
const regExp1 = /.../g; //  : 문자의 내용과 상관없이 3자리 문자열과 매치한다.
// /string 객체가 제공(match) : 대상 문자열과 인수로 전달받은 정규표현식과의 매칭결과를 바탕으로 문자열을 검색
console.log(target.match(regExp1)); //(7) ['Is ', 'thi', 's a', 'll ', 'the', 're ', 'is?']

const target1 = "A AA B BB Aa Bb AA";

//{m,n}은 앞선 패턴이 최소 m번, 최대 n번 반복되는 문자열을 의미
//주의 : ,뒤에 공백이 있으면 정상적으로 작동되지 않음.

//'A'가 최소 1번, 최대 2번 반복되는 문자열을 전역 검색
const regExp2 = /A{1,2}/g;

console.log(target1.match(regExp2)); //(4) ['A', 'AA', 'A', 'AA']

const target2 = "A AA B BB Aa Bb AA AAA";

//A가 2번 반복되는 문자열을 전역 검색
const regExp3 = /A{2}/g;
console.log(target2.match(regExp3)); //(3) ['AA', 'AA', 'AA']

//A가 최소 2번이상 반복되는 문자열을 검색
const regExp4 = /A{2,}/g;

const target3 = "A AA B BB Aa Bb AA AAA";
//+는 앞선 패턴이 최소 한 번이상 반복되는 문자열을 의미한다.
const regExp5 = /A+/g; //= A{1,}
console.log(target3.match(regExp5)); //(5) ['A', 'AA', 'A', 'AA', 'AAA']

const target4 = "A AA B BB Aa Bb";
// (A 또는 B)
const regExp6 = /A|B/g; //A 또는 B가 한 번이상 반복되는 문자열을 전역 검색
const regExp66 = /A+|B+/g; //분해 되지 않는 문자요소를 검색할 떄에는 +요소 사용
//const regExp66 = /[AB]+/g; //위와 동일함. [] 내의 문자는  or로 동작한다, 그 뒤에 +를 사용하면 앞선 패턴을 한번 이상 반복
console.log(target4.match(regExp6)); // (8) ['A', 'A', 'A', 'B', 'B', 'B', 'A', 'B']

const target5 = "A AA BB ZZ Aa Bb";
//A~Z가 한 번이상 반복되는 문자열을 전역검색
const regExp7 = /[A-Z]+/g;
console.log(target.match(regExp7)); //(8) ['A', 'A', 'A', 'B', 'B', 'B', 'A', 'B']

const target55 = "A BB Aa Bb 12";
//A~Z 또는 a~z 한 번이상 반복되는 문자열을 전역검색
const regExp77 = /[A-Za-z]+/g;
console.log(target55.match(regExp77)); //((4) ['A', 'BB', 'Aa', 'Bb']
