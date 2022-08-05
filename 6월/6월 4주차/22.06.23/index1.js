//string 

const str = "hello world";

//인덱스 메서드는 해당열에서 인수로 전달받은 문자 검색
//인수로 전달받은 문자열을 검색해서 첫번 째 인덱스 반환.
console.log(str.indexOf('l')); //2
//or을 검색해서 첫번 째 인덱스 리턴
console.log(str.indexOf('or')); //7
//띄어쓰기 공백도 인덱스열 포함

//검색하려는 문자가 없으면 -1 리턴
console.log(str.indexOf('a')); // -1

//인덱스 [3] 부터 'l'을 검색하겠다. 첫번 째 인덱스 반환.
console.log(str.indexOf('l',3)); // 3

if(str.indexOf('hello')==-1){
    //hello가 포함 되어 있는 경우 처리할 코드
}
if(str.includes('hello')){
    //hello가 포함 되어 있는 경우 처리할 코드
}

//ES6
//인수로 전달받은 문자열로 시작하냐? true or false 리턴 
console.log(str.startsWith('he')); //true
console.log(str.startsWith('He')); //flase   (대소문자 구분)

//인덱스 1부터 인덱스 4 이전까지의 부분 문자열 반환
//substring의 첫번 째 인수는 두번 째 인수보다 작은 정수여야  정상
//첫번재 > 두번쨰 인경우 교환
console.log(str.substring(1,4)); //ell

//두번 째 인수는 생략가능. 이때 첫번 쨰 인수로 전달한 인덱스에 
//위치하는 문자부터 마지막문까지 부분 문자열 반환
console.log(str.substring(1)); //ello world

//스페이스바(공백) 기준으로 앞에 있는 부분문자열 반환
console.log(str.substring(0,str.indexOf(' '))); //hello

//스페이스바(공백) 기준으로 뒤에 있는 부분문자열 반환
console.log(str.substring(str.indexOf(' ')+1,str.iength)); //world

console.log(str.substring(0,5)); //hello
console.log(str.slice(0,5)); //hello

//인수 < 0 (음수) or NaN 경우 0으로 취급
console.log(str.substring(-5)); //hello world
//뒤에서 5자리를 잘라내서 반환     (substring과 slice의 차이점)
console.log(str.slice(-5)); //world

console.log(str.toUpperCase()); // HELLO WORLD (전부 대문자로 변환)
console.log(str.toLowerCase()); // hello world (전부 소문자로 변환)


const str1 = "   foo    ";

//문자열 앞뒤에 공백문자가 있을경우 제거 후 반환 (중간에 있는 공백은 제거 X)
console.log(str1.trim()); //foo

//첫번 째 인수를 찾아서 두번 쨰 인수로 치환(변환)한다.
console.log(str.replace('world','lee')); //hello lee

const str2 = "how are you doing?";

//split : 대상 문자열에서 첫번 째 인수로 전달한 문자열 또는 정규표현식을 검색하여
//문자열을 구분한 후 분리된 각 문자열로 배열을 반환한다.
//공백으로 구분(단어로)하여 배열로 리턴
console.log(str2.split(' ')); //(4) ['how', 'are', 'you', 'doing?']
//빈문자열로 인수로 넣으면 각 문자로 모두 분리한다.
console.log(str2.split(''));     //(18) ['h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u', ' ', 'd', 'o', 'i', 'n', 'g', '?']

//인수를 생략하면 문자열 전체를 배열로 반환.
console.log(str2.split());  // ['how are you doing?']

//split은 배열로 반환하기 때문에 array.reverse, join 사용 가능
//문자열을 뒤집을 수 있다.
function reverseString(){
    return str.split('').reverse().join('');
}
const helloStr = 'Hello World'
console.log(reverseString(helloStr)); //dlrow olleh 

