class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
            // obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환이 필요함.

        } else {
            return false; // 타입이 Person이 아니면 값을 비교할 필요가 없음.
        }
    }

    Person(long id) {
        this.id = id;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같습니다.");
        } else {
            System.out.println("p1과 p2는 다릅니다.");

        }
    }
}
