import java.util.stream.*;

import javax.sound.midi.Soundbank;

import java.util.*;

public class App19 {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));

        List<String> oddLengthList = patition.get(false);
        System.out.println(oddLengthList); // [CSS, PHP]

        List<String> evenLengthList = patition.get(true);
        System.out.println(evenLengthList); // [HTML, JAVA]
    }

}
