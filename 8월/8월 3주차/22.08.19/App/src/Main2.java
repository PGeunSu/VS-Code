class Parent {

    public final void show() {
        System.out.println("hi");
    }

}

public class Main2 extends Parent {

    // public void show() { error : final로 정의된 메서드는 오버라이딩 불가
    // System.out.println("hello");
    // }

    public static void main(String[] args) {

        Main2 main = new Main2();
        main.show();

    }

}
