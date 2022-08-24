public class App { // Lambda Expression (람다식) 메서드를 간단한 식으로 표현 하는 방법

    int max(int a, int b) { // 람다식 : (a, b) -> a > b ? a : b;
        return a > b ? a : b;
    }

    // 람다식 : (name, i) -> System.out.println(name + “=” + i);
    // int printVar(String name, int i) {
    // System.out.println(name + "=" + i);
    // }

    int square(int x) { // 람다식 : x - > x * x;
        return x * x;
    }

    int roll() { // 람다식 : () -> (int) Math.random() * 6);
        return (int) (Math.random() * 6);
    }
}

// 람다식의 특징
// 클래스를 구현하지 않아도됨, 코드가 간결함
// 인터페이스(추상 메서드)를 구현
// Abstract 클래스의 경우, 익명 함수는 가능하지만 람다식은 구현 안됨.
// 인자를 전달할 수 있고, 결과를 리턴할 수 있다.
