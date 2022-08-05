//손님 객체를 매개변수로 받아서 선입선출 방식으로 음식 주문하기

//1. 점원은 주문을 위해 손님의 이름과 주뭉항목을 요구
//2. 첫번 째로 주문받은 손님을 먼저 처리한다.

//ex...
//1.홍길동 햄버거
//2.아이유 삼겹살

class Guest {
  constructor() {
    this.arr = [];
  }
  order(name, data) {
    this.arr.push(name, data);
  }
  serving() {
    return this.arr.splice(0, 2);
  }
}

const result = new Guest();

result.order("손님1", "라면");
result.order("손님2", "비빔밥");
result.order("손님3", "짜장면");
result.order("손님4", "초밥");

result.serving();

console.log(result); //arr: (6) ['손님2', '비빔밥', '손님3', '짜장면', '손님4', '초밥']

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ//

function Guest1(arr) {
  this.arr = [];
  if (arr) this.arr = arr;
}
Guest1.prototype.order = function (name, odrer) {
  return this.arr.push(name, odrer);
};
Guest1.prototype.serving = function () {
  return this.arr.splice(0, 2);
};

const result1 = new Guest1();

result1.order("손님1", "라면");
result1.order("손님2", "비빔밥");
result1.order("손님3", "짜장면");
result1.order("손님4", "초밥");

result1.serving();
result1.serving();

console.log(result1); // arr: (4) ['손님3', '짜장면', '손님4', '초밥']

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ교수님ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ//

function Customer(name, order) {
  this.name = order;
  this.order = order;
}
function Cashier() {
  this.customers = new Customer();
}
Cashier.prototype.addOrder = function (customer) {
  this.customers.enqueue(customer);
};

Cashier.prototype.deliverOrder = function () {
  const finishCustomer = this.customers.dequeue();

  console.log(finishCustomer.name + "님" + "주문하신" + finishCustomer.order + "음식 나왔습니다.");
};

const cashier = new Cashier();
const sonnum1 = new Customer("손님1", "라면");
const sonnum2 = new Customer("손님2", "비빔밥");
const sonnum3 = new Customer("손님3", "짜장면");
const sonnum4 = new Customer("손님4", "초밥");

cashier.addOrder(sonnum1);
cashier.addOrder(sonnum2);
cashier.addOrder(sonnum3);
cashier.addOrder(sonnum4);

sonnum1.deliverOrder();
sonnum2.deliverOrder();
sonnum3.deliverOrder();
sonnum4.deliverOrder();

console.log(cashier);
