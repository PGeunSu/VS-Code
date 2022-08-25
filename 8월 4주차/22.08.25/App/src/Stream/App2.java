import java.util.*;
import java.util.stream.Stream;

public class App2 {

    public static void main(String[] args) {
        String[] arr = { "넷", "둘", "셋", "하나" };

        // 배열에서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.print(e + " "));// 넷 둘 셋 하나
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 인덱스 1 부터 3 전까
        stream2.forEach(e -> System.out.print(e + " ")); // 둘 셋

    }

}
