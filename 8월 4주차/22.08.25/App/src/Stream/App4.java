import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App4 {
    public static void main(String[] args) {

        // range() 메소드는 명시된 시작 정수를 포함하지만 마지막 정수는 포함하지 않는 스트림 생성
        IntStream stream = IntStream.range(1, 4);
        stream.forEach(e -> System.out.print(e + " ")); // 1 2 3
        System.out.println();

        // rangeClosed() 메서드는 명시된 시작 정수뿐만 아니라 명시된 마지막 정수 포함 스트림 생성
        IntStream stream2 = IntStream.rangeClosed(1, 4);
        stream2.forEach(e -> System.out.print(e + " ")); // 1 2 3 4
    }
}
