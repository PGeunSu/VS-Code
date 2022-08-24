public class Example2 {
    interface Math {

        int sum(int n1, int n2);
    }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    // 람다식을 사용하여 동일 내용 구현, 익명 함수와 비슷하지만 불필효한 선언부 모두 생략
    // 인터페이스의 함수와 구현부만 정의 - 코드가 가장 간결함

    public static void main(String[] args) {

        // int result = doSomething(new Math() {
        // @Override
        // public int sum(int n1, int n2) {
        // return n1 + n2; }
        // });

        int result = doSomething((n1, n2) -> n1 + n2); // 람다식 구현 (위 문장과 동일)

    }
}
