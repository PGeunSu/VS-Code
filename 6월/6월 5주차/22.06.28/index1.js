let numOne = "";
let numTwo = "";
let operator = "";

const $operator = document.querySelector('#operator')
const $result = document.querySelector('#result')


// document.querySelector('#num-0').addEventListener('click',()=>{

//     if(operator){
//         numTwo+= "0";
//     }
//     else{
//         numOne += "0";
//     }
//     $result.value += "0";

// });

/* 조건문 억제 방법
1. if문 다음에 나오는 공통된 절차를 분기점 내부에 넣는다.
2. 분기점에서 짧은 절차부터 실행할수 있도록 if작성
3. 짧은 절차가 끝났을 경우 return(함수 내부의 경우)
 또는 break(for문 내부의 경우)로 중단함 
4. else 제거 (이때 중첩된 녀석이 사라진다.)
5. 다음 중첩이 생길경우 1~4 과정 반복
*/

//숫자버튼 클릭
// const onClickNum = (event) => {      //변경 전
//     if(operator){
//         if(!numTwo){
//             $result.value = "";     //값을 저장하기 전에 비워버림 
//         }
// numTwo += event.target.textContent;
//     }
//     else{
//         numOne += event.target.textContent;
//     }
//     $result.value += event.target.textContent;
// };



const onClickNum = (event) => {         //변경 후
    if(!operator){
    numOne += event.target.textContent;
    $result.value += event.target.textContent;
    return;
    }
    //여기 부터는 operator가 존재하는 경우에만 실행
        if(!numTwo){
            $result.value = "";     //값을 저장하기 전에 비워버림 
        }
        numTwo += event.target.textContent;
        $result.value += event.target.textContent;
    }



//연산자 클릭
const onClickOper = (op) => () => {
    if(numOne){
        operator = op;
        $operator.value = op;
    }
    if(numTwo) {
        switch(operator){
            case '+' :
                //parseInt : 문자를 정수(숫자)로 변경 시켜줌
                $result.value = parseInt(numOne) + parseInt(numTwo);
                numOne = $result.value;
                numTwo = "";
                break;
            case '-' : // + 빼고 나머지 연산자는 자동으로 변환 시켜줌
                $result.value = numOne - numTwo;
                numOne = $result.value;
                numTwo = "";
                break;
            case '*' :
                $result.value = numOne * numTwo;
                numOne = $result.value;
                numTwo = "";
                break;
            case '/' :
                $result.value = numOne / numTwo;
                numOne = $result.value;
                numTwo = "";
                break;

                default :
                break;
        }
    }
    else if(!numOne){
        alert("숫자 먼저 입력해라")
    }
    //첫번 째 입력값 표시
    document.getElementById("numOne").innerHTML = numOne;
}

document.querySelector('#num-0').addEventListener("click",onClickNum);

   
document.querySelector('#num-1').addEventListener("click",onClickNum);

document.querySelector('#num-2').addEventListener("click",onClickNum);
document.querySelector('#num-3').addEventListener("click",onClickNum);
document.querySelector('#num-4').addEventListener("click",onClickNum);
document.querySelector('#num-5').addEventListener("click",onClickNum);
document.querySelector('#num-6').addEventListener("click",onClickNum);
document.querySelector('#num-7').addEventListener("click",onClickNum);
document.querySelector('#num-8').addEventListener("click",onClickNum);
document.querySelector('#num-9').addEventListener("click",onClickNum);

document.querySelector('#plus').addEventListener("click",onClickOper('+'));
document.querySelector('#minus').addEventListener("click",onClickOper('-'));
document.querySelector('#divide').addEventListener("click",onClickOper('/'));
document.querySelector('#multiply').addEventListener("click",onClickOper('*'));
document.querySelector('#calculate').addEventListener("click",()=>{
    if(numTwo){
        switch(operator){
            case '+' :
                //parseInt : 문자를 정수(숫자)로 변경 시켜줌
                $result.value = parseInt(numOne) + parseInt(numTwo);
                numOne = $result.value;
                numTwo = "";
                break;
            case '-' : // + 빼고 나머지 연산자는 자동으로 변환 시켜줌
                $result.value = numOne - numTwo;
                numOne = $result.value;
                numTwo = "";
                break;
            case '*' :
                $result.value = numOne * numTwo;
                numOne = $result.value;
                numTwo = "";
                break;
            case '/' :
                $result.value = numOne / numTwo;
                numOne = $result.value;
                numTwo = "";
                break;

                default :
                break;
        }
    }
    $operator.value = "";
    document.getElementById("numOne").innerHTML = numOne;
});
document.querySelector('#clear').addEventListener("click",()=>{

    $operator.value = "";
    $result.value = "";  
    numOne = "";               //resul값을 0으로 설정 후  
    numTwo = "";
    operator = "";               //처음 입력 했던 값을 비워줌
});



 

// const func = (msg)=>{
//     return () => {
//         console.lof(msg);
//     };
// };

// //위 func처럼 함수본문에서 바로 리턴되는 값이 있으면 return이랑 {} 생략 가능
// const func1 = (msg) => () => {
//     console.log(msg);
// };

// const onClickNum = (number) => (event) => {
//     if(ofrator){
// numTwo += number;    
//     }
//     else{
//         numOne += number;
//     }
//     $result.value += number;
// };

// const onClickNumber = (number) => {
//     return (event) => {
//      if(ofrator){
//         numTwo += number;    
//   }
//     else{
//     numOne += number;
//        }
//     $result.value += number;
//     };
    
// };

// eval() 문자열을 자동으로 계산해줌
//코드가 간단해서 편하지만 보안에 취약해서 실무에서는 거의 사용하지 않는다.
// console.log(eval('1+2'))

