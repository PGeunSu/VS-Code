public class Ex2 { // 추상클래스로 익명클래스 구현

    public static abstract class MyAbstractClass {

        public abstract void doSomething();
    }

    public static void main(String[] args) {

        MyAbstractClass myClass = new MyAbstractClass() {

            @Override
            public void doSomething() {
                System.out.println("doSomething");
            }
        };
        myClass.doSomething();
    }
}