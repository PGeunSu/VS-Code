class Student {

  Student() {
    // 인스턴스 생성할 때 돌아칼 코드....
    // 주로 인스턴스 변수의 초기화 코드를 적는다.
  }

  // 생성자도 오버로딩이 가능하다.
  Student(String str, int num) {}
}

class Data {

  int value;
  // 생성자 없음.
  // Data(){ 컴파일러가 자동으로 기본생성자 생성 (매개변수 X 내용 X)
  // }
}

class Data1 {

  int value1;

  Data1(int n) {
    value1 = n;
  }
}

public class Cons {

  public static void main(String[] args) {
    // 생성자(Constructor)
    // 생성자는 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
    // 인스턴스 변수의 초기화 작업에 주로 사용.
    // 인스턴스 생성 시에 실행 되어야 할 작업을 위해서도 사용.

    // 생성자도 메서드와 유사하지만 return value가 없다.
    /*
     * (조건)
     * 1. 생성사의 이름은 클래스 이름이랑 동일해야 된다.
     * 2. 생성자는 return이 없다.
     */
    // =+=============================================================
    Student st1 = new Student(); // 생성자

    // default Constructor (기본 생성자)
    // 클래스 내부에 생성자가 하나도 없다면 컴파일러가 dafault Constructor를 제공한다.
    // 디폴트 생성자는 매개변수, 아무런 내용이 없다.
    // 인스턴스 초기화 작업이 굳이 필요하지 않다면 디폴트 생성자를 사용해도 무방한다.
    Data d = new Data();
    d.value = 10;

    System.out.println(d.value);

    Data1 d1 = new Data1(1);
    System.out.println(d1.value1);

    //Data1 d2 = new Data1(); // error 정의된 생성자가 있기 때문에 디폴트 생성자가 생성되지 않는다.

    // ==========================================================================

    Car hyundai = new Car();
    hyundai.color = "black";
    hyundai.productName = "아반떼";
    hyundai.price = 5000;

    Car Kia = new Car("red", "K5", 3000);

    System.out.println(
      "현대 컬러 : " +
      hyundai.color +
      " 현대 제품 : " +
      hyundai.productName +
      " 가격 : " +
      hyundai.price
    );

    System.out.println(
      "기아 컬러 : " +
      Kia.color +
      " 기아 제품 : " +
      Kia.productName +
      " 가격 : " +
      Kia.price
    );
  }
}
