import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App5 {
    public static void main(String[] args) {

        // 특정 타이브이 난수로 이루어진 스트림 생성
        IntStream stream = new Random().ints(2);
        stream.forEach(System.out::println);

        // Iterate() 메소드를 이용한 무한 스트림
        // Stream<Integer> stream1 = Stream.iterate(2, n -> n + 2);
        // stream1.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(100, n -> n + 10).limit(5); // 100 10씩 증가 한 것을 최대 5개까지 출력
        stream2.forEach(System.out::println);

        // test.txt파일의 데이터를 라인단위로 읽어서 뽑아주는 스트림 객체, 이 떄 데이터는 UTF-8로 지정해서 다코딩
        // Stream<String> stream3 = Files.lines(Paths.get("text.txt"),
        // Charset.forName("UTF-8"));
    }
}
