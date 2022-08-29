public class Main3 {
    public static void main(String[] args) {
        String str = new String("java");
        System.out.println("원본 문자열 : " + str); // java
        System.out.println("문자열 : " + str.charAt(1)); // a

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ",");
        }

        System.out.println("\n charAt() 메서드 호출 후 원본 문자열 : " + str); // java

        System.out.println("문자열 : " + str.concat("수업")); // java수업
        System.out.println("concat() 메서드 호출 후 원본 문자열 : " + str); // java

        System.out.println("========================================================");

        String str1 = new String("Oracle java");

        System.out.println(str1.indexOf("O")); // 0
        System.out.println(str1.indexOf("a"));// 2
        System.out.println(str1.indexOf("java"));// 7

        System.out.println("indexOf() 메서드 호출 후 원본 문자열 : " + str1); // Oracle java

        // indexOf() : 특정문자나 문자열이 처음 등장하는 위치의 인덱스를 찾는다. 없으면 -1 반환
        System.out.println("========================================================");

        String str2 = new String("java     ");
        System.out.println("원본 문자열 : " + str2); // java
        System.out.println(str2 + "|"); // java (공란) |
        System.out.println(str2.trim() + "|");// java|

        System.out.println("trim() 메서드 호출 후 원본 문자열 : " + str2); // java

        System.out.println("========================================================");

        // trim() : 공란 제거

        String str3 = new String("Java");
        System.out.println("원본 문자열 : " + str3); // Java
        System.out.println(str3.toLowerCase()); // java
        System.out.println(str3.toUpperCase()); // JAVA

        System.out.println("Low.Uppcase() 메서드 호출 후 원본 문자열 : " + str3); // Java

        System.out.println("========================================================");

        // Lower : 모두 소문자로, Upper : 모두 대문자로 수정

        StringBuffer str4 = new StringBuffer("Java");
        System.out.println(str4.append("수업")); // java수업

        System.out.println("append() 메서드 호출 후 원본 문자열 : " + str4); // Java수업

        // StringBuffer : 값 저장
        System.out.println("========================================================");

        StringBuffer str5 = new StringBuffer("Oracle java");
        System.out.println(str5.delete(4, 8)); // Oracava //4 인덱스부터 8인덱스 까지 값 제거
        System.out.println(str5.deleteCharAt(1)); // Oacava // 1번 인덱스 제거

        System.out.println("delete() 메서드 호출 후 원본 문자열 : " + str5); // Oacava

        System.out.println((int) Math.pow(5, 2)); // 25 (pow : a의b승) 5의 2승
        System.out.println((int) Math.sqrt(25)); // 5 (sqrt : 루트 ) 루트 25

        System.out.println("========================================================");

        StringBuffer str6 = new StringBuffer("java 만세!!");
        System.out.println("원본 문자열 : " + str6); // java 만세!!

        System.out.println(str6.insert(4, "Script")); // javaScript 만세!!
        System.out.println("insert() 메서드 호출 후 원본 문자열 : " + str6); // javaScript 만세!!
        System.out.println("========================================================");

    }
}
