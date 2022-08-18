import java.util.*;

public class Prog {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // put() 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet()); // [이십, 삼십, 사십, 십]
        // ketSet() 메소드는 해당 맵에 포함된 모든 키 값들을 하나의 집합(Set) 으로 반환

        for (String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key))); // 키 : 이십, 값 : 20 .....
        }
        System.out.println("=========================================");

        // remove() : 메소드를 이용한 요소 삭제
        hm.remove("사십");

        // Itrator() 메소드를 이용한 요소출력
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key))); // 키 : 이십, 값 : 20 ..... (사십(40) 삭제)
        }
        System.out.println("=========================================");

        // replace() 메소드를 이용한 Value값 변경
        hm.replace("이십", 200);

        for (String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key))); // 키 : 이십, 값 : 200 .....
        }

        System.out.println("=========================================");

    }

}
// Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식(key - value 방식)을 사용
// Map의 특징
// 요소의 저장순서를 유지하지 않는다.
// 키의 중복은 허용하지 않고, 값의 중복은 허용

// HashMap(Key,Value)
// Hashtable(Key,Value)
// TreeMap (Key,Value)