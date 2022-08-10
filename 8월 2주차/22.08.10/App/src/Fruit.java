
public class Fruit {// 다형성(polymorpghism) : 여러 가지 형태를 가질 수 있는 능력
    // 부모 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록함.

    String name;
    int price;
    int fresh;

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price + "원");
        System.out.println("신선도 : " + fresh);
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        Fruit fruit = new Peach(); // 타입 불일치. 부모타입의 참조변수로 자손 인스턴스를 참조
        fruit.show();

        Fruit fruit1 = new Banana();
        fruit1.show();

    }
}

class Peach extends Fruit {

    public Peach() {
        name = "복숭아";
        price = 1500;
        fresh = 75;
    }
}

class Banana extends Fruit {

    public Banana() {
        name = "바나나";
        price = 1000;
        fresh = 90;

    }
}
