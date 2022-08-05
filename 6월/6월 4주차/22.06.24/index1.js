//this
//자기 자신의 객체를 가르키는 녀석

var a = 5;
console.log(a);
//let,const로 선언할 시 출력되지 않음.
console.log(window.a);
console.log(this.a);

function func() {
    console.log("함수")
}
func();
//함수를 주체하는 것은 window
window.func();

console.log(func()=== window.func()); //true

function f(){
    if(window===this) console.log("윈도우는 this");
}
f();

var stdudent = {
    name : 'hong',         //property
    st : function(){        //method
        console.log(this);   
    },
};
//호출하는 주체는 학생
stdudent.st();  
var s = stdudent.st;
s();

//object : 객체 (우리가 실생활에서 인식할 수 있는 사물)

//고양이 객체
// cat.name = "나비"
// cat.age = 2;      //property
// cat.weight =2;

// cat.eat();
// cat.run();         //method
// cat.stop();


//빈 객체 만들기

const person = new Object();

person.name = "Lee";  ///property
person.Hello = function() {
    console.log("안녕 내이름은" + this.name);   //method
}
console.log(person);
person.Hello();

//생성자 함수에 의한 객체생성

function Circle(radius){
    this.radius = radius; //property
    this.getDiameter = function() {
        return  2 * this.radius;
    };
}
const circle1 = new Circle(5); //반지름이 5인 Circle객체를 생성
const circle2 = new Circle(10); //같은 구조로 여러개 생성 가능
console.log(circle1 .getDiameter());
console.log(circle2 .getDiameter());

console.log(circle1.getDiameter == circle2.getDiameter); //false

//생성자 함수 
function Person(name,age,city){
    this.name = name;
    this.age = age;
    this.city = city;
    
    this.information = function(){
        console.log('나는'+this.name+"나이는"+this.age+"사는 곳은"+ this.city);
    };
};

//생성자 함수를 이용해 student라는 함수를 만들고
//나이,키,사는  곳, 몸무게, 학번의 프로퍼티를 추가
//밥 먹기, 집가기, 등교 등등 어떤 동작을 하는 메서드를 만들기
//3명의 학생정보를 출력하기



function Student(name,age,city,weigth,eat){
    this.name= name;
    this.age = age;
    this.city = city;
    this.weigth = weigth;
    this.eat = eat;
    
    this.GoHome = function(){
        console.log("나는 우리집인"+this.city+"에 갈거야")

    }
    this.Food = function(){
        console.log("나는 오늘 저녁으로"+this.eat+"먹을거얌")
    }
    this.information= function(){
        console.log('나는'+this.name+"나이는"+this.age+"살"+"사는 곳은"+ this.city+
        "몸무게는"+this.weigth+"kg 이야");
    };
}

const Student1 = new Student("Park",23,"YangJu",70,"치킨")
const Student2 = new Student("Lee",25,"Seoul",60,"소고기")
const Student3 = new Student("Kim",20,"Busan",80,"피자")

console.log(Student1.information());
console.log(Student2.information());
console.log(Student3.information());

console.log(Student1.GoHome());
console.log(Student2.GoHome());
console.log(Student3.GoHome());

console.log(Student1.Food());
console.log(Student2.Food());
console.log(Student3.Food());


