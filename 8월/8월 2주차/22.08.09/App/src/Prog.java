import java.util.*;

public class Prog {
    public static void main(String[] args) {
        // ArrayList<String> arrList = new ArrayList<String>(); //문자열 배열
        ArrayList<Integer> arrList = new ArrayList<Integer>(); // Int형 배열

        // 리스트 요소의 저장
        arrList.add(40);
        arrList.add(30);
        arrList.add(20);
        arrList.add(10);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));

        }

        System.out.println();

        arrList.remove(1); // 인덱스(배열 위치) 1 remove(제거)

        // Enhanced for문
        for (int e : arrList) {
            System.out.println(e + ""); // 40 20 10
        }

        System.out.println();

        arrList.set(0, 20); // 0번째의 인덱스값을 20으로 변경

        for (int e : arrList) {
            System.out.println(e + ""); // 20,20,10
        }

        System.out.println();

        System.out.println("리스트의 크기 : " + arrList.size()); // 3
    }
}
// 배열과 차이점 : 배열의 크기는 고정인 반면 ArrayList는 크기가 가변적으로 변함
// 내부적으로 저장이 가능한 메모리 용량이 있으며 현재 사용중인 공간의 크기(size)가 있음.
// 만약 현재 가용량 이상을 저장하려고 할 때 더 큰 공간의 메모리를 새롭게 할당
