import java.util.stream.*;

public class App9 {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");

        stream.map(s -> s.length()).forEach(System.out::println); // 4,3,4,10

        System.out.println();
    }
}
