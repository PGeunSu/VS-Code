
class Data {

    int num;
}

public class App {
    public static void main(String[] args) {

        int[] a = { 10 };

        System.out.println("메인 a : " + a[0]);

        Change(a);

        System.out.println("함수 호출 후 메인 a : " + a[0]);
        System.out.println("================================================");

        int res = App.sum(1, 2);
        System.out.println(res); // 3

        int[] res1 = { 0 }; // 배열을 생성하고 0으로 초기화

        App.sum(1, 2, res1); // 배열 sum메서드의 매개변수로 전달

        System.out.println(res1[0]); // 3

        System.out.println("================================================");

        Data d = new Data();
        d.num = 10;

        Data d2 = Copy(d);
        System.out.println("d의 값은 : " + d.num);
        System.out.println("d2의 값은 : " + d2.num);
    }

    static void Change(int[] n) {
        n[0] = 1000;

        System.out.println("함수 안에서 n : " + n[0]);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    // 참조형 매개변수를 활용하면 return value가 없어도 메서드의 실행굘과를 얻을 수 있다.
    // 메서드는 하나의 value 를 return 하는데 아래처럼 참조형 매개변수를 응용하면 여러개의 값을
    // return 할 수 있는 효과를 얻을 수 있다.
    // 반환값이 없어도 실행값을 얻을 수 있다.
    static void sum(int a, int b, int[] n) {
        n[0] = a + b;
    }

    // d참조형 반환 타입
    // copy메서드는 새로운 객체를 생성한 다음 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 리턴
    // 반환하는 값은 Data개체의 주소이기 때문에 반환타입 Data
    static Data Copy(Data d) {

        // 새로운 객체 temp를 만들고
        Data temp = new Data();
        // d.num 값을 temp.num에 복사
        temp.num = d.num;

        // 복사한 객체의 주소를 리턴한다.
        return temp;
    }
}
