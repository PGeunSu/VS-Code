import java.util.stream.*;
import java.util.*;

//reduct() 메소드는 첫번쨰와 두번 째 요소를 가지고 연산을 수행한뒤, 그 결과와 세번 쨰 요소를 가지고 또 다시 연산을 수행한다.
//이런식으로 해당 스트림의 모든 요소를 소모하여 연산을 수행하고, 그 결과를 반환

public class App13 {
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println); // 넷++둘++셋++하나
        // Optional객체를 사용하면 예상치 못한 NullpointrException 예외를 제공되는 메소드로 간단히 회피

        // ifPresent() : Optional 객체가 값을 가지고 있으면 실행, 값이 없으면 넘어감

        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result2); // 시작++넷++둘++셋++하나
    }
}
