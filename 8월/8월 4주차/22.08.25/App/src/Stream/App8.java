import java.util.stream.*;

public class App8 {
    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 5, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 5, 6);

        // 스트림에서 중복된 요소를 제거함
        stream1.distinct().forEach(e -> System.out.print(e + " ")); // 7 5 2 1 3 4 6
        System.out.println();

        // 스트림에서 홀수만을 골라냄.
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " ")); // 7 5 5 1 3 5

    }
}
