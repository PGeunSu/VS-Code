import java.util.stream.*;

public class App12 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");

        stream.forEach(System.out::print);// 넷둘셋하나

    }
}
