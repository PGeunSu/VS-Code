import java.text.Format;

public class Print {
    public static void main(String[] args) {

        int age = 10;
        int num = 20;
        // %d 10진수 형식의 데이터를 나타냄.
        System.out.printf("age : %d%n", age);
        System.out.printf("age : %d, num : %d%n", age, num);

        /*
         * %b : bloolean형식으로 출력
         * %d : 10진수 정수의 형식으로 출력
         * %o : 8진수 정수의 형식으로 출력
         * %x,X : 16진수 정수의 형식으로 출력
         * %f : 부동소수점(실수) 형식으로 출력
         * %e,E : 지수 표현식의 형식으로 출력
         * %c : 문자로 출력
         * %s : 문자열로 출력
         */

        byte b = 1;
        short s = 2;
        char c = 'A';
        int num1 = 10;
        long bigNum = 100_000_000_000L; // = 100000000000L 와 같음
        long hexNum = 0xFFFF_FFFF_FFFF_FFFFL;
        int octNum = 010;
        int hexNum1 = 0x10;
        int binNum = 0b010;

        System.out.printf("b = %d%n", b); // b = 1
        System.out.printf("s = %d%n", s); // s = 2
        // C에서는 char타입의 값을 %d로 출력이 가능하지만 java에서는 허용하지 않기 때문에 형변환을 해야한다.
        System.out.printf("c = %c,%d%n", c, (int) c); // c= A,65 (A가 대응되는 아스키코드가 10진수로 65이다.)
        System.out.printf("num1=[%5d]%n", num1); // num1=[ 10] , 출력될 값이 차지할 공간을 숫자로 지정할 수 있다.
        System.out.printf("num1=[%-5d]%n", num1); // num1=[10 ]
        System.out.printf("num1=[%05d]%n", num1); // num1=[00010] 빈 공간을 0으로 채워줌
        System.out.printf("bigNum=%d%n", bigNum); // bigNum=100000000000
        System.out.printf("hexNum=%#x%n", hexNum); // hexNum=0xffffffffffffffff #은 접두사임 16진수 0x
        System.out.printf("octNum=%o,%d%n", octNum, octNum); // octNum=10,8
        System.out.printf("hexNum1=%x,%d%n", hexNum1, hexNum1); // hexNum1=10,16
        System.out.printf("hexNum1=%s,%d%n", hexNum1, hexNum1); // hexNum1=16,16
        // 10진수는 2진수로 출력해주는 지시자가 없으므로 정수를 2진 문자열로 변환해주는 Integer.toBinaryString(i)를 사용
        // 정수를 2진수로 변환해서 문자열로 반환 하기 땜에 %s를 사용함
        System.out.printf("binNum=%s,%d%n", Integer.toBinaryString(binNum), binNum); // binNum=10,2

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.123456789;

        // f = 기본적으로 소수점 아래 6번째 자리만 출력 g= 값을 간략하게 표현할 떄 사용
        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1); // f1 = 0.100000, 1.000000e-01, 0.100000
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2); // f2 = 10.000000, 1.000000e+01, 10.0000
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3); // f3 = 3140.000000, 3.140000e+03, 3140.00

        System.out.printf("d= %f%n", d); // d= 1.123457 //6번째 자리면 출력하기 떄문에 7번쨰 자리에서 반올림 처리됨.
        System.out.printf("d =%14.10f%n", d); // d = 1.1234567890 //전체 14자리중 소수점 10자리까지만 출력해라

    }
}
