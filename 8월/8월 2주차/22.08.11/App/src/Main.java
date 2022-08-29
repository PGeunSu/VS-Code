
class Value { // Object 클래스의 메서드 - equals()

    int value;

    Value(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {

        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다."); // 결과값

        }
        // equals메서드는 주소값으로 비교를 하기 때문에, 두 Value인스턴스의 멤버변수 value의 값이 10으로 서로 같을 지라도
        // equals 메서드로 비교환 결과는 false이다.
    };
}
