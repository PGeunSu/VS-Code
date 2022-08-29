package Test;

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력하세요 (범위 : 1~4000)");

        int input = sc.nextInt();

        sc.close();

        if (input > 1 && input > 4000) {
            System.out.println("1 ~ 4000의 범위로만 입력 가능합니다");
            return;

        }

        if (input % 4 == 0 && input % 400 == 0) {
            System.out.println("☆윤년 입니다!!!!!!!☆");
        }
        if (input % 4 == 0 && input % 100 == 0) {
            System.out.println("4의 배수이기도 하지만 100의 배수이므로 윤년이 아닙니다!!");
        } else if (input % 100 == 0) {
            System.out.println("윤년이 아닙니다");
        } else {
            System.out.println("윤년이 아닙니다");
        }

    }

}
