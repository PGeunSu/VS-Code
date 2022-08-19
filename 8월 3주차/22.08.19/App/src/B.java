class A {
    int m = 3;
    static int n = 5;
}

public class B {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m);
        System.out.println(A.n);
    }
}
// Static member 정적 멤버의 특징
// 객체 생성없이 "클래스명.멤버명" 만으로 사용이 가능
// -> static member : 객체 생성 안 해도 사용 가능
// -> instance member : 객체 생성 후 사용 가능