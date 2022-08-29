package Test;

import java.util.Scanner;

public class QuadrantTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 값을 입력하세요 (음수 가능)");

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        System.out.println("==============================================");
        if (x > 0 && y > 0) {
            System.out.println("x : " + x + " y : " + y + "\nQuadrant1 제 1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("x : " + x + " y : " + y + "\nQuadrant2 제 2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("x : " + x + " y : " + y + "\nQuadrant3 제 3사분면");
        } else {
            System.out.println("x : " + x + " y : " + y + "\nQuadrant4 제 4사분면");
        }
        System.out.println("==============================================");

    }
}
