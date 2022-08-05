//먼저 들어간 데이터 먼저 나온다 (Queue)

class Queue {
  constructor() {
    this.arr = [];
  }
  enqueue(n) {
    this.arr.push(n);
  }
  dequeue() {
    return this.arr.shift();
  }
}

function Queue1(arr) {
  this.arr = [];
  if (arr) this.arr = arr;
}
Queue1.prototype.isEmpty = function () {
  return this.arr.length == 0;
};
Queue1.prototype.enqueue = function (data) {
  return this.arr.push(data);
};
Queue1.prototype.dequeue = function () {
  return this.arr.shift();
};
const queue = new Queue1();

queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
queue.enqueue(5);
console.log(queue); // Queue1 {arr: Array(5)} arr: (5) [1, 2, 3, 4, 5]
queue.dequeue();
console.log(queue); // Queue1 {arr: Array(4)} arr: (4) [2, 3, 4, 5]

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ//
