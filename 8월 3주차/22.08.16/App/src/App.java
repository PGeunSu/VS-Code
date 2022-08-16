import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(); // INT타입
        ArrayList arrList2 = new ArrayList(); // 문자열
        // <integer> : 제네릭

        // add() 메소드를 이용한 배열요소 저장
        arrList.add(40);
        arrList.add(30);
        arrList.add(20);
        System.out.print("add : ");

        // ArrayList for문 출력
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " "); // 40 30 20
        }

        System.out.println("\n=================================================");

        arrList.remove(1); // 1번 째 인덱스 삭제
        System.out.print("remove : ");

        for (int e : arrList) { // 각각 실행하라
            System.out.print(e + " "); // 40 20
        }
        System.out.println("\n=================================================");

        arrList.set(0, 30); // 0번 쨰 인덱스를 30으로 변경
        System.out.print("set : ");
        for (int e : arrList) {
            System.out.print(e + " "); // 30 20
        }

        // 배열 사이즈 출력해주는 메소드 .size()
        System.out.print("배열 사이즈 : " + arrList.size()); // 2

        System.out.println("\n=================================================");

        Collections.sort(arrList);
        // Collections 클래스일뿐임 = Collection : 최상위 인터페이스니 주의 요망
        // List, Set, Map에서 배열을 정렬할 때 쓰인다.

        System.out.print("sort : ");

        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " "); // 20 30
        }

        // Iterator은 자바 컬렉션 프레임워크에서 컬렉션에 저장되어있는 요소를 읽어오는 표준 방법
        // .hasNext : 읽어온 요소가 남아 있는 지 확인하는 메소드, 있으면 true 없으면 false

        System.out.println("\n=================================================");

        arrList2.add("Hello");

        // String string = arrList2.get(0); //error : Type mismatch(String으로 형변환 필요)
        String string = (String) arrList2.get(0); // 0번째 인덱스

        System.out.println(string); // Hello

        // 자바에서 제네릭이란 데이터의 타입을 일반화 한다.
        // 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법

    }
}

// 컬렉션 프레임 워크
// : 다수의 데이터를 쉽고 효괒거으로 처리할 수 있는 표준화된 방법
// 데이터를 저장하는 자료 구조와 처리하는 알고리즘을 구조화 화여 클래스로 구현해 놓은 것
// 이러한 컬레션 프레임 워크는 자바의 인터페이스를 사용하여 구현된다.

// 컬렉션 프레임 워크 - 주요 인터페이스
// 1. List 인터페이스 - ArrayList, LinkedList, Stack, Queue, vector(예전)
// ArrayList - add(삽입), remove(삭제), sort(정렬), set(변경)
// 2. Set 인터페이스
// 3. Map 인터페이스
