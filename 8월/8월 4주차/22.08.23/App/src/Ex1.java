public class Ex1 { // interface로 익명클래스 구현

    interface MyInterface {

        void doSomething();
    }

    public static void main(String[] args) {

        MyInterface myClass = new MyInterface() {

            public void doSomething() {
                System.out.println("doSomething");
            }
        };
        myClass.doSomething();
    }
}
// 익명 클래스(Anonymous Class)
// 익명 클래스란 다른 내부 클래스와는 달리 이름을 가지지 않는 클래스
// 클래스의 선언과 동시에 객체를 생성하므로, 단하나의 객체만을 생성하는 일회용 클래스
// 생성자를 선언할 수 도 없으며, 오로지 단 하나의 클래스나 단 하나의 인터페이스를 상속받거나 구현할 수 있을 뿐이다.
// 클래스 이름 참조 변수 이름 = new 클래스 이름(){....}
