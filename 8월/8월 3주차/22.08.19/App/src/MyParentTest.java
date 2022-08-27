class MyParent {
    // 접근 가능성
    private int prv; // 같은 클래스만 접근 가능
    int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; // 접근 제한 없음.

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();

        p.printMembers();

        // System.out.println(p.prv); //접근 불가
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
