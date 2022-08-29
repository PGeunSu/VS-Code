import java.util.*;;

public class ClassName<E> {

    private E element; // 제네릭 타입 변수

    void set(E element) { // 제네릭 피라미터 메소드
        this.element = element;
    }

    E get() { // 제네릭 타입 변환 메소드
        return element;
    }

    public static void main(String[] args) {

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get()); // 10
        // 반환된 변수의 타입 출력
        System.out.println("a E type : " + a.get().getClass().getName()); // java.lang.String

        System.out.println("=================================================");

        System.out.println("b data : " + b.get()); // 10
        // 반환된 변수의 타입 출력
        System.out.println("b E type : " + b.get().getClass().getName()); // java.lang.Integer

    }

}
