public class OverLoad {
    public static void main(String[] args) {
        // 함수 오버로딩

        // 클래스 내에서 같은 이름의 메서드를 여러개 정의한다.

        /*
         * 오버로딩의 조건
         * 1. 메서드 이름이 같아야 한다.
         * 2. 매개변수 개수 or 타입이 달라야 한다.
         * 메서드 이름이 같더라도 매개변수가 다르면 서로 구별되기 때문에 오버로딩이 가능하다.
         * 
         * 1,2번 조건을 만족시키지 못하면 메서드는 중복 정의로 간주도히기 때문에 컴파일 시 에러가 발생한다.
         * 오버로딩된 메서드 들은 매개변수에 의해서만 구분되기 때문에 반환타입은 오버로딩을 구현하는데 아무런 영향 X
         */

        OverLoad over = new OverLoad();

        int res = over.sum3(1, 2);
        int res1 = over.sum3(1, 2, 3);
        long res2 = over.sum3(3L, 2L);
        int[] arrRes = { 1, 2, 3, 4, 5 };
        int res3 = over.sum3(arrRes);

        System.out.println(res); // 3
        System.out.println(res1); // 6
        System.out.println(res2); // 5
        System.out.println(res3); // 15
    }

    // 아래 두 함수는 매개변수의 이름만 다를 뿐 타입이 동일하기 때문에 조건에 성립 X
    int sum(int a, int b) {
        return a + b;
    }
    // int sum(int x, int y) {
    // return x + y; error : Duplicate method sum(int, int) in type OverLoad
    // }

    // ===============================================================================
    int sum1(int a, int b) {
        return a + b;
    }

    // long sum1(int x, int y) {
    // return (long) x + y; error : Duplicate method sum(int, int) in type OverLoad
    // }

    // ===============================================================================
    // int, long 하나씩 순서가 다르게 선언 되었다.
    // 이 경우에는 호출할 때 매개변수 값에 의해 호출될 메서드가 구분되기 때문에 중복된 정의 X (오버로딩 간주)
    long sum2(int a, long b) {
        return a + b;
    }

    long sum2(long a, int b) {
        return a + b;
    }
    // 가능은 하지만 타입 순서를 기억해야 되는 단점이 있기 때문에 거의 사용하지 않는다.
    // ===============================================================================

    // 같은 작업을 하지만 매개변수를 달리해야 하는 경우 사용
    int sum3(int a, int b) {
        return a + b;
    }

    int sum3(int a, int b, int c) {
        return a + b + c;
    }

    long sum3(long a, long b) {
        return a + b;
    }

    int sum3(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
    // 위 sum3이라는 4개의 함수들은 오버로딩 되어 있다.

}
