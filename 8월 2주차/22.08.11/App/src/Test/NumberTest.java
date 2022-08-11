package Test;

import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {

        System.out.println("구구단 프로그램  1~9사이의 숫자 하나를 입력하세요");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        int result;

        if (input < 1 && input > 9) {
            System.out.println("1~9사이의 숫자만 입려 가능합니다!!!!!!");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            result = input * i;
            System.out.println(input + "X" + i + "= " + result);
        }

    }
}
