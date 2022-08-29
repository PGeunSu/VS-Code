import java.util.stream.*;
import java.util.*;

public class App15 { // 요소의 검사
    public static void main(String[] args) {

        int[] intArr = { 2, 4, 6 };

        // allMatch() : 해당 스트림의 *모든* 요소가 특정 조건을 만족할 경우에 true반환
        boolean result = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
        System.out.println("2의 배수가 있나? : " + result); // true

        // anyMatch() : 해당 스트림의 *일부* 요소가 특정 조건을 만족할 경우에 true반환
        result = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
        System.out.println("3dml 배수가 하나라도 있나 ? " + result); // true

        // noneMatch(): 해당 스트림의 '모든' 요소가 특정 조건을 만족하지 않을 경우 true반환
        result = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없나 ? " + result); // false

    }
}
