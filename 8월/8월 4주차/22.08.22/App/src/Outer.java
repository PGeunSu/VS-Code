public class Outer {
    int a = 10;
    static int b = 20;

    public void print() {
        System.out.println("print");
    }

    class Inner {
        int c = 30;

        final static int c3 = 40; // final static은 상수이므로 허용

        public void foo() {
            System.out.println("foo()");
        }
    }

    static class Sinner {
        int d = 40;

        void bar() {
            System.out.println("bar()");
        }

        static void baz() { // static 클래스만이 static 멤버를 정의가능.
            System.out.println("baz()");
        }
    }

    public static void main(String[] args) {

        Outer o = new Outer();

        // static이 붙은 변수는 "클래스명.변수"로 지정.
        // static이 붙지 않는 변수는 "객체명.변수"로 지정.

        System.out.println("o.a : " + o.a); // 10
        System.out.println("Outer.b : " + Outer.b); // 20 (static 처리를 했기 때문에 따로 객체생성을 할 필요가 없음.)

        // Outer class안에 있는 Inner 클래스의 변수 c 출력
        Outer.Inner oi = o.new Inner();
        System.out.println("oi.c : " + oi.c); // 30

        // Outer class안에 있는 Inner 클래스의 foo() 메소드 호출
        oi.foo(); // foo()

        // Outer class안에 있는 Sinner클래스의 변수 d를 출력(static class)
        Outer.Sinner osi = new Outer.Sinner();
        System.out.println("osi.d : " + osi.d); // 40

        // Outer class안에 있는 Sinner 클래스의 bar() 메소드 호출
        osi.bar(); // bar()

        // Outer class안에 있는 Sinner 클래스의 baz() 메소드 호출
        // baz() 메소드가 static 으로 선언 했기 꺠문에 아래와 같이 클래스명.내부클래스명.메소드로 호출 가능
        Outer.Sinner.baz(); // baz()
    }
}
