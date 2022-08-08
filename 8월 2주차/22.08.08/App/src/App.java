import java.util.Scanner;

public class App {

    // static int max1(int a, int b) {
    // return (a < b) ? a : b;
    // }

    // static int func(int a, int b, int c) {
    // int result = max1(a, b);
    // result = max1(result, c);
    // return result;
    // }

    // static int min(int a, int b, int c) { //촤대 공약수

    // int max = 0;

    // for (int i = 1; i < a && i < b && i < c; i++) {

    // if (a % i == 0 && b % i == 0 && c % i == 0) {

    // max = i;
    // }
    // }
    // }

    static int fact(int a) {
        // 팩토리얼 구하기

        int sum = 1;

        for (int i = 1; i <= a; i++) {
            sum *= i;
        }

        return sum;
    }

    static int fact2(int a) {
        // 팩토리얼 구하기 2번쨰 방법 (재귀함수 Recursion)

        if (a == 1) {
            return 1;
        } else {
            return a * fact2(a - 1);
        }

    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // int result = sc.nextInt();

        // System.out.print("입력된 정수는 : " + result + "입니다.");

        // System.out.println("400,300,750 중에서 가장 작은 값은 : " + func(400, 300, 750));

        // int a = 3050;

        // int max = 0;
        // int count = 0;

        // for (int i = 1; i < a; i++) {

        // if (a % i == 0) {

        // count++;

        // if (count == 10) {

        // max = i;
        // }

        // }

        // }
        // System.out.println("10번째 약수는 : " + max);

        System.out.println(fact(10));
        System.out.println(fact2(10));

    }
}
