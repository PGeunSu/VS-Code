
//javascript에서는 함수와 배열이 가장 중요하다.

//배열 (Array)
/*
여러개의 값을 순차적으로 나열한 자료구조이다.
사용빈도가 매우 높다.

*/

        //arrNum[0] ~ arrNum[4]
const arrNum= [1,2,3,4,5]; //배열은 대괄호로 선언

// console.log(arrNum);
// console.log(arrNum.length);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//(첫번 째 방법)
// const arrNum1 = [];
// arrNum1[0] = 1;
// arrNum1[1] = 110;
// arrNum1[2] = 12;
// arrNum1[3] = 16;
// arrNum1[4] = 17;

// 2번쨰 방법
console.log(arrNum[0]); //1
console.log(arrNum[1]);//2
console.log(arrNum[2]);//3
console.log(arrNum[3]);//4
console.log(arrNum[4]);//5
console.log(arrNum.length); //길이
console.log("arrNum의 TYPE : " ,typeof arrNum);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 문자도 상관 없음.
            //fruit[0], fruit[1], fruit[2]
const fruit = ['apple', 'banana', 'orange'];

console.log(fruit);
console.log(fruit[0]);
console.log(fruit[1]);
console.log(fruit[2]);

//3번째 방법

const arrNum2 = new Array(1,2,3,4,5);
console.log(arrNum2);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

let forArr = [];
for(let i = 0;i<5;i++){
    forArr[i] = i+1;

    //arrNum[0] = 1; ()
    forArr[0] = 1;
    forArr[1] = 2;
    forArr[2] = 3;
    forArr[3] = 4;
}
console.log('for문을 이용', forArr)

for(let index = 0; index<forArr.length;index++){
    document.write(forArr[index]+'<br>')        
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// function linearSearch(arr,target){
//     const length = arr.length; //arr의 길이
//  //for문을 돌면서
//     for(let i = 0;i<length;i++){
//        //내가 찾으려고 하는 target과 같다면 해당 인덱스를 리턴
//         if(arr[i]===target) return i;
//     }
//     //없으면 -1 리턴
//     return -1;
// }
// console.log(linearSearch([1,2,3,4,5],3));


//지금 해볼것

//배열을 생성하고 그 배열안에 랜덤한 숫자(1~45)를 넣는다.(범위 상관x)

// 입력 받은 a,b가 있다.
// 최소값, 최대값을 구분하는 함수를 만들어라.

//ex : a=1, b=2 를 받았을때  최소값 : a(1)이 나와야한다.


let arrNum3 =[14,31,21,3,42];
let result = Math.max.apply(null,arrNum3);
let min = Math.min.apply(null,arrNum3);
console.log(result);
console.log(min);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// let random=[];
// for(i=0;i<5;i++){
//     randomNum =Math.floor(Math.random() *50)
//     if(random.indexOf(randomNum)=== -1){
//         random.push(randomNum)
//     }
// }

random =  Math.floor(Math.random()*50)
console.log(random)

let arr= [14,31,21,3,42];

function arrMin(arr){
    
        // if(arr.length===0){
        //     return 0;
        // }
    if(arr){
        let minNum =arr[0];

    for(i = 0; i<arr.length; i++){
        
        if(arr[i] <minNum){
            minNum = arr[i]
        }
    }
return minNum;
}
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
function arrMax(arr){
 
    if(arr.length===0){
        return 0;
    }
    else{
        let maxNum =arr[0];

    for(i = 0; i<arr.length; i++){
        
        if(arr[i] > maxNum){
            maxNum = arr[i]
        }
    }
return maxNum;
}
}

console.log(arrMin(arr)); //최소값 출력
console.log(arrMax(arr)); //최대값 출력