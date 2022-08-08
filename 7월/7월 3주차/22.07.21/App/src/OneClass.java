
class Tv {
    String color;
    boolean power; // 속성
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

}

public class OneClass {
    public static void main(String[] args) {
        // 객체지향

        /*
         * 1. 코드의 재사용성이 높다 : 새로운 코드를 작성할 때 기존의 코드를 이용해서 쉽게 작성할 수 있다
         * 2. 코드의 관리가 용이하다. 코드간의 관계를 이용해서 작은 노력으로 쉽게 코드 변경 가능
         * 3. 신뢰성이 높은 프로그래밍을 가능하게 한다 : 제어,메서드 등을 이용해서 데이터를 보호하고 올바른 값을 유지하도록 한다.
         * -> 코드의 중복을 제거하고 코드의 불일치로 인한 오류현상을 방지할 수 있다.
         */

        // class 와 object

        // class : 객체를 정의해 놓은 것. 객체의 설계도, 틀
        // class 용도 : 객체를 생성하는 용도

        // 객체(Object) : 사전적 의미로는 실생활에서 우리가 인식할 수 있는 사물.

        // Object 와 instance

        // class로 부터 object를 만드는 과정을 class의 instance화라고 한다.
        // 어떤 class로 부터 만들어진 object를 그 class의 instance이다.

        // Object의 구성 : 속성, 기능

        ///////////////////////////////////////////////////////////////////

        // class이름 변수명; || 클래스의 객체를 참조하기위한 참조변수 선언
        // 변수명 = new 클래스명(); || 클래스의 객체를 생성한 후 객체의 주소를 참조변수의 저장

        Tv lg; // TV클래스 타입의 참조변수 lg 선언
        lg = new Tv(); // Tv인스턴스를 생성한 다음 -> Tv인스턴스의 주소를 t에 대입

        lg.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7
        lg.channelDown(); // Tv인스턴스의 메서드 channelDown 호출

        System.out.println("현재 내가 보고싶은 채널 : " + lg.channel + "이다"); // 6

        ///////////////////////////////////////////////////////////////////

        Tv samsung = new Tv();
        Tv t = new Tv();

        // samsung이 가지고 있는 값(주소)
        // t에 저장(samsung이 참조하고 있는 인스턴스를 같이 참조하게 된다. samsung이 참조 하고 있던 인스턴스는 더 이상 사용할 수
        // 없다.)
        t = samsung;

        samsung.channel = 11;
        System.out.println("현재 내가 보고싶은 채널 : " + samsung.channel + "이다"); // 11
        System.out.println("현재 내가 보고싶은 채널 : " + t.channel + "이다");// 11

        // Tv tv1,tv2,tv3.....

        Tv[] tvArr = new Tv[50];

        Tv[] tvArr1 = { new Tv(), new Tv(), new Tv() };

        // for문 이용
        // for (int i = 0; i < tvArr.length; i++) {
        // tvArr[i] = new Tv();
        // }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10 저장
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);

            /*
             * tvArr[0].channel=11
             * tvArr[1].channel=12
             * tvArr[2].channel=13
             * tvArr[3].channel=14
             * tvArr[4].channel=15
             * ..........
             */
        }

    }
}
