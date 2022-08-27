import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App7 {
    public static void main(String[] args) {

        // 빈 스트림 생성
        Stream<Object> stream = Stream.empty();
        System.out.println(stream.count()); // 0

    }
}
// 아무요소도 가지지 않는 빈 스트림은 steam클래스의 empty() 메소드를 사용하여 생성할 수 있다.