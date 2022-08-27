public class Main1 implements Dog1, Cat1 { // 다중 클래스 상속 가능

    @Override
    public void crying() {

        System.out.println("냐옹~");
    }

    @Override
    public void one() {
        System.out.println("One");

    }

    @Override
    public void two() {
        System.out.println("Two");
    }

    public static void main(String[] args) {

        Main1 main = new Main1();

        main.crying();
        main.one();
        main.two();
    }

}
