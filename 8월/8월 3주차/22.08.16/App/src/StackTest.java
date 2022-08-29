import java.util.*;

public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();// 스텍의 생성
        // Deque<Integer> st = new ArrayDeque<Integer>();
        // LIFO = Last In First Out

        // push() : 해당 스택의 제일 상단에 전달되어 요소 삽입.

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        // peek() : 제일 마지막으로 저장된 요소 반환(제일 상단)
        System.out.println(st.peek()); // 1

        System.out.println(st); // [4, 3, 2, 1]

        System.out.println("=======================================");

        // pop() : 해당 스택의 제일 상단에 있는(제일 마지막에 저장된) 요소를 반환하고. 해당요소를 스택에서 제거
        System.out.println(st.pop()); // 1

        System.out.println(st); // [4, 3, 2]

        System.out.println("=======================================");

        // search() : 해당 스택에서 전달된 객체가 존재하는 위치의 인덱스 반환
        // 이 떄 인덱스는 Array와 다르게 0이 아닌 1로 시작
        System.out.println("4의 위치 : " + st.search(4)); // 3

        System.out.println("3의 위치 : " + st.search(3)); // 2

        System.out.println(st.search(8)); // -1 찾고자 하는 값이 없으면 false(-1)를 return

    }
}
