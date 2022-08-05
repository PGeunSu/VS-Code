class Person{
    //생성자    
    constructor(age,phone,city){
        this.age =age;
        this.phone = phone;
        this.city = city;
        }
        getInfo(){
            return ("나이는"+this.age+"살, "+"핸드폰 번호는"+this.phone+
            ", 사는 곳은 "+this.city+"입니다");
        }
}
const st = new Person(23,"010-3230-4877","서울");

console.log(st);
console.log(st.age);
console.log(st.getInfo());

//외부에 공개가 되면 안 되는 것들 private       
//private, public, protected

class Product{
    constructor(name,price){
        this.name = name;
        this.price = price;
    }
    get getName(){
        return "제품이름 : "+this.name;
    }
    set setPrice(price){
        this.price = price  ;
    }
}

let pr = new Product("아이폰 14",1000000)
console.log(pr);
console.log(pr.getName);
pr.setPrice = 2000;
console.log(pr);

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

class Mother{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
    getInfo(){
        return console.log("내 이름은 "+ this.name+ "이고 나이는 "+this.age+"살 입니다.")
    }
}
let a = new Mother("부모",40);
a.getInfo();

//extends : 키워드를 사용해서 상속 받을 수 있다.
//자식 클래스가 부모 클래스를 상속받아 자식클래스에서 부모 클래스의 기능을
//물려 받아 사용 가능.
//기존에 존재하던 기능을 토대로 새로운 기능을 만들 수 있다.
class Child extends Mother {
}
let b = new Child("나는 자식",20);
b.getInfo();

class Animal{
    constructor(name){
        this.name = name;
        this.speed = 0;
    }
    run(speed){
        this.speed+=speed;
        console.log(this.name+"은"+this.speed+"km/h로 달린다.",
        "나는 부모 요소")
    }
    stop(){
        this.speed = 0;
        console.log(this.name + "이 멈췄다","나는 부모");
    }
};

//상속을 이용해 고양이 클래스 
const ani = new Animal("동물");
ani.run(5);
ani.stop();

class Cat extends Animal{
    //constructor가 없으면 비어 있는 생성자가 만들어진다.
    
    //이 run 함수가 없으면 상속받은 run함수를 실행
    //부모의 함수를 받아서 재정의 해서 사용 : 함수 오버라이딩
    run(speed){
        this.speed = speed;
        console.log(this.name+"는 "+this.speed+"km/h로 달린다","난 자식요소")
    }
    speak(){
        console.log("야옹");
        }
        stop(){
            //super는 상속받은 부모클래스를 의미함
            //재정의 해서 사용할 수도 있지만 super 키워드를 이용해서 실행가능
            super.stop();
            // this.speak();
        }
}
let cat = new Cat("고양이");
cat.run(2);
cat.stop();


class Human{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
}
//상속받은 클래스에서 생성자를 재정의 하기 위해서는 super키워드로 부모클래스를
//불러와야만 사용 가능
class Man extends Human{
    /*상속클래스(Man)의 생성자 함수가 실행되면
    일반적인 함수에서 일어나는 일이 발생하지 않는다.
    ->new 키워드와 함께 실행되면 빈 객체가 만들어지고
    this 키워드에 이 객체 할당 */

    /* this에 객체를 할당하는 일을 부모클래스의 생성자가
    처리해 주길 바라기 때문임.   */
        constructor(name,age){
            super(name,age);
            this.name = name;
            this.age = age;
        }
}
let ma = new Man("경일",30);
console.log(ma);    

//오늘의 숙제
/*Monster 부모클래스를 만들고 상속관계로 이용해
Boss몹, 기타 잡몹 만들기


클래스 플레이어 만들기
1.플레이어가 때리면 몬스터의 hp감소
2.몬스터가 떄리면 플레이어 HP감소

*/



// class Plater{
//     constructor(hp){
//         this,hp = hp;
//     }
//     get getHP(){

//     }
//     set setHp(){

//     }
// }
// class Monster {
//     constructor(hp,atk) {
//         this.hp = hp;
//         this.atk=atk;
//     }
//     Atk(){

//     }
// }
// const player = new Player(10);
// const mon = new Monster();