//내부 클래스 (inner class)
// 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
//코드의 복잡성을 줄일 수 있다.(캡슐화)

class AAA { /// AAA는 BBB의 외부 클래스
    int i = 100;
    // BBB b = new BBB();

    class BBB {
        void method() {
            // AAA a = new AAA();
            // System.out.println(a.i);
            System.out.println(i); // 객체생성 없이 외부 클래스로 접근 가능

        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        // BBB b = new BBB();
        // b.method(); // 100

        AAA a = new AAA();
        AAA.BBB b = a.new BBB();

        b.method(); // 100
    }

}
