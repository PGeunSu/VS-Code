
public class Operator {
    public static void main(String[] args) {

        /*
         * 산술 연산자 : + - * / % >> <<(쉬프트 연산)
         * 비교 연산자 : == < > <= >= !=
         * 논리 연산자 : $$ || $ | ^ ~
         * 대입 연산자 : =
         * 기타 : 형변환, 삼항, instanceof
         */

        int num1 = 8;
        int num2 = 4;
        System.out.println("더하기 : " + (num1 + num2));
        System.out.println("빼기 : " + (num1 - num2));
        System.out.println("곱하기 : " + (num1 * num2));
        System.out.println("나누기 : " + (num1 / num2));
        System.out.println("나머지 : " + (num1 % num2));

        // 증감연산자
        // ++(피연산자의 값을 1증가), --(피연산자의 값을 1 감소)

        int result, result2;
        result = --num1 + 4;
        result2 = num2-- + 4;
        System.out.println("전위 감소 연산자 :" + result + ",변수값 : " + num1);
        System.out.println("후위 감소 연산자 :" + result2 + ",변수값 : " + num2);

        int x = 10;
        int y = x-- + 5 + --x;

        System.out.println("x : " + x + ", y : " + y);

        char c1 = 'a'; // 97
        char c2 = c1;
        char c3 = ' ';
        c2 += 2;
        // c3 = char c1 + 1;

        int i = c1 + 1;
        System.out.println(i);
        System.out.println(c3);
        System.out.println(c2);

        System.out.printf("\t%b%n", 10 == 10.0f); // true
        System.out.printf("\t%b%n", '0' == 0); // false 0=45

    }
}
