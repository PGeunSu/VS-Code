import java.util.stream.*;
import java.util.*;

public class App14 {
    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result1 = stream1.sorted().findFirst();
        System.out.println(result1.getAsInt()); // 1

        // getAsInt() : OptionalInt 값이 있으면 값을 반환하고, 그렇지 않으면 을 throw한다.

        OptionalInt result2 = stream2.sorted().findAny();
        System.out.println(result2.getAsInt()); // 1

    }
}
