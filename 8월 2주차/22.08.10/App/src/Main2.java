public class Main2 {
    public static void main(String[] args) { // final
        // 변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메서드에 사용되면 오버라이딩을 할 수 없다.
        // 클래스에 사용되면 자신을 확장하는 자손클래스를 정의하지 못함.

        // final 사용 가능한 곳 : 클래스,메서드(함수), 멤버변수, 지역변수

        int number = 10; // 변수
        number = 20;

        final int number2 = 10;
        // number2 = 30; // 오류 (변경 불가)

        System.out.println(number);// 20

    }
}

class Parent {
    final void show() { // 메서드의 final선언
        System.out.println("hi");
    }
}

class Son extends Parent {

    // void show() {// Error : Cannot override the final method from Parent
    // // Parent클래스를 상속받은 Son클래스는 오버라이딩을 통해 재정의 불가
    // System.out.println("hello");
    // }
}
