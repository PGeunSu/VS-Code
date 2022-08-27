class Car { // 형변환
    String color;
    int door;

    void drive() {
        System.out.println("drive~~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!!");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe; 에서 형변봔이 생력됨
        // car.water(); : error (Car타입의 참조변수로는 water()를 호출할 수 없다.)
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입. 형변환 생략불가
        fe2.water();

    }
}
