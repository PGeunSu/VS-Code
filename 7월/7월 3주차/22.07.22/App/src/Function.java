class Math {
    int sum(int a, int b) {
        int res = a + b;
        return res;
    }

    int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    int mul(int a, int b) {
        int res = a * b;
        return res;
    }

    double divide(double a, double b) {
        double res = a / b;
        return res;
    }

}

class Math2 {
    int a, b; // 인스턴스 변수

    // 인스턴스 a,b만을 이용해서 동작하기 때문에ㅐ 매개변수가 필요없다.
    int sum() {
        int res = a + b;
        return res;
    }

    int sub() {
        int res = a - b;
        return res;
    }

    int mul() {
        int res = a * b;
        return res;
    }

    double divide() {
        double res = a / b;
        return res;
    }

    // 클레스 메서드
    // 인스턴스 변수인 a,b를 사용하지 않는다. 관계X
    // 매개변수로 처리
    static int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    static int sum(int a, int b) {
        int res = a + b;
        return res;
    }

    static int mul(int a, int b) {
        int res = a * b;
        return res;
    }

    static double divide(double a, double b) {
        double res = a / b;
        return res;
    }
}

public class Function {
    public static void main(String[] args) {

        Math2 m = new Math2();

        m.a = 200;
        m.b = 100;
        int res = m.sum();
        int res2 = m.sub();
        double res1 = m.divide();
        // 인스턴스 메서드 호출
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res1);

        // 클래스 메서드 호출
        System.out.println(Math2.sum(11, 2));
        System.out.println(Math2.sub(4, 1));
        System.out.println(Math2.mul(3, 3));

        // 인스턴스 메서드와 클래스 메서드의 차이점

        // 함수(Method)
        // 1 . 중복된 코드 제거 2. 재사용성이 좋다. 3. 프로그램 구조화

        // 반환 타입 메서드 이름 (타입 변수명, 타입 변수명...)
        // void Print()
        //

    }

    // int add(int a, int b) { // 선언부
    // // 구현
    // int result = a + b;
    // return result;
    // // return a + b; = return result; }

    // // 메서드를 호추할 때 괄호안에 지정해준 값

    // 클래스 메서드 : 객체를 생성 안 해도 사용 가능(static 붙은 녀석)
    // 인스턴스와 관계가 없는 메서드를 클래스 메서드로 정의한다 (인스턴스 변수나, 인스턴스 메서드를 사용하지 않는 경우)
    // 인스턴스 메서드 : 인스턴스 변수와 관련된 작업을 한다, 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드다.
    // 인스턴스 메서드 역시 객체를 생성해야만 사용할 수 있다.

    // 클래스를 설계할 때 멤버 변수 중에 모든 인스턴스에 공통으로 사용하는 것에 static을 붙힌다.
    // 클래스 변수는 인스턴스를 생성하지 않아도 사용 가능
    // 클래스 메서드는 인스턴스 변수를 사용할 수 없다.

    // 인스턴스 변수나 인스턴스 메서드는 static붙은 멤버들을 사용하는 것이 가능하다.
    // 메서드 내에서 인스턴트 변수를 쓰지 않는다면 static을 붙히는 것을 교려한다. -> 효일이 좋아짐

}
