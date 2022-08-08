
//자바에서 모든 코드는 반드시 클래스 안에 존재해야 한다.
public class App {
    // main 메서드의 선언부, 미리약속된 부분, 항상 동일해야함
    // main : 반드시 하나는 존재해야됨 (진입 함수)
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

// hello2.java (public class가 있는 경우 반드시 파일 이름과 class 이름이 동일해야됨)
// public class Hello2{}
// class Hello3{}

// 둘 이상의 public class가 존재하면 안 됨.
// 별도로 나누거나 둘중 하나는 public을 붙이지 않아야 한다.

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// public class가 하나도 없는 경우라면 소스파일의 이름은 둘다 가능
class Hello2 {
}

class Hello3 {
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// error

/*
 * cannot find symbol, cannot resolve symbol
 * 지정된 변수나 메서드를 찾을 수 없다.
 * 
 * ';' expected : 세미클론이 존재하지 않음. (java 에서는 ;을 반드시 사용해야함)
 * 
 * Exception int thread "main"....
 * 메인 메서드가 없거나 오타가 난 경우 (class 내부에)
 * 
 * ilegral start of expression
 * 문법적 오류
 */

//