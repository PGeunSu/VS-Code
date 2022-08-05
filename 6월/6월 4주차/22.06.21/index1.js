 //배열 빌트인 메서드

 
 /* 2가지 패턴
 1.원본 배열 변경
 2.원본 배열을 변경하지 않고 새로운 배열을 생성해서 반환
 */

const arr=[1,2,2,3];
//indexOf() : 원본 배열에서 인수로 전달된 요소를 검색하여 인덱스를 반환한다.
            //인수로 전달한 요소와 중복되는 요소가 여러개 있으면 첫번쨰로 검색된 인덱스를 반환
            //원본 배열에 인수로 전달한 요소가 존재하지  않는다 -> -1 리턴

//배열 arr에서 요소 2를 검색하여 첫번쨰로 검색된 요소의 인덱스를 반환
console.log(arr.indexOf(2));  //1

//없으므로 -1 리턴
console.log(arr.indexOf(4)); //-1
//두번 째 인수는 검색을 시작할 인덱스임. 두번 쨰 인수를 생략하면 처음부터 검색
console.log(arr.indexOf(2,2)); //2

const foods = ['apple','banana','orange'];
 
//foods 배열에 orange 요소가 있나?
// if(food.indexOf('orange')== -1){
//     foods.push('orange');
// }

//indexOf메서드 대신 includes는 가독성이 더 좋아진다. (둘이 똑같은 기능)
if(!foods.includes('orange')){
    foods.push('orange');
}

//push메서드는 인수로 전달받은 모든값을 원본배열의 마지막 요소로
//원본 배열을 직접변경한다.
const arr1 = [1,2];
let result = arr1.push(3,4); //1,2,3,4
console.log(arr1);

//추가할 요소가 1개라면 length프로퍼티를 이용하는 것이 빠르다. 
const arr2=[1,2];
arr2[arr2.length]=3; //= arr2.push(3)

console.log(arr2)

//push메서드보단 전개연선자를 사용하는 편이 더 좋다


//pop() : 원본배열에서 마지막요소를 제거하고 제거한 요소를 반환. (원본 배열을 건드린다.)

const arr3 = [1,2,3];
let result1 = arr3.pop();

console.log(arr3); //1,2        
console.log(result1); //3


//unshift() : 인수로 전달받은 모든 값을 원본배열의  선두에 요소로 추가하고 변경된lenght
// 프로퍼티값을 리턴 (원본 배열을 건드린다.)

const arr4 = [1,2];
let result2 = arr4.unshift(3,4); 

console.log(result2); //4
console.log(arr4); // 3, 4, 1, 2

//shift() : 원본 배열에서 첫번 째 요소를 제거하고 제거한 요소를 반환. (원본 배열 변경)

const arr5 = [1,2];
let result3= arr5.shift();

console.log(result3);//1
console.log(arr5); //2


//concat() : 인수로 전달된 값들을 원본 배열의 마지막 요소로 추가한 새로운 배열을 반환
// 인수 로 전달한 값이 배열인 경우 배열을 분해하여 새로운 배열의 요소로 추가한다.
//원본 배열 변경 x

const arr6 = [1,2];
const arr7 = [3,4];

//arr7  을 원본배열 arr6의 마지막 요소로 추가한 새로운 배열을 반환
//
let result4 = arr6.concat(arr7); 
console.log(result4); //1,2,3,4

//숫자를 원본 배열 arr6 마지막 요소를 추가한 새로운 배열을 반환
result5 = arr6.concat(3);
console.log(result5) //1,2,3

//배열 arr7, 숫자를 원본 arr6의 마지막요소를 추가한 새로운 배열을 반환
result6 =arr6.concat(arr7,5);
console.log(result6)  //1,2,3,4,5

console.log(arr6) //: (원본 배열을 변경 x) 1,2

/*push,unshift 메서드는 concat메서드로 대체가능.
1. concat 원본 배열을 건드리지 않고 새로운 배열을 반환
2. push,unshift메서드를 사용할 경우 원본 배열을 반드시 변수에 저장해야함.
3. concat은 반환값을 반드시 변수에 할당.

*/

/*splice() : 원본 배열의 중간 요소를 추가하거나 중간에 있는 요소를 제거하는 경우
3개의 매개변수가 있고 원본배열을 건드림.

1. start : 원본배열의 요소를 제거하기 시작할 인덱스
 (음수(-1)일 경우에는 배열 끝에서의 인덱스를 나타냄)
2. deleteCount : start부터 제거할 요소의 개수
3. items : 제거한 위치에 삽일 할 요소들의 목록.
*/  

const arr8 = [1,2,3,4];
//원본배열의 인덱스 1부터 2개의 요소를 제거하고 그자리에 20,30 insert한다.
const result7 = arr8.splice(1,2,20,30);
//제거한 요소가 배열로 리턴 
console.log(result7); //2,3
//원본배열 직접 변경
console.log(arr8); //1,20,30,4

const arr9 = [1,2,3,4]
//첫번 째 인덱스부터 2개를 제거
const result8 = arr9.splice(1,2);
console.log(arr9); //1,4

//배열에서의 특정요소 제거
const arr10 = [1,2,3,1,2];

//중복된 데이터가 있다면 첫번 째 요소만 제거
function remove(array,item){
    //제거할 item요소의 인덱스를 가져옴
    const index = array.indexOf(item);

    //제거 할 item이 있다면 제거해
    if(index !==1)array.splice(index,1);
    return array;
}
console.log(remove(arr10,2));

 
//slice() : 인수로 전달된 범위의 요소들을 복사해서 배열로 리턴(원본배열 변경X)

const arr11 = [1,2,3];
//arr11[0] ~ arr11[1] 까지 복사하여 리턴
let result10 = arr11.slice(0,1)

console.log(result10); // 1
