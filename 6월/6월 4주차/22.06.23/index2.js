//Date
//날짜와 시간을 제공하는 메서드 함수

//2 => 3월을 나타냄 0 = 1월
const d = new Date(2020,2);
console.log(d); // Thu Jun 23 2022 10:33:17 GMT+0900 (한국 표준시)

//1970.01.01기준으로 경과된 밀리 초 계산
const now = Date.now();
console.log(now); //1655948222051

const today = new Date('2020/07/24').getFullYear();
console.log(today) //2020

const today1 = new Date('2020/07/24').getMonth();
console.log(today1) //6 7월은 : 6

(function printNow(){
    const today = new Date();
    
    const datNames = ['(일요일)','(월요일)','(화요일)','(수요일)','(목요일)','(금요일)','(토요일)'];
    
    //getDay : 해당요일 (0~6)을 나타내느 정수를 리턴.
    const day = datNames[today.getDay()];
    
    const year = today.getFullYear();
    const month = today.getMonth()+1;
    const Date = today.getDate();
    const hour = today.getHours();
    const minute = today.getMintes();
    const second = today.getSeconds();
    const ampm = hour > 12 ? 'PM':'AM';

    //12시간제로 바꿈
    hour %=12;
    hour= hour||12;

    //10미만인 분과 초를 두 자리로 변경
    minute = minute<10 ?'0'+minute : minute;
    second = second<10 ? '0'+second : second;

    const now = '${year}년 ${month}월 ${month}일 ${day} ${hour} : ${minute} ${second} ${ampm}';

    console.log(now);

    // 콜백 함수 : 함수안에서 특정 시점에 호출되는 함수
    setTimeout(printNow,1000);
    
}());