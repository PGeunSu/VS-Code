import java.util.*;

public class App {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        hs01.add("홍길동");
        hs01.add("이순신");

        System.out.println(hs01.add("임꺽정")); // true
        System.out.println(hs01.add("임꺽정")); // false
        System.out.println("=========================================");

        for (String e : hs01) {
            System.out.print(e + " "); // 홍길동 이순신 임꺽정
        }

        System.out.println("\n=========================================");

        hs02.add("임꺽정");
        hs02.add("이순신");
        hs02.add("홍길동");

        // Itrator() 메소드를 이용한 요소출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.print(iter02.next() + " "); // 홍길동 이순신 임꺽정
        }
        System.out.println("\n=========================================");

        // size() 메소드를 이용한 요소의 총 개수

        System.out.print("집합의 크기 : " + hs02.size()); // 3
        System.out.println("\n=========================================");

    }
}
// set 컬렉션

// 1. 저장순서를 유지하지 않는다.
// 2. 같은 요소의 중복 저장을 허용하지 않는다.

// HashSet<E>
// TreeSet<E>
