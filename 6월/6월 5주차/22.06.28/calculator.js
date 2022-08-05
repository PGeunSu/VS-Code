let numOne = "";
let numTwo = "";
let operator = "";

const $operator = document.querySelector('#operator')
const $result = document.querySelector('#result')

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
    numOne = "";               //result값을 0으로 설정 후  
    numTwo = "";
    operator = "";               //처음 입력 했던 값을 비워줌
});