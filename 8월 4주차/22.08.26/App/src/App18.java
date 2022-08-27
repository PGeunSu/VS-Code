import java.util.stream.*;
import java.util.*;

public class App18 {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");

        List<String> list = stream.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " "); // 넷 둘 하나 셋
        }

    }
}
