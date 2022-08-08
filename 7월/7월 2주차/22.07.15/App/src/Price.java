import java.util.Scanner;

public class Price {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("첫번 째 음식 가격 : " + num1 + "원");
        System.out.println("두번 째 음식 가격 : " + num2 + "원");
        System.out.println("세번 째 음식 가격 : " + num3 + "원");

        float result = num1 + num2 + num3;

        System.out.println("음식 값 합계 : " + (int) (num1 + num2 + num3) + "원");
        System.out.println("N빵 : " + result / 3 + "원");

        scanner.close();
    }
}