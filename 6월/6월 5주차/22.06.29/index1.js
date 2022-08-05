//버블 정렬 ( 거의 쓸 일 없음) 
//가장 간단하지만 전체배열을 순회하면서 이전 항목이 다음 항목보다 큰 경우 두 항목교환
/*5,1,2,6,9,8,7
1,5,2,6,9,8,7
1,2,5,6,9,8,7
1,2,5,6,8,9,7
1,2,5,6,8,7,9
1,2,5,6,7,8,9


*/
// function random(n){
//     let arr = new Array();
//     let num;
//     let temp;

//     for(let i = 0; i <= n; i++){
//         arr.push(i);
//     }
//     for(let i =0; i < arr.length; i++){
//         num = Math.floor(Math.random() * n);
//         temp = arr[i];
//         arr[i] = arr[num];
//         arr[num] = temp;
//     }
//     return arr;
// }

// function bubbleSort(array){
//     const arrlen =array.length;
//     for(let i = 0; 1 < arrlen; i++){
//         //끝까지 돌았을 때 다시 처음부터    
//         for(let k = 0; k < arrlen - 1 -i; k++){
//             //두 항목을 비교한다. 앞이 뒤보다 크다면
//             if(array[k]>array[k+1]){
//                 //바꿔준다.
//                 let temp = array[k];
//                 array[k] = array[k+1];
//                 array[k+1] = temp;
//             }
//         }
//     }
//     return array;
// }


// let bubblesorting = random(10);
// console.log("버블", bubblesorting);
// let startTime= new Date().getTime() / 1000; 
// console.log("버블", bubbleSort(bubblesorting)); 
// let endTime = new Date().getTime() /1000;
// console.log(`정렬시간 : ${endTime - startTime}`);


// [1,2,3,4,5] = 9       3,4

//배열 arr가 있다. 어떤 수 weight가 주어졌을 때 합쳐서 weight가 되는
//배열 내 두개의 인덱스를 반환해라/
//만약 합쳐서 weight가 되는 항목 두개가 존재하지 않을 경우 -1 return해라

// if(weight = a+b);
// return [a,b];



let arr = [1,3,4,6,7,8,9];
let weight = 193  
for(let i = 0; i < arr.length; i++){
    for(let k = i+1; k < arr.length; k++){
        if(arr[i]+arr[k] == weight){
            console.log(arr[i],arr[k])
        }
        // return -1;
        }
        
    }




function findSum(arr,weight){
    for(let i = 0; i < arr.length; i++){
        for(let k = i+1; k<arr.length; k++){
            //만약 배열안에 들어있는 두개의 값이 weight와 같다면
            if(arr[i]+arr[k]==weight)
            return[i,k];
        }
    }
    return -1;
}
const arr1= [1,2,3,4,5];
const test = findSum(arr1,99);
console.log(test);