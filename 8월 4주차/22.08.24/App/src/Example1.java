public class Example1 {
    interface Math {

        int sum(int n1, int n2);
    }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    // Example과 동일한 내용 구현, 한 번만 사용되는 객체를 만들기 위해 클래스를 구현하지 않아도 된다.
    // 그렇기 떄문에 익명 객체는 클래스 이름이 없다.

    public static void main(String[] args) {

        int result = doSomething(new Math() {

            @Override
            public int sum(int n1, int n2) { // Anonymous function(익명 클래스)
                return n1 + n2;
            }
        });

        System.out.println(result); // 30

    }
}
