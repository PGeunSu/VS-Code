import java.util.stream.*;
import java.util.Arrays;

public class App11 {
    public static void main(String[] args) {

        String[] arr = { "I study hard", "You study Java", "I am hungry" };

        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::print); //IstudyhardYoustudyJavaIamhungry
    }
}
