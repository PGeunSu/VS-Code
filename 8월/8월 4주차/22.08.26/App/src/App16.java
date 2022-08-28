import java.util.stream.*;
import java.util.*;

public class App16 {
    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.count()); // 4
        System.out.println(stream2.max().getAsInt()); // 90
        // System.out.println(stream2.min().getAsInt());
        // error : stream has already been operated upon or closed (스트림 재사용 불가)
        System.out.println(stream3.min().getAsInt()); // 10

    }
}
