class Data1 {
    int n;
}

public class Inner {
    public static void main(String[] args) {
        Data1 d = new Data1();

        d.n = 100;

        System.out.println("메인 함수 : " + d.n);
        // callByvalue(d.n); 메인함수 100, 100
        callByReference(d); // 메인함수 100,2000
        // 함수가 호출되면서 참조변수 d의 값(소) 매개변수 t에 복사된다. 저장된 주소값으로 n에 접근 가능
        System.out.println("메인 함수 : " + d.n);

    }

    // static void callByvalue(int n) {
    // n = 2000;
    // System.out.println("함수에서의 데이터 :" + n);
    // }
    static void callByReference(Data1 t) {
        t.n = 2000;
        System.out.println("함수에서의 데이터 :" + t.n);
    }
}
