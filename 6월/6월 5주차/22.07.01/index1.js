//Stack 기능

//Last In FIrst Out (Stack) : 후입 선출
//javascript는 Stack 기능이 없어서 직접 구현해야된다.

//데이터를 삽입 (push) , 데이터를 추출 (pop)

//오버플로워 : 스택이 넘쳐서 더이상 못넣을 때 , 언더 플로워 : 스택이 소진 됐을 때

//stack(스택) : 마지막에 삽입된 항목을 제거하고 접근할 수 있는 자료 구조
//Last In Frist Out(LIFO) -> 마지막에 들어간 항목이 먼저 나온다.

class Stack {
  constructor() {
    this._arr = [];
  }
  push(n) {
    this._arr.push(n);
  }
  pop() {
    return this._arr.pop();
  }
}

const stack = new Stack();
stack.push(1);

function Stack1(arr) {
  this.arr = [];
  if (arr) this.arr = arr;
}

Stack1.prototype.insert = function (data) {
  this.arr.push(data);
};

Stack1.prototype.isEmpty = function () {
  return this.arr.length == 0;
};

Stack1.prototype.pop = function () {
  if (this.isEmpty()) throw "error";
  return this.arr.pop();
};

const stack1 = new Stack1();
stack1.insert(1);
stack1.insert(2);
stack1.insert(3);
console.log(stack1); //Stack1 {arr: Array(3)} arr: (3) [1, 2, 3]

stack1.pop();
console.log(stack1); //Stack1 {arr: Array(2)} arr: (3) [1, 2] (뒤에서 부터 빠지는 것을 볼 수 있다.)`
