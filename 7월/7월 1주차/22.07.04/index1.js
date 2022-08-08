//리니어 리스트 : 배열기반
//      
//연결 리스트 : 로드로 연결됨

function Node(data){
    this.data = data;
    this.next = null;
}
Node.prototype.insert = function(value) {
    let newNode = new Node(value);
    if(this.next == null)this.next = newNode;
    else{
        newNode.next = this.next;
        this.next = newNode;
    }
};
Node.prototype.delete = function(){
    if(this.next = null) return null;
    const remove = this.next;
    this.next = remove.next;
};
Node.prototype.print = function(){
    let str= "";
    for (let p = this; p !=null; p=p.next){
        str += `${p.data}->`;
    }
    str += `NULL`;
    console.log(str);           
}
let sll = new Node("head");
sll.insert(1);
sll.insert(2);
sll.insert(3);
sll.print();


//ajax : 자바스크립트를 사용해서 비동기적으로 서버 데이터를 받는 기술
//json : 키와 값으로 표현해 놓은 표기법 (모든 키는 ""로 감싸준다.)

//제이쿼리
//1. 압축되지 않은
//2. 압축된
//3. 가벼운 녀석
//4. 3번의 압축된 형태
//제이쿼리 : 개발할 때 번거롭고 어려운걸 쉽고 간결하게 해주는 
//대규모 프로젝트에서는 비효율(느리기 땜에)