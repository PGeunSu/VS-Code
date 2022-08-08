public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final int num = 10;
        System.out.println(num);

        int triangle = (20 * 10) / 2; // 삼각형의 면적 구하기
        int rectangle = 20 * 10; // 사각형 면적

        System.out.println(triangle);
        System.out.println(rectangle);

        // 상수를 이용하여 의미가 명확해 질 수 있음.
        // 다른 값으로 계산할 때도 다른 곳을 수정할 필요없이 상수 초기값만 변경해주면 됨.
        final int WITDH = 20;
        final int HEIGHT = 10;

        int tri = (WITDH * HEIGHT) / 2;
        int rect = WITDH * HEIGHT;
        System.out.println(tri);
        System.out.println(rect);

        /*
         * 변수에 타입이 있는 것 처럼 리터럴에도 타입이 있다.
         * 종류 리터럴 || 접미사
         * 논리 false,true || X
         * 정수 123,0b101,077,0xFF || L
         * 실수 3.14, 3.0e8 || f,d
         * 문자 'A','1' || X
         * 문자열 "ABC" , "123" || X
         */

        /*
         * 정수형과 실수형에는 여러타입이 존재하므로 리터럴에 접미사를 붙여서 타입을 구분한다.
         * long타입의 리터럴에 L을 붙이고 접미사가 없으면 int 타입의 리터럴이다.
         * byte,short는 별도로 존재하지 않는다.
         * 
         * 10진수 외에도 2,8,16진수로 표현된 리터럴을 변수에 저장 할 수 있다.
         */

        // 8진수는 앞에 0을 붙힌다.
        int octNum = 010;
        // 16진수는 앞에 0x를 붙힌다.
        int hexNum = 0X10;
        // 미진수는 앞에 0b을 붙힌다.
        int binNum = 0b10;

        System.out.println(octNum); // 10진수로 8
        System.out.println(hexNum); // 16진수로 16
        System.out.println(binNum); // 2진수로 2

        // 실수형 리터럴에는 접미사를 붙혀서 타입을 구분한다. 정수형에는 int가 기본 자료형 인것 처럼
        // 실수형에서는 double이 기본자료형이다.(접미사 d는 생략 가능) double이 기본자료형이기 때문

        float fi = 3.14f; // f를 붙여줘야됨
        double dou = 1.45;
        float pi = 3.14; // float 타입 변수에 double타입 리터럴을 저장할 수 없다.

        System.out.println(fi);
        System.out.println(dou);

        /////////////////////////////////////////////////////////////////////////
        // 문자 리터럴
        /*
         * 'A'와 같이 작은 따옴표로 문자 하나를 감싸고 있는 것을 문자 리터럴이라고 한다.
         * "AA"
         */

        // char ch='a';
        // //char ch1='ddd'; // error : 하나의 문자만 저장가능

        // String str = "dddddd";
        // String str1 = ""; //문자열은 아무런 문자도 넣지 않는 것을 허용
        // char ch2 = ''; //error : 문자리터럴은 반드시 하나의 문자가 있어야 함.
        // char ch3 = ' '; //공백으로 초기화

        // boolean
        // 1bit만 사용하지만 데이터를 다루는 최소단위는 byte이기 떄문에 크기는 1byte(8bit)이다
        boolean isCheck = true;
        boolean isAttack = false;

        /*
         * 특수문자
         * \t (tab)
         * \n (new line 줄바꿈)
         * \b (back space)
         * \\
         * \''
         * \""
         * 유니코드(ex : char a =\'u0041')
         */

        System.out.println('\''); // 작은따옴표
        System.out.println("abc\t123\b678"); // \b 떄문에 3이 지워짐
        System.out.println('\n');
        System.out.println("\"Hello World\""); // 더블쿼터
        System.out.println("C:\\"); // 경로
    }
}
