import java.util.*;

public class Queue {
    public static void main(String[] args) {

        LinkedList<String> qu = new LinkedList<String>();
        // FIFO First In First Out

        qu.add("넷");
        qu.add("둘");
        qu.add("셋");
        qu.add("하나");

        System.out.println(qu.peek()); // 넷
        System.out.println(qu); // [넷, 둘, 셋, 하나]
        System.out.println("================================");

        // poll : 요소의 반환 및 제거
        System.out.println(qu.poll()); // 넷
        System.out.println(qu); // [둘, 셋, 하나]
        System.out.println("================================");

        qu.remove("하나");
        System.out.println(qu); // [둘, 셋]
        System.out.println("================================");

    }
}
