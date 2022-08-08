import javax.sound.midi.SysexMessage;

//InnerApp
/*
 * 변수는 Class Variable, instance Variable, Local Variable
 *
 * 지역 변수
 *          위치 : 함수,초기화, 내부 블럭, 생성자
 *     생성 시점 : 변수 선언이 실행 되었을 때
 *
 * 인스턴스 변수 :
 *          위치 : class 내부
 *       생성 시점 : 인스턴스가 생설될 때
 * 클래스 변수 :
 *          위치 : class 내부
 *       생성 시점 : 클래스가 메모리에 올라갈 떄
 */

/*
 * 인스턴스 변수 : 인스턴스 변수의 값을 read, write를 할 때는 먼저 인스턴스를 생성해야 한다. 

    클래스 변수 : 공통된 공간을 공유하게 된다.  || 한 클래스의 공통적인 값을 유지해야 하는 속성의 경우 클래스 변수 선언
                    인스턴스를 생성하지 않고 바로 사용할 수 있음. 

    **지역변수, 인스턴스 변수, 클래스 변수 차이점 반드시 숙지**

 */
class Data {

  int intanceVal; // instance Variable,
  static int n; // (공유) Class Variable,
  public static int s; // public을 붙혀주면 전역변수의 특성을 가지게됨.

  // void print() {
  // int number; // Local Variable (지역 변수)
  // }

  // 인스턴스 변수
  String name;
  int productNumber;

  // 클래스 변수
  static int width = 100;
  static int height = 200;
}

public class App {

  public static void main(String[] args) {
    System.out.println("제품의 가로크기 : " + Data.width);
    System.out.println("제품의 세로크기 : " + Data.height);

    Data d = new Data();
    d.name = "♥ 올레드 티비";
    d.productNumber = 10;

    System.out.println("제품의 이름 : " + d.name);
    System.out.println("제품의 번호 : " + d.productNumber);

    Data d1 = new Data();
    d1.name = "★ 올레드 티비";
    d1.productNumber = 20;
    System.out.println("제품의 이름 : " + d1.name);
    System.out.println("제품의 번호 : " + d1.productNumber);
    // d.width = 200;
    // d.height = 300;

    // // Data.width = 200;
    // // Data.height = 300; 클래스 변수값을 재선언이 가능하지만 위에 처럼 작성할 시 헷갈릴 수도 있음

    // System.out.println("제품의 가로크기 : " + Data.width);
    // System.out.println("제품의 세로크기 : " + Data.height);

  }
}
