public interface Interface { // 인터페이스(interface)
    // interface 인터페이스 이름{........}
    // 추상 클래스와 매우 흡사하다.
    // 인터페이스를 사용하면 다중상속을 구현할 수 있다.

    abstract void crying();

    public void show();

    // public을 absract class로 바꾸면 오류가 발생하지 않음. - 추상화 정도가 높다.

    // 인터 페이스는 미리 어떤 코드를 작성하면 오류

    // 인터페이스에서는 이렇게 어떤 함수가 존재한다는 것만 알려줘야한다.

    public static void main(String[] args) {

        Main main = new Main();
        main.crying();
        main.show();

    }
}

class Main implements Interface {

    @Override
    public void crying() {
        System.out.println("월월");

    }

    @Override
    public void show() {
        System.out.println("Hello");

    }

}
